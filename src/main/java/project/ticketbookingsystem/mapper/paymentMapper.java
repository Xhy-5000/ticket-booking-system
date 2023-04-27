package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.payment;

@Mapper
public interface paymentMapper {
    Integer insert(payment payment);
}
