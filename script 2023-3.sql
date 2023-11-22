--crear una base de datos (DDL)
CREATE DATABASE Gerardo
GO
/*--elimina una base de datos (DDL)
DROP DATABASE Gerardo
GO*/
--seleccionar la base de datos
USE Gerardo
GO
--CREAR UNA TABLA
CREATE TABLE Producto(
	ProductoID bigint NOT NULL IDENTITY(1,1),
	Nombre VARCHAR(150) NOT NULL,
	Codigo VARCHAR(20) NOT NULL,
	Costo DECIMAL(12,2) NOT NULL,
	PrecioVenta DECIMAL(12,2) NOT NULL,
	Existencia DECIMAL(12,2) NOT NULL,
	Comentarios TEXT NULL,
	PRIMARY KEY(ProductoID)
)
GO