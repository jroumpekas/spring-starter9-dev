package gr.aueb.cf.spring_starter9_dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller                      // Επιστρέφει HTML
@RequestMapping("/starter")     // base path του Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("message", "Hello World");
        return "index";     // index.html μέσα στον folder mv templates

    }
    @GetMapping("/welcome")
    public String sayWelcome(@RequestParam(name = "username", defaultValue = "Guest") String name, Model model){
        model.addAttribute("name", name);
        return "welcome";
    }


}
