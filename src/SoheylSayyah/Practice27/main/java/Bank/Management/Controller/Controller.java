package SoheylSayyah.Practice27.main.java.Bank.Management.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Bank")
public class Controller
{
    @GetMapping("/Hello")
    public String helloWorld(){
        return "Hello World";
    }
}
