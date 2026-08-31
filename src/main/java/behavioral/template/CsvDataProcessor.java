package behavioral.template;

public class CsvDataProcessor
        extends DataProcessor {

    @Override
    protected void readData() {

        System.out.println("Reading CSV data...");
    }

    @Override
    protected void processData() {

        System.out.println("Processing CSV data...");
    }
}
