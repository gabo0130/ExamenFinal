package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    public static User guardar(User user) {
        return null;
    }

    public List<User> listarUsuarios();

    public Optional<User> listarId(long id);

    public int save(User p);

    public void delete(long id);
}
