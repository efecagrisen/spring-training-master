package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com/users", name = "USER-CLIENT")
public interface UserClient {

    @GetMapping("/users")
    List<User> getUsers();

}

//02:03