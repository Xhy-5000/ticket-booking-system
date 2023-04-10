package project.ticketbookingsystem.mapper;

import org.junit.Test;
import project.ticketbookingsystem.entity.user;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class userMapperTest {
    @Autowired
    private userMapper userMapper;

    @Test
    public void findByid(){
        user user =userMapper.findByid(6);
        System.out.println(user);
    }

    @Test
    public void insert(){
        user user = new user();
        user.setUser_id(2);
        user.setPassword("123456");
        userMapper.insert(user);
    }

}
