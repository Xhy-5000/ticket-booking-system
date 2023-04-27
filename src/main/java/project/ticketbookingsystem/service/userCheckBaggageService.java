package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.flight_baggage_info;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.flight_baggage_infoMapper;
@Service

public class userCheckBaggageService {
    @Autowired
    private flight_baggage_infoMapper flight_baggage_infoMapper;

    public result checkBaggage(int flight_id){
        flight_baggage_info info=flight_baggage_infoMapper.findBaggageInfoByid(flight_id);

        result result = new result();
        result.setCode(0);
        result.setMsg("Baggage Check Success");
        result.setObj(info);
        return result;
    }
}
