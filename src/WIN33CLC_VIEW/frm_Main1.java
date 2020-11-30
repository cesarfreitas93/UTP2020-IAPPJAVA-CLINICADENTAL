
package WIN33CLC_VIEW;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import rojerusan.RSPanelsSlider;

public class frm_Main1 extends javax.swing.JFrame  {
static boolean maximized = true;
 int xMouse;
    int yMouse;
    public frm_Main1() {
        initComponents();
         //panel_menu_despegable_2.setVisible(false);
         setBackground(new Color (255,255,255,253));
         Panel_Menu_despegable.setBackground(new Color (255,255,255,100));
         panel_menu_despegable_2.setBackground(new Color (255,255,255,100));
         setLocationRelativeTo(null); 
         
       //------------------
       
        lblinicio.setBackground(new Color(101,208,250));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
        lblsalir.setBackground(new Color(255,255,255));
        
            
    
           }

    public void changeimage(JLabel button, String resourcheimg){
        ImageIcon aimg = new ImageIcon(getClass().getResource(resourcheimg));
        button.setIcon(aimg);
    }
    
     public void ocultar_panel_menu_despegable_2(){
      
          int posicion = this.panel_menu_despegable_2.getX();
           ocultar_panel_base_datos();
       if (posicion < 860 )
            
       {

            changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/12.png");
           
           Animacion.Animacion.mover_derecha(850 ,1240, 2,4, panel_menu_despegable_2);

           frm_03_reservar_cita1.deshabilitar_rbx(true);
            frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
   
  
       }
         
         
        
 
               
    }
     
     
     
     public void ocultar_panel_base_datos(){
      
        
        
           int posicion = this.panel_base_datos.getX();
          //  if (posicion== 880)
           if (posicion< 890) 
       {Animacion.Animacion.mover_derecha(880 ,1242, 2, 4, panel_base_datos);

           frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);

       }
               
    }
    
    public void boton_inicio()
    {
    if(!this.btn_inicio.isSelected()){
            this.btn_inicio.setSelected(true);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
        
        lblinicio.setBackground(new Color(101,208,250));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
      
        rSPanelsSlider1.slidPanel(10, panel_inicio, RSPanelsSlider.direct.Right);
        frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
       } 
    }
    
    public void boton_paciente()
    {
    if(!this.btn_paciente.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(true);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            
            lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(101,208,250));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        
                lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
          
            frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        rSPanelsSlider1.slidPanel(10, panel_paciente, RSPanelsSlider.direct.Right);
        
       } }
    
    public void boton_cita()
    {
    
if(!this.btn_citas.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(true);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
        lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(101,208,250));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        
                lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
            frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        rSPanelsSlider1.slidPanel(10, panel_cita, RSPanelsSlider.direct.Right);
        
       }    
    }
    
    public void boton_gestionarCita()
    {
        if(!this.btn_gestionar_cita.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(true);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
        }
        lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(101,208,250));
        lblfactura.setBackground(new Color(255,255,255));
        
                lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
        
        frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        rSPanelsSlider1.slidPanel(10, panel_gestionar_cita, RSPanelsSlider.direct.Right);
    }
    public void boton_comprobante()
    {
    if(!this.btn_factura.isSelected()){
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(true);
            this.btn_servicios.setSelected(false);
            this.btn_especialista.setSelected(false);
            
             lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(101,208,250));
        
        lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
            frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        rSPanelsSlider1.slidPanel(10, panel_factura, RSPanelsSlider.direct.Right);
        
       }        
    }
    
    public void boton_salir()
    {
    
    }
    public void boton_servicios()
    {
    if(!this.btn_servicios.isSelected()){
            this.btn_servicios.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_especialista.setSelected(false);
            
            
        lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicio.setBackground(new Color(101,208,250));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
        lblsalir.setBackground(new Color(255,255,255));
            frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        rSPanelsSlider1.slidPanel(10,panel_servicios, RSPanelsSlider.direct.Left);
        
       }   
    }
    public void boton_especialistas()
    {
     if(!this.btn_especialista.isSelected()){
            this.btn_especialista.setSelected(true);
            this.btn_inicio.setSelected(false);
            this.btn_paciente.setSelected(false);
            this.btn_citas.setSelected(false);
            this.btn_gestionar_cita.setSelected(false);
            this.btn_factura.setSelected(false);
            this.btn_servicios.setSelected(false);
            
            
                    lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(101,208,250));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
        lblsalir.setBackground(new Color(255,255,255));
        
            frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
           
        rSPanelsSlider1.slidPanel(10,panel_especialista, RSPanelsSlider.direct.Left);
        
       }    
    }
    public void boton_base_datos()
    {
    lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        
                lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(101,208,250));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(255,255,255));
        
   int posicion = this.panel_base_datos.getX();
        
       if (posicion> 1000)
            
       {
           
           icono_menu();
        Animacion.Animacion.mover_izquierda(1242, 880 , 2, 4, panel_base_datos);

           frm_03_reservar_cita1.deshabilitar_rbx(false);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(false);
       }
        
        
    }
    
    
    
    
    public void boton_usuarios()
    {
    lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        
                lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(101,208,250));
        lblminimizar.setBackground(new Color(255,255,255)); 
        
        frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
    }
    public void boton_minimizar()
    {
     lblinicio.setBackground(new Color(255,255,255));
        lblpaciente.setBackground(new Color(255,255,255));
        lblcita.setBackground(new Color(255,255,255));
        lblgestioncita.setBackground(new Color(255,255,255));
        lblfactura.setBackground(new Color(255,255,255));
        lblservicio.setBackground(new Color(255,255,255));
        lblespecialistas.setBackground(new Color(255,255,255));
        lblbasedatos.setBackground(new Color(255,255,255));
        lblusuario.setBackground(new Color(255,255,255));
        lblminimizar.setBackground(new Color(101,208,250));
        lblsalir.setBackground(new Color(255,255,255));
        
        frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
        
        this.setState(Frame.ICONIFIED); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_menu = new javax.swing.JPanel();
        btn_paciente = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_factura = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_inicio = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_citas = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable = new javax.swing.JLabel();
        btn_salir1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_gestionar_cita = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblfactura = new javax.swing.JLabel();
        lblinicio = new javax.swing.JLabel();
        lblpaciente = new javax.swing.JLabel();
        lblcita = new javax.swing.JLabel();
        lblgestioncita = new javax.swing.JLabel();
        lblsalir = new javax.swing.JLabel();
        Panel_menu_opcion2 = new javax.swing.JPanel();
        btn_especialista = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lb_menu_despegable_2 = new javax.swing.JLabel();
        btn_servicios = new RSMaterialComponent.RSButtonMaterialGradientOne();
        min = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_base_datos = new RSMaterialComponent.RSButtonMaterialGradientOne();
        btn_usuario1 = new RSMaterialComponent.RSButtonMaterialGradientOne();
        lblservicio = new javax.swing.JLabel();
        lblespecialistas = new javax.swing.JLabel();
        lblminimizar = new javax.swing.JLabel();
        lblbasedatos = new javax.swing.JLabel();
        lblusuario = new javax.swing.JLabel();
        panel_base_datos = new javax.swing.JPanel();
        rSButtonRiple2 = new rojeru_san.RSButtonRiple();
        rSButtonRiple3 = new rojeru_san.RSButtonRiple();
        rSButtonRiple4 = new rojeru_san.RSButtonRiple();
        Panel_Menu_despegable = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_inicio_02 = new newscomponents.RSButtonFlat_new();
        jLabel1 = new javax.swing.JLabel();
        btn_paciente_02 = new newscomponents.RSButtonFlat_new();
        btn_citas_2 = new newscomponents.RSButtonFlat_new();
        btn_gestionar_citas_02 = new newscomponents.RSButtonFlat_new();
        btn_facturas_02 = new newscomponents.RSButtonFlat_new();
        btn_salir_02 = new newscomponents.RSButtonFlat_new();
        fSGradientPanel1 = new LIB.FSGradientPanel();
        panel_menu_despegable_2 = new javax.swing.JPanel();
        fSGradientPanel2 = new LIB.FSGradientPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_servicios_02 = new newscomponents.RSButtonFlat_new();
        btn_base_datos_2 = new newscomponents.RSButtonFlat_new();
        btn_especialista_02 = new newscomponents.RSButtonFlat_new();
        btn_usuarios_02 = new newscomponents.RSButtonFlat_new();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        panel_inicio = new javax.swing.JPanel();
        frm_inicio2 = new WIN33CLC_VIEW.frm_inicio();
        panel_paciente = new javax.swing.JPanel();
        frm_02_Patient_Detail1 = new WIN33CLC_VIEW.frm_02_Patient_Detail();
        panel_cita = new javax.swing.JPanel();
        frm_03_reservar_cita1 = new WIN33CLC_VIEW.frm_03_reservar_cita();
        panel_factura = new javax.swing.JPanel();
        frm_04_comprobantes1 = new WIN33CLC_VIEW.frm_04_comprobantes();
        panel_servicios = new javax.swing.JPanel();
        frm_05_servicios1 = new WIN33CLC_VIEW.frm_05_servicios();
        panel_especialista = new javax.swing.JPanel();
        frm_06_especialistas1 = new WIN33CLC_VIEW.frm_06_especialistas();
        panel_gestionar_cita = new javax.swing.JPanel();
        frm_07_gestionar_cita1 = new WIN33CLC_VIEW.frm_07_gestionar_cita();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1240, 741));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_menu.setBackground(new java.awt.Color(255, 255, 255));
        Panel_menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_paciente.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente.setBorder(null);
        btn_paciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/4.png"))); // NOI18N
        btn_paciente.setBorderPainted(false);
        btn_paciente.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_paciente.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_paciente.setFocusPainted(false);
        btn_paciente.setIconTextGap(0);
        btn_paciente.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btn_paciente.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_paciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pacienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pacienteMouseExited(evt);
            }
        });
        btn_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pacienteActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 50, -1));

        btn_factura.setBackground(new java.awt.Color(255, 255, 255));
        btn_factura.setBorder(null);
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/6.png"))); // NOI18N
        btn_factura.setBorderPainted(false);
        btn_factura.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_factura.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_factura.setFocusPainted(false);
        btn_factura.setIconTextGap(0);
        btn_factura.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_facturaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_facturaMouseExited(evt);
            }
        });
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_factura, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 50, -1));

        btn_inicio.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio.setBorder(null);
        btn_inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/2.png"))); // NOI18N
        btn_inicio.setBorderPainted(false);
        btn_inicio.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_inicio.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_inicio.setFocusPainted(false);
        btn_inicio.setIconTextGap(0);
        btn_inicio.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicioMouseExited(evt);
            }
        });
        btn_inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicioActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        btn_citas.setBackground(new java.awt.Color(255, 255, 255));
        btn_citas.setBorder(null);
        btn_citas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/3.png"))); // NOI18N
        btn_citas.setBorderPainted(false);
        btn_citas.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_citas.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_citas.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_citas.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_citas.setFocusPainted(false);
        btn_citas.setIconTextGap(0);
        btn_citas.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_citasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_citasMouseExited(evt);
            }
        });
        btn_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citasActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_citas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 50, -1));

        lb_menu_despegable.setBackground(new java.awt.Color(0, 0, 0));
        lb_menu_despegable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/12.png"))); // NOI18N
        lb_menu_despegable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_despegableMouseExited(evt);
            }
        });
        Panel_menu.add(lb_menu_despegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_salir1.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir1.setBorder(null);
        btn_salir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/8.png"))); // NOI18N
        btn_salir1.setBorderPainted(false);
        btn_salir1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_salir1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_salir1.setFocusPainted(false);
        btn_salir1.setIconTextGap(0);
        btn_salir1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_salir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salir1MouseExited(evt);
            }
        });
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_salir1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 50, -1));

        btn_gestionar_cita.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setBorder(null);
        btn_gestionar_cita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/5.png"))); // NOI18N
        btn_gestionar_cita.setBorderPainted(false);
        btn_gestionar_cita.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_gestionar_cita.setFocusPainted(false);
        btn_gestionar_cita.setIconTextGap(0);
        btn_gestionar_cita.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_gestionar_cita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gestionar_citaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gestionar_citaMouseExited(evt);
            }
        });
        btn_gestionar_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_citaActionPerformed(evt);
            }
        });
        Panel_menu.add(btn_gestionar_cita, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, -1));

        lblfactura.setBackground(new java.awt.Color(101, 208, 250));
        lblfactura.setOpaque(true);
        Panel_menu.add(lblfactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 10, 40));

        lblinicio.setBackground(new java.awt.Color(101, 208, 250));
        lblinicio.setOpaque(true);
        Panel_menu.add(lblinicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 10, 40));

        lblpaciente.setBackground(new java.awt.Color(101, 208, 250));
        lblpaciente.setOpaque(true);
        Panel_menu.add(lblpaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 10, 40));

        lblcita.setBackground(new java.awt.Color(101, 208, 250));
        lblcita.setOpaque(true);
        Panel_menu.add(lblcita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 10, 40));

        lblgestioncita.setBackground(new java.awt.Color(101, 208, 250));
        lblgestioncita.setOpaque(true);
        Panel_menu.add(lblgestioncita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 10, 40));

        lblsalir.setBackground(new java.awt.Color(101, 208, 250));
        lblsalir.setOpaque(true);
        Panel_menu.add(lblsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 10, 40));

        getContentPane().add(Panel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 740));

        Panel_menu_opcion2.setBackground(new java.awt.Color(255, 255, 255));
        Panel_menu_opcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_especialista.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista.setBorder(null);
        btn_especialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/10.png"))); // NOI18N
        btn_especialista.setBorderPainted(false);
        btn_especialista.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_especialista.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_especialista.setFocusPainted(false);
        btn_especialista.setIconTextGap(0);
        btn_especialista.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_especialista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_especialistaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_especialistaMouseExited(evt);
            }
        });
        btn_especialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialistaActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_especialista, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 50, -1));

        lb_menu_despegable_2.setBackground(new java.awt.Color(0, 0, 0));
        lb_menu_despegable_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/12.png"))); // NOI18N
        lb_menu_despegable_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lb_menu_despegable_2MouseExited(evt);
            }
        });
        Panel_menu_opcion2.add(lb_menu_despegable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btn_servicios.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios.setBorder(null);
        btn_servicios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/9.png"))); // NOI18N
        btn_servicios.setBorderPainted(false);
        btn_servicios.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_servicios.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_servicios.setFocusPainted(false);
        btn_servicios.setIconTextGap(0);
        btn_servicios.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_servicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_serviciosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_serviciosMouseExited(evt);
            }
        });
        btn_servicios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_serviciosActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_servicios, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, -1));

        min.setBackground(new java.awt.Color(255, 255, 255));
        min.setBorder(null);
        min.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/14.png"))); // NOI18N
        min.setBorderPainted(false);
        min.setColorPrimario(new java.awt.Color(255, 255, 255));
        min.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        min.setColorSecundario(new java.awt.Color(255, 255, 255));
        min.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        min.setFocusPainted(false);
        min.setIconTextGap(0);
        min.setRippleColor(new java.awt.Color(204, 204, 204));
        min.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minMouseExited(evt);
            }
        });
        min.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(min, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 680, 50, -1));

        btn_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos.setBorder(null);
        btn_base_datos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/11.png"))); // NOI18N
        btn_base_datos.setBorderPainted(false);
        btn_base_datos.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_base_datos.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_base_datos.setFocusPainted(false);
        btn_base_datos.setIconTextGap(0);
        btn_base_datos.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_base_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_base_datosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_base_datosMouseExited(evt);
            }
        });
        btn_base_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datosActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_base_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 50, -1));

        btn_usuario1.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuario1.setBorder(null);
        btn_usuario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/1.png"))); // NOI18N
        btn_usuario1.setBorderPainted(false);
        btn_usuario1.setColorPrimario(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorPrimarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorSecundario(new java.awt.Color(255, 255, 255));
        btn_usuario1.setColorSecundarioHover(new java.awt.Color(255, 255, 255));
        btn_usuario1.setFocusPainted(false);
        btn_usuario1.setIconTextGap(0);
        btn_usuario1.setRippleColor(new java.awt.Color(204, 204, 204));
        btn_usuario1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuario1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuario1MouseExited(evt);
            }
        });
        btn_usuario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuario1ActionPerformed(evt);
            }
        });
        Panel_menu_opcion2.add(btn_usuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, 50, -1));

        lblservicio.setBackground(new java.awt.Color(101, 208, 250));
        lblservicio.setOpaque(true);
        Panel_menu_opcion2.add(lblservicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 10, 40));

        lblespecialistas.setBackground(new java.awt.Color(101, 208, 250));
        lblespecialistas.setOpaque(true);
        Panel_menu_opcion2.add(lblespecialistas, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 10, 40));

        lblminimizar.setBackground(new java.awt.Color(101, 208, 250));
        lblminimizar.setOpaque(true);
        Panel_menu_opcion2.add(lblminimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 680, 10, 40));

        lblbasedatos.setBackground(new java.awt.Color(101, 208, 250));
        lblbasedatos.setOpaque(true);
        Panel_menu_opcion2.add(lblbasedatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 10, 40));

        lblusuario.setBackground(new java.awt.Color(101, 208, 250));
        lblusuario.setOpaque(true);
        Panel_menu_opcion2.add(lblusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 10, 40));

        getContentPane().add(Panel_menu_opcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 0, 70, 740));

        panel_base_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_base_datos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonRiple2.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonRiple2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-configuración-de-datos-30.png"))); // NOI18N
        rSButtonRiple2.setText("Hacer Copia de Seguridad");
        rSButtonRiple2.setBorderPainted(false);
        rSButtonRiple2.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple2.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple2.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonRiple2.setFocusPainted(false);
        rSButtonRiple2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        rSButtonRiple2.setIconTextGap(8);
        panel_base_datos.add(rSButtonRiple2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 90));

        rSButtonRiple3.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple3.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonRiple3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-configuración-restaurar-copia-de-seguridad-30.png"))); // NOI18N
        rSButtonRiple3.setText("Restaurar Base de Datos");
        rSButtonRiple3.setBorderPainted(false);
        rSButtonRiple3.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple3.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple3.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonRiple3.setFocusPainted(false);
        rSButtonRiple3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        rSButtonRiple3.setIconTextGap(8);
        panel_base_datos.add(rSButtonRiple3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 290, 90));

        rSButtonRiple4.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonRiple4.setForeground(new java.awt.Color(0, 0, 0));
        rSButtonRiple4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WIN34CLC_RESOURCES/icons8-eliminar-30.png"))); // NOI18N
        rSButtonRiple4.setText("Vaciar Base de Datos");
        rSButtonRiple4.setBorderPainted(false);
        rSButtonRiple4.setColorHover(new java.awt.Color(255, 255, 255));
        rSButtonRiple4.setColorText(new java.awt.Color(0, 0, 0));
        rSButtonRiple4.setColorTextHover(new java.awt.Color(0, 0, 0));
        rSButtonRiple4.setFocusPainted(false);
        rSButtonRiple4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        rSButtonRiple4.setIconTextGap(8);
        panel_base_datos.add(rSButtonRiple4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 90));

        getContentPane().add(panel_base_datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(1242, 330, 360, 280));

        Panel_Menu_despegable.setBackground(new java.awt.Color(255, 255, 255));
        Panel_Menu_despegable.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_inicio_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_inicio_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_inicio_02.setText("Inicio");
        btn_inicio_02.setBorderPainted(false);
        btn_inicio_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_inicio_02.setOpaque(true);
        btn_inicio_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_inicio_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_inicio_02MouseExited(evt);
            }
        });
        btn_inicio_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inicio_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_inicio_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 250, 140));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("DentalSys");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        btn_paciente_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_paciente_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_paciente_02.setText("Pacientes");
        btn_paciente_02.setBorderPainted(false);
        btn_paciente_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_paciente_02.setOpaque(true);
        btn_paciente_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_paciente_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_paciente_02MouseExited(evt);
            }
        });
        btn_paciente_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paciente_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_paciente_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 250, 160));

        btn_citas_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_citas_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_citas_2.setText("Citas");
        btn_citas_2.setBorderPainted(false);
        btn_citas_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_citas_2.setOpaque(true);
        btn_citas_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_citas_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_citas_2MouseExited(evt);
            }
        });
        btn_citas_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_citas_2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_citas_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 250, 60));

        btn_gestionar_citas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_gestionar_citas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_gestionar_citas_02.setText("Gestionar Citas");
        btn_gestionar_citas_02.setBorderPainted(false);
        btn_gestionar_citas_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_gestionar_citas_02.setOpaque(true);
        btn_gestionar_citas_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gestionar_citas_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gestionar_citas_02MouseExited(evt);
            }
        });
        btn_gestionar_citas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gestionar_citas_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_gestionar_citas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 250, 80));

        btn_facturas_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_facturas_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_facturas_02.setText("Facturas");
        btn_facturas_02.setBorderPainted(false);
        btn_facturas_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_facturas_02.setOpaque(true);
        btn_facturas_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_facturas_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_facturas_02MouseExited(evt);
            }
        });
        btn_facturas_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturas_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_facturas_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 530, 250, 110));

        btn_salir_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_salir_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_salir_02.setText("Salir");
        btn_salir_02.setBorderPainted(false);
        btn_salir_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_salir_02.setOpaque(true);
        btn_salir_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_salir_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_salir_02MouseExited(evt);
            }
        });
        btn_salir_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir_02ActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 670, 250, 60));

        Panel_Menu_despegable.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 322, 740));

        fSGradientPanel1.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel1.setFSStartColor(new java.awt.Color(101, 208, 250));
        Panel_Menu_despegable.add(fSGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 10, 740));

        getContentPane().add(Panel_Menu_despegable, new org.netbeans.lib.awtextra.AbsoluteConstraints(-360, 0, 360, 740));

        panel_menu_despegable_2.setBackground(new java.awt.Color(255, 255, 255));
        panel_menu_despegable_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fSGradientPanel2.setFSEndColor(new java.awt.Color(3, 111, 198));
        fSGradientPanel2.setFSStartColor(new java.awt.Color(101, 208, 250));
        panel_menu_despegable_2.add(fSGradientPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 10, 740));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("DentalSys ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

        btn_servicios_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_servicios_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_servicios_02.setText("Servicios");
        btn_servicios_02.setBorderPainted(false);
        btn_servicios_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_servicios_02.setIconTextGap(2);
        btn_servicios_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_servicios_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_servicios_02MouseExited(evt);
            }
        });
        btn_servicios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_servicios_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_servicios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 100));

        btn_base_datos_2.setBackground(new java.awt.Color(255, 255, 255));
        btn_base_datos_2.setForeground(new java.awt.Color(0, 0, 0));
        btn_base_datos_2.setText("Base de Datos");
        btn_base_datos_2.setBorderPainted(false);
        btn_base_datos_2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_base_datos_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_base_datos_2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_base_datos_2MouseExited(evt);
            }
        });
        btn_base_datos_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_base_datos_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_base_datos_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 270, 90));

        btn_especialista_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_especialista_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_especialista_02.setText("Especialistas");
        btn_especialista_02.setBorderPainted(false);
        btn_especialista_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_especialista_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_especialista_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_especialista_02MouseExited(evt);
            }
        });
        btn_especialista_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_especialista_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_especialista_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 270, 80));

        btn_usuarios_02.setBackground(new java.awt.Color(255, 255, 255));
        btn_usuarios_02.setForeground(new java.awt.Color(0, 0, 0));
        btn_usuarios_02.setText("Usuarios");
        btn_usuarios_02.setBorderPainted(false);
        btn_usuarios_02.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_usuarios_02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usuarios_02MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usuarios_02MouseExited(evt);
            }
        });
        btn_usuarios_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuarios_02ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_usuarios_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 270, 90));

        panel_menu_despegable_2.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 340, 740));

        getContentPane().add(panel_menu_despegable_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, 390, 740));

        panel_inicio.setName("panel_inicio"); // NOI18N
        panel_inicio.setLayout(new java.awt.CardLayout());
        panel_inicio.add(frm_inicio2, "card2");

        rSPanelsSlider1.add(panel_inicio, "card2");

        panel_paciente.setName("panel_paciente"); // NOI18N
        panel_paciente.setLayout(new java.awt.CardLayout());
        panel_paciente.add(frm_02_Patient_Detail1, "card2");

        rSPanelsSlider1.add(panel_paciente, "card3");

        panel_cita.setName("panel_cita"); // NOI18N
        panel_cita.setLayout(new java.awt.CardLayout());
        panel_cita.add(frm_03_reservar_cita1, "card2");

        rSPanelsSlider1.add(panel_cita, "card4");

        panel_factura.setName("panel_factura"); // NOI18N
        panel_factura.setLayout(new java.awt.CardLayout());
        panel_factura.add(frm_04_comprobantes1, "card2");

        rSPanelsSlider1.add(panel_factura, "card5");

        panel_servicios.setName("panel_servicios"); // NOI18N
        panel_servicios.setLayout(new java.awt.CardLayout());
        panel_servicios.add(frm_05_servicios1, "card2");

        rSPanelsSlider1.add(panel_servicios, "card6");

        panel_especialista.setName("panel_especialista"); // NOI18N
        panel_especialista.setLayout(new java.awt.CardLayout());
        panel_especialista.add(frm_06_especialistas1, "card2");

        rSPanelsSlider1.add(panel_especialista, "card3");

        panel_gestionar_cita.setBackground(new java.awt.Color(255, 255, 255));
        panel_gestionar_cita.setName("panel_gestionar_cita"); // NOI18N
        panel_gestionar_cita.setLayout(new java.awt.CardLayout());
        panel_gestionar_cita.add(frm_07_gestionar_cita1, "card2");

        rSPanelsSlider1.add(panel_gestionar_cita, "card3");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 1100, 740));

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
boton_comprobante();
icono_menu ();
    }//GEN-LAST:event_btn_facturaActionPerformed

    
    public void icono_menu ()
            
    {
        changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/12.png");
       changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/12.png");
        
    }
    private void lb_menu_despegableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseClicked
      
        
      int posicion = this.Panel_Menu_despegable.getX();
        
       if (posicion< -1)
            
       {
           
           changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/13.png");
       changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/12.png");
        Animacion.Animacion.mover_derecha(-360, 0 , 2, 4, Panel_Menu_despegable);
        
       
            Panel_Menu_despegable.setVisible(true);
            Panel_Menu_despegable.setEnabled(true);
       }
       
       else
           
       {
            changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/12.png");
           
           Animacion.Animacion.mover_izquierda(0 ,-360, 2, 4, Panel_Menu_despegable);
        
     
           
           
       }
     
     
    }//GEN-LAST:event_lb_menu_despegableMouseClicked

    private void lb_menu_despegableMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseEntered
     
    }//GEN-LAST:event_lb_menu_despegableMouseEntered

    private void lb_menu_despegableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegableMouseExited
  
    }//GEN-LAST:event_lb_menu_despegableMouseExited

    private void btn_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pacienteActionPerformed
boton_paciente();
icono_menu ();

    }//GEN-LAST:event_btn_pacienteActionPerformed

    private void btn_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citasActionPerformed
boton_cita();
       icono_menu ();
    }//GEN-LAST:event_btn_citasActionPerformed

    private void btn_inicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicioActionPerformed
boton_inicio();
icono_menu ();
    }//GEN-LAST:event_btn_inicioActionPerformed

    private void btn_especialistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialistaActionPerformed
boton_especialistas();
        
     icono_menu ();   
        
        
    }//GEN-LAST:event_btn_especialistaActionPerformed

    private void lb_menu_despegable_2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseClicked
       
    
        int posicion = this.panel_menu_despegable_2.getX();
           ocultar_panel_base_datos();
       if (posicion > 1000 )
            
       {
          // 
       
          
       changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/15.png");
       changeimage(lb_menu_despegable, "/WIN34CLC_RESOURCES/12.png");
       Animacion.Animacion.mover_izquierda(1240, 850 , 2, 4, panel_menu_despegable_2);
     
           frm_03_reservar_cita1.deshabilitar_rbx(false);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(false);
 
       }
       
       else
           
       {
           
            changeimage(lb_menu_despegable_2, "/WIN34CLC_RESOURCES/12.png");
           
           Animacion.Animacion.mover_derecha(850 ,1240, 2,4, panel_menu_despegable_2);

           frm_03_reservar_cita1.deshabilitar_rbx(true);
            frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);
   
  
       }
    }//GEN-LAST:event_lb_menu_despegable_2MouseClicked

    private void lb_menu_despegable_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseEntered

    private void lb_menu_despegable_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_menu_despegable_2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lb_menu_despegable_2MouseExited

    private void btn_serviciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_serviciosActionPerformed
boton_servicios();
icono_menu ();
    }//GEN-LAST:event_btn_serviciosActionPerformed

    private void minActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minActionPerformed
boton_minimizar();
            
    }//GEN-LAST:event_minActionPerformed

    private void btn_base_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datosActionPerformed

         int posicion = this.panel_base_datos.getX();
        
       if (posicion> 1000)
            
       {
          ocultar_panel_menu_despegable_2();
        Animacion.Animacion.mover_izquierda(1242, 880 , 2, 4, panel_base_datos);

 
            
           frm_03_reservar_cita1.deshabilitar_rbx(false);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(false);
       }
       
       else
           
       {
      
           
           Animacion.Animacion.mover_derecha(880 ,1242, 2, 4, panel_base_datos);

           frm_03_reservar_cita1.deshabilitar_rbx(true);
           frm_07_gestionar_cita1.deshabilitar_rbx_Gestionar_cita(true);

       }
        
 boton_base_datos();
icono_menu ();
    }//GEN-LAST:event_btn_base_datosActionPerformed

    private void btn_gestionar_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citaActionPerformed
boton_gestionarCita();
icono_menu ();
    }//GEN-LAST:event_btn_gestionar_citaActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
System.exit(0);
   
    }//GEN-LAST:event_btn_salir1ActionPerformed

    private void btn_inicio_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inicio_02ActionPerformed
boton_inicio();
icono_menu();   
       
    }//GEN-LAST:event_btn_inicio_02ActionPerformed

    private void btn_paciente_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paciente_02ActionPerformed
boton_paciente();
icono_menu();   
    }//GEN-LAST:event_btn_paciente_02ActionPerformed

    private void btn_citas_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_citas_2ActionPerformed
boton_cita();
icono_menu();
    }//GEN-LAST:event_btn_citas_2ActionPerformed

    private void btn_gestionar_citas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gestionar_citas_02ActionPerformed
        boton_gestionarCita();
        icono_menu();
    }//GEN-LAST:event_btn_gestionar_citas_02ActionPerformed

    private void btn_facturas_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturas_02ActionPerformed
boton_comprobante();
icono_menu();
    }//GEN-LAST:event_btn_facturas_02ActionPerformed

    private void btn_salir_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir_02ActionPerformed
System.exit(0);       
    }//GEN-LAST:event_btn_salir_02ActionPerformed

    private void btn_servicios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_servicios_02ActionPerformed
boton_servicios();
icono_menu();
    }//GEN-LAST:event_btn_servicios_02ActionPerformed

    private void btn_especialista_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_especialista_02ActionPerformed
boton_especialistas();
icono_menu();
    }//GEN-LAST:event_btn_especialista_02ActionPerformed

    private void btn_base_datos_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_base_datos_2ActionPerformed
     
       boton_base_datos();
     icono_menu();
    }//GEN-LAST:event_btn_base_datos_2ActionPerformed

    private void btn_usuarios_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuarios_02ActionPerformed
boton_usuarios();
icono_menu();
    }//GEN-LAST:event_btn_usuarios_02ActionPerformed

    private void btn_usuario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuario1ActionPerformed
boton_usuarios();
icono_menu ();
    }//GEN-LAST:event_btn_usuario1ActionPerformed

    private void btn_pacienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseEntered
         lblpaciente.setBackground(new Color(101,208,250));

    }//GEN-LAST:event_btn_pacienteMouseEntered

    private void btn_pacienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pacienteMouseExited
    
        if(!this.btn_paciente .isSelected()){
            lblpaciente.setBackground(new Color(255,255,255));
        }
        
    
    }//GEN-LAST:event_btn_pacienteMouseExited

    private void btn_inicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseEntered
 lblinicio.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioMouseEntered

    private void btn_inicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicioMouseExited
  if(!this.btn_inicio .isSelected()){
            lblinicio.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicioMouseExited

    private void btn_citasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citasMouseEntered
  lblcita.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citasMouseEntered

    private void btn_citasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citasMouseExited
 if(!this.btn_citas .isSelected()){
            lblcita.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citasMouseExited

    private void btn_gestionar_citaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseEntered
  lblgestioncita.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaMouseEntered

    private void btn_gestionar_citaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citaMouseExited
  if(!this.btn_gestionar_cita .isSelected()){
            lblgestioncita.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citaMouseExited

    private void btn_facturaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseEntered
  lblfactura.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaMouseEntered

    private void btn_facturaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseExited
 if(!this.btn_factura .isSelected()){
            lblfactura.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaMouseExited

    private void btn_salir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir1MouseEntered
  lblsalir.setBackground(new Color(224, 10, 71));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir1MouseEntered

    private void btn_salir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir1MouseExited
 if(!this.btn_salir1 .isSelected()){
            lblsalir.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir1MouseExited

    private void btn_serviciosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseEntered
  lblservicio.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_serviciosMouseEntered

    private void btn_serviciosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_serviciosMouseExited
  if(!this.btn_servicios.isSelected()){
            lblservicio.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_serviciosMouseExited

    private void btn_especialistaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseEntered
 lblespecialistas.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaMouseEntered

    private void btn_especialistaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialistaMouseExited
if(!this.btn_especialista .isSelected()){
            lblespecialistas.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialistaMouseExited

    private void btn_base_datosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseEntered
lblbasedatos.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosMouseEntered

    private void btn_base_datosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datosMouseExited
 if(!this.btn_base_datos .isSelected()){
            lblbasedatos.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datosMouseExited

    private void btn_usuario1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuario1MouseEntered
lblusuario.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario1MouseEntered

    private void btn_usuario1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuario1MouseExited
 if(!this.btn_usuario1 .isSelected()){
            lblusuario.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuario1MouseExited

    private void minMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseEntered
lblminimizar.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_minMouseEntered

    private void minMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minMouseExited
  if(!this.min .isSelected()){
            lblminimizar.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_minMouseExited

    private void btn_inicio_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseEntered
lblinicio.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseEntered

    private void btn_inicio_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inicio_02MouseExited
  if(!this.btn_inicio .isSelected()){
            lblinicio.setBackground(new Color(255,255,255));
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btn_inicio_02MouseExited

    private void btn_paciente_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseEntered
lblpaciente.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseEntered

    private void btn_paciente_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_paciente_02MouseExited
if(!this.btn_paciente .isSelected()){
            lblpaciente.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_paciente_02MouseExited

    private void btn_citas_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citas_2MouseEntered
lblcita.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_citas_2MouseEntered

    private void btn_citas_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_citas_2MouseExited
if(!this.btn_citas .isSelected()){
            lblcita.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_citas_2MouseExited

    private void btn_gestionar_citas_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citas_02MouseEntered
lblgestioncita.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citas_02MouseEntered

    private void btn_gestionar_citas_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gestionar_citas_02MouseExited
if(!this.btn_gestionar_cita .isSelected()){
            lblgestioncita.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_gestionar_citas_02MouseExited

    private void btn_facturas_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturas_02MouseEntered
lblfactura.setBackground(new Color(101,208,250));
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturas_02MouseEntered

    private void btn_facturas_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturas_02MouseExited
if(!this.btn_factura .isSelected()){
            lblfactura.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturas_02MouseExited

    private void btn_salir_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_02MouseEntered
lblsalir.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02MouseEntered

    private void btn_salir_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salir_02MouseExited
if(!this.btn_salir1 .isSelected()){
            lblsalir.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_salir_02MouseExited

    private void btn_servicios_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseEntered
lblservicio.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicios_02MouseEntered

    private void btn_servicios_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_servicios_02MouseExited
if(!this.btn_servicios .isSelected()){
            lblservicio.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_servicios_02MouseExited

    private void btn_especialista_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseEntered
lblespecialistas.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseEntered

    private void btn_especialista_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_especialista_02MouseExited
if(!this.btn_especialista .isSelected()){
            lblespecialistas.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_especialista_02MouseExited

    private void btn_base_datos_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datos_2MouseEntered
lblbasedatos.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datos_2MouseEntered

    private void btn_base_datos_2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_base_datos_2MouseExited
if(!this.btn_base_datos .isSelected()){
            lblbasedatos.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_base_datos_2MouseExited

    private void btn_usuarios_02MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_02MouseEntered
lblusuario.setBackground(new Color(101,208,250));        // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarios_02MouseEntered

    private void btn_usuarios_02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usuarios_02MouseExited
if(!this.btn_usuario1 .isSelected()){
            lblusuario.setBackground(new Color(255,255,255));
        }            // TODO add your handling code here:
    }//GEN-LAST:event_btn_usuarios_02MouseExited

 
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_Main1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Menu_despegable;
    private javax.swing.JPanel Panel_menu;
    private javax.swing.JPanel Panel_menu_opcion2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_base_datos;
    private newscomponents.RSButtonFlat_new btn_base_datos_2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_citas;
    private newscomponents.RSButtonFlat_new btn_citas_2;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_especialista;
    private newscomponents.RSButtonFlat_new btn_especialista_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_factura;
    private newscomponents.RSButtonFlat_new btn_facturas_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_gestionar_cita;
    private newscomponents.RSButtonFlat_new btn_gestionar_citas_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_inicio;
    private newscomponents.RSButtonFlat_new btn_inicio_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_paciente;
    private newscomponents.RSButtonFlat_new btn_paciente_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_salir1;
    private newscomponents.RSButtonFlat_new btn_salir_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_servicios;
    private newscomponents.RSButtonFlat_new btn_servicios_02;
    private RSMaterialComponent.RSButtonMaterialGradientOne btn_usuario1;
    private newscomponents.RSButtonFlat_new btn_usuarios_02;
    private LIB.FSGradientPanel fSGradientPanel1;
    private LIB.FSGradientPanel fSGradientPanel2;
    private WIN33CLC_VIEW.frm_02_Patient_Detail frm_02_Patient_Detail1;
    private WIN33CLC_VIEW.frm_03_reservar_cita frm_03_reservar_cita1;
    private WIN33CLC_VIEW.frm_04_comprobantes frm_04_comprobantes1;
    private WIN33CLC_VIEW.frm_05_servicios frm_05_servicios1;
    private WIN33CLC_VIEW.frm_06_especialistas frm_06_especialistas1;
    private WIN33CLC_VIEW.frm_07_gestionar_cita frm_07_gestionar_cita1;
    private WIN33CLC_VIEW.frm_inicio frm_inicio2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lb_menu_despegable;
    private javax.swing.JLabel lb_menu_despegable_2;
    private javax.swing.JLabel lblbasedatos;
    private javax.swing.JLabel lblcita;
    private javax.swing.JLabel lblespecialistas;
    private javax.swing.JLabel lblfactura;
    private javax.swing.JLabel lblgestioncita;
    private javax.swing.JLabel lblinicio;
    private javax.swing.JLabel lblminimizar;
    private javax.swing.JLabel lblpaciente;
    private javax.swing.JLabel lblsalir;
    private javax.swing.JLabel lblservicio;
    private javax.swing.JLabel lblusuario;
    private RSMaterialComponent.RSButtonMaterialGradientOne min;
    private javax.swing.JPanel panel_base_datos;
    private javax.swing.JPanel panel_cita;
    private javax.swing.JPanel panel_especialista;
    private javax.swing.JPanel panel_factura;
    private javax.swing.JPanel panel_gestionar_cita;
    private javax.swing.JPanel panel_inicio;
    private javax.swing.JPanel panel_menu_despegable_2;
    private javax.swing.JPanel panel_paciente;
    private javax.swing.JPanel panel_servicios;
    private rojeru_san.RSButtonRiple rSButtonRiple2;
    private rojeru_san.RSButtonRiple rSButtonRiple3;
    private rojeru_san.RSButtonRiple rSButtonRiple4;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    // End of variables declaration//GEN-END:variables



}

