package project.ticketbookingsystem.mapper;

import org.junit.Test;
import project.ticketbookingsystem.entity.flight;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class flightMapperTest {
    @Autowired
    private flightMapper flightMapper;

    @Test
    public void findByid(){
        flight flight =flightMapper.findByid(1);
        System.out.println(flight);
    }

    @Test
    public void findByAirRoute(){
        flight[] flights =flightMapper.findByAirRoute("John F. Kennedy International Airport",
                "Pittsburgh Internetional Airport");
        for(flight flight:flights){
            System.out.println(flight);
        }

    }

    @Test
    public void findByAirRouteDate(){
        flight[] flights =flightMapper.findByAirRouteDate("John F. Kennedy International Airport",
                "Pittsburgh Internetional Airport", "2023-05-05");
        for(flight flight:flights){
            System.out.println(flight);
        }
    }

    @Test
    public void insert(){
        for(int i=1;i<10; i++){
            flight flight = new flight();
            flight.setDeparture_airport("John F. Kennedy International Airport");
            flight.setArrival_airport("Pittsburgh Internetional Airport");
            flight.setAirline_name("United Airlines");
            flight.setDeparture_time("2023-05-0"+i+" 17:00:00");
            flight.setArrival_time("2023-05-0"+i+" 19:40:00");
            flight.setFlight_duration("2h 40m");
            flight.setWifi(0);
            flight.setCharge(0);
            flight.setIn_flight_entertainment(0);
            flight.setMeal(0);
            flightMapper.insert(flight);
        }

    }
}
