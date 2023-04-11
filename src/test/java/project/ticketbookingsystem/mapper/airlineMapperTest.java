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
}
