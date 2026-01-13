CREATE SCHEMA IF NOT EXISTS `reto2_g4` DEFAULT CHARACTER SET utf8mb4;
USE `reto2_g4`;

-- =========================
-- CLIENTE
-- =========================
CREATE TABLE cliente (
  DNICliente VARCHAR(9) NOT NULL,
  Nombre CHAR(30) NOT NULL,
  Apellido CHAR(30) NOT NULL,
  Correo CHAR(30) NOT NULL,
  Contraseña VARCHAR(20) NOT NULL,
  PRIMARY KEY (DNICliente)
) ENGINE=InnoDB;

-- =========================
-- SALA
-- =========================
CREATE TABLE sala (
  IDSala VARCHAR(3) NOT NULL,
  NomSala CHAR(30) NOT NULL,
  Aforo INT UNSIGNED NOT NULL DEFAULT 200,
  PRIMARY KEY (IDSala)
) ENGINE=InnoDB;

-- =========================
-- SESION
-- =========================
CREATE TABLE sesion (
  IDSesion VARCHAR(6) NOT NULL,
  FecHoraIni TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  FecHoraFin TIMESTAMP NULL,
  Precio DOUBLE UNSIGNED NOT NULL,
  IDSala VARCHAR(3) NOT NULL,
  PRIMARY KEY (IDSesion),
  CONSTRAINT FK_Sesion_Sala
    FOREIGN KEY (IDSala)
    REFERENCES sala (IDSala)
    ON UPDATE CASCADE
) ENGINE=InnoDB;

-- =========================
-- COMPRA
-- =========================
CREATE TABLE compra (
  IDCompra VARCHAR(3) NOT NULL,
  Fecha TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  DNICliente VARCHAR(9) NOT NULL,
  descuento DOUBLE NOT NULL,
  Canal TINYINT NOT NULL,
  PRIMARY KEY (IDCompra),
  CONSTRAINT fk_Compra_Cliente
    FOREIGN KEY (DNICliente)
    REFERENCES cliente (DNICliente)
    ON UPDATE CASCADE
) ENGINE=InnoDB;

-- =========================
-- ENTRADA
-- =========================
CREATE TABLE entrada (
  IDEntrada INT UNSIGNED NOT NULL,
  NumPers INT UNSIGNED NOT NULL,
  IDSesion VARCHAR(6) NOT NULL,
  IDCompra VARCHAR(3) NOT NULL,
  PRIMARY KEY (IDEntrada),
  CONSTRAINT fk_Entrada_Compra
    FOREIGN KEY (IDCompra)
    REFERENCES compra (IDCompra)
    ON UPDATE CASCADE,
  CONSTRAINT fk_Entrada_Sesion
    FOREIGN KEY (IDSesion)
    REFERENCES sesion (IDSesion)
    ON UPDATE CASCADE
) ENGINE=InnoDB;

-- =========================
-- GENERO
-- =========================
CREATE TABLE genero (
  IDGenero INT UNSIGNED NOT NULL,
  NomGenero CHAR(20) NOT NULL,
  PRIMARY KEY (IDGenero)
) ENGINE=InnoDB;

-- =========================
-- PELICULA
-- =========================
CREATE TABLE pelicula (
  IDPelicula INT UNSIGNED NOT NULL,
  NomPelicula VARCHAR(50) NOT NULL,
  Duracion INT UNSIGNED NOT NULL,
  IDGenero INT UNSIGNED NOT NULL,
  IDSesion VARCHAR(6) NOT NULL,
  PRIMARY KEY (IDPelicula),
  CONSTRAINT FK_Pelicula_Genero
    FOREIGN KEY (IDGenero)
    REFERENCES genero (IDGenero)
    ON UPDATE CASCADE,
  CONSTRAINT FK_Pelicula_Sesion
    FOREIGN KEY (IDSesion)
    REFERENCES sesion (IDSesion)
    ON UPDATE CASCADE
) ENGINE=InnoDB;

insert into Sala (IDSala, NomSala, Aforo)
values ('S01', 'Sala 1', 200);
insert into Sala (IDSala, NomSala, Aforo)
values ('S02', 'Sala 2', 200);

insert into Sesion(IDSesion, FecHoraIni, FecHoraFin, Precio, IDSala)
values('S01-01', '2026-01-16 16:00:00', '2026-01-16 18:00:00', 7.5, 'S01');
insert into Sesion(IDSesion, FecHoraIni, FecHoraFin, Precio, IDSala)
values('S02-02', '2026-01-16 16:00:00', '2026-01-16 18:00:00', 7.5, 'S02');

insert into Genero (IDGenero, NomGenero)
values (1, 'Animación');


insert into Pelicula values(1, 'El Rey León', 88, 1,'S01-01');
insert into Pelicula values(1, 'El Rey León', 88, 1,'S02-02');
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();
insert into Pelicula values();

