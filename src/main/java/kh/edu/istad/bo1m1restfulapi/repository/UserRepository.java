package kh.edu.istad.bo1m1restfulapi.repository;

import kh.edu.istad.bo1m1restfulapi.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping


public class UserRepository {
    private  List<User> users;
    public  UserRepository() {
        users =List.of(
                new User(UUID.randomUUID(), "admin", "qwer" , "example@gmail.com", true),
                new User(UUID.randomUUID(), "admin1", "qwer" , "example1@gmail.com", true)

        );

    }
public List<User>selectAll(){
   return users;
}
}
