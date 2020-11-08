-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema UTP2020-DENTAL-SYSTEM-DEV
-- -----------------------------------------------------
-- Base de datos para el proyecto del curso integrador uno de la universidad tecnologica del peru, facultad de ingenieria

-- -----------------------------------------------------
-- Schema UTP2020-DENTAL-SYSTEM-DEV
--
-- Base de datos para el proyecto del curso integrador uno de la universidad tecnologica del peru, facultad de ingenieria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV` DEFAULT CHARACTER SET utf8mb4 ;
USE `UTP2020-DENTAL-SYSTEM-DEV` ;

-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`user` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`patient`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`patient` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `dni` VARCHAR(10) NOT NULL,
  `name` VARCHAR(77) NOT NULL,
  `lastname` VARCHAR(77) NOT NULL,
  `surename` VARCHAR(77) NOT NULL,
  `createAt` DATETIME NOT NULL,
  `updateAt` DATETIME NOT NULL,
  `enable` TINYINT(1) NOT NULL,
  `phone` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `address` VARCHAR(100) NULL,
  `ubigeo` VARCHAR(8) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`services`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`services` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` INT NOT NULL,
  `price` DOUBLE(10,4) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`especialista`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`especialista` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(77) NOT NULL,
  `lastname` VARCHAR(77) NOT NULL,
  `surename` VARCHAR(77) NOT NULL,
  `phone` VARCHAR(9) NOT NULL,
  `address` VARCHAR(100) NOT NULL,
  `dni` VARCHAR(10) NOT NULL,
  `enable` TINYINT(1) NOT NULL,
  `createAt` DATETIME NULL,
  `updateAt` DATETIME NULL,
  `services_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_especialista_services_idx` (`services_id` ASC) ,
  CONSTRAINT `fk_especialista_services`
    FOREIGN KEY (`services_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`services` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`citas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`citas` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `createAt` DATETIME NOT NULL,
  `status` TINYINT(1) NOT NULL DEFAULT 0 COMMENT 'cita vigente 0\ncita pagada 1\ncita anualda 2 \ncita vencidas 3',
  `patient_id` INT NOT NULL,
  `especialista_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_citas_patient1_idx` (`patient_id` ASC) ,
  INDEX `fk_citas_especialista1_idx` (`especialista_id` ASC) ,
  CONSTRAINT `fk_citas_patient1`
    FOREIGN KEY (`patient_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`patient` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_citas_especialista1`
    FOREIGN KEY (`especialista_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`especialista` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`window`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`window` (
  `id` INT NOT NULL,
  `path` VARCHAR(255) NOT NULL,
  `name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`permisos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`permisos` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  `window_id` INT NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_permisos_window1_idx` (`window_id` ASC) ,
  INDEX `fk_permisos_user1_idx` (`user_id` ASC) ,
  CONSTRAINT `fk_permisos_window1`
    FOREIGN KEY (`window_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`window` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_permisos_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`user` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`empresa` (
  `id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `address` VARCHAR(255) NOT NULL,
  `ruc` VARCHAR(255) NOT NULL,
  `ubigeo` VARCHAR(255) NOT NULL,
  `phone` VARCHAR(255) NOT NULL,
  `email` VARCHAR(100) NOT NULL,
  `logo` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`comprantes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`comprantes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `numero` VARCHAR(45) NOT NULL,
  `serie` VARCHAR(45) NOT NULL,
  `fechaEmision` VARCHAR(45) NOT NULL,
  `citas_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_comprantes_citas1_idx` (`citas_id` ASC) ,
  CONSTRAINT `fk_comprantes_citas1`
    FOREIGN KEY (`citas_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`citas` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `UTP2020-DENTAL-SYSTEM-DEV`.`comprobanteDetalle`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `UTP2020-DENTAL-SYSTEM-DEV`.`comprobanteDetalle` (
  `id` INT NOT NULL,
  `descripcion` LONGTEXT NOT NULL,
  `precio` DOUBLE(10,4) NOT NULL,
  `igv` DOUBLE(10,4) NOT NULL,
  `total` DOUBLE(10,4) NOT NULL,
  `comprantes_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_comprobanteDetalle_comprantes1_idx` (`comprantes_id` ASC) ,
  CONSTRAINT `fk_comprobanteDetalle_comprantes1`
    FOREIGN KEY (`comprantes_id`)
    REFERENCES `UTP2020-DENTAL-SYSTEM-DEV`.`comprantes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
