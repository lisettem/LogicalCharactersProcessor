package converters;

public class UppercaseConverter implements Converter {
    @Override
    public String convert(String text) {
        return text.toUpperCase();
    }
}
