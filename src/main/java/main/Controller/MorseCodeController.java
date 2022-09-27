package main.Controller;

// Imports

import main.DTO.MorseCodeDTO;
import main.Service.MorseCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
// Inicio/identifica uma Controlller
public class MorseCodeController {

    @Autowired
    private MorseCodeService morseCodeService;

    /**
     * ResquestBody --> recebe o tipo do parametro;
     */
    @GetMapping("/getTextFromMorse")
    public ResponseEntity<MorseCodeDTO> getTextFromMorse(@RequestBody MorseCodeDTO textCodeDTORequest) {
        MorseCodeDTO morseCodeResponse = new MorseCodeDTO();

        try {
            morseCodeResponse.setText(morseCodeService.textFromMorse(textCodeDTORequest.getMorseCode()));
            return new ResponseEntity<>(morseCodeResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/getMorseFromText")
    public String getMorseFromText(
            @RequestBody MorseCodeDTO morseCodeDTORequest) {
        return morseCodeService.morseFromText(morseCodeDTORequest.getText());
    }

    /* @GetMapping("/helloWorld")                                                              // --> EndPoint
     * public String helloWorld() {                                                            // --> Função string
     *  return "Hello"; }
     */
}

