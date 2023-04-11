package project.ticketbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.airlineLoginService;

@RestController
public class airlineLoginController {
    @Autowired
    airlineLoginService airlineLoginService;

    @ResponseBody
    @RequestMapping(value = "/airline/login" , consumes = "application/json")
    public Object patientLogin(@RequestParam String name, @RequestParam String password){
        return airlineLoginService.login(name,password);
    }
}