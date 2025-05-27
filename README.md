# Microservicios - Perfulandia SPA

Este repositorio contiene los microservicios desarrollados para la solución distribuida de **Perfulandia SPA**, orientada a la gestión de usuarios, ventas, inventario y sucursales. Cada microservicio está desarrollado utilizando **Spring Boot** y se comunica con los demás a través de API REST.

---

##  Microservicios incluidos

### 1.  microservicio-usuarios
- **Descripción:** Gestión de usuarios del sistema (crear, leer, actualizar, eliminar).
- [Repositorio](https://github.com/TomasG0110/microservicio-usuarios)

### 2.  microservicio-ventas
- **Descripción:** Registro y administración de ventas y sus detalles.
- [Repositorio](https://github.com/JosephIth/MicroServicio-Ventas.git)
  
### 3.  microservicio-inventario
- **Descripción:** Administración de productos del inventario por categoría, ID, etc.

### 4.  microservicio-sucursales
- **Descripción:** Gestión de sucursales físicas de Perfulandia SPA.
- [Repositorio](https://github.com/JosephIth/Microservicio-Sucursal.git)

---

##  Pruebas

Se utilizaron pruebas funcionales con **Postman** para verificar:
- Respuestas esperadas (200, 201, 204, 400, 404, 500)
- Integridad de los endpoints
- Conexión exitosa con la base de datos
- Validación de errores

---

##  Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- Oracle DB / H2 (según microservicio)
- Postman
- Git & GitHub

  ## Configuración de la base de datos

Cada microservicio tiene su propio archivo `application.properties` donde se configura la conexión a la base de datos. A continuación, un ejemplo típico con **Oracle**:

```properties
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XE
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
