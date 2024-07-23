CREATE DATABASE  IF NOT EXISTS `colegioamigos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `colegioamigos`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: colegioamigos
-- ------------------------------------------------------
-- Server version	8.0.38

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumno` (
  `idAlumno` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Dni` varchar(8) DEFAULT NULL,
  `Sexo` varchar(50) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Tutor` varchar(50) DEFAULT NULL,
  `NombreApoderado` varchar(45) DEFAULT NULL,
  `ApellidoApoderado` varchar(45) DEFAULT NULL,
  `DNIApoderado` varchar(8) DEFAULT NULL,
  `Telefono` varchar(9) DEFAULT NULL,
  `FechaApoderado` date DEFAULT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `asistencia`
--

DROP TABLE IF EXISTS `asistencia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asistencia` (
  `idAsistencia` int NOT NULL AUTO_INCREMENT,
  `Fecha` date DEFAULT NULL,
  `Hora` time DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  `idMatricula` int NOT NULL,
  PRIMARY KEY (`idAsistencia`,`idMatricula`),
  KEY `idMatricula_idx` (`idMatricula`),
  CONSTRAINT `idMatricula` FOREIGN KEY (`idMatricula`) REFERENCES `matricula` (`idMatricula`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `calificaciones`
--

DROP TABLE IF EXISTS `calificaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `calificaciones` (
  `idCalificaciones` int NOT NULL AUTO_INCREMENT,
  `Unidad` varchar(45) NOT NULL,
  `Nota` decimal(10,2) DEFAULT NULL,
  `Estado` varchar(50) DEFAULT NULL,
  `idMatricula` int NOT NULL,
  `idCurso` int NOT NULL,
  PRIMARY KEY (`idCalificaciones`,`idMatricula`),
  KEY `idMatricula` (`idMatricula`),
  KEY `fk_idCurso_calificaciones` (`idCurso`),
  CONSTRAINT `calificaciones_ibfk_1` FOREIGN KEY (`idMatricula`) REFERENCES `matricula` (`idMatricula`),
  CONSTRAINT `fk_idCurso_calificaciones` FOREIGN KEY (`idCurso`) REFERENCES `curso` (`idCurso`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `curso` (
  `idCurso` int NOT NULL AUTO_INCREMENT,
  `NombreCurso` varchar(45) DEFAULT NULL,
  `idGrado` int NOT NULL,
  PRIMARY KEY (`idCurso`,`idGrado`),
  KEY `idGrado_idx` (`idGrado`),
  CONSTRAINT `fk_idGrado_curso` FOREIGN KEY (`idGrado`) REFERENCES `grado` (`idGrado`)
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `docente`
--

DROP TABLE IF EXISTS `docente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `docente` (
  `idDocente` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) DEFAULT NULL,
  `Apellido` varchar(45) DEFAULT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `DNI` varchar(8) DEFAULT NULL,
  `Sexo` varchar(50) DEFAULT NULL,
  `Telefono` varchar(9) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Especialidad` varchar(45) DEFAULT NULL,
  `Fecha` date DEFAULT NULL,
  `Contrato` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idDocente`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `grado`
--

DROP TABLE IF EXISTS `grado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `grado` (
  `idGrado` int NOT NULL AUTO_INCREMENT,
  `Nombre_Grado` varchar(45) NOT NULL,
  PRIMARY KEY (`idGrado`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `matricula`
--

DROP TABLE IF EXISTS `matricula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `matricula` (
  `idMatricula` int NOT NULL AUTO_INCREMENT,
  `idAlumno` int NOT NULL,
  `Fecha` date NOT NULL,
  `MontoMatricula` decimal(10,2) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `Seccion` varchar(45) NOT NULL,
  `idGrado` int NOT NULL,
  `idDocente` int NOT NULL,
  PRIMARY KEY (`idMatricula`,`idAlumno`,`idGrado`,`idDocente`),
  KEY `idAlumno` (`idAlumno`),
  KEY `idDocente` (`idDocente`),
  KEY `idGrado_idx` (`idGrado`),
  CONSTRAINT `idGrado` FOREIGN KEY (`idGrado`) REFERENCES `grado` (`idGrado`),
  CONSTRAINT `matricula_ibfk_1` FOREIGN KEY (`idAlumno`) REFERENCES `alumno` (`idAlumno`),
  CONSTRAINT `matricula_ibfk_3` FOREIGN KEY (`idDocente`) REFERENCES `docente` (`idDocente`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `pension`
--

DROP TABLE IF EXISTS `pension`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pension` (
  `idPension` int NOT NULL AUTO_INCREMENT,
  `Fecha` date NOT NULL,
  `Monto` decimal(10,2) NOT NULL,
  `Cuota` varchar(45) NOT NULL,
  `Estado` varchar(45) NOT NULL,
  `idMatricula` int NOT NULL,
  PRIMARY KEY (`idPension`,`idMatricula`),
  KEY `idMatricula_idx` (`idMatricula`),
  CONSTRAINT `fk_idMatricula_pension` FOREIGN KEY (`idMatricula`) REFERENCES `matricula` (`idMatricula`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `idUsuario` int NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Usuario` varchar(45) NOT NULL,
  `Contraseña` varchar(45) NOT NULL,
  PRIMARY KEY (`idUsuario`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping events for database 'colegioamigos'
--

--
-- Dumping routines for database 'colegioamigos'
--
/*!50003 DROP PROCEDURE IF EXISTS `AutenticarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `AutenticarUsuario`(
    IN p_Usuario VARCHAR(45),
    IN p_Clave VARCHAR(45),
    OUT p_NombreCompleto VARCHAR(100)
)
BEGIN
    DECLARE v_Nombre VARCHAR(45);
	DECLARE v_Imagen LONGBLOB;
    
    SELECT Nombre INTO v_Nombre
    FROM usuario
    WHERE Usuario = p_Usuario AND Contraseña = MD5(p_Clave);

    IF v_Nombre IS NOT NULL THEN
        SET p_NombreCompleto = v_Nombre;
    ELSE
        SET p_NombreCompleto = NULL;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscar` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscar`(
    IN p_idMatricula INT
)
BEGIN
    -- CTE para calcular el promedio final y obtener las notas de cada bimestre
    WITH CalificacionesPivot AS (
        SELECT
            m.idMatricula,
            d.Nombre AS NombreProfesor,
            d.Apellido AS ApellidoProfesor,
            g.Nombre_Grado AS Grado,
            m.Seccion,
            a.Dni,
            a.Nombre AS NombreAlumno,
            a.Apellido AS ApellidoAlumno,
            c.NombreCurso,
            -- Usar CASE para pivotar las notas de los bimestres en columnas
            MAX(CASE WHEN cal.Unidad = 'Primer Bimestre' THEN cal.Nota END) AS NotaPrimerBimestre,
            MAX(CASE WHEN cal.Unidad = 'Segundo Bimestre' THEN cal.Nota END) AS NotaSegundoBimestre,
            MAX(CASE WHEN cal.Unidad = 'Tercer Bimestre' THEN cal.Nota END) AS NotaTercerBimestre,
            MAX(CASE WHEN cal.Unidad = 'Cuarto Bimestre' THEN cal.Nota END) AS NotaCuartoBimestre,
            -- Agregar columna para el promedio final
            AVG(cal.Nota) AS PromedioFinal
        FROM 
            matricula m
        INNER JOIN 
            calificaciones cal ON cal.idMatricula = m.idMatricula
        INNER JOIN 
            alumno a ON m.idAlumno = a.idAlumno
        INNER JOIN 
            curso c ON cal.idCurso = c.idCurso AND m.idGrado = c.idGrado
        INNER JOIN 
            grado g ON c.idGrado = g.idGrado
        JOIN 
            docente d ON m.idDocente = d.idDocente
        WHERE 
            m.idMatricula = p_idMatricula
        GROUP BY 
            m.idMatricula, d.Nombre, d.Apellido, g.Nombre_Grado, m.Seccion, a.Nombre, a.Apellido, a.Dni, c.NombreCurso
    )

    SELECT
        idMatricula,
        NombreProfesor,
        ApellidoProfesor,
        Grado,
        Seccion,
        NombreAlumno,
        ApellidoAlumno,
        Dni,
        NombreCurso,
        NotaPrimerBimestre,
        NotaSegundoBimestre,
        NotaTercerBimestre,
        NotaCuartoBimestre,
        PromedioFinal
    FROM 
        CalificacionesPivot;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarAlumno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarAlumno`(IN p_dni VARCHAR(15))
BEGIN
    SELECT 
        idAlumno, 
        Nombre, 
        Apellido, 
        Dni, 
        Sexo, 
        Direccion, 
        Fecha, 
        Tutor, 
        NombreApoderado, 
        ApellidoApoderado, 
        DNIApoderado, 
        Telefono, 
        FechaApoderado 
    FROM 
        alumno
    WHERE 
        Dni = p_dni;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarAsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarAsistencia`(
    IN p_idAsistencia INT
)
BEGIN
    SELECT 
        a.idAsistencia,
        a.Fecha,
        a.Hora,
        a.Estado,
        a.idMatricula,
        m.idAlumno,
        al.Nombre AS NombreAlumno,
        al.Apellido AS ApellidoAlumno
    FROM 
        asistencia a
        JOIN matricula m ON a.idMatricula = m.idMatricula
        JOIN alumno al ON m.idAlumno = al.idAlumno
    WHERE 
        a.idAsistencia = p_idAsistencia;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarCalificaciones` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarCalificaciones`(
    IN p_Codigo VARCHAR(45)
)
BEGIN
    SELECT
		cal.idCalificaciones,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        c.NombreCurso,
        g.Nombre_Grado AS Grado,
        cal.Unidad,
        cal.Nota,
        cal.Estado
    FROM 
        calificaciones cal
    INNER JOIN 
        matricula m ON cal.idMatricula = m.idMatricula
    INNER JOIN 
        alumno a ON m.idAlumno = a.idAlumno
    INNER JOIN 
        curso c ON cal.idCurso = c.idCurso AND m.idGrado = c.idGrado
    INNER JOIN 
        grado g ON c.idGrado = g.idGrado
    WHERE 
      cal.idCalificaciones = p_Codigo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarDocente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarDocente`(IN p_dni VARCHAR(15))
BEGIN
    SELECT 
        idDocente, 
        Nombre, 
        Apellido,
        Direccion,
        DNI, 
        Sexo, 
        Telefono,
        Correo,
        Especialidad,
        Fecha, 
        Contrato
    FROM 
        docente
    WHERE 
        DNI = p_dni;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarMatriculas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarMatriculas`(
    IN p_codigo int
)
BEGIN
    SELECT 
		a.idAlumno,
        d.idDocente,
        m.idMatricula,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        m.Fecha,
        m.MontoMatricula,
        m.Estado,
        g.Nombre_Grado,
        m.Seccion,
		d.Nombre AS NombreDocente,
        d.Apellido AS ApellidoDocente
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN docente d ON m.idDocente = d.idDocente
    WHERE 
        m.idMatricula = p_codigo;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `BuscarPension` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `BuscarPension`(
    IN p_idPension INT
)
BEGIN
    SELECT 
		m.idMatricula,
        p.idPension,        
        al.Nombre AS NombreAlumno,
        al.Apellido AS ApellidoAlumno,
        p.Fecha,
        p.Monto,
        p.Cuota,
        p.Estado
    FROM 
        pension p
        JOIN matricula m ON p.idMatricula = m.idMatricula
        JOIN alumno al ON m.idAlumno = al.idAlumno
    WHERE 
        p.idPension = p_idPension;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Buscar_Reporte_Pension` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Buscar_Reporte_Pension`(IN idAlumnoParam INT)
BEGIN
    SELECT 
		m.idMatricula,
        g.Nombre_Grado,
        m.Seccion,        
        d.Nombre AS NombreProfesor,
        d.Apellido AS ApellidoProfesor,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        p.Fecha,
        p.Monto,
        p.Cuota,
        p.Estado
    FROM 
        matricula m
		JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN pension p ON m.idMatricula = p.idMatricula
        JOIN docente d ON m.idDocente = d.idDocente
	WHERE 
        m.idMatricula = idAlumnoParam;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ConsultaAsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ConsultaAsistencia`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45)
)
BEGIN
    SELECT 
        m.idMatricula,
        a.Nombre,
        a.Apellido,
        m.Seccion,
        m.idGrado
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
    WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ConsultaCalificaciones` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ConsultaCalificaciones`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45),
    IN p_NombreCurso VARCHAR(45)
)
BEGIN
    SELECT 
        m.idMatricula,
        a.Nombre,
        a.Apellido,
        m.idGrado,
        m.Seccion,
        c.NombreCurso
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN curso c ON m.idGrado = c.idGrado
    WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion AND c.NombreCurso = p_NombreCurso;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `EditarCalificacion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `EditarCalificacion`(
    IN p_idCalificacion INT,
    IN p_Unidad VARCHAR(50),
    IN p_Nota DECIMAL(10,2),
    IN p_Estado VARCHAR(50),
    IN p_idMatricula INT,
    IN p_NombreCurso VARCHAR(45),
    IN p_idGrado INT
)
BEGIN
    DECLARE v_idCurso INT;
    SELECT idCurso INTO v_idCurso
    FROM curso
    WHERE NombreCurso = p_NombreCurso AND idGrado = p_idGrado;
    
    -- Verificar si se encontró el idCurso
    IF v_idCurso IS NOT NULL THEN
        -- Actualizar la tabla calificaciones
        UPDATE calificaciones
        SET Nota = p_Nota, Estado = p_Estado, Unidad = p_Unidad
        WHERE idCalificaciones = p_idCalificacion;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarAlumno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarAlumno`(
    IN p_Nombre VARCHAR(45),
    IN p_Apellido VARCHAR(45),
    IN p_Dni VARCHAR(8),
    IN p_Sexo VARCHAR(50),
    IN p_Direccion VARCHAR(45),
    IN p_Fecha DATE,
    IN p_Tutor VARCHAR(50),
    IN p_NombreApoderado VARCHAR(45),
    IN p_ApellidoApoderado VARCHAR(45),
    IN p_DNIApoderado VARCHAR(8),
    IN p_Telefono VARCHAR(9),
    IN p_FechaApoderado DATE
)
BEGIN
    INSERT INTO alumno (
        Nombre, Apellido, Dni, Sexo, Direccion, Fecha,Tutor, NombreApoderado, ApellidoApoderado, DNIApoderado, Telefono, FechaApoderado
    ) 
    VALUES (
        p_Nombre, p_Apellido, p_Dni, p_Sexo, p_Direccion, p_Fecha, p_Tutor, p_NombreApoderado, p_ApellidoApoderado, p_DNIApoderado, p_Telefono, p_FechaApoderado
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarAsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarAsistencia`(
    IN p_Fecha DATE,
    IN p_Hora TIME,
    IN p_Estado VARCHAR(50),
    IN p_idMatricula INT
)
BEGIN
    INSERT INTO asistencia (
        Fecha, Hora, Estado, idMatricula
    ) 
    VALUES (
        p_Fecha, p_Hora, p_Estado, p_idMatricula
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarCalificacion` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarCalificacion`(
    IN p_Unidad VARCHAR(50),
    IN p_Nota DECIMAL(10,2),
    IN p_Estado VARCHAR(50),
    IN p_idMatricula INT,
    IN p_NombreCurso VARCHAR(45),
    IN p_idGrado INT
)
BEGIN
    DECLARE v_idCurso INT;
    DECLARE v_NotaCount INT;

    -- Obtener el idCurso
    SELECT idCurso INTO v_idCurso
    FROM curso
    WHERE NombreCurso = p_NombreCurso AND idGrado = p_idGrado;

    -- Verificar si se encontró el idCurso
    IF v_idCurso IS NOT NULL THEN
        -- Contar las notas existentes para este curso, matrícula y unidad
        SELECT COUNT(*) INTO v_NotaCount
        FROM calificaciones
        WHERE idCurso = v_idCurso AND idMatricula = p_idMatricula AND Unidad = p_Unidad;

        -- Verificar si ya existe una nota para este curso, matrícula y unidad
        IF v_NotaCount = 0 THEN
            -- Contar el número total de notas para este curso y matrícula
            SELECT COUNT(*) INTO v_NotaCount
            FROM calificaciones
            WHERE idCurso = v_idCurso AND idMatricula = p_idMatricula;

            -- Verificar si ya hay 4 notas para este curso y matrícula
            IF v_NotaCount < 4 THEN
                -- Insertar en la tabla calificaciones
                INSERT INTO calificaciones (Unidad, Nota, Estado, idMatricula, idCurso)
                VALUES (p_Unidad, p_Nota, p_Estado, p_idMatricula, v_idCurso);
            ELSE
                SIGNAL SQLSTATE '45000'
                SET MESSAGE_TEXT = 'No se pueden ingresar más de 4 notas por curso';
            END IF;
        ELSE
            SIGNAL SQLSTATE '45000'
            SET MESSAGE_TEXT = 'Ya existe una nota para este curso, matrícula y bimestre';
        END IF;
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'No se encontró el curso especificado';
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarCurso` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarCurso`(
    IN p_Nombre_Curso VARCHAR(45), 
    IN p_IdGrado int
)
BEGIN
    INSERT INTO curso (NombreCurso, idGrado) 
    VALUES (p_Nombre_Curso, p_IdGrado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarDocente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarDocente`(
    IN p_Nombre VARCHAR(45),
    IN p_Apellido VARCHAR(45),
    IN p_Direccion VARCHAR(45),
    IN p_DNI VARCHAR(8),
    IN p_Sexo VARCHAR(50),
    IN p_Telefono VARCHAR(9),
    IN p_Correo VARCHAR(45),
    IN p_Especialidad VARCHAR(45),
    IN p_Fecha DATE,
    IN p_Contrato VARCHAR(45)
)
BEGIN
    INSERT INTO docente (
        Nombre, Apellido, Direccion, DNI, Sexo, Telefono, Correo, Especialidad, Fecha, Contrato
    ) 
    VALUES (
        p_Nombre, p_Apellido, p_Direccion, p_DNI, p_Sexo, p_Telefono, p_Correo, p_Especialidad, p_Fecha, p_Contrato
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarGrado` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarGrado`(
    IN p_Nombre_Grado VARCHAR(45)
)
BEGIN
    INSERT INTO grado (Nombre_Grado) 
    VALUES (p_Nombre_Grado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarMatricula` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarMatricula`(
    IN p_idAlumno INT,
    IN p_Fecha DATE,
    IN p_MontoMatricula DECIMAL(10, 2),
    IN p_Estado VARCHAR(45),
    IN p_Seccion VARCHAR(1),
    IN p_idGrado INT,
    IN p_idDocente INT
)
BEGIN
    INSERT INTO matricula (
        idAlumno, Fecha, MontoMatricula, Estado, Seccion,
        idGrado, idDocente
    ) 
    VALUES (
        p_idAlumno, p_Fecha, p_MontoMatricula, p_Estado, p_Seccion, 
        p_idGrado, p_idDocente
    );
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarPension` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarPension`(
    IN p_idMatricula INT,
    IN p_Fecha DATE,
    IN p_Monto DECIMAL(10,2),
    IN p_Cuota VARCHAR(45),
    IN p_Estado VARCHAR(45)
)
BEGIN
    INSERT INTO pension (idMatricula, Fecha, Monto, Cuota, Estado)
    VALUES (p_idMatricula, p_Fecha, p_Monto, p_Cuota, p_Estado);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `InsertarUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `InsertarUsuario`(
    IN p_Nombre VARCHAR(45),
    IN p_Apellido VARCHAR(45),
    IN p_Usuario VARCHAR(45),
    IN p_Contraseña VARCHAR(45)
)
BEGIN
    INSERT INTO usuario (Nombre, Apellido, Usuario, Contraseña) 
    VALUES (p_Nombre,p_Apellido, p_Usuario,md5(p_Contraseña));
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListaASI` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListaASI`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45)
)
BEGIN
    SELECT 
        asi.idAsistencia,
		m.idMatricula,
        a.Dni,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        g.Nombre_Grado,
        m.Seccion,        
        d.Nombre AS NombreProfesor,
        d.Apellido AS ApellidoProfesor,
        asi.Fecha,
        asi.Hora,
        asi.Estado
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN asistencia asi ON m.idMatricula = asi.idMatricula
        JOIN docente d ON m.idDocente = d.idDocente
    WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarAlumnos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarAlumnos`()
BEGIN
    SELECT 
        idAlumno, 
        Nombre, 
        Apellido, 
        Dni, 
        Sexo, 
        Direccion, 
        Fecha, 
        Tutor, 
        NombreApoderado, 
        ApellidoApoderado, 
        DNIApoderado, 
        Telefono, 
        FechaApoderado 
    FROM 
        alumno;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarAsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarAsistencia`()
BEGIN
    SELECT 
		m.idMatricula, 
		a.idAsistencia,
        al.Nombre AS NombreAlumno,
        al.Apellido AS ApellidoAlumno,
        a.Fecha,
        a.Hora,
        a.Estado
    FROM 
        asistencia a
        JOIN matricula m ON a.idMatricula = m.idMatricula
        JOIN alumno al ON m.idAlumno = al.idAlumno;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarCalificaciones` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarCalificaciones`(
)
BEGIN
    SELECT
		cal.idCalificaciones,
        m.idMatricula,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        c.NombreCurso,
        g.Nombre_Grado AS Grado,
        cal.Unidad,
        cal.Nota,
        cal.Estado
    FROM 
        calificaciones cal
    INNER JOIN 
        matricula m ON cal.idMatricula = m.idMatricula
    INNER JOIN 
        alumno a ON m.idAlumno = a.idAlumno
    INNER JOIN 
        curso c ON cal.idCurso = c.idCurso AND m.idGrado = c.idGrado
    INNER JOIN 
        grado g ON c.idGrado = g.idGrado;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarDocentes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarDocentes`()
BEGIN
    SELECT 
    idDocente,
    Nombre,
    Apellido,
    Direccion,
    DNI,
    Sexo,
    Telefono,
    Correo,
    Especialidad,
    Fecha,
    Contrato
    FROM 
        docente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarMaA` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarMaA`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45)
)
BEGIN
    SELECT
		m.idGrado,
        m.idMatricula,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        a.Dni AS DniAlumno,
        a.Sexo AS SexoAlumno,
        a.Direccion AS DireccionAlumno,
        a.Fecha AS FechaNacimientoAlumno,
        a.Tutor,
        a.NombreApoderado,
        a.ApellidoApoderado,
        a.DNIApoderado,
        a.Telefono AS TelefonoApoderado,
        a.FechaApoderado AS FechaNacimientoApoderado,
        g.Nombre_Grado,
        m.Seccion,
        d.Nombre AS NombreDocente,
        d.Apellido AS ApellidoDocente,
        c.NombreCurso
    FROM 
        alumno a
    JOIN 
        matricula m ON a.idAlumno = m.idAlumno
    JOIN 
        grado g ON m.idGrado = g.idGrado
    JOIN 
        docente d ON m.idDocente = d.idDocente
    JOIN 
        curso c ON g.idGrado = c.idGrado
    WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarMatriculas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarMatriculas`()
BEGIN
    SELECT 
        a.idAlumno,
        d.idDocente,
        m.idMatricula,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        m.Fecha,
        m.MontoMatricula,
        m.Estado,
        g.Nombre_Grado,
        m.Seccion,
        d.Nombre AS NombreDocente,
        d.Apellido AS ApellidoDocente
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN docente d ON m.idDocente = d.idDocente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ListarPension` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ListarPension`()
BEGIN
    SELECT 
		m.idMatricula, 
		p.idPension,
        al.Nombre AS NombreAlumno,
        al.Apellido AS ApellidoAlumno,
        p.Fecha,
        p.Monto,
        p.Cuota,
        p.Estado
    FROM 
        pension p
        JOIN matricula m ON p.idMatricula = m.idMatricula
        JOIN alumno al ON m.idAlumno = al.idAlumno;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Notas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Notas`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45))
BEGIN
    SELECT
        g.idGrado,
        m.idMatricula,
        g.Nombre_Grado, 
        c.Unidad AS Unidad_Bimestre, 
        c.Nota, 
        a.Nombre, 
        a.Apellido, 
        m.Seccion, 
        a.Dni,
        cr.NombreCurso AS Curso
    FROM 
        calificaciones c
    JOIN  matricula m ON c.idMatricula = m.idMatricula
    JOIN alumno a ON m.idAlumno = a.idAlumno
    JOIN grado g ON m.idGrado = g.idGrado
    JOIN curso cr ON c.idCurso = cr.idCurso
	WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerDatosUsuario` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerDatosUsuario`(
    IN pUsuarioInput VARCHAR(45),
    IN pContraseñaInput VARCHAR(45),
    OUT pNombre VARCHAR(45),
    OUT pApellido VARCHAR(45),
    OUT pUsuarioOutput VARCHAR(45),
    OUT pContraseñaOutput VARCHAR(45)
)
BEGIN
    SELECT Nombre, Apellido, Usuario, Contraseña
    INTO pNombre, pApellido, pUsuarioOutput, pContraseñaOutput
    FROM usuario
    WHERE Usuario = pUsuarioInput AND Contraseña = MD5(pContraseñaInput);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ObtenerDetallesAlumno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ObtenerDetallesAlumno`(IN alumnoId INT)
BEGIN
    SELECT 
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        c.NombreCurso,
        cal.Unidad,
        cal.Nota
    FROM 
        alumno a
    INNER JOIN 
        matricula m ON a.idAlumno = m.idAlumno
    INNER JOIN 
        calificaciones cal ON m.idMatricula = cal.idMatricula
    INNER JOIN 
        curso c ON cal.idCurso = c.idCurso
    WHERE 
        a.idAlumno = alumnoId;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ReporteAlumno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ReporteAlumno`(IN idAlumnoParam INT)
BEGIN
    SELECT
		m.idGrado,
		m.idMatricula,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        a.Dni AS DniAlumno,
        a.Sexo AS SexoAlumno,
        a.Direccion AS DireccionAlumno,
        a.Fecha AS FechaNacimientoAlumno,
        a.Tutor,
        a.NombreApoderado,
        a.ApellidoApoderado,
        a.DNIApoderado,
        a.Telefono AS TelefonoApoderado,
        a.FechaApoderado AS FechaNacimientoApoderado,
        g.Nombre_Grado,
        m.Seccion,
        d.Nombre AS NombreDocente,
        d.Apellido AS ApellidoDocente,
        c.NombreCurso
    FROM 
        alumno a
    JOIN 
        matricula m ON a.idAlumno = m.idAlumno
    JOIN 
        grado g ON m.idGrado = g.idGrado
    JOIN 
        docente d ON m.idDocente = d.idDocente
    JOIN 
        curso c ON g.idGrado = c.idGrado
    WHERE 
        m.idMatricula = idAlumnoParam;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ReporteAsistencia` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ReporteAsistencia`(IN idAlumnoParam INT)
BEGIN
    SELECT 
        asi.idAsistencia,
		m.idMatricula,
        a.Dni,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        g.Nombre_Grado,
        m.Seccion,        
        d.Nombre AS NombreProfesor,
        d.Apellido AS ApellidoProfesor,
        asi.Fecha,
        asi.Hora,
        asi.Estado
    FROM 
        matricula m
        JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN asistencia asi ON m.idMatricula = asi.idMatricula
        JOIN docente d ON m.idDocente = d.idDocente
    WHERE 
        m.idMatricula = idAlumnoParam;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ReporteNotas` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ReporteNotas`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45)
)
BEGIN
    -- CTE para calcular el promedio final y obtener las notas de cada bimestre
    WITH CalificacionesPivot AS (
        SELECT
            m.idMatricula,
            d.Nombre AS NombreProfesor,
            d.Apellido AS ApellidoProfesor,
            g.Nombre_Grado AS Grado,
            m.Seccion,
			a.Dni,
            a.Nombre AS NombreAlumno,
            a.Apellido AS ApellidoAlumno,
            c.NombreCurso,
            -- Usar CASE para pivotar las notas de los bimestres en columnas
            MAX(CASE WHEN cal.Unidad = 'Primer Bimestre' THEN cal.Nota END) AS NotaPrimerBimestre,
            MAX(CASE WHEN cal.Unidad = 'Segundo Bimestre' THEN cal.Nota END) AS NotaSegundoBimestre,
            MAX(CASE WHEN cal.Unidad = 'Tercer Bimestre' THEN cal.Nota END) AS NotaTercerBimestre,
            MAX(CASE WHEN cal.Unidad = 'Cuarto Bimestre' THEN cal.Nota END) AS NotaCuartoBimestre,
            -- Agregar columna para el promedio final
            AVG(cal.Nota) AS PromedioFinal
        FROM 
            matricula m
        INNER JOIN 
            calificaciones cal ON cal.idMatricula = m.idMatricula
        INNER JOIN 
            alumno a ON m.idAlumno = a.idAlumno
        INNER JOIN 
            curso c ON cal.idCurso = c.idCurso AND m.idGrado = c.idGrado
        INNER JOIN 
            grado g ON c.idGrado = g.idGrado
        JOIN 
            docente d ON m.idDocente = d.idDocente
        WHERE 
            m.idGrado = p_idGrado AND m.Seccion = p_Seccion
        GROUP BY 
            m.idMatricula, d.Nombre, d.Apellido, g.Nombre_Grado, m.Seccion, a.Nombre, a.Apellido,a.Dni, c.NombreCurso
    )

    SELECT
        idMatricula,
        NombreProfesor,
        ApellidoProfesor,
        Grado,
        Seccion,
        NombreAlumno,
        ApellidoAlumno,
        Dni,
        NombreCurso,
        NotaPrimerBimestre,
        NotaSegundoBimestre,
        NotaTercerBimestre,
        NotaCuartoBimestre,
        PromedioFinal
    FROM 
        CalificacionesPivot;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `ReportePension` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `ReportePension`(
    IN p_idGrado INT,
    IN p_Seccion VARCHAR(45))
BEGIN
    SELECT 
		m.idMatricula,
        g.Nombre_Grado,
        m.Seccion,        
        d.Nombre AS NombreProfesor,
        d.Apellido AS ApellidoProfesor,
        a.Nombre AS NombreAlumno,
        a.Apellido AS ApellidoAlumno,
        p.Fecha,
        p.Monto,
        p.Cuota,
        p.Estado
    FROM 
        matricula m
		JOIN alumno a ON m.idAlumno = a.idAlumno
        JOIN grado g ON m.idGrado = g.idGrado
        JOIN pension p ON m.idMatricula = p.idMatricula
        JOIN docente d ON m.idDocente = d.idDocente
	WHERE 
        m.idGrado = p_idGrado AND m.Seccion = p_Seccion;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VistaAlumno` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VistaAlumno`()
BEGIN
    SELECT 
        idAlumno, 
        Nombre, 
        Apellido, 
        Dni, 
        Sexo
    FROM 
        alumno;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `VistaDocente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `VistaDocente`()
BEGIN
    SELECT
    idDocente,
    Nombre,
    Apellido,
    Especialidad
    FROM 
        docente;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-22 16:00:16
