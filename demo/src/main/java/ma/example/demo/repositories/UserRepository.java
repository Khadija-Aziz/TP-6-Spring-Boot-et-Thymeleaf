package ma.example.demo.repositories;

import ma.example.demo.entities.user;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<user, Long> {}