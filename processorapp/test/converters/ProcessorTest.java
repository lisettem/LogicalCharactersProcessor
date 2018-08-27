package converters;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcessorTest {

    @Test
    void TestAndThenMethod(){
        Processor processor = new Processor(List.of(new LetterBlocker("Z"), new UppercaseConverter()));

        assertEquals("123ABC!", processor.process("ZZ123Zabc!"));
    }

    @Test
    void TestProcessor1() {
        Processor processor = new Processor(List.of(new LetterBlocker("X"), new LetterBlocker("Z"), new UppercaseConverter()));

        assertEquals("ZZ11AAWW", processor.process("ZZzz11aaXXww"));
    }

    @Test
    void TestProcessor2() {
        Processor processor = new Processor(List.of(new LetterBlocker("Z"), new LowercaseConverter()));

        assertEquals("zz11aaww", processor.process("ZZzz11aaww"));
    }

    @Test
    void TestProcessor3() {
        Processor processor = new Processor(List.of(new UppercaseConverter(), new LetterBlocker("Z"), new LowercaseConverter()));

        assertEquals("11aaww", processor.process("ZZzz11aaww"));
    }

    @Test
    void TestProcessor4() {
        Processor processor = new Processor(List.of(new UppercaseConverter(), new LetterBlocker("Z"), new LetterBlocker("k"), new LowercaseConverter()));

        assertEquals("11aawwkk", processor.process("ZZzz11aawwKK"));
    }

    @Test
    void TestProcessor5() {
        Processor processor = new Processor(List.of(new UppercaseConverter(), new LetterBlocker("z"), new LetterBlocker("k"), new LowercaseConverter()));

        assertEquals("zzzz11aawwkk", processor.process("ZZzz11aawwkk"));
    }
}