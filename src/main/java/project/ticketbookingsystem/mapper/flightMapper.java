package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.flight;

@Mapper
public interface flightMapper {
    flight findByid(int flight_id);

    flight[] findByAirRoute(String departure_airport, String arrival_airport);

    flight[] findByAirRouteDate(String departure_airport, String arrival_airport, String departure_date);

    Integer insert(flight flight);
}
