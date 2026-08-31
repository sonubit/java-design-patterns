package behavioral.visitor;

public class SalaryVisitor implements Visitor {

    private double totalSalary;

    @Override
    public void visit(Employee employee) {

        totalSalary += employee.getSalary();

        System.out.println(
                "Employee: " +
                employee.getName() +
                ", Salary: " +
                employee.getSalary()
        );
    }

    @Override
    public void visit(Department department) {

        System.out.println(
                "Department: " +
                department.getName()
        );
    }

    public double getTotalSalary() {
        return totalSalary;
    }
}
