package algorithmsfilter.prefix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrefixTest {

    Prefix prefix = new Prefix();

    @Test
    void testGetWordsStartWith() {
        List<String> source = Arrays.asList("szarvasmarha", "eredet", "kutatás", "szerint", "eper");
        List<String> actual = prefix.getWordsStartWith(source, "sz");

        assertEquals(2, actual.size());
        assertEquals(true, actual.contains(source.get(0)));
        assertEquals(false, actual.contains(source.get(1)));
    }
}