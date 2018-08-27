package converters;

import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class ConverterFactory {

    public static Converter createConverter(String converterInfo) {
        try {
            List<String> infoList = Stream.of(converterInfo.split(" ")).collect(toList());
            if (infoList.size() < 2)
                return (Converter) Class.forName(converterInfo)
                        .getConstructor()
                        .newInstance();

            String args = String.join(" ", infoList.subList(1, infoList.size()));
            return (Converter) Class.forName(infoList.get(0))
                    .getDeclaredConstructor(String.class)
                    .newInstance(args);

        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static List<Converter> createConverters(List<String> convertersInfo) {
        return convertersInfo.stream()
                .map(ConverterFactory::createConverter)
                .collect(toList());
    }
}


