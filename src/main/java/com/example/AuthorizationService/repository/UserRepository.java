package com.example.AuthorizationService.repository;

import com.example.AuthorizationService.enums.Authorities;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {

    private final List<Authorities> authorities = new ArrayList<>(Collections.singleton(Authorities.READ));

    public List<Authorities> getUserAuthorities(String user, String password) {
        String password1 = "1111";
        String user1 = "Ivan";
        if (user1.equals(user) & password1.equals(password)){
            return authorities;
        }
        else
            return new ArrayList<>();
    }

}
