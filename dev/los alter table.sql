/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Cesar
 * Created: 17-nov-2020
 */
ALTER TABLE `citas` ADD `updateAt` DATETIME NOT NULL AFTER `especialista_id`;
ALTER TABLE `citas` ADD `service_id` INT NOT NULL AFTER `updateAt`;
ALTER TABLE `citas` ADD `fechaDeCita` INT NOT NULL AFTER `service_id`;

ALTER TABLE `services` ADD `enable` TINYINT(1) NOT NULL AFTER `price`;

ALTER TABLE `services` CHANGE `name` `name` VARCHAR(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL;