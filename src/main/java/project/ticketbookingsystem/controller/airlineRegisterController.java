package project.ticketbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.airlineRegisterService;

@RestController
public class airlineRegisterController {
    @Autowired
    private airlineRegisterService airlineRegisterService;
    @ResponseBody
    @RequestMapping(value = "/airline/register" , consumes = "application/json")
    public Object airlinePost(@RequestParam String airline_name, @RequestParam String contact_information,
                              @RequestParam String airline_password){
        return airlineRegisterService.register(airline_name, contact_information, airline_password);
    }
}
