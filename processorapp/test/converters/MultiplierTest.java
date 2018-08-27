package converters;
import java.util.Map;

public class MultiplierTest implements ConverterTest {
    @Override
    public Converter createInstance() {
        return new Multiplier();
    }

    @Override
    public Map<String, String> createTestSample() {
        return Map.of("a", "aa", "a1", "aa11", "aBc", "aaBBcc");
    }
}
