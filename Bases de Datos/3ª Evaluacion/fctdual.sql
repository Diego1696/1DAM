-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-03-2017 a las 20:43:12
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `fctdual`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumnos`
--

CREATE TABLE `alumnos` (
  `dni` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `alumno` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `nifempresa` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `idestudios` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `alumnos`
--

INSERT INTO `alumnos` (`dni`, `alumno`, `email`, `telefono`, `nifempresa`, `idestudios`) VALUES
('12345679', 'ASCDASa', 'Dal320@hotmail.com', '622068477', 'vwww', 1),
('123456792', 'Diego', 'Dal3w20@hotmail.com', '622068477', 'vvvvv', 2),
('2223244', 'Xsd', 'xd@xd2.xd', '555552555', '212122212', 112111),
('222333444', 'Xd', 'xd@xd.xd', '555555555', '212121212', 11111),
('asefasda', 'asdfasf', '', '', '', 0),
('qw124124', '1wdfg', 'sas@sdfsdf.com', '124123523', 'vvvvv', 1),
('sdfgsdfgd', '1wdfg', 'sas@sdfsdf.com', '124123523', 'vwww', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresas`
--

CREATE TABLE `empresas` (
  `nif` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `empresa` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `direccion` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `dniusuario` varchar(9) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `empresas`
--

INSERT INTO `empresas` (`nif`, `empresa`, `direccion`, `email`, `telefono`, `dniusuario`) VALUES
('vvvvv', 'Ferrari', 'Calle 854', 'ferra@hfe.cpm', '212222111', '12254645'),
('vwww', 'Teltonic', 'Calle 8544', 'ferra@hwwwfe.cpm', '211122211', '122534645');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudios`
--

CREATE TABLE `estudios` (
  `idestudio` int(11) NOT NULL,
  `estudio` varchar(60) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `estudios`
--

INSERT INTO `estudios` (`idestudio`, `estudio`) VALUES
(1, 'sistemas de telecomunicaciones'),
(2, 'fabricacion mecanica'),
(3, 'sistemas de telecomunicaciones'),
(4, 'fabricacion mecanica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `informes`
--

CREATE TABLE `informes` (
  `idinforme` int(11) NOT NULL,
  `dnialumno` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `dniusuario` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `fecha inicio` date NOT NULL,
  `fechafin` date NOT NULL,
  `horainicio` time NOT NULL,
  `horafin` time NOT NULL,
  `tecnica` smallint(6) NOT NULL,
  `aprendizaje` smallint(6) NOT NULL,
  `planificacion` smallint(6) NOT NULL,
  `recambios` smallint(6) NOT NULL,
  `organizacion` smallint(6) NOT NULL,
  `orden` smallint(6) NOT NULL,
  `consultas` smallint(6) NOT NULL,
  `iniciatica` smallint(6) NOT NULL,
  `relacion` smallint(6) NOT NULL,
  `criticas` smallint(6) NOT NULL,
  `responsabilidad` smallint(6) NOT NULL,
  `puntualidad` smallint(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `dni` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `clave` varchar(12) COLLATE utf8_unicode_ci NOT NULL,
  `nombre` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(60) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(9) COLLATE utf8_unicode_ci NOT NULL,
  `fechaultimoacceso` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`dni`, `clave`, `nombre`, `email`, `telefono`, `fechaultimoacceso`) VALUES
('', '11112', 'Jesucristo Garcia', 'Jesucristo@hotmail.com', '658524188', '2017-03-21 08:00:00'),
('2', '12314', 'Jesucristo NoGarcia', 'NoJesucristo@hotmail.com', '652852418', '2017-03-21 08:00:00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumnos`
--
ALTER TABLE `alumnos`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `nifempresa` (`nifempresa`,`idestudios`);

--
-- Indices de la tabla `empresas`
--
ALTER TABLE `empresas`
  ADD PRIMARY KEY (`nif`),
  ADD UNIQUE KEY `dniusuario` (`dniusuario`);

--
-- Indices de la tabla `estudios`
--
ALTER TABLE `estudios`
  ADD PRIMARY KEY (`idestudio`);

--
-- Indices de la tabla `informes`
--
ALTER TABLE `informes`
  ADD PRIMARY KEY (`idinforme`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`dni`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudios`
--
ALTER TABLE `estudios`
  MODIFY `idestudio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `informes`
--
ALTER TABLE `informes`
  MODIFY `idinforme` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
