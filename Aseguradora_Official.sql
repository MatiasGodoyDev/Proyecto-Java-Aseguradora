-- Crear la base de datos
drop database if exists Aseguradora_Official;		
CREATE DATABASE Aseguradora_Official;
USE Aseguradora_Official;

CREATE TABLE clientes (
    id_cliente INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    FechaDeNacimiento DATE NOT NULL,
    direccion VARCHAR(200),
    nrocontacto VARCHAR(20) NOT NULL,
    dni VARCHAR(10) NOT NULL,
    nrocontactoaux VARCHAR(20)
);


-- Crear la tabla de autos
CREATE TABLE autos (
    id_auto INT AUTO_INCREMENT PRIMARY KEY,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    ano INT NOT NULL,
    vin VARCHAR(17) NOT NULL,
    matricula VARCHAR(20) NOT NULL,
    valor DOUBLE NOT NULL,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);

-- Crear la tabla de registros con claves foráneas
CREATE TABLE registro (
    id_registro INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    contrasena VARCHAR(100) ,
    usurname VARCHAR(50) NOT NULL,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);
CREATE TABLE seguros (
    id_seguros INT AUTO_INCREMENT PRIMARY KEY,
    nombredelseguro VARCHAR(100),
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id_cliente)
);


SELECT * FROM clientes;
select * from registro;
select * from autos;
select * from seguros;
select c.nombre,c.apellido,c.direccion,c.FechaDeNacimiento,a.marca,s.nombredelseguro from clientes c inner join autos a on c.id_cliente=a.id_auto inner join seguros s on a.cliente_id=s.id_seguros;

SELECT c.nombre, c.apellido, c.direccion, c.FechaDeNacimiento, a.marca, s.nombredelseguro FROM clientes c INNER JOIN autos a ON c.id_cliente = a.id_auto INNER JOIN seguros s ON c.id_cliente = s.id_seguros;



