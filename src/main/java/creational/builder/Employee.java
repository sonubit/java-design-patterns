package creational.builder;

public class Employee {

    private final long id;
    private final String name;
    private final String email;
    private final String department;
    private final String designation;
    private final double salary;

    private Employee(Builder builder) {

        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.department = builder.department;
        this.designation = builder.designation;
        this.salary = builder.salary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private long id;
        private String name;
        private String email;
        private String department;
        private String designation;
        private double salary;

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder designation(String designation) {
            this.designation = designation;
            return this;
        }

        public Builder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {

            if (name == null || name.isBlank()) {
                throw new IllegalStateException(
                        "Employee name is required"
                );
            }

            if (email == null || email.isBlank()) {
                throw new IllegalStateException(
                        "Employee email is required"
                );
            }

            return new Employee(this);
        }
    }

    @Override
    public String toString() {

        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", department='" + department + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}
