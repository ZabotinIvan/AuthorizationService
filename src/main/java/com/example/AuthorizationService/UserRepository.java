package com.example.AuthorizationService;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
public class UserRepository {

     protected String user = "Ivan";
    protected String password = "1111";
    protected List<Authorities> authorities = new ArrayList<>(Collections.singleton(Authorities.READ));
    public List<Authorities> getUserAuthorities(String user, String password) {
        if (this.user.equals(user) & this.password.equals(password)){
            return authorities;
        }
        else
        return null;
    }

}
