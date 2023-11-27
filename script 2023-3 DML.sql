--DML: Data Manipulation Language
--los comandos mas populares: SELECT INSERT DELETE UPDATE
/*INSERT: agrega registros a una tabla, consideraciones:
1) no se menciona el campo IDENTITY ya que ese lo
   numera automaticamente el DBMS
2) esta obligado a mencionar todas las columnas NOT NULL
3) las columnas NULL son opcionales*/
INSERT Producto(Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios)
VALUES('Naranja Unidad','FR01',5,9.25,0,'Tiene vitamina C')

INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencia)
VALUES('FR02','Fresas Bandeja',45,80,10)

--enviar un NULL de forma manual a comentarios
INSERT Producto(Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios)
VALUES('Naranja Unidad','FR01',5,9.25,0,NULL)

INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencia)
VALUES('CC01','Coca Cola 3LT',45,55,0)

INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencia, Comentarios)
VALUES('CC02','Coca Cola 1LT',18,25,7,'No es bueno para la salud')

INSERT Producto(Codigo, Nombre, Costo, PrecioVenta, Existencia)
VALUES('CH01','Rica Sula',4,6,250)

--insertar registros que son resultado de un SELECT
/*
INSERT Producto(Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios)
SELECT Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios
FROM Producto
*/

/*SELECT: permite leer registros de una o varias tablas*/
USE Gerardo
GO

SELECT * FROM Producto --muestra los registros de todas las columnas de Producto

SELECT ProductoID, Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios
FROM Producto

SELECT Codigo, Nombre, PrecioVenta, Comentarios
FROM Producto

--campos calculados en tiempo real
SELECT Codigo, Nombre, Costo, PrecioVenta,
		PrecioVenta-Costo as Ganancia,
		CAST( (PrecioVenta-Costo)/Costo*100 as DECIMAL(12,2) ) as PorcentajeGanancia,
		Comentarios
FROM Producto

--unir dos consultas
SELECT ProductoID, Nombre
FROM Producto
UNION ALL
SELECT ProductoID, Comentarios
FROM Producto

--concatenar los contedos de las columnas a presentar
SELECT Codigo+' '+Nombre as Descripcion, Costo, PrecioVenta
FROM Producto

--uso del WHERE (condiciona el resultado del SELECT)
SELECT *
FROM Producto
WHERE Costo < 10

SELECT *
FROM Producto
WHERE Costo = 45

SELECT *
FROM Producto
WHERE Existencia >= 7

SELECT *
FROM Producto
wHERE Costo >= 20 AND Existencia <= 100

--rango determinado
SELECT * FROM Producto
WHERE Existencia >= 7 AND Existencia <= 50
--rango determinado
SELECT * FROM Producto
WHERE Existencia BETWEEN 7 AND 50

SELECT *
FROM Producto
WHERE Existencia <= 100 AND ( Costo = 5 OR Costo = 45 )

SELECT *
FROM Producto
WHERE Codigo = 'FR01'

SELECT *
FROM Producto
WHERE Nombre LIKE '%col%' AND Costo <= 100

--DELETE
--Borrar todos los registros de la tabla
DELETE FROM Producto
--Borrar registros condicionando con WHERE
DELETE FROM Producto
WHERE Nombre LIKE '%col%' AND Costo <= 100

--eliminar todos los productos cuyo comentario sea NULL
DELETE FROM Producto
WHERE Comentarios IS NULL

--eliminar todos los productos cuyo comentario NO sea NULL
DELETE FROM Producto
WHERE Comentarios IS NOT NULL
