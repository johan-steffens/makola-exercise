package za.co.steff.makolaexercise.service;

import org.springframework.stereotype.Service;
import za.co.steff.makolaexercise.dto.model.FrequenciesDto;

import java.util.AbstractMap;
import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Service
public class WordServiceImpl implements WordService {

    @Override
    public FrequenciesDto getWordFrequencies(List<String> words) {
        FrequenciesDto frequencies = new FrequenciesDto();
        frequencies.setFrequencies(words.stream()
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim())
                .filter(word -> word.length() > 0)
                .collect(groupingBy(Function.identity(), counting())));
        return frequencies;
    }
}
