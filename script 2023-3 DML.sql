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

--insertar registros que son resultado de un SELECT
/*
INSERT Producto(Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios)
SELECT Nombre, Codigo, Costo, PrecioVenta, Existencia, Comentarios
FROM Producto
*/

/*SELECT: permite leer registros de una o varias tablas*/
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