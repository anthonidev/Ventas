create database Ventas;
use Ventas;
drop database Ventas;
create table Empleado(
idEmpleado char(8) not null primary key,
Apeliidos varchar(30) not null,
Nombre varchar (15) not null,
Cargo varchar(10) not null,
Telefono int(9) ,
FechaNacimiento date,
FechaContrato date,
direccion text,
Ciudad text
);

create table Niveles(
idNivel char (2) not null primary key,
Nivel varchar(10) not null
);

create table Usuario(
usuario char(6),
clave varchar(20),
idNivel char (2),
idEmpleado char(8),
PRIMARY KEY (idNivel , idEmpleado)
);


SELECT *FROM Empleado;

insert into Empleado
(idEmpleado,Apeliidos,Nombre,Cargo,Telefono,FechaNacimiento,FechaContrato,direccion,Ciudad)
VALUE ("12345678","Portocarrero","Anthoni","123467891","798269875",'2012-07-01','2015-07-02',"callao","ventanilla");

insert into Niveles
(idNivel,Nivel)
VALUE ("01","ADMI");


insert into Usuario
(usuario,clave,idNivel,idEmpleado)
VALUE ("tonsof","123","01","12345678");


select *from Usuario