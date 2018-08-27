package converters;

import java.util.Map;

public class LowercaseZBlockerTest implements ConverterTest {

    @Override
    public Converter createInstance() {
        return new LetterBlocker("z");
    }

    @Override
    public Map<String, String> createTestSample() {
        return Map.of("z", "", "az", "a", "b", "b", "zZaz1", "Za1");
    }

}

