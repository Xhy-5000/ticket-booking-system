package project.ticketbookingsystem.mapper;
import org.junit.Test;
import project.ticketbookingsystem.entity.airline;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)

public class airlineMapperTest {
    @Autowired
    private airlineMapper airlineMapper;

    @Test
    public void findByid(){
        airline airline =airlineMapper.findByName("United Airlines");
        System.out.println(airline);
    }

    @Test
    public void insert(){
        airline airline= new airline();
        airline.setAirline_name("JetBlue Airways");
        airline.setContact_information("1(800)538-2583");
        airline.setPassword("JetBlue Airways");
        airlineMapper.insert(airline);
    }
}
