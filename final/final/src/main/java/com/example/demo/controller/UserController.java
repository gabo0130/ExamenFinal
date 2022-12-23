package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping
    public String registrarCuentaDeUsuario(@ModelAttribute("user") User user) {
        UserService.guardar(user);
        return "redirect:/registro?exito";
    }
}
