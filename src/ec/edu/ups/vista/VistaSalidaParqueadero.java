/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorCliente;
import ec.edu.ups.controlador.ControladorTicket;
import ec.edu.ups.controlador.ControladorVehiculo;
import ec.edu.ups.modelo.Cliente;
import ec.edu.ups.modelo.Ticket;
import ec.edu.ups.modelo.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paul Idrovo
 */
public class VistaSalidaParqueadero extends javax.swing.JInternalFrame {

    private ControladorCliente controladorCliente;
    private ControladorTicket controladorTicket;
    private ControladorVehiculo controladorVehiculo;

    public VistaSalidaParqueadero(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo) {
        initComponents();

        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnIngresarTicket = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        ftxCodigo = new javax.swing.JFormattedTextField();
        lblPlaca = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        pnIngresarTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALIDA TICKET", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

        tblTickets.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tblTickets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTickets.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(tblTickets);

        ftxCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftxCodigo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        ftxCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftxCodigoKeyTyped(evt);
            }
        });

        lblPlaca.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblPlaca.setText("CODIGO:");

        javax.swing.GroupLayout pnIngresarTicketLayout = new javax.swing.GroupLayout(pnIngresarTicket);
        pnIngresarTicket.setLayout(pnIngresarTicketLayout);
        pnIngresarTicketLayout.setHorizontalGroup(
            pnIngresarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIngresarTicketLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(ftxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1636, 1636, 1636))
            .addGroup(pnIngresarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnIngresarTicketLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnIngresarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1812, Short.MAX_VALUE)
                        .addGroup(pnIngresarTicketLayout.createSequentialGroup()
                            .addComponent(lblPlaca)
                            .addGap(0, 1736, Short.MAX_VALUE)))
                    .addContainerGap()))
        );
        pnIngresarTicketLayout.setVerticalGroup(
            pnIngresarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnIngresarTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ftxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(622, 622, 622))
            .addGroup(pnIngresarTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnIngresarTicketLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblPlaca)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnIngresarTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnIngresarTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        listarTickets();
    }//GEN-LAST:event_formInternalFrameActivated

    private void ftxCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxCodigoKeyTyped
        char validar = evt.getKeyChar();
        if (validar == '\n') {
            if (ftxCodigo.getValue() != null) {
                int codigo = Integer.valueOf(ftxCodigo.getValue().toString());
                if (controladorTicket.verTicketPorCodigo(codigo) != null) {
                    Calendar c = Calendar.getInstance();
                    Ticket mensaje = controladorTicket.calcularPago(codigo, c.getTime());
                    int confirmar = JOptionPane.showConfirmDialog(null,
                            "<html>EL VALOR A PAGAR ES <strong>" + mensaje.getTotal() + "</strong> DE <strong>" + mensaje.getMinutos()+ "</strong> MINUTOS TOTAL <strong> "+ mensaje.getFracciones()+ "</strong> FRACCIONES</html> \n DESEA CONTINUAR?");

                    if (JOptionPane.OK_OPTION == confirmar) {
                        controladorTicket.salidaVehiculoTicket(codigo, c.getTime());
                        listarTickets();
                        ftxCodigo.setValue(0);
                    }else{
                        mensaje.setFechaHoraSalida(null);
                        mensaje.setMinutos(0);
                        mensaje.setTotal(0);
                        mensaje.setFracciones(0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "TICKET NO EXISTENTE", "ERROR DATOS", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "FORMATO DE CODIGO NO VALIDO", "ERROR DATOS", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ftxCodigoKeyTyped
    private void listarTickets() {
        DefaultTableModel modelo = (DefaultTableModel) tblTickets.getModel();
        modelo.setColumnCount(0);
        modelo.setRowCount(0);
        modelo.addColumn("CODIGO");
        modelo.addColumn("FEHCA INGRESO");
        modelo.addColumn("FEHCA SALIDA");
        modelo.addColumn("TOTAL $");
        modelo.addColumn("MINUTOS");
        modelo.addColumn("FRACCIONES");
        modelo.addColumn("PLACA");
        modelo.addColumn("MARCA");
        modelo.addColumn("MODELO");
        modelo.addColumn("CEDULA");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("DIRECCION");
        modelo.addColumn("TELEFONO");

        this.tblTickets.setModel(modelo);
        Object[] fila = new Object[13];

        for (Ticket datosTicket : controladorTicket.listaSalidaDeTickets()) {
            fila[0] = datosTicket.getNumero();
            fila[1] = fechaActual(datosTicket.getFechaHoraIngreso());
            fila[2] = fechaActual(datosTicket.getFechaHoraSalida());
            fila[3] = "$ " + datosTicket.getTotal();
            fila[4] = datosTicket.getMinutos();
            fila[5] = datosTicket.getFracciones();
            Vehiculo datosVehiculo = datosTicket.getVehiculoTicket();
            fila[6] = datosVehiculo.getPlaca();
            fila[7] = datosVehiculo.getModelo();
            fila[8] = datosVehiculo.getPlaca();
            fila[9] = datosVehiculo.getCliente().getCedula();
            fila[10] = datosVehiculo.getCliente().getNombre();
            fila[11] = datosVehiculo.getCliente().getDireccion();
            fila[12] = datosVehiculo.getCliente().getTelefono();
            modelo.addRow(fila);
        }
        this.tblTickets.setModel(modelo);
    }

    private String fechaActual(Date fecha) {
        String strDateFormat = "dd-MM-yyyy HH: mm: ss";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        return objSDF.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JPanel pnIngresarTicket;
    private javax.swing.JTable tblTickets;
    // End of variables declaration//GEN-END:variables
}
