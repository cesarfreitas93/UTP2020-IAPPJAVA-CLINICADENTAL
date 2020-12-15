/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WIN32CLC_CTR;

import WIN30CLC_DAO.DaoException;
import WIN30CLC_DAO.MYSQL.MySqlDaoManager;
import WIN31CLC_DTO.CitasPatient;
import WIN31CLC_DTO.Comprobante;
import WIN32CLC_TABLEMODELS.CitasPatientTableModel;
import WIN32CLC_TABLEMODELS.ExploradorComprobantes;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cesar
 */
public class CTR_08_Comprobante {
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
        // este metodo funciona mejor para el control jtable
    private CitasPatientTableModel  model;
    public List<CitasPatient> lista = new ArrayList();

    public void setLista(List<CitasPatient> lista) {
        this.lista = lista;
    }

    public List<CitasPatient> getLista() {
        return lista;
    }

    public AbstractTableModel List(long id) throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new CitasPatientTableModel(man.getComprobante());
        this.model.updateModel(id);
        this.setLista(this.model.getLista());
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    public AbstractTableModel List(List<CitasPatient> list) throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        this.model = new CitasPatientTableModel(man.getComprobante());
        this.model.updateModel(list);
        this.setLista(list);
        this.model.fireTableDataChanged();
        return this.model;
    }
    
    public Comprobante Insertar(Comprobante entity)throws DaoException, SQLException{
        MySqlDaoManager man = new MySqlDaoManager();
        entity =  man.getComprobante().Insertar(entity);
        return entity;
    }
    
    public void InsertarDetalle(List<CitasPatient> list, long id_cabecera) throws SQLException, DaoException{
        MySqlDaoManager man = new MySqlDaoManager();
        man.getComprobante_Detalle().InsertarDetalle(list, id_cabecera);
    }
    
    
    
    private ExploradorComprobantes  explorador_model;
    public AbstractTableModel ExploradorCitas(String filtro, int rowShow, int pagenumber) throws SQLException, DaoException {
        MySqlDaoManager man = new MySqlDaoManager();
        this.explorador_model = new ExploradorComprobantes(man.getComprobante());
        this.explorador_model.updateModel(filtro, rowShow, pagenumber);
        this.explorador_model.fireTableDataChanged();
        this.setTotal_registros_bd(this.explorador_model.getTotal_registros_bd());
        this.setPaginas_page(this.explorador_model.getPaginas_page());
        return this.explorador_model;
    }
    
}
