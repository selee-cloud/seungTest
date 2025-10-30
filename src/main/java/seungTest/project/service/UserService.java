package seungTest.project.service;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import seungTest.project.repository.UserRepository;
import seungTest.project.entity.UserEntity;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public UserEntity getUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public UserEntity getUserByPhone(String phone) {
        return userRepository.findByPhone(phone);
    }
    
    public UserEntity getUserByAddress(String address) {
        return userRepository.findByAddress(address);
    }
}

