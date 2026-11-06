package kh.edu.istad.bo1m1restfulapi.service.impl;


import kh.edu.istad.bo1m1restfulapi.dto.UserResponse;
import kh.edu.istad.bo1m1restfulapi.service.UserService;
import kh.edu.istad.bo1m1restfulapi.model.User;
import kh.edu.istad.bo1m1restfulapi.repository.UserRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Getter
@Service
@RequiredArgsConstructor
public class UserServicelmpl  implements UserService {
    private final UserRepository userRepository;

    @Override
    public List<UserResponse> getAll() {
        return userRepository.selectAll()
                .stream()
                .map(user -> new UserResponse(user.getId(),
                        user.getFullname(),
                        user.getIsactive()))
                .toList();
    }

    @Override
    public User getById(UUID id) {
        return null;
    }
}

