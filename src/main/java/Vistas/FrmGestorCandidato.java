/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Controladores.CtlCandidato;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kaká
 */
public class FrmGestorCandidato extends javax.swing.JFrame {

    JFrame frameMenu;
    //creamos el objeto para comunicarnos con el controlador

    CtlCandidato controlador;
    LinkedList<ClsCandidato> candidatos;

    /**
     * Creates new form FrmGestorCandidato
     */
    //cambio el constructor y recibo un frameMenu
    public FrmGestorCandidato(JFrame frameMenu) {
        initComponents();
        this.frameMenu = frameMenu;
        //al iniciar el constructor ocultar estos dos botones, solo se harán visibles en la edición
        this.botonNuevo.setVisible(false);
        this.botonActualizar.setVisible(false);
        //tambien creamos el objeto desde la vista osea formulario
        this.controlador = new CtlCandidato();
        obtenerCandidatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelErrorCampana1 = new javax.swing.JLabel();
        panelPestanias = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        campoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        comboPartido = new javax.swing.JComboBox<>();
        comboCiudad = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoDescripcion = new javax.swing.JTextArea();
        botonAgregar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        campoMensaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoPropuestas = new javax.swing.JTextArea();
        botonNuevo = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        LabelErrorDocumento = new javax.swing.JLabel();
        LabelErrorNombre = new javax.swing.JLabel();
        LabelErrorTelefono = new javax.swing.JLabel();
        LabelErrorCampana = new javax.swing.JLabel();
        LabelErrorPropuesta = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botonEliminar = new javax.swing.JButton();
        botonEditar = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaCandidatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        LabelErrorCampana1.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorCampana1.setForeground(new java.awt.Color(255, 51, 51));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPestanias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Numero documento(*)");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nombre Completo");

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTelefonoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Teléfono");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Correo electrónico");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Partido Político");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Ciudad Origen");

        comboPartido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Demócrata", "De La U", "Liberal", "Conservador", "Pacto Histórico" }));

        comboCiudad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Medellín", "Cali", "Armenia" }));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Descripción");

        campoDescripcion.setColumns(20);
        campoDescripcion.setRows(5);
        jScrollPane1.setViewportView(campoDescripcion);

        botonAgregar.setBackground(new java.awt.Color(255, 255, 204));
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Mensaje campaña");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Propuestas");

        campoPropuestas.setColumns(20);
        campoPropuestas.setRows(5);
        jScrollPane2.setViewportView(campoPropuestas);

        botonNuevo.setText("Nuevo");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        LabelErrorDocumento.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorDocumento.setForeground(new java.awt.Color(255, 51, 51));

        LabelErrorNombre.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorNombre.setForeground(new java.awt.Color(255, 51, 51));

        LabelErrorTelefono.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorTelefono.setForeground(new java.awt.Color(255, 51, 51));

        LabelErrorCampana.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorCampana.setForeground(new java.awt.Color(255, 51, 51));

        LabelErrorPropuesta.setFont(new java.awt.Font("Segoe UI", 1, 8)); // NOI18N
        LabelErrorPropuesta.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoMensaje, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelErrorCampana, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(LabelErrorPropuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(botonAgregar)
                                .addGap(31, 31, 31)
                                .addComponent(botonNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(botonActualizar)))
                        .addGap(0, 121, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comboPartido, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(campoTelefono)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(campoDocumento, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel4)))
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelErrorDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(LabelErrorTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelErrorDocumento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LabelErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 2, Short.MAX_VALUE))
                    .addComponent(LabelErrorTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel9))
                    .addComponent(LabelErrorCampana, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelErrorPropuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAgregar)
                            .addComponent(botonNuevo)
                            .addComponent(botonActualizar))
                        .addGap(18, 18, 18))))
        );

        panelPestanias.addTab("Formulario", jPanel1);

        botonEliminar.setBackground(new java.awt.Color(255, 204, 204));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonEditar.setText("Editar");
        botonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarActionPerformed(evt);
            }
        });

        tablaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Documento", "Nombre", "Partido"
            }
        ));
        jScrollPane3.setViewportView(tablaCandidatos);

        jScrollPane4.setViewportView(jScrollPane3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(botonEditar)
                .addGap(18, 18, 18)
                .addComponent(botonEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonEditar)
                    .addComponent(botonEliminar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        panelPestanias.addTab("Lista Candidatos", jPanel2);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("GESTOR CANDIDATOS");

        botonRegresar.setBackground(new java.awt.Color(204, 255, 204));
        botonRegresar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel11.setText("ELECCIONES 2022 COLOMBIA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelPestanias)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(82, 82, 82)
                        .addComponent(botonRegresar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRegresar)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(panelPestanias, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.frameMenu.setVisible(true);

    }//GEN-LAST:event_botonRegresarActionPerformed

    private void campoTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTelefonoActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        // TODO add your handling code here:
        String numeroDocumento = campoDocumento.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        String partido = comboPartido.getSelectedItem().toString();
        String ciudad = comboCiudad.getSelectedItem().toString();
        String descripcion = campoDescripcion.getText();
        String mensaje = campoMensaje.getText();
        String propuestas = campoPropuestas.getText();
        
         try{
        
            if (numeroDocumento.equals("")) {
                LabelErrorDocumento.setText("Campo obligatorio");
                return;
            }

            if (nombre.equals("")) {
                LabelErrorNombre.setText("Campo obligatorio");
                return;}
            
            if (mensaje.equals("")) {
                LabelErrorCampana.setText("Campo obligatorio");
                return;}
            
             if (propuestas.equals("")) {
                LabelErrorPropuesta.setText("Campo obligatorio");
                return;}
        

        ClsCandidato candidato = new ClsCandidato(partido, ciudad, descripcion, mensaje, propuestas, numeroDocumento, nombre, telefono, correo);

        //una vez recibida la informacion la enviamos al controlador con la sigueinte linea
        ClsMensaje respuesta = this.controlador.agregarcandidato(candidato);
        // ahora verificamos que si se envia correctamente la info muestra un mensaje ok de lo contrario un error
        //luego se actualiza la tabla con candidadtos
        if (respuesta.getTipo().equals(ClsMensaje.OK)) {
        obtenerCandidatos();
        }
        JOptionPane.showMessageDialog(rootPane, respuesta.getTexto());
        this.Limpiarcampos();
         }catch (NumberFormatException e) {
            LabelErrorTelefono.setText("Debe ser numérico");}
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        // TODO add your handling code here:
        int columna=0;
        int fila = this.tablaCandidatos.getSelectedRow();
        
        String idcandidato = this.tablaCandidatos.getModel().getValueAt(fila, columna).toString();
        
        //una vez recibida la informacion la enviamos al controlador con la sigueinte linea
        ClsMensaje respuesta=this.controlador.eliminarcandidato(idcandidato);
        
        
        // ahora verificamos que si se envia correctamente la info muestra un mensaje ok de lo contrario un error
        //luego se actualiza la tabla con candidadtos
        if (respuesta.getTipo().equals(ClsMensaje.OK)) {
        obtenerCandidatos();
        }
        JOptionPane.showMessageDialog(rootPane, respuesta.getTexto());
        
        
        
        
        
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarActionPerformed
        // TODO add your handling code here:
        
        //aca obtengo en este caso lo que hay almacenado en memoria la primera columna correspondiente al id
        int columna=0;
        int fila = this.tablaCandidatos.getSelectedRow();
        
        String idcandidato = this.tablaCandidatos.getModel().getValueAt(fila, columna).toString();
        
        ClsCandidato candidato=this.BuscarCandidato(idcandidato);
        //ahora lo que retorna en la variable candidato se envia a todos los campos del formulario
        if(candidato!=null){
            //deshabilitar el campo documento toda vez que por recomendacion no se deberia actualizar
            this.campoDocumento.setEnabled(false);
            //mostrar los otros botones ocultos
            this.botonNuevo.setVisible(true);
            this.botonActualizar.setVisible(true);
            
            //ocultar el boton agregar
            this.botonAgregar.setVisible(false);
            
            this.campoDocumento.setText(candidato.getNumeroDocumento());
            this.campoNombre.setText(candidato.getNombre());
            this.campoTelefono.setText(candidato.getTelefono());
            this.campoCorreo.setText(candidato.getCorreo());
            this.comboPartido.setSelectedItem(candidato.getPartidoPolitico());
            this.comboCiudad.setSelectedItem(candidato.getCiudadOrigen());
            this.campoMensaje.setText(candidato.getMensajeCampania());
            this.campoPropuestas.setText(candidato.getPropuestas());
            this.campoDescripcion.setText(candidato.getDescripcion());
        }
        this.panelPestanias.setSelectedIndex(0);
        
    }//GEN-LAST:event_botonEditarActionPerformed

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed
        // TODO add your handling code here:
        this.botonActualizar.setVisible(false);
        this.botonNuevo.setVisible(false);
        this.botonAgregar.setVisible(true);
        
        //reiniciamos los campos o se dejan en vacio
         this.campoDocumento.setText("");
            this.campoNombre.setText("");
            this.campoTelefono.setText("");
            this.campoCorreo.setText("");
            this.campoMensaje.setText("");
            this.campoPropuestas.setText("");
            this.campoDescripcion.setText("");
        this.campoDocumento.setEnabled(true);
    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        // TODO add your handling code here:
        String numeroDocumento = campoDocumento.getText();
        String nombre = campoNombre.getText();
        String telefono = campoTelefono.getText();
        String correo = campoCorreo.getText();
        String partido = comboPartido.getSelectedItem().toString();
        String ciudad = comboCiudad.getSelectedItem().toString();
        String descripcion = campoDescripcion.getText();
        String mensaje = campoMensaje.getText();
        String propuestas = campoPropuestas.getText();

        ClsCandidato candidato = new ClsCandidato(partido, ciudad, descripcion, mensaje, propuestas, numeroDocumento, nombre, telefono, correo);

        //una vez recibida la informacion la enviamos al controlador con la sigueinte linea
        ClsMensaje respuesta = this.controlador.actualizarcandidato(candidato);
        // ahora verificamos que si se envia correctamente la info muestra un mensaje ok de lo contrario un error
        //luego se actualiza la tabla con candidadtos
        if (respuesta.getTipo().equals(ClsMensaje.OK)) {
        obtenerCandidatos();
        }
        JOptionPane.showMessageDialog(rootPane, respuesta.getTexto());
    }//GEN-LAST:event_botonActualizarActionPerformed

    public void obtenerCandidatos() {
        this.candidatos = this.controlador.obtenerCandidatos();
        this.ActualizarTabla(candidatos);
    }

    //creamos un nuevo metodo para buscar un candidato en especifico y poder editar
    public ClsCandidato BuscarCandidato(String idcandidato){
        for(ClsCandidato candidato:this.candidatos){
            if(candidato.getNumeroDocumento().equals(idcandidato)){
            return candidato;
            }
        }
        return null;
    }
    
    private void ActualizarTabla(LinkedList<ClsCandidato> lista) {
        DefaultTableModel modelo = (DefaultTableModel) tablaCandidatos.getModel();
        modelo.setRowCount(0);

        //realiza un recorrrido a los datos a partir del ciclo for 
        for (ClsCandidato c : lista) {
            Object[] fila = {c.getNumeroDocumento(), c.getNombre(), c.getPartidoPolitico()};
            modelo.addRow(fila);

        }
    }
    
    private void Limpiarcampos() {
        campoNombre.setText("");
        campoDocumento.setText("");
        campoTelefono.setText("");
        campoCorreo.setText("");
        campoMensaje.setText("");
        campoPropuestas.setText("");
        campoDescripcion.setText("");
        LabelErrorDocumento.setText("");
        LabelErrorNombre.setText("");
        LabelErrorTelefono.setText("");
        LabelErrorCampana.setText("");

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
            java.util.logging.Logger.getLogger(FrmGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGestorCandidato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGestorCandidato(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelErrorCampana;
    private javax.swing.JLabel LabelErrorCampana1;
    private javax.swing.JLabel LabelErrorDocumento;
    private javax.swing.JLabel LabelErrorNombre;
    private javax.swing.JLabel LabelErrorPropuesta;
    private javax.swing.JLabel LabelErrorTelefono;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEditar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextArea campoDescripcion;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoMensaje;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextArea campoPropuestas;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JComboBox<String> comboCiudad;
    private javax.swing.JComboBox<String> comboPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane panelPestanias;
    private javax.swing.JTable tablaCandidatos;
    // End of variables declaration//GEN-END:variables
}
