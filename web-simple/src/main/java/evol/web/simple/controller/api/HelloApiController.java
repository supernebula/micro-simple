package evol.web.simple.controller.api;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    public String get(){
        return "Hellp API";
    }
}
