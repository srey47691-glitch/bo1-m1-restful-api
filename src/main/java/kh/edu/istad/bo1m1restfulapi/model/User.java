package kh.edu.istad.bo1m1restfulapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;
@Getter
@Setter
@AllArgsConstructor
public class User {
    private UUID id;
    private String fullname;
    private String username;
    private String password;
  private Boolean isactive;



}
