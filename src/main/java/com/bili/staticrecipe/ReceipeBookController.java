package com.bili.staticrecipe;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ReceipeBookController {
    @RequestMapping("/")
    public String home() {
        return "home";
    }

    @RequestMapping("/recipelist")
    public String recipeList() {
        return "recipelists";
    }

    @RequestMapping("/contact")
    public String contact() {
        return "contact";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }
}

