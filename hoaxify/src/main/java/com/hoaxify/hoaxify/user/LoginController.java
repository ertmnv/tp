package com.hoaxify.hoaxify.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoaxify.hoaxify.user.shared.CurrentUser;
import com.hoaxify.hoaxify.user.vm.UserVM;

@RestController
public class LoginController {

    @PostMapping("/api/1.0/login")
    public UserVM handleLogin(@CurrentUser User loggedInUser) {
        return new UserVM(loggedInUser);
    }
    
}