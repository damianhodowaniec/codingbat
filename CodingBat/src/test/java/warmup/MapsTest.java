package warmup;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapsTest {
    Maps maps = new Maps();
    ArraysBat arraysBat = new ArraysBat();

    @Test
    void wordCountTest(){
        String[] strings = new String[] {"a", "a", "kiss", "ccc", "ccc", "ccc"};
        Map<String, Integer> map = maps.wordCount(strings);

        assertEquals(2,map.get("a"));
    }

    @Test
    void allSwapTest(){
        String[] strings = new String[] {"ac", "avvv", "kiss", "ccc", "cccrrrrr", "cccuuuuuuuuuuuuu"};

        String[] strings1 = maps.allSwap(strings);

    }




}