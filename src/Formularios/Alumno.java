package Formularios;

import Clases.CAlumno;
import Clases.LogicaAlumno;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class Alumno extends javax.swing.JInternalFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        bsc = new javax.swing.JButton();
        bc = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        n5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nameapo = new javax.swing.JTextField();
        lastapo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        dniapo = new javax.swing.JTextField();
        telapo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        fechaapo = new com.toedter.calendar.JDateChooser();
        n6 = new javax.swing.JLabel();
        tur = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        n7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jDateChooser5 = new com.toedter.calendar.JDateChooser();
        n8 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        cancel = new javax.swing.JButton();
        nv = new javax.swing.JButton();
        gr = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        n12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        dni = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        drc = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jTextField4.setText("jTextField4");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("ALumno");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LG.png"))); // NOI18N
        setRequestFocusEnabled(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n1.setText("Buscar:");
        jPanel3.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 840, 470));

        total.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        total.setText("N° de Registros:");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 40));

        bsc.setBackground(new java.awt.Color(73, 216, 255));
        bsc.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bsc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/14.png"))); // NOI18N
        bsc.setText("Buscar");
        bsc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bscMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bscMouseExited(evt);
            }
        });
        bsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bscActionPerformed(evt);
            }
        });
        jPanel3.add(bsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 40));

        bc.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        bc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bc.setText("Ingrese el DNI para buscar");
        bc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                bcFocusLost(evt);
            }
        });
        bc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcActionPerformed(evt);
            }
        });
        bc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bcKeyTyped(evt);
            }
        });
        jPanel3.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 40));

        eliminar.setBackground(new java.awt.Color(225, 26, 11));
        eliminar.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/15.png"))); // NOI18N
        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel3.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 130, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 860, 570));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Apoderado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n5.setText("Nombre:");
        jPanel5.add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel16.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel16.setText("DNI:");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel17.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel17.setText("Apellido:");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        nameapo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel5.add(nameapo, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 69, 270, -1));

        lastapo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel5.add(lastapo, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 108, 270, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setText("Telefono:");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        dniapo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        dniapo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniapoKeyTyped(evt);
            }
        });
        jPanel5.add(dniapo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 153, 112, -1));

        telapo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        telapo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telapoKeyTyped(evt);
            }
        });
        jPanel5.add(telapo, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 153, 130, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setText("F. Nacimiento:");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));
        jPanel5.add(fechaapo, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 192, 230, -1));

        n6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n6.setText("Tutor:");
        jPanel5.add(n6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        tur.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tur.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Madre", "Padre", "Apoderado" }));
        jPanel5.add(tur, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 30, 270, -1));

        jPanel6.setBackground(new java.awt.Color(153, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Datos del Apoderado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed Black", 0, 18))); // NOI18N
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n7.setText("Nombre:");
        jPanel6.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("DNI:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setText("Apellido:");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, 30));

        jTextField18.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel6.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 69, 252, -1));

        jTextField19.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel6.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 108, 252, -1));

        jLabel22.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel22.setText("Telefono:");
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jTextField20.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel6.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 153, 112, -1));

        jTextField21.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel6.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 153, 112, -1));

        jLabel23.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel23.setText("F. Nacimiento:");
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 30));
        jPanel6.add(jDateChooser5, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 192, 217, -1));

        n8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n8.setText("Tutor:");
        jPanel6.add(n8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        jComboBox6.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel6.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 30, 252, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 380, 260));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 380, 240));

        cancel.setBackground(new java.awt.Color(153, 0, 0));
        cancel.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/13.png"))); // NOI18N
        cancel.setText("Cancelar");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 530, 130, 50));

        nv.setBackground(new java.awt.Color(0, 0, 204));
        nv.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        nv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/11.png"))); // NOI18N
        nv.setText("Nuevo");
        nv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nvMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nvMouseExited(evt);
            }
        });
        nv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nvActionPerformed(evt);
            }
        });
        jPanel1.add(nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, -1, 50));

        gr.setBackground(new java.awt.Color(0, 102, 51));
        gr.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        gr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/12.png"))); // NOI18N
        gr.setText("Guardar");
        gr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                grMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                grMouseExited(evt);
            }
        });
        gr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grActionPerformed(evt);
            }
        });
        jPanel1.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 530, -1, 50));

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Alumno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n12.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n12.setText("Nombre:");
        jPanel9.add(n12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 30));

        jLabel27.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel27.setText("DNI:");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 127, 30, 20));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel28.setText("Apellido:");
        jPanel9.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        name.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel9.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 279, -1));

        last.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel9.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 79, 280, -1));

        jLabel29.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel29.setText("Sexo:");
        jPanel9.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        gen.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Masculino", "Femenino" }));
        jPanel9.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 123, 125, -1));

        dni.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });
        jPanel9.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 123, 118, -1));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel30.setText("Direccion:");
        jPanel9.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, 30));

        drc.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel9.add(drc, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 167, 282, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel31.setText("F. Nacimiento:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, 30));

        fecha.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel9.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 211, 247, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1271, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grActionPerformed
        if(Validacion()==false){
            LocalDate FechaN;
            LocalDate Fecha;

            FechaN = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Fecha = fechaapo.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            CAlumno al = new CAlumno();
            LogicaAlumno funcion = new LogicaAlumno();
            al.setFecha(FechaN);
            al.setFechaApoderado(Fecha);
            al.setNombre(name.getText());
            al.setApellido(last.getText());
            al.setDNI(dni.getText());
            al.setSexo(gen.getSelectedItem().toString());
            al.setDirección(drc.getText());
            al.setTutor(tur.getSelectedItem().toString());
            al.setNombreApoderado(nameapo.getText());
            al.setApellidoApoderado(lastapo.getText());
            al.setDNIApoderado(dniapo.getText());
            al.setTelefono(telapo.getText());

            if(accion.equals("guardar")){
                if(funcion.Guardar(al)){
                    JOptionPane.showInternalMessageDialog(rootPane, "El alumno fue registrado satisfactoriamente");
                    Mostrar();
                    Inhabilitar();
                }
            }else if(accion.equals("editar")){
                al.setDNI(dni.getText());

                if(funcion.Editar(al)){
                    JOptionPane.showConfirmDialog(rootPane, "El alumno fue editada satisfactoriamente");
                    Mostrar();
                    Inhabilitar();
                } else {
                }
            }
        }
    }//GEN-LAST:event_grActionPerformed

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();

        int numerocaracteres=8;
        if(dni.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_dniKeyTyped

    private void dniapoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniapoKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();

        int numerocaracteres=8;
        if(dniapo.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_dniapoKeyTyped

    private void telapoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telapoKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();
        int numerocaracteres=8;
        if(telapo.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_telapoKeyTyped

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Inhabilitar();
    }//GEN-LAST:event_cancelActionPerformed

    private void grMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseEntered
        gr.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_grMouseEntered

    private void grMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseExited
        gr.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_grMouseExited

    private void nvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvActionPerformed
        Habilitar();
        gr.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_nvActionPerformed

    private void nvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvMouseExited
        nv.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_nvMouseExited

    private void nvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvMouseEntered
       nv.setBackground(new Color(74, 187, 255));
    }//GEN-LAST:event_nvMouseEntered

    private void bscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseEntered
        bsc.setBackground(new Color(128, 185, 238));
    }//GEN-LAST:event_bscMouseEntered

    private void bscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseExited
        bsc.setBackground(new Color(73,216,255));
    }//GEN-LAST:event_bscMouseExited

    private void bscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bscActionPerformed
        Buscar(bc.getText());
    }//GEN-LAST:event_bscActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        gr.setText("Editar");
        Habilitar();
        eliminar.setEnabled(true);
        accion="editar";
        int fila =tabla.rowAtPoint(evt.getPoint());
        name.setText(tabla.getValueAt(fila, 1).toString());
        last.setText(tabla.getValueAt(fila, 2).toString());
        dni.setText(tabla.getValueAt(fila, 3).toString());
        gen.setSelectedItem(tabla.getValueAt(fila,4).toString());
        drc.setText(tabla.getValueAt(fila, 5).toString());
        fecha.setDate(java.sql.Date.valueOf(tabla.getValueAt(fila, 6).toString()));
        tur.setSelectedItem(tabla.getValueAt(fila,7).toString());
        nameapo.setText(tabla.getValueAt(fila, 8).toString());
        lastapo.setText(tabla.getValueAt(fila, 9).toString());
        dniapo.setText(tabla.getValueAt(fila, 10).toString());
        telapo.setText(tabla.getValueAt(fila, 11).toString());
        fechaapo.setDate(java.sql.Date.valueOf(tabla.getValueAt(fila, 12).toString()));
    }//GEN-LAST:event_tablaMouseClicked

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        eliminar.setBackground(new Color(148, 17, 7));
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        eliminar.setBackground(new Color(225,26,11));
    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(!bc.getText().equals("")){
            int confirmacion=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de Eliminar el alumno","Confirmar",2);

            if(confirmacion==0){
                CAlumno dts = new CAlumno();
                LogicaAlumno func = new LogicaAlumno();

                dts.setDNI(bc.getText());
                func.Eliminar(dts);
                Mostrar();
                Inhabilitar();
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void bcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bcFocusGained
        if(bc.getText().equals("Ingrese el DNI para buscar")){
            bc.setText("");
        }
    }//GEN-LAST:event_bcFocusGained

    private void bcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bcFocusLost
        if(bc.getText().equals("")){
            bc.setText("Ingrese el DNI para buscar");
        }
    }//GEN-LAST:event_bcFocusLost

    private void bcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcActionPerformed
        bc.transferFocus();
        Buscar(bc.getText());
    }//GEN-LAST:event_bcActionPerformed

    private void bcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bcKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();

        int numerocaracteres=8;
        if(bc.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_bcKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bc;
    private javax.swing.JButton bsc;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField dniapo;
    private javax.swing.JTextField drc;
    private javax.swing.JButton eliminar;
    private com.toedter.calendar.JDateChooser fecha;
    private com.toedter.calendar.JDateChooser fechaapo;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton gr;
    private javax.swing.JComboBox<String> jComboBox6;
    private com.toedter.calendar.JDateChooser jDateChooser5;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField last;
    private javax.swing.JTextField lastapo;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n12;
    private javax.swing.JLabel n5;
    private javax.swing.JLabel n6;
    private javax.swing.JLabel n7;
    private javax.swing.JLabel n8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameapo;
    private javax.swing.JButton nv;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField telapo;
    private javax.swing.JLabel total;
    private javax.swing.JComboBox<String> tur;
    // End of variables declaration//GEN-END:variables
    
    private String accion="Guardar";
    
    public void ocultar_columnas(){
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void Mostrar() {
        try {
            DefaultTableModel modelo;
            LogicaAlumno fun = new LogicaAlumno();
            modelo = fun.Mostrar();
            tabla.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(fun.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void Buscar(String dni) {
        try {
            DefaultTableModel modelo;
            LogicaAlumno fun = new LogicaAlumno();
            modelo = fun.Buscar(dni);
            tabla.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(fun.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }

    private void Habilitar(){
        name.setEnabled(true);
        last.setEnabled(true);
        dni.setEnabled(true);
        gen.setEnabled(true);
        drc.setEnabled(true);
        fecha.setEnabled(true);
        tur.setEnabled(true);
        nameapo.setEnabled(true);
        lastapo.setEnabled(true);
        dniapo.setEnabled(true);
        telapo.setEnabled(true);
        fechaapo.setEnabled(true);

        
        name.setText("");
        last.setText("");
        dni.setText("");
        drc.setText("");
        nameapo.setText("");
        lastapo.setText("");
        dniapo.setText("");
        telapo.setText(""); 

        gen.setSelectedItem("<Seleccionar>");
        tur.setSelectedItem("<Seleccionar>");
 
    }
    
    private void Inhabilitar(){
        
        name.setEnabled(false);
        last.setEnabled(false);
        dni.setEnabled(false);
        gen.setEnabled(false);
        drc.setEnabled(false);
        fecha.setEnabled(false);
        tur.setEnabled(false);
        nameapo.setEnabled(false);
        lastapo.setEnabled(false);
        dniapo.setEnabled(false);
        telapo.setEnabled(false);
        fechaapo.setEnabled(false);
        
        name.setText("");
        last.setText("");
        dni.setText("");
        drc.setText("");
        nameapo.setText("");
        lastapo.setText("");
        dniapo.setText("");
        telapo.setText("");

    }
    
    public boolean Validacion(){
        if(name.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del alumno");
            name.requestFocus();
            return true;
        }
        if(last.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apelliudo del alumno");
            last.requestFocus();
            return true;
        }
        if(dni.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el dni del alumno");
            dni.requestFocus();
            return true;
        }
        if(gen.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar el género del alumno");
            return true;
        }
        if(drc.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar la dirección del alumno");
            drc.requestFocus();
            return true;
        }
        if (fecha.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar la fecha del menor");
            return true;
        }
        if(tur.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar el parentesco del tutor del alumno");
            return true;
        }
        if(nameapo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del tutor del alumno");
            nameapo.requestFocus();
            return true;
        }
        if(lastapo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apellido del tutor del alumno");
            lastapo.requestFocus();
            return true;
        }
        if(dniapo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el dni del tutor del alumno");
            dniapo.requestFocus();
            return true;
        }
        if(telapo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el telefono del tutor del alumno");
            telapo.requestFocus();
            return true;
        }
        if (fechaapo.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar fecha del apoderado");
            return true;
        }
        return false;
    }
    
    public Alumno() {
        initComponents();
        Inhabilitar();
        Mostrar();
    }
}
