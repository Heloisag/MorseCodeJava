/* Classe objeto */

package main.DTO;
import java.util.List;

public class MorseCodeDTO {
//--------------------------------------------- attributes --------------------------------------------------------------
    private String text;
    private String morseCode;

//--------------------------------------------- beginner Constructor ---------------------------------------------------

    public MorseCodeDTO() {

    } //end

//--------------------------------------------- beginner Getter and Setter ---------------------------------------------

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getMorseCode() {
        return morseCode;
    }

    public void setMorseCode(String morseCode) {
        this.morseCode = morseCode;
    } //end
//--------------------------------------------- beginner methods ---------------------------------------------

    public String makeMorseFromText() {
        char[] chars = this.text.toCharArray();         //charArray --> quebrar cada letra
        String result = "";

        for(char currentCharacter : chars) {
            result = result + MappedMorseCode.getMorseFromTextCharacter(String.valueOf(currentCharacter).toUpperCase()) + " ";

        }

        return result;

    }

    public String makeTextFromMorse() {
        List<String> list = List.of(this.morseCode.split(" "));         // List<String> --> String[]
        String result = "";

        for(String currentCharacter : list) {
            result = result + MappedMorseCode.getTextFromMorseCharacter(currentCharacter);

        }

        return result;

    }

}

