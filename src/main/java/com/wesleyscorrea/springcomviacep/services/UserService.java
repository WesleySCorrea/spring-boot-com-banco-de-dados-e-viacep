package com.wesleyscorrea.springcomviacep.services;

import com.wesleyscorrea.springcomviacep.entities.User;
import com.wesleyscorrea.springcomviacep.repositories.UserRepository;
import com.wesleyscorrea.springcomviacep.services.exceptions.DataBaseException;
import com.wesleyscorrea.springcomviacep.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
       Optional<User> obj = userRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
     }

     public User insert(User user) {
        return userRepository.save(user);
     }

     public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DataBaseException(e.getMessage());
        }
     }

     public User update(Long id, User user) {
        User entity = userRepository.getOne(id);
        updateData(user, entity);
        return userRepository.save(entity);
     }

    private void updateData(User user, User entity) {
        if (user.getName() != null) {
            entity.setName(user.getName());
        }
        if (user.getBirthday() != null) {
        entity.setBirthday(user.getBirthday());
        }
        if (user.getCPF() != null) {
        entity.setCPF(user.getCPF());
        }
        if (user.getEmail() != null) {
            entity.setEmail(user.getEmail());
        }
    }
}