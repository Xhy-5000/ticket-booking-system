package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.user;

@Mapper
public interface userMapper {
    user findByid(int user_id);

    Integer insert(user user);
}
