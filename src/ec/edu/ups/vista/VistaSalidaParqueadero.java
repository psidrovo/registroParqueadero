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
import java.util.ResourceBundle;
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

    private String tituloErrorDatos;
    private String mensajeErrorTicket;
    private String mensajeErrorCodigo;
    private String mensajeSalida1;
    private String mensajeSalida2;
    private String mensajeSalida3;
    private String mensajeSalida4;
    private String mensajeSalida5;

    //Tabla
    private String codigo;
    private String fechaIngreso;
    private String fechaSalida;
    private String total;
    private String minutos;
    private String fracciones;
    private String placa;
    private String marca;
    private String modelo;
    private String cedula;
    private String nombre;
    private String direccion;
    private String telefono;

    public VistaSalidaParqueadero(ControladorCliente controladorCliente, ControladorTicket controladorTicket, ControladorVehiculo controladorVehiculo) {
        initComponents();

        this.controladorCliente = controladorCliente;
        this.controladorTicket = controladorTicket;
        this.controladorVehiculo = controladorVehiculo;
    }

    public void SetCambiarIdioma(ResourceBundle mensajes) {
        this.pnSalidaTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(null, mensajes.getString("panelSalidaTicket"), javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); 
        this.lblCodigo.setText(mensajes.getString("codigo"));

        this.tituloErrorDatos = mensajes.getString("tituloErrorDatos");
        this.mensajeErrorTicket = mensajes.getString("mensajeErrorTicket");
        this.mensajeErrorCodigo = mensajes.getString("mensajeErrorCodigo");

        this.mensajeSalida1 = mensajes.getString("mensajeSalida1");
        this.mensajeSalida2 = mensajes.getString("mensajeSalida2");
        this.mensajeSalida3 = mensajes.getString("mensajeSalida3");
        this.mensajeSalida4 = mensajes.getString("mensajeSalida4");
        this.mensajeSalida5 = mensajes.getString("mensajeSalida5");

        this.codigo = mensajes.getString("codigo");
        this.fechaIngreso = mensajes.getString("fechaIngreso");
        this.fechaSalida = mensajes.getString("fechaSalida");
        this.total = mensajes.getString("total");
        this.minutos = mensajes.getString("minutos");
        this.fracciones = mensajes.getString("fracciones");
        this.placa = mensajes.getString("placa");
        this.marca = mensajes.getString("marca");
        this.modelo = mensajes.getString("modelo");
        this.cedula = mensajes.getString("cedula");
        this.nombre = mensajes.getString("nombre");
        this.direccion = mensajes.getString("direccion");
        this.telefono = mensajes.getString("telefono");
        
        listarTickets();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnSalidaTicket = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTickets = new javax.swing.JTable();
        ftxCodigo = new javax.swing.JFormattedTextField();
        lblCodigo = new javax.swing.JLabel();

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

        pnSalidaTicket.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SALIDA TICKET", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 18))); // NOI18N

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

        lblCodigo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblCodigo.setText("CODIGO:");

        javax.swing.GroupLayout pnSalidaTicketLayout = new javax.swing.GroupLayout(pnSalidaTicket);
        pnSalidaTicket.setLayout(pnSalidaTicketLayout);
        pnSalidaTicketLayout.setHorizontalGroup(
            pnSalidaTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSalidaTicketLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lblCodigo)
                .addGap(18, 18, 18)
                .addComponent(ftxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1636, 1636, 1636))
            .addGroup(pnSalidaTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSalidaTicketLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1812, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnSalidaTicketLayout.setVerticalGroup(
            pnSalidaTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSalidaTicketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnSalidaTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftxCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigo))
                .addGap(622, 622, 622))
            .addGroup(pnSalidaTicketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnSalidaTicketLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnSalidaTicket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(pnSalidaTicket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        listarTickets();
        ftxCodigo.setValue(0);
    }//GEN-LAST:event_formInternalFrameActivated

    private void ftxCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxCodigoKeyTyped
        char validar = evt.getKeyChar();
        //VALIDA ENTER
        if (validar == '\n') {
            //VALIDA EL FORMATO DEL CODIGO
            if (ftxCodigo.getValue() != null) {
                int codigo = Integer.valueOf(ftxCodigo.getValue().toString());
                //VALIDA SI CODIGO EXISTE
                if (controladorTicket.verTicketPorCodigo(codigo) != null) {
                    Calendar c = Calendar.getInstance();
                    Ticket mensaje = controladorTicket.calcularPago(codigo, c.getTime());
                    int confirmar = JOptionPane.showConfirmDialog(null,
                            "<html>" + mensajeSalida1 + " <strong>" + mensaje.getTotal() + "</strong> " + mensajeSalida2 + " <strong>" + mensaje.getMinutos() + "</strong> " + mensajeSalida3 + " <strong> " + mensaje.getFracciones() + "</strong> " + mensajeSalida4 + "</html> \n" + mensajeSalida5);
                    //SI ES SE ELIJE "SI" SE PROCESA SALIR EL TICKET 
                    if (JOptionPane.OK_OPTION == confirmar) {
                        controladorTicket.salidaVehiculoTicket(codigo, c.getTime());
                        listarTickets();
                        ftxCodigo.setValue(0);
                    //SI NO SETEA LOS VALORES DEL CALCULO DE TIEMPO 
                    } else {
                        mensaje.setFechaHoraSalida(null);
                        mensaje.setMinutos(0);
                        mensaje.setTotal(0);
                        mensaje.setFracciones(0);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "TICKET " + mensajeErrorTicket, tituloErrorDatos, JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, mensajeErrorCodigo, tituloErrorDatos, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ftxCodigoKeyTyped
    private void listarTickets() {
        DefaultTableModel modeloTabla = (DefaultTableModel) tblTickets.getModel();
        modeloTabla.setColumnCount(0);
        modeloTabla.setRowCount(0);
        modeloTabla.addColumn(codigo);
        modeloTabla.addColumn(fechaIngreso);
        modeloTabla.addColumn(fechaSalida);
        modeloTabla.addColumn(total);
        modeloTabla.addColumn(minutos);
        modeloTabla.addColumn(fracciones);
        modeloTabla.addColumn(placa);
        modeloTabla.addColumn(marca);
        modeloTabla.addColumn(modelo);
        modeloTabla.addColumn(cedula);
        modeloTabla.addColumn(nombre);
        modeloTabla.addColumn(direccion);
        modeloTabla.addColumn(telefono);

        this.tblTickets.setModel(modeloTabla);
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
            modeloTabla.addRow(fila);
        }
        this.tblTickets.setModel(modeloTabla);
    }

    private String fechaActual(Date fecha) {
        String strDateFormat = "dd-MM-yyyy HH: mm: ss";
        SimpleDateFormat objSDF = new SimpleDateFormat(strDateFormat);
        return objSDF.format(fecha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField ftxCodigo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JPanel pnSalidaTicket;
    private javax.swing.JTable tblTickets;
    // End of variables declaration//GEN-END:variables
}
