package kh.edu.istad.bo1m1restfulapi.service;

import kh.edu.istad.bo1m1restfulapi.dto.UserResponse;
import kh.edu.istad.bo1m1restfulapi.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {
    List<UserResponse> getAll();
    User getById(UUID id);
}
