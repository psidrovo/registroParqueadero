/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;

/**
 *
 * @author Paul Idrovo
 */
public class VistaAgregarCliente extends javax.swing.JInternalFrame {
    
    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;
    
    private VistaAgregarVehiculo vistaAgregarVehiculo;
    
    public VistaAgregarCliente(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo, VistaAgregarVehiculo vistaAgregarVehiculo) {
        initComponents();
        
        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.vistaAgregarVehiculo = vistaAgregarVehiculo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAgregarCliente = new javax.swing.JPanel();
        lblApellido = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        btRegistrar = new javax.swing.JButton();

        pnAgregarCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

        lblApellido.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblApellido.setText("DIRECCION");

        lblCorreo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCorreo.setText("TELEFONO");

        txtCedula.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        txtTelefono.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        lblNombre.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblNombre.setText("NOMBRE");

        lblCedula.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCedula.setText("CEDULA");

        btRegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/salvar.png"))); // NOI18N
        btRegistrar.setText("REGISTRAR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAgregarClienteLayout = new javax.swing.GroupLayout(pnAgregarCliente);
        pnAgregarCliente.setLayout(pnAgregarClienteLayout);
        pnAgregarClienteLayout.setHorizontalGroup(
            pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAgregarClienteLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre)
                    .addComponent(lblCedula)
                    .addComponent(lblApellido)
                    .addComponent(lblCorreo))
                .addGap(45, 45, 45)
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtDireccion)
                    .addComponent(txtTelefono)
                    .addComponent(txtCedula)
                    .addComponent(txtNombre))
                .addGap(15, 15, 15))
            .addGroup(pnAgregarClienteLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(btRegistrar)
                .addGap(110, 110, 110))
        );
        pnAgregarClienteLayout.setVerticalGroup(
            pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAgregarClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCedula))
                .addGap(10, 10, 10)
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre))
                .addGap(10, 10, 10)
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDireccion))
                .addGap(10, 10, 10)
                .addGroup(pnAgregarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtTelefono))
                .addGap(18, 18, 18)
                .addComponent(btRegistrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnAgregarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped

    }//GEN-LAST:event_txtCedulaKeyTyped

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        controladorCliente.crearCliente(txtCedula.getText(), txtNombre.getText(), txtDireccion.getText(), txtTelefono.getText());
        this.setVisible(false);
        vistaAgregarVehiculo.setVisible(true);
    }//GEN-LAST:event_btRegistrarActionPerformed
    public void setCedulaVista(String cedula) {
        txtCedula.setText(cedula);
    }
    
    public void setVistaAgregarVehiculo(VistaAgregarVehiculo vistaAgregarVehiculo){
        this.vistaAgregarVehiculo=vistaAgregarVehiculo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnAgregarCliente;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
