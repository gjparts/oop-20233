--crear una base de datos (DDL)
CREATE DATABASE Gerardo
GO
/*--elimina una base de datos (DDL)
DROP DATABASE Gerardo
GO*/
--seleccionar la base de datos
USE Gerardo
GO
--CREAR UNA TABLA (DDL)
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
PRINT 'Tabla Producto Creada' 
GO

--BORRAR UNA TABLA (DLL)
/*DROP TABLE Producto
GO*/

--Agregar una columna a la tabla (DDL)
ALTER TABLE Producto
ADD algo bigint NULL
GO

--Eliminar una columna de la tabla (DDL)
ALTER TABLE Producto
DROP COLUMN algo
GO

--Cambiar las especificaciones de una columna (DDL)
--nombre pasa de tener 150 a 200 char
ALTER TABLE Producto
ALTER COLUMN Nombre VARCHAR(200) NOT NULL
GO