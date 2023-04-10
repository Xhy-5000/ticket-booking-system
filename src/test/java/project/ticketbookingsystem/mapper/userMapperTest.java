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
        user.setFirst_name("1");
        user.setLast_name("user");
        user.setDate_of_birth("1990-09-29");
        user.setGender("Male");
        user.setEmail("user1@gmail.com");
        user.setBalance(0);
        user.setMileage(0);
        user.setMembership_level("Basic");
        user.setPassword("123456");
        userMapper.insert(user);
    }

}
