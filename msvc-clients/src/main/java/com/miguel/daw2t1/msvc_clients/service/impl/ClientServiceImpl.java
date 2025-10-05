package com.miguel.daw2t1.msvc_clients.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miguel.daw2t1.msvc_clients.client.UserFeignClient;
import com.miguel.daw2t1.msvc_clients.model.Client;
import com.miguel.daw2t1.msvc_clients.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

    @Autowired
    private UserFeignClient userFeignClient;

    @Override
    public List<Client> findAll() {
        return userFeignClient.list().getBody().stream().map(user -> {
            String usuario = generateUsername(user.nombres(), user.apellidos());
            String contrasenia = generateRandomPassword(10);
            return new Client(user, usuario, contrasenia);
        }).collect(Collectors.toList());
    }

    @Override
    public Optional<Client> findById(Long id) {

        var response = userFeignClient.detail(id);
        var user = response.getBody();

        if (user == null) {
            return Optional.empty();
        }

        String usuario = generateUsername(user.nombres(), user.apellidos());
        String contrasenia = generateRandomPassword(10);
        return Optional.of(new Client(userFeignClient.detail(id).getBody(), usuario, contrasenia));
    }



    private String generateUsername(String nombres, String apellidos) {
        if (nombres == null || apellidos == null) return "usuario.desconocido";

        String firstName = nombres.split(" ")[0].toLowerCase();   // Primer nombre
        String lastName = apellidos.split(" ")[0].toLowerCase();  // Primer apellido

        return firstName + "." + lastName;
    }

    private String generateRandomPassword(int length) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%";
        StringBuilder sb = new StringBuilder();
        java.util.Random random = new java.util.Random();
        for (int i = 0; i < length; i++) {
            sb.append(chars.charAt(random.nextInt(chars.length())));
        }
        return sb.toString();
    }

}
