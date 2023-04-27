package project.ticketbookingsystem.mapper;
import org.junit.Test;
import project.ticketbookingsystem.entity.order;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class orderMapperTest {
    @Autowired
    private orderMapper orderMapper;

    @Test
    public void findByUser_id(){
        order[] orders =orderMapper.findByUser_id(6);
        for(order order:orders){
            System.out.println(order);
        }

    }

    @Test
    public void insert(){
        order order = new order();
        order.setPassenger_name("user1");
        order.setPrice(100);
        order.setFk_user_id(11);
        order.setFk_insurance_package("Basic");
        order.setFk_payment_id(8);
        orderMapper.insert(order);
    }
}
