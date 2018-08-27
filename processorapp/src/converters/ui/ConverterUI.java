package converters.ui;

import converters.Converter;
import converters.ConverterFactory;
import converters.Processor;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ConverterUI {

    public static void main(String[] args){

        try {
            List<String> blocksFromFile = readFromBlocksFile();
            String text = readFromInputFile();

            ConverterFactory factory = new ConverterFactory();
            List<Converter> converters = factory.createConverters(blocksFromFile);
            
            Processor processor = new Processor(converters);
            String output = processor.process(text);
            
            System.out.println(text + " has been converted to " + output);
        } catch (Exception ex){

            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public static List<String> readFromBlocksFile() throws Exception {
        return Files.lines(Paths.get("inputs/blocks.txt"))
                .collect(toList());
    }

    public static String readFromInputFile() throws Exception {
        return Files.lines(Paths.get("inputs/text.txt"))
               .collect(joining(""));
    }
}
