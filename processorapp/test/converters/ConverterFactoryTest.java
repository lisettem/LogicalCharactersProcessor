package converters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterFactoryTest
{
    @Test
    void testingMultiplierConverter() {
        List<String> input= List.of("converters.Multiplier");
        ConverterFactory factory = new ConverterFactory();
        List<Converter> converterList = List.of(new Multiplier());

        assertEquals( converterList.get(0).getClass().getName(),
                factory.createConverters(input).get(0).getClass().getName());
    }

    @Test
    void testingMultipleConverters(){
        List<String> input = List.of("converters.LowercaseConverter", "converters.UppercaseConverter", "converters.LetterBlocker P");
        ConverterFactory factory = new ConverterFactory();
        List<Converter> converterList = List.of(new LowercaseConverter(), new UppercaseConverter(), new LetterBlocker("P"));


        assertEquals( converterList.get(0).getClass().getName(),
                factory.createConverters(input).get(0).getClass().getName());
    }

    @Test
    void createConvertersThrowsRuntimeException () throws Exception {

        List<String> input = List.of("converters.Polk");
        ConverterFactory factory = new ConverterFactory();

        assertThrows(RuntimeException.class, ()-> factory.createConverters(input));

    }
}
