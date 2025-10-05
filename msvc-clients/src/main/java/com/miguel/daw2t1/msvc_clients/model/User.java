package com.miguel.daw2t1.msvc_clients.model;

import java.util.Date;

public record User( Long id, String dni, String nombres, String apellidos, Date nacimiento, int port) {

}
