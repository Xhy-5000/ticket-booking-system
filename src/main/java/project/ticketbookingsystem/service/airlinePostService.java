package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.flight;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.flightMapper;
@Service
public class airlinePostService {
    @Autowired
    private flightMapper flightMapper;

    public result postNewFlight(String departure_airport, String arrival_airport, String airline_name,
                                String departure_time, String arrival_time, String flight_duration,
                                int wifi, int charge, int in_flight_entertainment, int meal){
        flight flight = new flight();
        flight.setDeparture_airport(departure_airport);
        flight.setArrival_airport(arrival_airport);
        flight.setAirline_name(airline_name);
        flight.setDeparture_time(departure_time);
        flight.setArrival_time(arrival_time);
        flight.setFlight_duration(flight_duration);
        flight.setWifi(wifi);
        flight.setCharge(charge);
        flight.setIn_flight_entertainment(in_flight_entertainment);
        flight.setMeal(meal);
        flightMapper.insert(flight);
        result result = new result();
        result.setCode(0);
        result.setMsg("post success");
        result.setObj(flight);
        return result;
    }
}
