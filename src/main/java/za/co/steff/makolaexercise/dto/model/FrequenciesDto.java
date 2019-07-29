package za.co.steff.makolaexercise.dto.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Map;

@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class FrequenciesDto {

    private Map<String, Long> frequencies;

    public Map<String, Long> getFrequencies() {
        return frequencies;
    }

    public void setFrequencies(Map<String, Long> frequencies) {
        this.frequencies = frequencies;
    }

    @Override
    public String toString() {
        return "FrequenciesDto{" +
                "frequencies=" + frequencies +
                '}';
    }
}
