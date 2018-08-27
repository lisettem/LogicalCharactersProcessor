package converters;

import java.util.Map;

public class UppercaseConverterTest implements ConverterTest {

    @Override
    public Converter createInstance() {
        return new UppercaseConverter();
    }

    @Override
    public Map<String, String> createTestSample() {

        return Map.of("a", "A", "aB", "AB", "a1B", "A1B");
    }
}