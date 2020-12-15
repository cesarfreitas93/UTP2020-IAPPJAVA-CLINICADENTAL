DELIMITER //
CREATE PROCEDURE `SP_CITAS_GETCITAS_X_PATIENT` (in id_pat int)
BEGIN

select
	ci.id as 'Codigo de cita',
    ci.fechaDeCita,
    hc.cita_horario_inicio,
    hc.cita_horario_fin,
    sv.name as 'Servicio', -- servicio
    sv.price as 'Precio',
    concat(sp.name,", ", sp.lastname, " ", sp.surename) as 'Especialista'-- especialista
from citas as ci
inner join patient as pat on ci.patient_id = pat.id
inner join services as sv on ci.service_id = sv.id
inner join especialista as sp on ci.especialista_id =  sp.id
inner join horario_citas as hc on ci.id_horario = hc.id_horario
where ci.patient_id = id_pat;
END;
