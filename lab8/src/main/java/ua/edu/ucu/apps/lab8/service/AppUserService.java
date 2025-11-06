package ua.edu.ucu.apps.lab8.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.lab8.model.AppUser;
import ua.edu.ucu.apps.lab8.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class AppUserService {

    private AppUserRepository appUserRepository;
    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }
    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public AppUser createUser(AppUser user) {
        return appUserRepository.save(user);
    }

    public Optional<AppUser> getUserByEmail(String email){
        return appUserRepository.findUserByEmail(email);
    }


}
