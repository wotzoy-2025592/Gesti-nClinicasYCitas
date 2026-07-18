package com.gestionconsultasmedicas.GestionClinicasYCitas.service;

import com.gestionconsultasmedicas.GestionClinicasYCitas.entity.User;

import java.util.List;

public interface IUserService {

    List<User> listarTodos();
    List<User> listarID();

    User guardar();
    User eliminar(String id);

    User actualizar(String id, User user);

}
