package com.miguel.daw2t1.msvc_clients.service;

import java.util.List;
import java.util.Optional;

import com.miguel.daw2t1.msvc_clients.model.Client;

public interface ClientService {

    List<Client> findAll();

    Optional<Client> findById(Long id);

}
