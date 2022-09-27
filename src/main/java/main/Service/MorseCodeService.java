package main.Service;

import main.DTO.MorseCodeDTO;
import org.springframework.stereotype.Service;

@Service
public class MorseCodeService {


    public String textFromMorse(String morseCode) {
        MorseCodeDTO DTOcode = new MorseCodeDTO();
        DTOcode.setMorseCode(morseCode);

        return DTOcode.makeTextFromMorse();
    }


    public String morseFromText(String text) {
        MorseCodeDTO codeDTO = new MorseCodeDTO();
        codeDTO.setText(text);

        return codeDTO.makeMorseFromText();
    }

}
