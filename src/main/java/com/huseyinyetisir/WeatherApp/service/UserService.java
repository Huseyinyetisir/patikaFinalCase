package com.huseyinyetisir.WeatherApp.service;


import com.huseyinyetisir.WeatherApp.dto.user.UserUpdateRequest;
import com.huseyinyetisir.WeatherApp.entity.User;
import com.huseyinyetisir.WeatherApp.general.BaseEntityService;
import com.huseyinyetisir.WeatherApp.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseEntityService<User, UserRepository> {


    public UserService(UserRepository repository) {
        super(repository);
    }

    public User findByUsername(String username){
        return getRepository().findUserByUsername(username);
    }

    public User update(String username, UserUpdateRequest request){
        User user = getRepository().findUserByUsername(username);
        user.setPassword(request.password());
        getRepository().save(user);
        return user;
    }
}
