package ci1.cics.iceaas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String hello(){
        return "index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/consultar")
    public String consultar(Model model){
        model.addAttribute("trans", null);

        return "consultar";
    }

    @GetMapping("/form")
    public String form(){
        return "form";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @ResponseBody
    @GetMapping("/greeting")
    public String greeting(){
        return "Hello World";
    }

}
