package project.ticketbookingsystem.mapper;
import org.junit.Test;
import project.ticketbookingsystem.entity.payment;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;

@SpringBootTest
@RunWith(SpringRunner.class)
public class paymentMapperTest {
    @Autowired
    private paymentMapper paymentMapper;
    @Test
    public void insert(){
        payment payment = new payment();
        payment.setAmount(100);
        payment.setPayment_method("Cash");
        Date date=new Date(System.currentTimeMillis());
        payment.setPayment_date(date);
        payment.setFk_user_id(11);
        paymentMapper.insert(payment);
    }
}
