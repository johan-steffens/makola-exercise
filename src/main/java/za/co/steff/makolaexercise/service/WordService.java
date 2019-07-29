package za.co.steff.makolaexercise.service;

import za.co.steff.makolaexercise.dto.model.FrequenciesDto;

import java.util.List;

public interface WordService {

    FrequenciesDto getWordFrequencies(List<String> words);

}
