package behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {

        System.out.println("=== Visitor Pattern ===");

        Employee john =
                new Employee("John", 75000);

        Employee david =
                new Employee("David", 85000);

        Department department =
                new Department("Engineering");

        SalaryVisitor visitor =
                new SalaryVisitor();

        department.accept(visitor);
        john.accept(visitor);
        david.accept(visitor);

        System.out.println(
                "Total Salary: "
                        + visitor.getTotalSalary()
        );
    }
}
