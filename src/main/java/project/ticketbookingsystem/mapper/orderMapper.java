package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.order;

@Mapper
public interface orderMapper {
    order[] findByUser_id(int user_id);

    Integer insert(order order);
}
