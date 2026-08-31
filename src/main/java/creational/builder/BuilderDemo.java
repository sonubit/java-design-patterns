package creational.builder;

public class BuilderDemo {

    public static void main(String[] args) {

        Employee employee = Employee.builder()
                .id(1001)
                .name("John Smith")
                .email("john@example.com")
                .department("Engineering")
                .designation("Senior Developer")
                .salary(85000)
                .build();

        System.out.println(employee);
    }
}
