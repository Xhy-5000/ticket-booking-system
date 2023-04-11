package project.ticketbookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.airline;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.airlineMapper;

@Service
public class airlineLoginService {
    @Autowired
    private airlineMapper airlineMapper;

    public result login(String name, String password){
        airline airline = airlineMapper.findByName(name);
        result result = new result();
        if(airline!=null && airline.getPassword().equals(password)){
            result.setCode(0);
            result.setMsg("successfully login");
            System.out.println("login success");
            result.setObj(airline);
        }else{
            result.setCode(1);
            result.setMsg("login failed");
        }
        return result;
    }

}
