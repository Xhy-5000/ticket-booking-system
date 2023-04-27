package project.ticketbookingsystem.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.ticketbookingsystem.entity.order;
import project.ticketbookingsystem.entity.payment;
import project.ticketbookingsystem.entity.result;
import project.ticketbookingsystem.entity.user;
import project.ticketbookingsystem.mapper.paymentMapper;
import project.ticketbookingsystem.mapper.orderMapper;
import project.ticketbookingsystem.mapper.userMapper;

import java.sql.Date;
import java.text.SimpleDateFormat;

@Service
public class userBookService {
    @Autowired
    private paymentMapper paymentMapper;
    @Autowired
    private orderMapper orderMapper;
    @Autowired
    private userMapper userMapper;

    public int pay(int user_id, double amount, String payment_method){
        payment payment = new payment();
        payment.setFk_user_id(user_id);
        java.sql.Date date=new Date(System.currentTimeMillis());
        payment.setPayment_date(date);
        payment.setAmount(amount);
        payment.setPayment_method(payment_method);
        paymentMapper.insert(payment);
        int payment_id = paymentMapper.findid(payment);
        return payment_id;
    }

    public result book(int user_id, String insurance, double price, String payment_method){
        int payment_id = pay(user_id, price,payment_method);
        order order = new order();
        order.setFk_user_id(user_id);
        order.setFk_payment_id(payment_id);
        order.setStatus("Paid");
        order.setFk_insurance_package(insurance);
        user user = userMapper.findByid(user_id);
        order.setPassenger_name(user.getFirst_name()+" "+user.getLast_name());
        order.setPrice(price);
        orderMapper.insert(order);
        result result = new result();
        result.setCode(0);
        result.setMsg("Book success");
        result.setObj(order);
        return result;
    }
}
