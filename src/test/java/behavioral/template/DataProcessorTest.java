package behavioral.template;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class DataProcessorTest {

    @Test
    void shouldProcessCsvData() {

        DataProcessor processor =
                new CsvDataProcessor();

        assertDoesNotThrow(processor::process);
    }

    @Test
    void shouldProcessJsonData() {

        DataProcessor processor =
                new JsonDataProcessor();

        assertDoesNotThrow(processor::process);
    }
}
