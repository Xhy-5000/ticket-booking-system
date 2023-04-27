package project.ticketbookingsystem.mapper;
import org.apache.ibatis.annotations.Mapper;
import project.ticketbookingsystem.entity.user;

@Mapper
public interface userMapper {
    user findByid(int user_id);

    Integer insert(user user);

    Integer delete(int user_id);

    Integer update(int user_id, String new_password);
}
