package za.co.steff.makolaexercise;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import za.co.steff.makolaexercise.dto.model.FrequenciesDto;
import za.co.steff.makolaexercise.service.WordService;

import java.util.*;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MakolaExerciseTests {

    @Autowired
    private WordService wordService;

    @Test
    public void allSingleValues() {
        List<String> words = Arrays.asList("a", "b", "c");

        // Get our expected and actual frequencies
        Map<String, Long> expectedFrequencies = new HashMap<String, Long>() {
            {
                put("a", 1L);
                put("b", 1L);
                put("c", 1L);
            }
        };
        FrequenciesDto frequencies = wordService.getWordFrequencies(words);

        // Our test case
        assertEquals(expectedFrequencies, frequencies.getFrequencies());
    }

    @Test
    public void expectedValues() {
        List<String> words = Arrays.asList("aa", "bd", "aa", "cx", "cx", "cx");

        // Get our expected and actual frequencies
        Map<String, Long> expectedFrequencies = new HashMap<String, Long>() {
            {
                put("aa", 2L);
                put("bd", 1L);
                put("cx", 3L);
            }
        };
        FrequenciesDto frequencies = wordService.getWordFrequencies(words);

        // Our test case
        assertEquals(expectedFrequencies, frequencies.getFrequencies());
    }

    @Test
    public void actualWords() {
        List<String> words = Arrays.asList("parched", "fuzzy", "real", "worthless", "servant", "amazing", "amazing", "worthless",
                "amazing", "festive", "grade", "amazing", "fuzzy", "fuzzy", "real", "actor", "fuzzy", "real", "fuzzy", "entertaining", "servant");

        // Get our expected and actual frequencies
        Map<String, Long> expectedFrequencies = new HashMap<String, Long>() {
            {
                put("worthless", 2L);
                put("parched", 1L);
                put("entertaining", 1L);
                put("fuzzy", 5L);
                put("servant", 2L);
                put("grade", 1L);
                put("real", 3L);
                put("actor", 1L);
                put("festive", 1L);
                put("amazing", 4L);
            }
        };
        FrequenciesDto frequencies = wordService.getWordFrequencies(words);

        // Our test case
        assertEquals(expectedFrequencies, frequencies.getFrequencies());
    }



}
