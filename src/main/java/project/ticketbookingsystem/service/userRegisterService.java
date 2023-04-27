package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.user;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.mapper.userMapper;

@Service
public class userRegisterService {
    @Autowired
    private userMapper userMapper;

    public result register(String last_name, String first_name, String date_of_birth, String gender, String email,String password){
        user user = new user();
        user.setLast_name(last_name);
        user.setFirst_name(first_name);
        user.setDate_of_birth(date_of_birth);
        user.setGender(gender);
        user.setEmail(email);
        user.setPassword(password);
        userMapper.insert(user);
        result result = new result();
        result.setCode(0);
        result.setMsg("post success");
        result.setObj(user);
        return result;
    }
}
