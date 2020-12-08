DELIMITER //
CREATE PROCEDURE exploradordecitas (
	in cantidadregistros int, 
    in poffset int,
    in filtro varchar(20)
)
BEGIN
	declare opaginas int;
    declare ototal int;
	SELECT
		CEIL(COUNT(DISTINCT tcitas.id)/cantidadregistros) into opaginas
	FROM citas as tcitas 
		inner join patient pat on tcitas.patient_id =  pat.id
		inner join especialista esp on tcitas.especialista_id = esp.id
		inner join services serv on tcitas.service_id = serv.id
		inner join horario_citas horario on tcitas.id_horario = horario.id_horario
	WHERE concat(pat.name,', ',pat.lastname,' ', pat.surename) like concat('%',filtro,'%');
    
	SELECT
		count(DISTINCT tcitas.id) Into ototal
	FROM citas as tcitas 
		inner join patient pat on tcitas.patient_id =  pat.id
		inner join especialista esp on tcitas.especialista_id = esp.id
		inner join services serv on tcitas.service_id = serv.id
		inner join horario_citas horario on tcitas.id_horario = horario.id_horario
	WHERE concat(pat.name,', ',pat.lastname,' ', pat.surename) like concat('%',filtro,'%');
    
    
	SELECT ototal, opaginas,tcitas.id, tcitas.createAt fecha_registro,
		pat.dni as DNI,
		concat(pat.name,', ',pat.lastname,' ', pat.surename) as paciente,
		concat(esp.name,', ',esp.lastname,' ', esp.surename) as medico,
		serv.name as Servicio,
		DATE_FORMAT(tcitas.fechaDeCita,'%d - %b - %Y')as fecha,
		horario.cita_horario_inicio as horainicio
	FROM `citas` as tcitas inner join patient pat on tcitas.patient_id =  pat.id
		inner join especialista esp on tcitas.especialista_id = esp.id
		inner join services serv on tcitas.service_id = serv.id
		inner join horario_citas horario on tcitas.id_horario = horario.id_horario
	WHERE concat(pat.name,', ',pat.lastname,' ', pat.surename) like concat('%',filtro,'%') 
    LIMIT poffset,cantidadregistros;
    
END