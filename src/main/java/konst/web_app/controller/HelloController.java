package konst.web_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("This is a CRUD-application using Spring MVC + Hibernate");
        messages.add("version by September'24");
        model.addAttribute("messages", messages);

        return "index";
    }
}
