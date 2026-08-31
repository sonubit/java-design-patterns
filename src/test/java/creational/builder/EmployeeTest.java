package creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EmployeeTest {

    @Test
    void shouldBuildEmployee() {

        Employee employee = Employee.builder()
                .id(1001)
                .name("John Smith")
                .email("john@example.com")
                .department("Engineering")
                .designation("Senior Developer")
                .salary(85000)
                .build();

        assertTrue(
                employee.toString().contains("John Smith")
        );
    }

    @Test
    void shouldRequireName() {

        assertThrows(
                IllegalStateException.class,
                () -> Employee.builder()
                        .email("john@example.com")
                        .build()
        );
    }

    @Test
    void shouldRequireEmail() {

        assertThrows(
                IllegalStateException.class,
                () -> Employee.builder()
                        .name("John Smith")
                        .build()
        );
    }
}
