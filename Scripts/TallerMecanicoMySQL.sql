create database TallerMecanico;
use TallerMecanico;
create table Cliente(
	cedula int not null primary key,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    apellido2 varchar(100) not null,
    direccion varchar(300) not null,
    telefono int unique not null,
    check(cedula>0)

);

create table Vehiculo(
	placa int not null,
    propietario int not null,
    marca varchar(100) not null,
    modelo varchar(100) not null,
    año int not null,
    foreign key(propietario) references Cliente(cedula),
    primary key (placa,propietario),
    check(placa>0),
    check(año between 1970 and 2021)
    

);

alter table Vehiculo add column color varchar(25) not null;

create table Mecanico(
	codigo int not null primary key,
    nombre varchar(100) not null,
    apellido varchar(100) not null,
    apellido2 varchar(100) not null

);

create table Reparacion(
	id int not null primary key,
    placa int not null,
    cliente int not null,
    mecanicoLider int not null,
    fechaEntrada date,
    foreign key(placa) references Vehiculo(placa),
    foreign key(cliente) references Vehiculo(propietario),
    foreign key(mecanicoLider) references Mecanico(codigo),
    check(placa>0)
);

create table Mecanico_Secundario(
	idReparacion int not null,
    codigoMecanico int not null,
    foreign key(idReparacion) references Reparacion(id),
    foreign key(codigoMecanico) references Mecanico(codigo),
    primary key(idReparacion,codigoMecanico)

);

create table Repuesto(
	codigo int not null primary key,
    nombre varchar(150) not null,
    precio double(8,2) not null

);

create table Repuesto_Reparacion(
	codigoRepuesto int not null,
    idReparacion int not null,
    foreign key(codigoRepuesto) references Repuesto(codigo),
    foreign key(idReparacion) references Reparacion(id),
    primary key(codigoRepuesto,idReparacion)

);

create table ManoDeObra(
	codigo int not null primary key,
    nombre varchar(200) not null,
    monto double(8,2) not null

);

create table ManoObra_Reparacion(
	codigoManoObra int not null,
    idReparacion int not null,
    foreign key(codigoManoObra) references ManoDeObra(codigo),
    foreign key(idReparacion) references Reparacion(id),
    primary key(codigoManoObra,idReparacion)

);

create table Factura(
	numero int not null primary key,
    idReparacion int not null,
    fechaEntregado date not null,
    totalAPagar double(8,2) not null,
    foreign key(idReparacion) references Reparacion(id)

);

insert into Cliente values(118180009,'Richard','Leon','Chinchilla','Desamparados',86272041);
insert into Vehiculo values(111,118180009,'Toyota','Tercel',2001,'Verde');
insert into Vehiculo values(222,118180009,'Nissan','Tida',2011,'Gris');
insert into Vehiculo values(333,118180009,'Kia','Picanto',2016,'Azul');
insert into Vehiculo values(444,118180009,'Mazda','R8',2012,'Rojo');
insert into Vehiculo values(555,118180009,'Range Rover','Discovery',2021,'Blanco');

insert into Mecanico values(1,'Juan','Guarnizo','Robles');
insert into Mecanico values(2,'Carlitos','Ramos','del Cordero');
insert into Mecanico values(3,'Pancho','Panza','Segura');

insert into Repuesto values(1010,'Aceite',10);
insert into Repuesto values(1011,'Embrague',60);
insert into Repuesto values(1012,'Llanta',70);
insert into Repuesto values(1013,'Freno',100);
insert into Repuesto values(1014,'Carburador',50);
insert into Repuesto values(1015,'Bateria',200);

insert into ManoDeObra values(50,'Cambio de Aceite',6);
insert into ManoDeObra values(51,'Revision Normal',10);
insert into ManoDeObra values(52,'Limpieza del motor',20);
insert into ManoDeObra values(53,'Cambio de Embrague',30);
insert into ManoDeObra values(54,'Cambio de Llanta',15);
insert into ManoDeObra values(55,'Cambio de Freno',43);
insert into ManoDeObra values(56,'Cambio de Carburador',35);
insert into ManoDeObra values(57,'Cambio de Bateria',115);

select * from Cliente;
select * from Vehiculo;
select * from Mecanico;
select * from Repuesto;
select * from ManoDeObra;

delete from Cliente where cedula!=118180009;
drop table Cliente;
drop table Vehiculo;
drop table Mecanico;
drop table Reparacion;
drop table Mecanico_Secundario;
drop table Repuesto;
drop table Repuesto_Reparacion;
drop table ManoDeObra;
drop table ManoObra_Reparacion;
drop table Factura;
