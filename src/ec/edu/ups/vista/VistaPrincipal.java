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
    //Dao
    private IClienteDAO clienteDao;
    private ITicketDAO ticketDao;
    private IVehiculoDAO vehiculoDao;
    //Controladores
    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    public VistaPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);

        //Inicializar Dao
        this.clienteDao = new ClienteDAO();
        this.ticketDao = new TicketDAO();
        this.vehiculoDao = new VehiculoDAO();
        
        //Inicializar controladores
        this.controladorCliente = new ControladorCliente(clienteDao, ticketDao, vehiculoDao);
        this.controladorTicket = new ControladorTicket(clienteDao, ticketDao, vehiculoDao);
        this.controladorVehiculo = new ControladorVehiculo(clienteDao, ticketDao, vehiculoDao);

        //Vistas
        this.vistaAgregarCliente = new VistaAgregarCliente(controladorCliente, controladorTicket, controladorVehiculo,vistaAgregarVehiculo);
        this.vistaAgregarVehiculo = new VistaAgregarVehiculo(controladorCliente, controladorTicket, controladorVehiculo,vistaAgregarCliente,vistaIngresoParqueadero);
        this.vistaAgregarCliente.setVistaAgregarVehiculo(vistaAgregarVehiculo);
        this.vistaIngresoParqueadero = new VistaIngresoParqueadero(controladorCliente, controladorTicket, controladorVehiculo,vistaAgregarVehiculo);
        this.vistaAgregarVehiculo.setVistaIngresoParqueadero(vistaIngresoParqueadero);
        this.vistaSalidaParqueadero = new VistaSalidaParqueadero(controladorCliente, controladorTicket, controladorVehiculo);
        
        //Agregar desktopPane
        this.desktopPane.add(vistaAgregarCliente);
        this.desktopPane.add(vistaAgregarVehiculo);
        this.desktopPane.add(vistaIngresoParqueadero);
        this.desktopPane.add(vistaSalidaParqueadero);
    }

    private void Ocultar() {
        this.vistaAgregarCliente.setVisible(false);
        this.vistaAgregarVehiculo.setVisible(false);
        this.vistaIngresoParqueadero.setVisible(false);
        this.vistaSalidaParqueadero.setVisible(false);
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
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mnIngresar = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/parque.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("INICIO");
        fileMenu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        mnIngresar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        mnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/moving-truck.png"))); // NOI18N
        mnIngresar.setMnemonic('o');
        mnIngresar.setText("Ingresar vehiculo");
        mnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIngresarActionPerformed(evt);
            }
        });
        fileMenu.add(mnIngresar);

        saveMenuItem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        saveMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/enviado.png"))); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Salir vehiculo");
        fileMenu.add(saveMenuItem);

        exitMenuItem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        exitMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/cerrar.png"))); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Salir");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("EDITAR");
        editMenu.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N

        cutMenuItem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        menuBar.add(editMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 695, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void mnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIngresarActionPerformed
        this.vistaIngresoParqueadero.setVisible(true);
    }//GEN-LAST:event_mnIngresarActionPerformed

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
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mnIngresar;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
