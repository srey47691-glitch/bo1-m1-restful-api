package kh.edu.istad.bo1m1restfulapi.dto;


import java.util.UUID;

public record UserResponse(
        UUID id,
        String fullname,
        Boolean isactive
) {

}
