package za.co.steff.makolaexercise.controller.v1.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

public class WordsRequest {

    @NotEmpty
    @NotNull
    private List<String> words;

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    @Override
    public String toString() {
        return "WordsRequest{" +
                "words=" + words +
                '}';
    }
}
