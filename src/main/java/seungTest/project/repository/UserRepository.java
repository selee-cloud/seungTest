package seungTest.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import seungTest.project.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
    UserEntity findByPhone(String phone);
    UserEntity findByAddress(String address);
}
