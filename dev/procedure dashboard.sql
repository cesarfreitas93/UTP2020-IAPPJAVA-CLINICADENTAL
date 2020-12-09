select count(*) as vigentes from citas where status = 1;
select count(*) as reprogramadas from citas where status = 2;
select count(*) as vencidas from citas where status = 3;
select * from patient;


select COUNT(*) from patient where createAt BETWEEN (NOW() - INTERVAL 30 day) AND NOW(); 

SELECT (NOW() - INTERVAL 30 day);

DELIMITER //
CREATE PROCEDURE `dashboard` ()
BEGIN
declare ivigentes int;
declare ireprogramadas int;
declare ivencidas int;
declare ipacientes int;
declare ipacienteslas30meses int;
declare iporcentaje decimal(3,2);

select count(*) into ivigentes from citas where status = 1;
select count(*) into ireprogramadas from citas where status = 2;
select count(*) into ivencidas from citas where status = 3;
select count(*) into ipacientes from patient;
select round((100 * count(*)/3),2) into iporcentaje  from patient where enable = 0;
select COUNT(*) into ipacienteslas30meses from patient where createAt BETWEEN (NOW() - INTERVAL 30 day) AND NOW(); 
select ivigentes, ireprogramadas, ivencidas, ipacientes, iporcentaje,ipacienteslas30meses;

END

call dashboard();