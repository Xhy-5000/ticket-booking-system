package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.userSearchService;

@RestController
public class userSearchController {
    @Autowired
    private userSearchService userSearchService;

    @ResponseBody
    @RequestMapping(value = "/user/search" , consumes = "application/json")
    public Object userSearchByPosition(@RequestParam String departure_airport, @RequestParam String arrival_airport){
        return userSearchService.searchByPosition(departure_airport, arrival_airport);
    }

    @ResponseBody
    @RequestMapping(value = "/user/searchDate" , consumes = "application/json")
    public Object userSearchByPositionAndDate(@RequestParam String departure_airport, @RequestParam String arrival_airport,
                                              @RequestParam String date){
        return userSearchService.searchByPositionAndDate(departure_airport, arrival_airport, date);
    }
}
