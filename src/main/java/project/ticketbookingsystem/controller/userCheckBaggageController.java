package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.userCheckBaggageService;

@RestController
public class userCheckBaggageController {
    @Autowired
    private userCheckBaggageService userCheckBaggageService;

    @ResponseBody
    @RequestMapping(value = "/user/findBaggageInfoByid" , consumes = "application/json")
    public Object userSearchByPosition(@RequestParam int flight_id){
        return userCheckBaggageService.checkBaggage(flight_id);
    }


}
