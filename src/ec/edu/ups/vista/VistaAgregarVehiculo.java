/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import java.util.Calendar;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;

/**
 *
 * @author Paul Idrovo
 */
public class VistaAgregarVehiculo extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    private VistaAgregarCliente vistaAgregarCliente;
    private VistaIngresoParqueadero vistaIngresoParqueadero;
    
    private String tituloErrorDatos;
    private String mensajeErrorPlaca;
    private String mensajeErrorDatos;
    private String mensajeExistePlaca1;
    private String mensajeExistePlaca2;
    private String mensajeTicket;
    private String mensajeNoExisteCedula;
    private String mensajeResgistrarCliente;

    public VistaAgregarVehiculo(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo, VistaAgregarCliente vistaAgregarCliente, VistaIngresoParqueadero vistaIngresoParqueadero) {
        initComponents();
        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
        this.vistaAgregarCliente = vistaAgregarCliente;
        this.vistaIngresoParqueadero = vistaIngresoParqueadero;
    }

    public void setCambiarIdioma(ResourceBundle mensajes) {
        this.pnVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("panelVehiculo"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); 
        this.lblCedula.setText(mensajes.getString("cedula"));
        this.lblPlaca.setText(mensajes.getString("placa"));
        this.lblMarca.setText(mensajes.getString("marca"));
        this.lblModelo.setText(mensajes.getString("modelo"));
        this.btRegistrar.setText(mensajes.getString("resgistrar"));
        this.mensajeErrorPlaca = mensajes.getString("mensajeErrorPlaca");
        this.mensajeErrorDatos = mensajes.getString("mensajeErrorDatos");
        this.tituloErrorDatos = mensajes.getString("tituloErrorDatos");
        this.mensajeExistePlaca1= mensajes.getString("mensajeExistePlaca1");
        this.mensajeExistePlaca2= mensajes.getString("mensajeExistePlaca2");
        this.mensajeTicket = mensajes.getString("creado");
        this.mensajeNoExisteCedula = mensajes.getString("mensajeNoExisteCedula");
        this.mensajeResgistrarCliente = mensajes.getString("mensajeResgistrarCliente");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnVehiculo = new javax.swing.JPanel();
        btRegistrar = new javax.swing.JButton();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        lblPlaca = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        ftxPlaca = new javax.swing.JFormattedTextField();

        pnVehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "VEHICULO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

        btRegistrar.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/ups/multimedia/salvar.png"))); // NOI18N
        btRegistrar.setText("REGISTRAR");
        btRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegistrarActionPerformed(evt);
            }
        });

        lblMarca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMarca.setText("MARCA");

        lblModelo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblModelo.setText("MODELO");

        txtCedula.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtMarca.setEnabled(false);

        txtModelo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtModelo.setEnabled(false);

        lblPlaca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPlaca.setText("PLACA");

        lblCedula.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCedula.setText("CEDULA");

        try {
            ftxPlaca.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("UUU-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftxPlaca.setEnabled(false);
        ftxPlaca.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnVehiculoLayout = new javax.swing.GroupLayout(pnVehiculo);
        pnVehiculo.setLayout(pnVehiculoLayout);
        pnVehiculoLayout.setHorizontalGroup(
            pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVehiculoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPlaca)
                    .addComponent(lblCedula)
                    .addComponent(lblMarca)
                    .addComponent(lblModelo))
                .addGap(65, 65, 65)
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btRegistrar)
                    .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMarca)
                        .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ftxPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)
                        .addComponent(txtModelo)))
                .addGap(20, 20, 20))
        );
        pnVehiculoLayout.setVerticalGroup(
            pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCedula))
                .addGap(8, 8, 8)
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ftxPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMarca))
                .addGap(10, 10, 10)
                .addGroup(pnVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(pnVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegistrarActionPerformed
        if (ftxPlaca.getValue() == null) {
            //SI ES NULL ESTA MAL FORMTIADO LA PLACA
            JOptionPane.showMessageDialog(null, mensajeErrorPlaca, tituloErrorDatos, JOptionPane.ERROR_MESSAGE);
        } else {
            //VALIDACION DE CAMPOS
            if (txtCedula.getText().equals("") || txtMarca.getText().equals("") || txtModelo.getText().equals("") || ftxPlaca.getValue().toString().equals("")) {
                JOptionPane.showMessageDialog(null, mensajeErrorDatos, tituloErrorDatos, JOptionPane.ERROR_MESSAGE);
            } else {
                //PLACA YA EXISTE 
                if (controladorVehiculo.buscarVehiculo(ftxPlaca.getValue().toString()) != null) {
                    JOptionPane.showMessageDialog(null, "<html>"+mensajeExistePlaca1+" <strong>" + ftxPlaca.getValue() + "</strong> "+mensajeExistePlaca2+"</html>", "ERROR DATOS", JOptionPane.ERROR_MESSAGE);

                } else {
                    //CREA UN NUEVO VEHICULO Y UN NUEVO TICKET
                    controladorCliente.crearVehiculo(ftxPlaca.getValue().toString(), txtMarca.getText(), txtModelo.getText(), txtCedula.getText());
                    this.setVisible(false);
                    Calendar c = Calendar.getInstance();
                    controladorTicket.ingresoVehiculoTicket(c.getTime(), ftxPlaca.getValue().toString());
                    JOptionPane.showMessageDialog(null, "TICKET "+mensajeTicket, "TICKET", JOptionPane.INFORMATION_MESSAGE);
                    vistaIngresoParqueadero.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_btRegistrarActionPerformed

    public void setEditarCamposRegresarCliente(String cedula) {
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        ftxPlaca.setEnabled(true);
        txtCedula.setEnabled(false);
        txtCedula.setText(cedula);
    }

    public void setVistaIngresoParqueadero(VistaIngresoParqueadero vistaIngresoParqueadero) {
        this.vistaIngresoParqueadero = vistaIngresoParqueadero;
    }
    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        char validar = evt.getKeyChar();
        //RECONOCE SI ES QUE EL USUARIO A USADO EL ENTER
        if (validar == '\n') {
            //SI LA CEDULA EXISTE SE HABLITA LOS CAMPOS DEL VEHICULO
            if (controladorCliente.verCliente(txtCedula.getText()) != null) {
                ftxPlaca.setEnabled(true);
                txtMarca.setEnabled(true);
                txtModelo.setEnabled(true);
            } else {
                //PREGUNTA SI SE DESEA CREAR UN NUVEO CLIENTE
                int confirmar = JOptionPane.showConfirmDialog(null,
                        "<html>"+mensajeNoExisteCedula+" <strong>" + txtCedula.getText() + "</strong> "+mensajeResgistrarCliente+"</html>");

                if (JOptionPane.OK_OPTION == confirmar) {
                    this.setVisible(false);
                    vistaAgregarCliente.setCedulaVista(txtCedula.getText());
                    vistaAgregarCliente.setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_txtCedulaKeyTyped

    public void setPlaca(Object placa) {
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        ftxPlaca.setEnabled(false);
        txtCedula.setEnabled(true);
        txtCedula.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        ftxPlaca.setValue(placa);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegistrar;
    private javax.swing.JFormattedTextField ftxPlaca;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnVehiculo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
