package project.ticketbookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import project.ticketbookingsystem.entity.airline;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.airlineMapper;
import org.springframework.stereotype.Service;

@Service
public class airlineRegisterService {
    @Autowired
    private airlineMapper airlineMapper;

    public result register(String airline_name, String contact_information, String airline_password){
        airline airline = new airline();
        airline.setAirline_name(airline_name);
        airline.setPassword(airline_password);
        airline.setContact_information(contact_information);
        airlineMapper.insert(airline);
        result result = new result();
        result.setCode(0);
        result.setMsg("post success");
        result.setObj(airline);
        return result;
    }


}
