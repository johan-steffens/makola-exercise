package za.co.steff.makolaexercise.controller.v1.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.co.steff.makolaexercise.controller.v1.request.WordsRequest;
import za.co.steff.makolaexercise.dto.model.FrequenciesDto;
import za.co.steff.makolaexercise.dto.response.Response;
import za.co.steff.makolaexercise.service.WordService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class WordController {

    @Autowired
    private WordService wordService;

    @PostMapping("/freq")
    public Response calculateFrequencies(@RequestBody @Valid WordsRequest wordsRequest) {
        Response<FrequenciesDto> response = Response.ok();
        response.setPayload(wordService.getWordFrequencies(wordsRequest.getWords()));
        return response;
    }

}
