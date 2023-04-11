package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.flight;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.flightMapper;

import java.util.Arrays;

@Service
public class userSearchService {
    @Autowired
    private flightMapper flightMapper;

    public result searchByPosition(String departure_airport, String arrival_airport){
        flight[] flights = flightMapper.findByAirRoute(departure_airport,arrival_airport);
        result result = new result();
        Arrays.sort(flights,(o1, o2) -> {
            String time1 = o1.getDeparture_time();
            String time2 = o2.getDeparture_time();
            return time1.compareTo(time2);
        });
        if(flights!=null){
            result.setCode(0);
            result.setMsg("search success");
        }else{
            result.setCode(1);
            result.setMsg("No vaild flight");
        }
        result.setObj(flights);
        return result;
    }

    public result searchByPositionAndDate(String departure_airport, String arrival_airport, String date){
        flight[] flights = flightMapper.findByAirRouteDate(departure_airport,arrival_airport,date);
        result result = new result();
        Arrays.sort(flights,(o1, o2) -> {
            String time1 = o1.getDeparture_time();
            String time2 = o2.getDeparture_time();
            return time1.compareTo(time2);
        });
        if(flights!=null){
            result.setCode(0);
            result.setMsg("search success");
        }else{
            result.setCode(1);
            result.setMsg("No vaild flight");
        }
        result.setObj(flights);
        return result;
    }
}
