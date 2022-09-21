package morsecode.Controller;

/* Library */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseCodeController {

    /* Classe que Recebe informações do front*/
    @GetMapping("/helloWorld")
        public String helloWorld() {             /*Função*/
        return "MagazineHelouisa";
    }
}
