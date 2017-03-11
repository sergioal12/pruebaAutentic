CREATE DATABASE veterinaria;

CREATE TABLE productos(
id INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
nom_producto CHAR(20),
cant_producto INT(5),
ubicacion_producto CHAR(20)
);

CREATE TABLE ventas(
id INT(5) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
venta_efectuada BOOLEAN,
fecha_venta timestamp,
total_venta INT(10),
despacho_venta char(20),
id_producto INT(5)
);