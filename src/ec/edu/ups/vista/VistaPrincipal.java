/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.dao.ClienteDAO;
import ec.edu.ups.dao.TicketDAO;
import ec.edu.ups.dao.VehiculoDAO;
import ec.edu.ups.idao.IClienteDAO;
import ec.edu.ups.idao.ITicketDAO;
import ec.edu.ups.idao.IVehiculoDAO;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Paul Idrovo
 */
public class VistaPrincipal extends javax.swing.JFrame {

    //Vistas
    private VistaAgregarCliente vistaAgregarCliente;
    private VistaAgregarVehiculo vistaAgregarVehiculo;
    private VistaIngresoParqueadero vistaIngresoParqueadero;
    private VistaSalidaParqueadero vistaSalidaParqueadero;
    private VistaListarTickets vistaListarTickets;
    private VistaEditarDatosVehiculo vistaEditarDatosVehiculo;
    //Dao
    private IClienteDAO clienteDao;
    private ITicketDAO ticketDao;
    private IVehiculoDAO vehiculoDao;
    //Controladores
    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    private ResourceBundle mensajes;
    private Locale localizacion;
    
    public VistaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(screenSize);
        lblFondo.setSize(screenSize);
        
        //Inicializar Dao
        this.clienteDao = new ClienteDAO();
        this.ticketDao = new TicketDAO();
        this.vehiculoDao = new VehiculoDAO();

        //Inicializar controladores
        this.controladorCliente = new ControladorCliente(clienteDao, ticketDao, vehiculoDao);
        this.controladorTicket = new ControladorTicket(clienteDao, ticketDao, vehiculoDao);
        this.controladorVehiculo = new ControladorVehiculo(clienteDao, ticketDao, vehiculoDao);

        
        //Vistas
        this.vistaAgregarCliente = new VistaAgregarCliente(controladorCliente, controladorTicket, controladorVehiculo, vistaAgregarVehiculo);
        this.vistaAgregarVehiculo = new VistaAgregarVehiculo(controladorCliente, controladorTicket, controladorVehiculo, vistaAgregarCliente, vistaIngresoParqueadero);
        this.vistaAgregarCliente.setVistaAgregarVehiculo(vistaAgregarVehiculo);
        this.vistaEditarDatosVehiculo = new VistaEditarDatosVehiculo(controladorCliente, controladorTicket, controladorVehiculo, vistaIngresoParqueadero);
        this.vistaIngresoParqueadero = new VistaIngresoParqueadero(controladorCliente, controladorTicket, controladorVehiculo, vistaAgregarVehiculo, vistaEditarDatosVehiculo);
        this.vistaEditarDatosVehiculo.setVistaIngreso(vistaIngresoParqueadero);
        this.vistaAgregarVehiculo.setVistaIngresoParqueadero(vistaIngresoParqueadero);
        this.vistaSalidaParqueadero = new VistaSalidaParqueadero(controladorCliente, controladorTicket, controladorVehiculo);
        this.vistaListarTickets = new VistaListarTickets(controladorCliente, controladorTicket, controladorVehiculo);

        //Agregar desktopPane
        this.desktopPane.add(vistaAgregarCliente);
        this.desktopPane.add(vistaAgregarVehiculo);
        this.desktopPane.add(vistaIngresoParqueadero);
        this.desktopPane.add(vistaSalidaParqueadero);
        this.desktopPane.add(vistaListarTickets);
        this.desktopPane.add(vistaEditarDatosVehiculo);     
        
        //Idioma
        this.localizacion= new Locale("es", "EC");
        this.mensajes=ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);
        cambiarIdiomaTodasLasVentanas();
    }

    private void Ocultar() {
        this.vistaAgregarCliente.setVisible(false);
        this.vistaAgregarVehiculo.setVisible(false);
        this.vistaIngresoParqueadero.setVisible(false);
        this.vistaSalidaParqueadero.setVisible(false);
        this.vistaListarTickets.setVisible(false);
        this.vistaEditarDatosVehiculo.setVisible(false);
    }
public void setCambiarIdioma(){
        mnInicio.setText(mensajes.getString("menuPrincipal"));
        mnIngresarVehiculo.setText(mensajes.getString("menuIngresarVehiculo"));
        mnSalirVehiculo.setText(mensajes.getString("menuSalirVehiculo"));
        mnListarTickets.setText(mensajes.getString("menuListarTickets"));
        mnSalir.setText(mensajes.getString("menuSalir"));
        menuIdioma.setText(mensajes.getString("menuIdioma"));
        menuItemEspañol.setText(mensajes.getString("menuItemEspañol"));
        menuItemIngles.setText(mensajes.getString("menuItemIngles"));  
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        lblFondo = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        mnInicio = new javax.swing.JMenu();
        mnIngresarVehiculo = new javax.swing.JMenuItem();
        mnSalirVehiculo = new javax.swing.JMenuItem();
        mnListarTickets = new javax.swing.JMenuItem();
        mnSalir = new javax.swing.JMenuItem();
        menuIdioma = new javax.swing.JMenu();
        menuItemEspañol = new javax.swing.JMenuItem();
        menuItemIngles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setLayout(null);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/hora.png"))); // NOI18N
        desktopPane.add(lblFondo);
        lblFondo.setBounds(630, 10, 30, 30);

        mnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/parque.png"))); // NOI18N
        mnInicio.setMnemonic('f');
        mnInicio.setText("INICIO");
        mnInicio.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        mnIngresarVehiculo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnIngresarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/moving-truck.png"))); // NOI18N
        mnIngresarVehiculo.setMnemonic('o');
        mnIngresarVehiculo.setText("Ingresar vehiculo");
        mnIngresarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarVehiculoActionPerformed(evt);
            }
        });
        mnInicio.add(mnIngresarVehiculo);

        mnSalirVehiculo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnSalirVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/enviado.png"))); // NOI18N
        mnSalirVehiculo.setMnemonic('s');
        mnSalirVehiculo.setText("Salir vehiculo");
        mnSalirVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirVehiculoActionPerformed(evt);
            }
        });
        mnInicio.add(mnSalirVehiculo);

        mnListarTickets.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnListarTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/directorio.png"))); // NOI18N
        mnListarTickets.setText("Listar tickets");
        mnListarTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnListarTicketsActionPerformed(evt);
            }
        });
        mnInicio.add(mnListarTickets);

        mnSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/cerrar.png"))); // NOI18N
        mnSalir.setMnemonic('x');
        mnSalir.setText("Salir");
        mnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirActionPerformed(evt);
            }
        });
        mnInicio.add(mnSalir);

        menuBar.add(mnInicio);

        menuIdioma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/traduccion.png"))); // NOI18N
        menuIdioma.setMnemonic('e');
        menuIdioma.setText("IDIOMA");
        menuIdioma.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        menuItemEspañol.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuItemEspañol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/espana.png"))); // NOI18N
        menuItemEspañol.setMnemonic('t');
        menuItemEspañol.setText("Español");
        menuItemEspañol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEspañolActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemEspañol);

        menuItemIngles.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        menuItemIngles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/bandera.png"))); // NOI18N
        menuItemIngles.setMnemonic('y');
        menuItemIngles.setText("Ingles");
        menuItemIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemInglesActionPerformed(evt);
            }
        });
        menuIdioma.add(menuItemIngles);

        menuBar.add(menuIdioma);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnSalirActionPerformed

    private void mnIngresarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarVehiculoActionPerformed
        Ocultar();
        this.vistaIngresoParqueadero.setVisible(true);
    }//GEN-LAST:event_mnIngresarVehiculoActionPerformed

    private void mnSalirVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirVehiculoActionPerformed
        Ocultar();
        this.vistaSalidaParqueadero.setVisible(true);
    }//GEN-LAST:event_mnSalirVehiculoActionPerformed

    private void mnListarTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnListarTicketsActionPerformed
        Ocultar();
        this.vistaListarTickets.setVisible(true);
    }//GEN-LAST:event_mnListarTicketsActionPerformed

    private void menuItemInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemInglesActionPerformed
        localizacion=new Locale("en", "EU");
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);
        cambiarIdiomaTodasLasVentanas();
    }//GEN-LAST:event_menuItemInglesActionPerformed

    private void menuItemEspañolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEspañolActionPerformed
        localizacion=new Locale("es", "EC");
        mensajes=ResourceBundle.getBundle("ec.edu.ups.idioma.mensajes", localizacion);
        cambiarIdiomaTodasLasVentanas();
    }//GEN-LAST:event_menuItemEspañolActionPerformed

    public void cambiarIdiomaTodasLasVentanas(){
        this.setCambiarIdioma();
        vistaAgregarCliente.setCambiarIdioma(mensajes);
        vistaAgregarVehiculo.setCambiarIdioma(mensajes);
        vistaEditarDatosVehiculo.setCambiarIdioma(mensajes);
        vistaIngresoParqueadero.setCambiarIdioma(mensajes);
        vistaListarTickets.setCambiarIdioma(mensajes);
        vistaSalidaParqueadero.SetCambiarIdioma(mensajes);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
                    System.out.println("Error setting Java LAF: " + e);
                }
                new VistaPrincipal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuIdioma;
    private javax.swing.JMenuItem menuItemEspañol;
    private javax.swing.JMenuItem menuItemIngles;
    private javax.swing.JMenuItem mnIngresarVehiculo;
    private javax.swing.JMenu mnInicio;
    private javax.swing.JMenuItem mnListarTickets;
    private javax.swing.JMenuItem mnSalir;
    private javax.swing.JMenuItem mnSalirVehiculo;
    // End of variables declaration//GEN-END:variables

}
