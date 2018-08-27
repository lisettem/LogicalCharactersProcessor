package converters;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class LowercaseConverterTest implements ConverterTest {

    @Test
    void canary() { assertTrue(true); }

    @Override
    public Converter createInstance() {
        return new LowercaseConverter();
    }

    @Override
    public Map<String, String> createTestSample() {

        return Map.of("A", "a", "aB", "ab", "a1B", "a1b");
    }
}