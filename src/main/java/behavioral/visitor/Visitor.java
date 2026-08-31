package behavioral.visitor;

public interface Visitor {

    void visit(Employee employee);

    void visit(Department department);
}
