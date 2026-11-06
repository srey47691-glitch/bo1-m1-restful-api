package kh.edu.istad.bo1m1restfulapi.controller;

import kh.edu.istad.bo1m1restfulapi.dto.UserResponse;
import kh.edu.istad.bo1m1restfulapi.model.User;
import kh.edu.istad.bo1m1restfulapi.repository.UserRepository;
import kh.edu.istad.bo1m1restfulapi.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.realm.UserDatabaseRealm;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor

public class UserCotroller {
    private final UserService userService;
    @GetMapping
    public List<UserResponse> getAll() {
        return userService.getAll();


    }


}
