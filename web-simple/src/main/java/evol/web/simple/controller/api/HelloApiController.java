package evol.web.simple.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {

    @RequestMapping("api/hello")
    public String get(){
        return "Hellp API";
    }
}
