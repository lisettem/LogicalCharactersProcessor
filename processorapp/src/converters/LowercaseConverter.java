package converters;

public class LowercaseConverter implements Converter {

    @Override
    public String convert(String text) {
        return text.toLowerCase();
    }
}
