package main.DTO;

import java.util.HashMap;
import java.util.Map;

public class MappedMorseCode {

    /**
     * Map<String, String> utiliza uma estrutura de dicionario para receber valores a partir de um parametro
     * @param morseCharactere Caractere em morse para ser traduzido para texto
     * @return Caractere em texto de acordo com o caractere em morse
     */
    public static String getTextFromMorseCharacter(String morseCharacter) {
        Map<String,String> mappedStrings = new HashMap<>();  //hashmap --> Faz com que o map inicie nulo/vazio.

        mappedStrings.put(".-", "A");
        mappedStrings.put("-...", "B");
        mappedStrings.put("-.-.", "C");
        mappedStrings.put("-..", "D");
        mappedStrings.put(".", "E");
        mappedStrings.put("..-.", "F");
        mappedStrings.put("--.", "G");
        mappedStrings.put("....", "H");
        mappedStrings.put("..", "I");
        mappedStrings.put(".---", "J");
        mappedStrings.put("-.-", "K");
        mappedStrings.put(".-..", "L");
        mappedStrings.put("--", "M");
        mappedStrings.put("-.", "N");
        mappedStrings.put("---", "O");
        mappedStrings.put(".--.", "P");
        mappedStrings.put("--.-", "Q");
        mappedStrings.put(".-.", "R");
        mappedStrings.put("...", "S");
        mappedStrings.put("-", "T");
        mappedStrings.put("..-", "U");
        mappedStrings.put("...-", "V");
        mappedStrings.put(".--", "W");
        mappedStrings.put("-..-", "X");
        mappedStrings.put("-.--", "Y");
        mappedStrings.put("--..", "Z");
        mappedStrings.put("|", " ");

        return mappedStrings.get(morseCharacter);
    }

    public static String getMorseFromTextCharacter(String characterMorse) {
        Map<String,String> mappedStrings = new HashMap<>();

        mappedStrings.put("A", ".-");
        mappedStrings.put("B", "-...");
        mappedStrings.put("C", "-.-.");
        mappedStrings.put("D", "-..");
        mappedStrings.put("E", ".");
        mappedStrings.put("F", "..-.");
        mappedStrings.put("G", "--.");
        mappedStrings.put("H", "....");
        mappedStrings.put("I", "..");
        mappedStrings.put("J", ".---");
        mappedStrings.put("K", "-.-");
        mappedStrings.put("L", ".-..");
        mappedStrings.put("M", "--");
        mappedStrings.put("N", "-.");
        mappedStrings.put("O", "---");
        mappedStrings.put("P", ".--.");
        mappedStrings.put("Q", "--.-");
        mappedStrings.put("R", ".-.");
        mappedStrings.put("S", "...");
        mappedStrings.put("T", "-");
        mappedStrings.put("U", "..-");
        mappedStrings.put("V", "...-");
        mappedStrings.put("W", ".--");
        mappedStrings.put("X", "-..-");
        mappedStrings.put("Y", "-.--");
        mappedStrings.put("Z", "--..");
        mappedStrings.put(" ", "|");

        return mappedStrings.get(characterMorse);


    }
}





// Tipos primitivos
// Tipos