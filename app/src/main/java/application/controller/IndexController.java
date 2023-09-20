package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/")
    public String home() {
        // return "WEB-INF/home.jsp";
        /* Como foi alterado os prefixos/sufixos no application.properties, não há necessidade
            de colocar eles aqui */
        return "home";
    }
}

