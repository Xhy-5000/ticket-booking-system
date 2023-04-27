package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.airlineRegisterService;
import project.ticketbookingsystem.service.userRegisterService;

@RestController
public class userRegisterController {
    @Autowired
    private userRegisterService userRegisterService;
    @ResponseBody
    @RequestMapping(value = "/user/register" , consumes = "application/json")
    public Object airlinePost(@RequestParam String last_name, @RequestParam String first_name,
                              @RequestParam String date_of_birth, @RequestParam String gender,
                              @RequestParam String email,@RequestParam String password){
        return userRegisterService.register(last_name, first_name, date_of_birth, gender, email, password);
    }
}
