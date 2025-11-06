package ua.edu.ucu.apps.lab8.controller;

import java.util.List;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.lab8.model.AppUser;
import ua.edu.ucu.apps.lab8.service.AppUserService;

@RestController
public class AppUserController {
    private AppUserService appUserService;

    @Autowired
    public AppUserController(AppUserService userService){
        this.appUserService = userService;
    }

    @GetMapping("/user")
    public List<AppUser> getUsers() {
        return appUserService.getUsers();
    }

    @PostMapping("/user")
    public AppUser createUser(@RequestBody AppUser user) {
        return appUserService.createUser(user);
    }

    @GetMapping("/user/email")
    public ResponseEntity<AppUser> getUserByEmail(@RequestParam String email) {
        Optional<AppUser> userByEmail = appUserService.getUserByEmail(email);

        if (userByEmail.isPresent()) {
            return ResponseEntity.ok(userByEmail.get());
        }

        return ResponseEntity.notFound().build();
    }

}
