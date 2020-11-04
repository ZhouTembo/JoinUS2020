package works.mia.deploylab;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JoinController {

    @GetMapping("/joinus")
    public String joinUs(){
        return "Join us.";
    }

    @GetMapping("/info")
    public String getInfo(){
        return "Why join us you ask?";
    }

}
