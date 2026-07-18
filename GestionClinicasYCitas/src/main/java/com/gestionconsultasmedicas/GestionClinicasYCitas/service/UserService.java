package com.gestionconsultasmedicas.GestionClinicasYCitas.service;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService implements IUserService {

    private IUserService userService;

    public void IUserService(IUserService userService){
        this.userService = userService;
    }

    @Override
    public List<User> listarTodos() {
        return List.of();
    }

    @Override
    public List<User> listarID() {
        return List.of();
    }

    @Override
    public User guardar() {
        return null;
    }

    @Override
    public User eliminar(String id) {
        return null;
    }

    @Override
    public User actualizar(String id, User user) {
        return null;
    }
}
