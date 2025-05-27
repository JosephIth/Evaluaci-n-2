# Microservicios - Perfulandia SPA

Este repositorio contiene los microservicios desarrollados para la solución distribuida de **Perfulandia SPA**, orientada a la gestión de usuarios, ventas, inventario y sucursales. Cada microservicio está desarrollado utilizando **Spring Boot** y se comunica con los demás a través de API REST.

---

## Arquitectura del sistema

La aplicación está dividida en los siguientes microservicios independientes:


Cada microservicio puede ejecutarse y desarrollarse de forma independiente, siguiendo el patrón de diseño de microservicios.

![Diagrama de Arquitectura](ruta/diagrama-arquitectura.png) <!-- Opcional -->

---

## 📦 Microservicios incluidos

### 1. 👤 microservicio-usuarios
- **Descripción:** Gestión de usuarios del sistema (crear, leer, actualizar, eliminar).
- **Encargado:** Tomás Guajardo
- [Repositorio](https://github.com/TomasG0110/microservicio-usuarios)

### 2. 🛒 microservicio-ventas
- **Descripción:** Registro y administración de ventas y sus detalles.
- **Encargado:** Joseph Ithamar Muñoz

### 3. 📦 microservicio-inventario
- **Descripción:** Administración de productos del inventario por categoría, ID, etc.

### 4. 🏢 microservicio-sucursales
- **Descripción:** Gestión de sucursales físicas de Perfulandia SPA.

---

## 🧪 Pruebas

Se utilizaron pruebas funcionales con **Postman** para verificar:
- Respuestas esperadas (200, 201, 204, 400, 404, 500)
- Integridad de los endpoints
- Conexión exitosa con la base de datos
- Validación de errores

---

## ⚙️ Tecnologías

- Java 17
- Spring Boot
- Spring Data JPA
- Maven
- Oracle DB / H2 (según microservicio)
- Postman
- Git & GitHub
