package converters;

import java.util.Map;

public class LowercaseKBlockerTest implements ConverterTest{

    @Override
    public Converter createInstance() {
        return new LetterBlocker("k");
    }

    @Override
    public Map<String, String> createTestSample() {
        return Map.of("kk", "", "b", "b", "ak1", "a1", "kBck", "Bc");
    }
}
