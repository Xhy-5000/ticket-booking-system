package project.ticketbookingsystem.mapper;
import org.junit.Test;
import project.ticketbookingsystem.entity.flight_baggage_info;
import project.ticketbookingsystem.entity.order;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class flight_baggage_infoMapperTest {
    @Autowired
    private flight_baggage_infoMapper flight_baggage_infoMapper;

    @Test
    public void Flight_baggage_infoMapper(){
        flight_baggage_info  info=flight_baggage_infoMapper.findBaggageInfoByid(5);
        System.out.println(info.toString());

    }
}
