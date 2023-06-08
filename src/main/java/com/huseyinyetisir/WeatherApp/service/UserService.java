package com.huseyinyetisir.WeatherApp.service;


import com.huseyinyetisir.WeatherApp.dto.user.UserUpdatePasswordRequest;
import com.huseyinyetisir.WeatherApp.entity.AppUser;
import com.huseyinyetisir.WeatherApp.errorMessage.MailDoesntMatchMessage;
import com.huseyinyetisir.WeatherApp.errorMessage.UserNotFound;
import com.huseyinyetisir.WeatherApp.general.BaseEntityService;
import com.huseyinyetisir.WeatherApp.general.ItemNotFoundException;
import com.huseyinyetisir.WeatherApp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService extends BaseEntityService<AppUser, UserRepository> {


    public UserService(UserRepository repository) {
        super(repository);
    }

    public AppUser findByUsername(String username){
        return getRepository().findAppUserByUsername(username);
    }

    public AppUser update(String username, UserUpdatePasswordRequest request){

        AppUser appUser = getRepository().findAppUserByUsername(username);

        if (appUser == null){

            throw new ItemNotFoundException(UserNotFound.USER_NOT_FOUND);

        } else if (!Objects.equals(appUser.getEmail(), request.email())) {

            throw new ItemNotFoundException(MailDoesntMatchMessage.MAIL_DOESNT_MATCH_MESSAGE);
        }
        appUser.setPassword(request.password());
        getRepository().save(appUser);
        return appUser;

    }
}
