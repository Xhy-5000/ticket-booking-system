package project.ticketbookingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.deleteUserService;

@RestController
public class deleteUserController {
    @Autowired
    deleteUserService deleteUserService;

    @ResponseBody
    @RequestMapping(value = "/delete" , consumes = "application/json")
    public Object deleteUser(@RequestParam int id){
        return deleteUserService.deleteUser(id);
    }
}
