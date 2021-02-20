package ada.wm2.jpa.repository;

import ada.wm2.jpa.entity.Course;
import ada.wm2.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
