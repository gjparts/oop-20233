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

--sumar un NULL devuelve NULL:
SELECT ProductoID, Nombre+': '+CAST(Comentarios as VARCHAR(255))
FROM Producto

--evitar que al sumar un NULL devuelva NULL:
SELECT ProductoID, Nombre+': '+ISNULL( CAST(Comentarios as VARCHAR(255)), 'No tiene coment.')
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

SELECT *
FROM Producto
WHERE Codigo = 'CC01' OR Codigo = 'CC02'

--DELETE (DML)
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

USE Gerardo
GO

--UPDATE (DML)
--actualiza la informacion de uno o mas registros
--si se usa sin WHERE cambia todos los registros de la tabla:
UPDATE Producto
SET Comentarios = NULL

UPDATE Producto
SET Comentarios = 'Pongale mas chicharron'
WHERE ProductoID = 42

UPDATE Producto
SET Existencia = 0
WHERE PrecioVenta <= 10 AND Costo <= 5

--un update tambien puede ser incremental o decremental:
--sumar 10 a todas las existencias de todos los productos
UPDATE Producto
SET Existencia = Existencia + 10

--aumentar el precio de venta en un 15% para las coca colas
UPDATE Producto
SET PrecioVenta = PrecioVenta*1.15
WHERE Nombre LIKE '%Cola%'

--no se puede hacer update a un campo identity
UPDATE Producto
SET ProductoID = 1
WHERE ProductoID = 38

--se puede hacer update a mas de un campo a la vez
UPDATE Producto
SET Comentarios = 'Mala para la Salud', Existencia = 0
WHERE Nombre LIKE '%Cola%'

SELECT * FROM Producto



