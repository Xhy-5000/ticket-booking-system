package project.ticketbookingsystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.userMapper;

@Service
public class deleteUserService {
    @Autowired
    private userMapper userMapper;

    public result deleteUser(int id){
        userMapper.delete(id);
        result result = new result();
        result.setCode(0);
        result.setMsg("successfully delete user");
        System.out.println("delete success");

        return result;
    }
}
