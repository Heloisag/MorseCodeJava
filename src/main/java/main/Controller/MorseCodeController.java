package main.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController                                                                         //
public class MorseCodeController {


    @GetMapping("/helloWorld")                                                          // --> EndPoint //
    public String code(){                                                               // --> Função string //
       return "Hello";
    }
}

