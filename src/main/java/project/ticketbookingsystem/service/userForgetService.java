package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.user;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.userMapper;

@Service
public class userForgetService {
    @Autowired
    private userMapper userMapper;

    public result forget(int id, String new_password){
        userMapper.update(id,new_password);
        user user=userMapper.findByid(id);
        result result = new result();
        result.setCode(0);
        result.setMsg("successfully update password");
        System.out.println("successfully update password");
        result.setObj(user);
        return result;
    }
}
