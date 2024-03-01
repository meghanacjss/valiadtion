package com.example.SpringValidators.service;

import com.example.SpringValidators.dto.UserRequest;
import com.example.SpringValidators.entity.User;
import com.example.SpringValidators.exception.UserNotFoundException;
import com.example.SpringValidators.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
@Autowired
    private UserRepository repository;

public User saveUser(@Valid UserRequest userRequest){
    User user = User.build(0,userRequest.getName()
            ,userRequest.getEmail(),userRequest.getMobile(),
            userRequest.getGender(),userRequest.getAge(),
            userRequest.getNationality());
    return repository.save(user);
}

public List<User>getAllUsers(){
    return repository.findAll();
}
public User getUser(int id) throws UserNotFoundException {
    User user = repository.findByUserId(id);
    if(user!=null){
        return user;
    }else{
        throw new UserNotFoundException("user not found with id:"+id);//this is used for if id is not present in that situation
    }
   // return repository.findByUserId(id);
}
}
