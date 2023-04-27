package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.airline;

@Mapper
public interface airlineMapper {
    airline findByName(String airline_name);
    Integer insert(airline airline);
}
