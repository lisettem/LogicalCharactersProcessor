package converters;

import java.util.Map;

public class UppercaseZBlockerTest implements ConverterTest{

    @Override
    public Converter createInstance() {
        return new LetterBlocker("Z"); 
    }

    @Override
    public Map<String, String> createTestSample() {
        return Map.of("Z", "", "b", "b", "Z1", "1", "zZBcZ", "zBc");
    }
}