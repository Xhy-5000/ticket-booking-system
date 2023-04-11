package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.userLoginService;

@RestController
public class userLoginController {
    @Autowired
    userLoginService LoginService;

    @ResponseBody
    @RequestMapping(value = "/login" , consumes = "application/json")
    public Object userLogin(@RequestParam int id, @RequestParam String password){
        return LoginService.login(id,password);
    }
}
