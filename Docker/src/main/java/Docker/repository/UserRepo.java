package Docker.repository;

import Docker.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
}
