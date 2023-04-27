package project.ticketbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.userForgetService;

@RestController
public class UserForgetController {
    @Autowired
    userForgetService userForgetService;

    @ResponseBody
    @RequestMapping(value = "/user/forget" , consumes = "application/json")
    public Object userForget(@RequestParam int id, @RequestParam String password){
        return userForgetService.forget(id,password);
    }
}
