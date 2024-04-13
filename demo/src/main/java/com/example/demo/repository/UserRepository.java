package com.example.demo.repository;

import com.example.demo.model.User;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Getter
@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public void addUser(User user){
        users.add(user);
    }

}
