🧩 DAWII-T1 — Proyecto Examen T1

Curso: Desarrollo de Aplicaciones Web II

Docente: Santos Torres César Enrique

Estudiante: Soayne Magaño Miguel Alejandro

📘 Descripción del Proyecto

Este proyecto corresponde a la solución del Examen T1 del curso Desarrollo de Aplicaciones Web II (DAW II).
Implementa una arquitectura basada en microservicios utilizando Spring Cloud, OpenFeign y LoadBalancer, demostrando la comunicación entre servicios mediante consumo de APIs REST.

⚙️ Estructura del Proyecto
Carpeta / Módulo	Descripción
msvc-users	Microservicio proveedor de datos. Gestiona y expone la información de los usuarios.
msvc-clients	Microservicio consumidor, que obtiene los datos de msvc-users y agrega los campos adicionales de usuario y contraseña.
🗄️ Base de Datos

Gestor: MySQL Server

Archivo SQL: daw_ii_t1_miguel_soayne.sql

Descripción: Contiene la estructura y datos iniciales de la tabla usuarios.

🚀 Tecnologías Utilizadas

Java 21

Spring Boot 

Spring Cloud OpenFeign

Spring Cloud LoadBalancer

MySQL Server

Maven

Lombok

📦 Ejecución del Proyecto

Clonar el repositorio:

git clone https://github.com/miguelsoayne/DAWII-T1.git

Importar los proyectos msvc-users y msvc-clients en tu IDE (Eclipse, IntelliJ, VS Code).

Configurar la conexión a la base de datos MySQL en el archivo application.properties.

Ejecutar ambos microservicios.

Verificar la comunicación entre servicios mediante las rutas expuestas.


⚡ Endpoints del Proyecto

| Microservicio                | Puerto                            | Descripción                                                                                  |
| ---------------------------- | --------------------------------- | -------------------------------------------------------------------------------------------- |
| **msvc-users (instancia 1)** | `http://localhost:8001/api/users` | Provee los datos base de los usuarios.                                                       |
| **msvc-users (instancia 2)** | `http://localhost:9001/api/users` | Segunda instancia para pruebas de balanceo.                                                  |
| **msvc-clients**             | `http://localhost:8002/api/clients` | Consume `msvc-users` mediante **LoadBalancer** y agrega los campos *usuario* y *contraseña*. |
