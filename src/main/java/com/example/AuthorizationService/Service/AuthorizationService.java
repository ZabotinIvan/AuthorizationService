package com.example.AuthorizationService.Service;
import com.example.AuthorizationService.Enums.Authorities;
import com.example.AuthorizationService.Exception.InvalidCredentials;
import com.example.AuthorizationService.Exception.UnauthorizedUser;
import com.example.AuthorizationService.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;
import java.util.Objects;

@Service
public class AuthorizationService {
    @Autowired
    UserRepository userRepository;

    public List<Authorities> getAuthorities(String user, String password) {
        if (isEmpty(user) || isEmpty(password)) {
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(user, password);
        if (isEmpty(userAuthorities)) {
            throw new UnauthorizedUser("Unknown user " + user);
        }
        return userAuthorities;
    }

    private boolean isEmpty(String str) {
        return Objects.equals(str, "") || str.isEmpty();
    }

    private boolean isEmpty(List<?> str) {
        return str == null || str.isEmpty();
    }
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<String> responseEntity(RuntimeException e) {
        return new ResponseEntity<>("User name or password is empty", HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> responseEntity(IllegalArgumentException e) {
        return new ResponseEntity<>("User name or password is empty", HttpStatus.UNAUTHORIZED);
    }

}
