package Formularios;

import Clases.CMatricula;
import Clases.LogicaAlumno;
import Clases.LogicaMatricula;
import Clases.LogicaProfesor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Matricula extends javax.swing.JInternalFrame{
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel19 = new javax.swing.JLabel();
        esta = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        monto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        secc = new javax.swing.JComboBox<>();
        grado = new javax.swing.JComboBox<>();
        n10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        idDo = new javax.swing.JTextField();
        nameDo = new javax.swing.JTextField();
        cancel = new javax.swing.JButton();
        gr = new javax.swing.JButton();
        nv = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        bsc = new javax.swing.JButton();
        bc = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabAlumno = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Matricula");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LG.png"))); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de Alumno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 40, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        name.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 230, 40));

        fecha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 280, 40));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setText("Monto:");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 50, 40));

        esta.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        esta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Cancelado", "Pendiente" }));
        jPanel2.add(esta, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 280, 40));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("Fecha:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, 40));

        monto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 280, 40));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Sección:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 60, 60));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Grado:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 50, 40));

        secc.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        secc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "A", "B", "C" }));
        jPanel2.add(secc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 40));

        grado.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Primer Grado", "Segundo Grado", "Tercer Grado", "Cuarto Grado", "Quinto Grado" }));
        jPanel2.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 120, 40));

        n10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n10.setText("Estado:");
        jPanel2.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 60, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Tutor:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 40));

        idDo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        idDo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(idDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 40, 40));

        nameDo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        nameDo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(nameDo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 390, 370));

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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 130, 40));

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
        jPanel1.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, 40));

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
        jPanel1.add(nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Matriculados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n1.setText("Buscar:");
        jPanel3.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        tab.setModel(new javax.swing.table.DefaultTableModel(
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
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1110, 200));

        total.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        total.setText("N° de Registros:");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 30, -1, 40));

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
        jPanel3.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 130, 40));

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
        jPanel3.add(bsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, 40));

        bc.setFont(new java.awt.Font("Roboto Light", 0, 13)); // NOI18N
        bc.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        bc.setText("Ingrese el codigo para buscar");
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1130, 290));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Docentes", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 16))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaMousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(tabla);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 710, 130));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 730, 170));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumnos", javax.swing.border.TitledBorder.TRAILING, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 16))); // NOI18N
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabAlumno.setModel(new javax.swing.table.DefaultTableModel(
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
        tabAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabAlumnoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabAlumnoMousePressed(evt);
            }
        });
        jScrollPane5.setViewportView(tabAlumno);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 710, 140));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 730, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1151, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaMousePressed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila = tabla.rowAtPoint(evt.getPoint());
        this.idDo.setText(tabla.getValueAt(fila, 0).toString());
        this.nameDo.setText(tabla.getValueAt(fila, 1).toString()+" "+tabla.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tablaMouseClicked

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        gr.setText("Editar");
        Habilitar();
        eliminar.setEnabled(true);
        accion="editar";
        int fila =tab.rowAtPoint(evt.getPoint());
        id.setText(tab.getValueAt(fila, 0).toString());
        idDo.setText(tab.getValueAt(fila, 1).toString());
        idma = tab.getValueAt(fila, 2).toString();
        name.setText(tab.getValueAt(fila, 3).toString() + tab.getValueAt(fila, 4).toString());
        fecha.setDate(java.sql.Date.valueOf(tab.getValueAt(fila, 5).toString()));
        monto.setText(tab.getValueAt(fila, 6).toString());
        esta.setSelectedItem(tab.getValueAt(fila,7).toString());
        grado.setSelectedItem(tab.getValueAt(fila,8).toString());
        secc.setSelectedItem(tab.getValueAt(fila,9).toString());
        nameDo.setText(tab.getValueAt(fila, 10).toString() + tab.getValueAt(fila, 11).toString());
    }//GEN-LAST:event_tabMouseClicked

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

    private void grActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grActionPerformed
        if(Validacion() == false){
            CMatricula al = new CMatricula();
            LogicaMatricula funcion = new LogicaMatricula();

            if("Primer Grado".equals(grado.getSelectedItem().toString())){
                LocalDate Fecha;
                Fecha = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                al.setIdAlumno(Integer.parseInt(id.getText()));
                al.setFecha(Fecha);
                al.setMontoMatricula(Double.parseDouble(monto.getText()));
                al.setEstado(esta.getSelectedItem().toString());
                al.setIdGrado(1);
                al.setSeccion(secc.getSelectedItem().toString());
                al.setIdDocente(Integer.parseInt(idDo.getText()));
            }
            if("Segundo Grado".equals(grado.getSelectedItem().toString())){
                LocalDate Fecha;
                Fecha = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                al.setIdAlumno(Integer.parseInt(id.getText()));
                al.setFecha(Fecha);
                al.setMontoMatricula(Double.parseDouble(monto.getText()));
                al.setEstado(esta.getSelectedItem().toString());
                al.setIdGrado(2);
                al.setSeccion(secc.getSelectedItem().toString());
                al.setIdDocente(Integer.parseInt(idDo.getText()));  
            }
            if("Tercer Grado".equals(grado.getSelectedItem().toString())){
                LocalDate Fecha;
                Fecha = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                al.setIdAlumno(Integer.parseInt(id.getText()));
                al.setFecha(Fecha);
                al.setMontoMatricula(Double.parseDouble(monto.getText()));
                al.setEstado(esta.getSelectedItem().toString());
                al.setIdGrado(3);
                al.setSeccion(secc.getSelectedItem().toString());
                al.setIdDocente(Integer.parseInt(idDo.getText()));
            }
            if("Cuarto Grado".equals(grado.getSelectedItem().toString())){
                LocalDate Fecha;
                Fecha = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                al.setIdAlumno(Integer.parseInt(id.getText()));
                al.setFecha(Fecha);
                al.setMontoMatricula(Double.parseDouble(monto.getText()));
                al.setEstado(esta.getSelectedItem().toString());
                al.setIdGrado(4);
                al.setSeccion(secc.getSelectedItem().toString());
                al.setIdDocente(Integer.parseInt(idDo.getText()));
            }
            if("Quinto Grado".equals(grado.getSelectedItem().toString())){
                LocalDate Fecha;
                Fecha = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                al.setIdAlumno(Integer.parseInt(id.getText()));
                al.setFecha(Fecha);
                al.setMontoMatricula(Double.parseDouble(monto.getText()));
                al.setEstado(esta.getSelectedItem().toString());
                al.setIdGrado(5);
                al.setSeccion(secc.getSelectedItem().toString());
                al.setIdDocente(Integer.parseInt(idDo.getText()));
            }

            if(accion.equals("guardar")){
                if(funcion.Guardar(al)){
                    JOptionPane.showInternalMessageDialog(rootPane, "La matricula fue registrada satisfactoriamente");
                    Mostrar();
                }
            }else if(accion.equals("editar")){
                al.setIdMatricula(Integer.parseInt(idma));

                if(funcion.Editar(al)){
                    JOptionPane.showConfirmDialog(rootPane, "La matricula fue editada satisfactoriamente");
                    Mostrar();
                    Inhabilitar();
                }
            }
        }
    }//GEN-LAST:event_grActionPerformed

    private void grMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseExited
        gr.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_grMouseExited

    private void grMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseEntered
        gr.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_grMouseEntered

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Inhabilitar();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_cancelMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_cancelMouseEntered

    private void tabAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnoMouseClicked
        int fila = tabAlumno.rowAtPoint(evt.getPoint());
        this.id.setText(tabAlumno.getValueAt(fila, 0).toString());
        this.name.setText(tabAlumno.getValueAt(fila, 1).toString()+" "+tabAlumno.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tabAlumnoMouseClicked

    private void tabAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabAlumnoMousePressed

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
                CMatricula dts = new CMatricula();
                LogicaMatricula func = new LogicaMatricula();

                dts.setIdMatricula(Integer.parseInt(bc.getText()));
                func.Eliminar(dts);
                Mostrar();
                Inhabilitar();
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void bscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseEntered
        bsc.setBackground(new Color(128, 185, 238));
    }//GEN-LAST:event_bscMouseEntered

    private void bscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseExited
        bsc.setBackground(new Color(73,216,255));
    }//GEN-LAST:event_bscMouseExited

    private void bscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bscActionPerformed
        Buscar(bc.getText());
    }//GEN-LAST:event_bscActionPerformed

    private void bcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bcFocusGained
        if(bc.getText().equals("Ingrese el codigo para buscar")){
            bc.setText("");
        }
    }//GEN-LAST:event_bcFocusGained

    private void bcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_bcFocusLost
        if(bc.getText().equals("")){
            bc.setText("Ingrese el codigo para buscar");
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
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> esta;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton gr;
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idDo;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextField monto;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n10;
    private javax.swing.JTextField name;
    private javax.swing.JTextField nameDo;
    private javax.swing.JButton nv;
    private javax.swing.JComboBox<String> secc;
    private javax.swing.JTable tab;
    private javax.swing.JTable tabAlumno;
    private javax.swing.JTable tabla;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
    private String accion="Guardar";
    String idma="";
    private void Habilitar(){
        fecha.setEnabled(true);
        esta.setEnabled(true);
        monto.setEnabled(true);
        grado.setEnabled(true);
        secc.setEnabled(true);
        esta.setSelectedItem("<Seleccionar>");
        grado.setSelectedItem("<Seleccionar>");
        secc.setSelectedItem("<Seleccionar>");
        monto.setText("");
    }
    private void Inhabilitar(){
        id.setEnabled(false);
        idDo.setEnabled(false);
        name.setEnabled(false);
        nameDo.setEnabled(false);
        fecha.setEnabled(false);
        esta.setEnabled(false);
        monto.setEnabled(false);
        grado.setEnabled(false);
        secc.setEnabled(false);
        
        esta.setSelectedItem("<Seleccionar>");
        grado.setSelectedItem("<Seleccionar>");
        secc.setSelectedItem("<Seleccionar>");
        id.setText("");
        idDo.setText("");
        name.setText("");
        nameDo.setText("");
        monto.setText("");
    }
    
    public boolean Validacion(){
        if(id.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debe seleccionar el alumno");
            id.requestFocus();
            return true;
        }
        if(name.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apelliudo del alumno");
            name.requestFocus();
            return true;
        }
        if(idDo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar al docent");
            idDo.requestFocus();
            return true;
        }
        if(nameDo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del tutor del alumno");
            nameDo.requestFocus();
            return true;
        }
        if (fecha.getDate() == null) {
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar una fecha.");
            return true;
        }
        if(grado.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar el grado del alumno");
            return true;
        }
        if(secc.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar la sección del alumno");
            return true;
        }
                if(monto.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el monto de la matricula");
            monto.requestFocus();
            return true;
        }
        if(esta.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar el estado de pago");
            return true;
        }
        return false;
    }
    public void ocultar_columnas(){
        tab.getColumnModel().getColumn(0).setMaxWidth(0);
        tab.getColumnModel().getColumn(0).setMinWidth(0);
        tab.getColumnModel().getColumn(0).setPreferredWidth(0);
        tab.getColumnModel().getColumn(1).setMaxWidth(0);
        tab.getColumnModel().getColumn(1).setMinWidth(0);
        tab.getColumnModel().getColumn(1).setPreferredWidth(0);
        tab.getColumnModel().getColumn(10).setMaxWidth(0);
        tab.getColumnModel().getColumn(10).setMinWidth(0);
        tab.getColumnModel().getColumn(10).setPreferredWidth(0);
    }
        
    public void mostrarAlumno(){
        try {
            DefaultTableModel modelo;          
            LogicaAlumno func = new LogicaAlumno();
            modelo = func.MostrarVista();
             
            tabAlumno.setModel(modelo);
                
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void mostrarDocente() {
        try {
            DefaultTableModel modelo;
            LogicaProfesor func = new LogicaProfesor();
            modelo = func.MostrarVista();
            
            tabla.setModel(modelo);

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
    public void Mostrar(){
        try {
            DefaultTableModel modelo;
            LogicaMatricula fun = new LogicaMatricula();
            modelo = fun.Mostrar();
            tab.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: "+Integer.toString(fun.totalregistros));  
        }catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void Buscar(String codigo) {
        try {
            DefaultTableModel modelo;
            LogicaMatricula fun = new LogicaMatricula();
            modelo = fun.Buscar(codigo);
            tab.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(fun.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public Matricula() {
        initComponents();
        mostrarAlumno();
        mostrarDocente();
        Mostrar();
        Inhabilitar();
    }
}
