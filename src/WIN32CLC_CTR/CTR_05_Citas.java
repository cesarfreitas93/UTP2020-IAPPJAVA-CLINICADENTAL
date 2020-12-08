/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.Citas;
import WIN31CLC_DTO.Patient;
import WIN31CLC_DTO.Service;
import WIN31CLC_DTO.Specialist;
import WIN31CLC_DTO.horario_citas;
import WIN32CLC_TABLEMODELS.CitasTableModel;
import WIN32CLC_TABLEMODELS.ExploradorCitasModel;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CTR_05_Citas {
    private int total_registros_bd;
    private int paginas_page;

    public int getTotal_registros_bd() {
        return total_registros_bd;
    }

    public int getPaginas_page() {
        return paginas_page;
    }

    public void setTotal_registros_bd(int total_registros_bd) {
        this.total_registros_bd = total_registros_bd;
    }

    public void setPaginas_page(int paginas_page) {
        this.paginas_page = paginas_page;
    }
    
    public Citas getCita(long id) throws SQLException, DaoException {
        // obtener la cita
        Citas cita = new Citas();
        cita.setId(id);
        MySqlDaoManager man = new MySqlDaoManager();
        cita = man.getCitas().findById(cita);

        // obtener el paciente
        Patient paciente = new Patient();
        paciente.setId(cita.getPatient_id());
        paciente = man.getDaoPatient().findById(paciente);
        // obtener el servicio
        Service servicio = new Service();
        servicio.setId(cita.getService_id());
        servicio = man.getDaoService().findById(servicio);
        // obtner el especialista
        Specialist especialista = new Specialist();
        especialista.setId(cita.getEspecialista_id());
        especialista = man.getDaoSpecialist().findById(especialista);

        cita.setSpecialist(especialista);
        cita.setPatient(paciente);
        cita.setService(servicio);

        return cita;
    }

     public boolean insert(Citas entity) throws SQLException,DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        try {
            man.getCitas().rlInsert(entity);
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(CTR_03_Service.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    public int capturar_cantidad_fechas(String fecha) throws SQLException, DaoException {
        int registros = 0;

        MySqlDaoManager man = new MySqlDaoManager();
        registros = man.getCitas().capturar_cantidad_fechas(fecha);
        return registros;

    }

    public List<horario_citas> capturar_cantidad_fechas_v1(String fecha, long id_especialista, long id_servicio) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getCitas().capturar_cantidad_fechas_v1(fecha, id_especialista, id_servicio);

    }

    public List<horario_citas> listando_horario_disponible() throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        return man.getCitas().listando_horario_disponible();

    }
        private CitasTableModel  model;

        public AbstractTableModel ListCitas(int id_status) throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new CitasTableModel(man.getCitas());
        this.model.updateModel(id_status);
        this.model.fireTableDataChanged();
        return this.model;
    }
        
    public Citas SelecteCitasGestionar(long id) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        Citas p = new Citas();
        p.setId(id);
        p =  man.getCitas().findById(p);
        return p;
    }
        
    private ExploradorCitasModel  explorador_model;
    public AbstractTableModel ExploradorCitas(String filtro, int rowShow, int pagenumber) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        this.explorador_model = new ExploradorCitasModel(man.getCitas());
        this.explorador_model.updateModel(filtro, rowShow, pagenumber);
        this.explorador_model.fireTableDataChanged();
        this.setTotal_registros_bd(this.explorador_model.getTotal_registros_bd());
        this.setPaginas_page(this.explorador_model.getPaginas_page());
        return this.explorador_model;
    }
        
}
