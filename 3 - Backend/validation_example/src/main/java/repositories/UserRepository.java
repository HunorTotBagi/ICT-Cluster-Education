package repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import entities.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}