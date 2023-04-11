package project.ticketbookingsystem.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import project.ticketbookingsystem.service.airlinePostService;

@RestController
public class airlinePostController {
    @Autowired
    private airlinePostService airlinePostService;

    @ResponseBody
    @RequestMapping(value = "/airline/post" , consumes = "application/json")
    public Object airlinePost(@RequestParam String departure_airport, @RequestParam String arrival_airport,
                              @RequestParam String airline_name, @RequestParam String departure_time,
                              @RequestParam String arrival_time, @RequestParam String flight_duration,
                              @RequestParam int wifi, @RequestParam int charge,
                              @RequestParam int in_flight_entertainment, @RequestParam int meal){
        return airlinePostService.postNewFlight(departure_airport, arrival_airport, airline_name,
                departure_time, arrival_time, flight_duration, wifi, charge, in_flight_entertainment, meal);
    }
}
