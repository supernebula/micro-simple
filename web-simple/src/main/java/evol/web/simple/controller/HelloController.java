package evol.web.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HelloController {

    public String index(Model model){
        return "hello/index";
    }
}
