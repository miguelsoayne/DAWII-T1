-- CREATE DATABASE
DROP DATABASE IF EXISTS db_t1_miguel_soayne;
CREATE DATABASE db_t1_miguel_soayne;

-- USE DATABASE
USE db_t1_miguel_soayne;

-- CREATE TABLE usuarios
CREATE TABLE usuarios (
    id INT auto_increment NOT NULL,
    dni CHAR(8) NULL,
    nombres VARCHAR(100) NULL,
    apellidos VARCHAR(100) NULL,
    nacimiento DATE NULL,
    CONSTRAINT users_pk PRIMARY KEY (id)
)
ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_0900_ai_ci;

-- INSERTS TABLE usuarios
INSERT INTO usuarios (dni, nombres, apellidos, nacimiento) VALUES
('12345678', 'Carlos', 'Ramírez', '1990-04-12'),
('23456789', 'María', 'Fernández', '1988-11-23'),
('34567890', 'José', 'Castillo', '1995-07-05'),
('45678901', 'Lucía', 'Martínez Salas', '1992-09-17'),
('56789012', 'Andrés', 'Rojas', '2000-01-28'),
('67890123', 'Diana', 'Vargas', '1998-06-09'),
('78901234', 'Miguel', 'Huamán', '1993-03-14'),
('89012345', 'Rosa', 'Paredes', '1989-12-02'),
('90123456', 'Fernando', 'Cáceres', '1997-10-20'),
('01234567', 'Patricia', 'Navarro', '1991-05-30');
