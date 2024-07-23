package Formularios;

import Clases.CPension;
import Clases.LogicaAsistencia;
import Clases.LogicaMatricula;
import Clases.LogicaPension;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Smit
 */
public class Pensiones extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        monto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        fecha = new com.toedter.calendar.JDateChooser();
        n9 = new javax.swing.JLabel();
        esta = new javax.swing.JComboBox<>();
        n10 = new javax.swing.JLabel();
        cuota = new javax.swing.JComboBox<>();
        nv = new javax.swing.JButton();
        gr = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        bc = new javax.swing.JTextField();
        bsc = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabAlumno = new javax.swing.JTable();
        bsc3 = new javax.swing.JButton();
        n11 = new javax.swing.JLabel();
        grado = new javax.swing.JComboBox<>();
        secc = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Pensiones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LG.png"))); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Pensiones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Monto:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 60, 40));

        id.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, 40));

        monto.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        monto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoActionPerformed(evt);
            }
        });
        jPanel2.add(monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 290, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, 40));

        name.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel2.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 240, 40));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("Fecha:");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 50, 40));

        fecha.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel2.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 290, 40));

        n9.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n9.setText("Estado:");
        jPanel2.add(n9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 50, 40));

        esta.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        esta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Pagado", "Pendiente", "No pagado" }));
        jPanel2.add(esta, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 110, 40));

        n10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n10.setText("Cuota:");
        jPanel2.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 40));

        cuota.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cuota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Cuota 1", "Cuota 2", "Cuota 3", "Cuota 4", "Cuota 5", "Cuota 6", "Cuota 7", "Cuota 8", "Cuota 9", "Cuota 10" }));
        cuota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuotaActionPerformed(evt);
            }
        });
        jPanel2.add(cuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 120, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 410, 320));

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
        jPanel1.add(nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 40));

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
        jPanel1.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 40));

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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 130, 40));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Pensiones Registradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n1.setText("Buscar:");
        jPanel3.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 40));

        tab.setFont(new java.awt.Font("Roboto Condensed Medium", 0, 14)); // NOI18N
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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1120, 280));

        total.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        total.setText("N° de Registros:");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, 40));

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
        jPanel3.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, 130, 40));

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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 1140, 460));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alumno", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(tabAlumno);

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 700, 270));

        bsc3.setBackground(new java.awt.Color(0, 102, 51));
        bsc3.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        bsc3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/14.png"))); // NOI18N
        bsc3.setText("Buscar");
        bsc3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bsc3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bsc3MouseExited(evt);
            }
        });
        bsc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsc3ActionPerformed(evt);
            }
        });
        jPanel5.add(bsc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, 40));

        n11.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n11.setText("Grado:");
        jPanel5.add(n11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        grado.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "1", "2", "3", "4", "5" }));
        jPanel5.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 140, 30));

        secc.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        secc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "A", "B", "C" }));
        jPanel5.add(secc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 130, 30));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Sección:");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 60, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 720, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoActionPerformed

    private void cuotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cuotaActionPerformed

    private void nvMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvMouseEntered
        nv.setBackground(new Color(74, 187, 255));
    }//GEN-LAST:event_nvMouseEntered

    private void nvMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nvMouseExited
        nv.setBackground(new Color(0,0,204));
    }//GEN-LAST:event_nvMouseExited

    private void nvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nvActionPerformed
        Habilitar();
        gr.setText("Guardar");
        accion = "guardar";
    }//GEN-LAST:event_nvActionPerformed

    private void grMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseEntered
        gr.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_grMouseEntered

    private void grMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseExited
        gr.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_grMouseExited

    private void grActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grActionPerformed
        LocalDate Fe;
        Fe = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        CPension dts = new CPension();
        LogicaPension func = new LogicaPension();
        dts.setIdMatricula(Integer.parseInt(id.getText()));
        dts.setFecha(Fe);
        dts.setEstado(esta.getSelectedItem().toString());
        dts.setCuota(cuota.getSelectedItem().toString());
        dts.setMonto(Double.parseDouble(monto.getText()));

        if (accion.equals("guardar")) {
            if (func.Guardar(dts)) {
                JOptionPane.showConfirmDialog(rootPane, "Matrciula satisfactoriamente registrada");
                Mostrar();
                Inhabilitar();
            }
        }else if(accion.equals("editar")){
            dts.setIdPension(Integer.parseInt(idp));

           if(func.Editar(dts)){
                JOptionPane.showConfirmDialog(rootPane, "El alumno fue editada satisfactoriamente");
                Mostrar();
                Inhabilitar();
            } else {
            }
        }
    }//GEN-LAST:event_grActionPerformed

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setBackground(new Color(255,51,51));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setBackground(new Color(153,0,0));
    }//GEN-LAST:event_cancelMouseExited

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        Inhabilitar();
    }//GEN-LAST:event_cancelActionPerformed

    private void tabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabMouseClicked
        gr.setText("Editar");
        Habilitar();
        eliminar.setEnabled(true);
        accion="editar";
        int fila =tab.rowAtPoint(evt.getPoint());
        id.setText(tab.getValueAt(fila, 0).toString());
        idp = tab.getValueAt(fila, 1).toString();
        name.setText(tab.getValueAt(fila, 2).toString() + tab.getValueAt(fila, 3).toString());
        fecha.setDate(java.sql.Date.valueOf(tab.getValueAt(fila, 4).toString()));
        monto.setText(tab.getValueAt(fila, 5).toString());
        cuota.setSelectedItem(tab.getValueAt(fila,6).toString());
        esta.setSelectedItem(tab.getValueAt(fila,7).toString());
    }//GEN-LAST:event_tabMouseClicked

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        eliminar.setBackground(new Color(148, 17, 7));
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        eliminar.setBackground(new Color(225,26,11));
    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(!bc.getText().equals("")){
            int confirmacion=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de Eliminar la asistencia","Confirmar",2);

            if(confirmacion==0){
                CPension dts = new CPension();
                LogicaPension func = new LogicaPension();

                dts.setIdPension(Integer.parseInt(bc.getText()));
                func.Eliminar(dts);
                Mostrar();
                Inhabilitar();
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void tabAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnoMouseClicked
        int fila = tabAlumno.rowAtPoint(evt.getPoint());
        this.id.setText(tabAlumno.getValueAt(fila, 0).toString());
        this.name.setText(tabAlumno.getValueAt(fila, 1).toString()+" "+tabAlumno.getValueAt(fila, 2).toString());
    }//GEN-LAST:event_tabAlumnoMouseClicked

    private void tabAlumnoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabAlumnoMousePressed

    private void bsc3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsc3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_bsc3MouseEntered

    private void bsc3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bsc3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_bsc3MouseExited

    private void bsc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsc3ActionPerformed
        int Grado = Integer.parseInt(grado.getSelectedItem().toString());
        String Seccion = secc.getSelectedItem().toString();
        Buscar_Matricula(Grado, Seccion);
    }//GEN-LAST:event_bsc3ActionPerformed

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

    private void bscMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseEntered
        bsc.setBackground(new Color(128, 185, 238));
    }//GEN-LAST:event_bscMouseEntered

    private void bscMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bscMouseExited
        bsc.setBackground(new Color(73,216,255));
    }//GEN-LAST:event_bscMouseExited

    private void bscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bscActionPerformed
        Buscar(bc.getText());
    }//GEN-LAST:event_bscActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bc;
    private javax.swing.JButton bsc;
    private javax.swing.JButton bsc3;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cuota;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> esta;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JButton gr;
    private javax.swing.JComboBox<String> grado;
    public static javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField monto;
    private javax.swing.JLabel n1;
    private javax.swing.JLabel n10;
    private javax.swing.JLabel n11;
    private javax.swing.JLabel n9;
    public static javax.swing.JTextField name;
    private javax.swing.JButton nv;
    private javax.swing.JComboBox<String> secc;
    private javax.swing.JTable tab;
    private javax.swing.JTable tabAlumno;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
    private String accion="guardar";
    private String idp ="";
    private void Habilitar(){
        fecha.setEnabled(true);
        monto.setEnabled(true);
        esta.setEnabled(true);
        cuota.setEnabled(true);
        esta.setSelectedItem("<Seleccionar>");
        cuota.setSelectedItem("<Seleccionar>");
        id.setText("");
        name.setText("");
        monto.setText("");
    }
    
    private void Inhabilitar(){
        id.setEnabled(false);
        name.setEnabled(false);
        fecha.setEnabled(false);
        monto.setEnabled(false);
        esta.setEnabled(false);
        cuota.setEnabled(false);
        esta.setSelectedItem("<Seleccionar>");
        cuota.setSelectedItem("<Seleccionar>");
        id.setText("");
        name.setText("");
        monto.setText("");
    }
    
    public void Mostrar() {
        try {
            DefaultTableModel modelo;
            LogicaPension func = new LogicaPension();
            modelo = func.Mostrar();
            tab.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(func.totalregistros));
        } catch (HeadlessException e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void Buscar_Matricula(int g, String s) {
        try {
            DefaultTableModel modelo;          
            LogicaMatricula func = new LogicaMatricula();
            modelo = func.Buscar_Asistencia(g, s);
        
            tabAlumno.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void ocultar_columnas(){
        tab.getColumnModel().getColumn(0).setMaxWidth(0);
        tab.getColumnModel().getColumn(0).setMinWidth(0);
        tab.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void Buscar(String b) {
        try {
            DefaultTableModel modelo;
            LogicaPension func = new LogicaPension();
            modelo = func.Buscar(b);
            tab.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(func.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    public Pensiones() {
        initComponents();
        Inhabilitar();
        Mostrar();
    }
}
