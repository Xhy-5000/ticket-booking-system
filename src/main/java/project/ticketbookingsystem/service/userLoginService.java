package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.user;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.userMapper;

@Service
public class userLoginService {
    @Autowired
    private userMapper userMapper;

    public result login(int id, String password){
        user user=userMapper.findByid(id);
        result result = new result();
        if(user!=null && password.equals(user.getPassword())){
            result.setCode(0);
            result.setMsg("successfully login");
            System.out.println("login success");
            result.setObj(user);
        }else{
            result.setCode(1);
            result.setMsg("login failed");
        }
        return result;
    }
}
