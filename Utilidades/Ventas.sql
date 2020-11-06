-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 06-11-2020 a las 02:21:45
-- Versión del servidor: 10.5.6-MariaDB
-- Versión de PHP: 7.4.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Categoria`
--

CREATE TABLE `Categoria` (
  `idCategoria` char(2) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nombre` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Categoria`
--

INSERT INTO `Categoria` (`idCategoria`, `nombre`) VALUES
('01', 'Administracion'),
('02', 'vendedor'),
('03', 'Limpieza');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Cliente`
--

CREATE TABLE `Cliente` (
  `idCliente` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DNI` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nombre` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apellido` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Numero` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Sexo` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Cliente`
--

INSERT INTO `Cliente` (`idCliente`, `DNI`, `Nombre`, `Apellido`, `Numero`, `Sexo`) VALUES
('10000', '74589632', 'SEBASTIAN', 'VALDEZ MELERO', '958612546', 'M'),
('10001', '74125811', 'Laura', 'VICO TORRALBA', '21125478963', 'M'),
('10002', '74125896', 'ANA', 'ARANDA BOLUDA', '87456321455', 'F'),
('10003', '74747475', 'Anthoni', 'Portocarrero', '958612546', 'M'),
('10004', '47856932', 'Luis', 'Rodas Chavez', '741258963', 'M'),
('10005', '38310753', 'Bruno', 'Alarcón', '942767022', 'M'),
('10006', '37331314', 'David ', 'Mesa', '1132119', 'M'),
('10007', '60797837', 'Carla', 'Andrade', '191 4686', 'F'),
('10008', '23584720', 'Maria', 'Moya', '913757359', 'F'),
('10009', '24787479', 'Jorgee', 'Padilla', '995100215', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `DetalleVenta`
--

CREATE TABLE `DetalleVenta` (
  `idDetalleventa` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idVentas` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `idProducto` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precioventa` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `DetalleVenta`
--

INSERT INTO `DetalleVenta` (`idDetalleventa`, `idVentas`, `idProducto`, `cantidad`, `precioventa`) VALUES
('10000', '10000', '10001', 3, 15),
('10001', '10013', '10001', 2, 16),
('10002', '10014', '10001', 2, 16),
('10003', '10014', '10002', 1, 5),
('10004', '10014', '10002', 3, 15),
('10005', '10014', '10003', 4, 20),
('10006', '10015', '10001', 2, 16),
('10007', '10015', '10001', 4, 32),
('10008', '10015', '10001', 3, 24),
('10009', '10015', '10002', 4, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Empleado`
--

CREATE TABLE `Empleado` (
  `idEmpleado` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `DNI` char(8) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nombre` varchar(12) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Apellido` varchar(30) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Numero` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `FechaNa` date DEFAULT NULL,
  `FechaIng` date DEFAULT NULL,
  `idCategoria` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `sexo` char(1) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Empleado`
--

INSERT INTO `Empleado` (`idEmpleado`, `DNI`, `Nombre`, `Apellido`, `Numero`, `FechaNa`, `FechaIng`, `idCategoria`, `sexo`) VALUES
('10000', '74747474', 'Anthoni', 'Portocarrero', '958612546', '1999-12-21', '2015-10-15', '01', 'M'),
('10001', '80446710', 'Clara', 'Solano', '1038394', '1998-11-10', '2015-10-10', '03', 'F'),
('10002', '75996107', 'Ximena', ' Zavala Godínez', '1545107', '1991-10-12', '2018-10-13', '01', 'F'),
('10003', '93742753', 'Agustín ', 'Facundo', '1927469', '1974-10-20', '2015-10-20', '03', 'M'),
('10004', '38023128', 'Gabriel', 'Linares  ', '901524380', '1998-06-09', '2020-10-02', '03', 'M');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Nivel`
--

CREATE TABLE `Nivel` (
  `idNivel` char(2) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nivel` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Nivel`
--

INSERT INTO `Nivel` (`idNivel`, `Nivel`) VALUES
('01', 'ADMI'),
('02', 'Vendedor'),
('03', 'Conta');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `idProducto` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `nombre` varchar(15) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Descripcion` varchar(150) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idProveedor` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `Stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Producto`
--

INSERT INTO `Producto` (`idProducto`, `nombre`, `Descripcion`, `idProveedor`, `precio`, `Stock`) VALUES
('10000', 'Coca Cola', 'Gaseosa de un 1 litro\r\nbotella de vidrio', '10000', 2, 35),
('10001', 'Sublime', 'Rellleno de manjar \n\npaquete de 6 unidades', '10003', 8, 35),
('10002', 'Papa Lay\'s', 'Contiene más aire que papas ', '10002', 5, 35),
('10003', 'Caramelos', 'paquete de caremelos\n\nsabor a limon', '10004', 5, 10),
('10004', 'Galletas', 'paquete de galletas\n\nsabor fresa\n\n6 unidades', '10004', 15, 20),
('10005', 'Leche', 'paquetes de tarros de leche\n\n12 uniades\n\n', '10005', 20, 27),
('10006', 'Chocolate', 'paquete de barras de chocolate\n\n10 unidades', '10001', 30, 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Proveedor`
--

CREATE TABLE `Proveedor` (
  `idProveedor` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Nombre` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Telefono` varchar(12) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Direccion` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Proveedor`
--

INSERT INTO `Proveedor` (`idProveedor`, `Nombre`, `Telefono`, `Direccion`) VALUES
('10000', 'Coca Cola', '963258741', 'Calle 13'),
('10001', 'Cusco', '858585858', 'C. Comercial Lorem, 263A 7ºF'),
('10002', 'Lay\'s', '957 215 941', 'Cl. Juan Diego Barreto # 7272 '),
('10003', 'Nestle', '186 8930', 'Av. Bautista Bustamante # 76036 '),
('10004', 'Ambrosoli', 'a962703639', 'Av. Carla Becerra # 239 Dpto. 790'),
('10005', 'Gloria', '997173605', 'Urb. Hugo Tirado # 4 Piso 60');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuario`
--

CREATE TABLE `Usuario` (
  `usuario` varchar(15) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `clave` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `idNivel` char(2) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `idEmpleado` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `mode` varchar(1) COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Usuario`
--

INSERT INTO `Usuario` (`usuario`, `clave`, `idNivel`, `idEmpleado`, `mode`) VALUES
('Admin', '123', '01', '10000', ''),
('Admin', '123', '01', '10000', ''),
('root', '123', '01', '10001', '3'),
('pueba', '123', '01', '10004', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ventas`
--

CREATE TABLE `Ventas` (
  `idVentas` char(5) COLLATE utf8mb4_unicode_ci NOT NULL,
  `idCliente` char(5) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `FechaVenta` date DEFAULT NULL,
  `Monto` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Volcado de datos para la tabla `Ventas`
--

INSERT INTO `Ventas` (`idVentas`, `idCliente`, `FechaVenta`, `Monto`) VALUES
('10000', '10001', '2020-05-05', 170),
('10001', '10002', '2020-10-22', 45),
('10013', '10002', '2020-10-26', 16),
('10014', '10009', '2020-11-05', 56),
('10015', '10008', '2020-11-05', 92);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Categoria`
--
ALTER TABLE `Categoria`
  ADD PRIMARY KEY (`idCategoria`);

--
-- Indices de la tabla `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`idCliente`);

--
-- Indices de la tabla `DetalleVenta`
--
ALTER TABLE `DetalleVenta`
  ADD PRIMARY KEY (`idDetalleventa`),
  ADD KEY `idVentas` (`idVentas`),
  ADD KEY `idProducto` (`idProducto`);

--
-- Indices de la tabla `Empleado`
--
ALTER TABLE `Empleado`
  ADD PRIMARY KEY (`idEmpleado`),
  ADD KEY `idCategoria` (`idCategoria`);

--
-- Indices de la tabla `Nivel`
--
ALTER TABLE `Nivel`
  ADD PRIMARY KEY (`idNivel`);

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`idProducto`),
  ADD KEY `idProveedor` (`idProveedor`);

--
-- Indices de la tabla `Proveedor`
--
ALTER TABLE `Proveedor`
  ADD PRIMARY KEY (`idProveedor`);

--
-- Indices de la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD KEY `idNivel` (`idNivel`),
  ADD KEY `idEmpleado` (`idEmpleado`);

--
-- Indices de la tabla `Ventas`
--
ALTER TABLE `Ventas`
  ADD PRIMARY KEY (`idVentas`),
  ADD KEY `idCliente` (`idCliente`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `DetalleVenta`
--
ALTER TABLE `DetalleVenta`
  ADD CONSTRAINT `DetalleVenta_ibfk_1` FOREIGN KEY (`idVentas`) REFERENCES `Ventas` (`idVentas`),
  ADD CONSTRAINT `DetalleVenta_ibfk_2` FOREIGN KEY (`idProducto`) REFERENCES `Producto` (`idProducto`);

--
-- Filtros para la tabla `Empleado`
--
ALTER TABLE `Empleado`
  ADD CONSTRAINT `Empleado_ibfk_1` FOREIGN KEY (`idCategoria`) REFERENCES `Categoria` (`idCategoria`);

--
-- Filtros para la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD CONSTRAINT `Producto_ibfk_1` FOREIGN KEY (`idProveedor`) REFERENCES `Proveedor` (`idProveedor`);

--
-- Filtros para la tabla `Usuario`
--
ALTER TABLE `Usuario`
  ADD CONSTRAINT `Usuario_ibfk_1` FOREIGN KEY (`idNivel`) REFERENCES `Nivel` (`idNivel`),
  ADD CONSTRAINT `Usuario_ibfk_2` FOREIGN KEY (`idEmpleado`) REFERENCES `Empleado` (`idEmpleado`);

--
-- Filtros para la tabla `Ventas`
--
ALTER TABLE `Ventas`
  ADD CONSTRAINT `Ventas_ibfk_1` FOREIGN KEY (`idCliente`) REFERENCES `Cliente` (`idCliente`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
