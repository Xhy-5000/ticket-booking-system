package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.flight_baggage_info;

@Mapper
public interface flight_baggage_infoMapper {
    public flight_baggage_info findBaggageInfoByid(int flight_id) ;
}
