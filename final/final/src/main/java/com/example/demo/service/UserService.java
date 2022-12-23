package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.example.demo.entity.User
public interface UserService extends UserDetailsService {
    public User guardar(User user);

    public List<User> listarUsuarios();

    public Optional<User> listarId(long id);

    public int save(User p);

    public void delete(long id);
}
