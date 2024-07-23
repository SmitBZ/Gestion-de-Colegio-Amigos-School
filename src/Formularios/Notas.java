package Formularios;

import Clases.CNotas;
import Clases.LogicaMatricula;
import Clases.LogicaNotas;
import Clases.LogicaPension;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Notas extends javax.swing.JInternalFrame {

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        id = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cr = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Bime = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        nota = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        gr = new javax.swing.JButton();
        nv = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        n7 = new javax.swing.JLabel();
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
        n10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cur = new javax.swing.JComboBox<>();
        grado = new javax.swing.JComboBox<>();
        secc = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Notas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LG.png"))); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Nota", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 40, 40));

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setText("Nombre:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 40));

        cr.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        cr.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(cr, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 270, 40));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Curso:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 50, 50));

        Bime.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        Bime.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Selecionar>", "Primer Bimestre", "Segundo Bimestre", "Tercer Bimestre", "Cuarto Bimestre" }));
        Bime.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.add(Bime, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 270, 50));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Nota:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 50, 50));

        nota.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        nota.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 170, 40));

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setText("Bimestre:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 70, 50));

        name.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel3.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 220, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 420, 250));

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
        jPanel1.add(gr, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, -1, 50));

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
        jPanel1.add(nv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 50));

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
        jPanel1.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 130, 50));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Notas Registradas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n7.setText("Buscar:");
        jPanel4.add(n7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 40));

        tab.setAutoCreateRowSorter(true);
        tab.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
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
        tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tab);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 1190, 220));

        total.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        total.setText("N° de Registros:");
        jPanel4.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 30, -1, 40));

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
        jPanel4.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 30, 130, 40));

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
        jPanel4.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 190, 40));

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
        jPanel4.add(bsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 1210, 310));

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

        jPanel5.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 760, 220));

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
        jPanel5.add(bsc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, -1, 40));

        n10.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n10.setText("Grado:");
        jPanel5.add(n10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 40));

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel4.setText("Sección:");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 60, 40));

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setText("Curso:");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 50, 40));

        cur.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        cur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curActionPerformed(evt);
            }
        });
        jPanel5.add(cur, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 130, 40));

        grado.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        grado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "1", "2", "3", "4", "5" }));
        grado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradoActionPerformed(evt);
            }
        });
        jPanel5.add(grado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 130, 40));

        secc.setFont(new java.awt.Font("Roboto Condensed Light", 0, 14)); // NOI18N
        secc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "A", "B", "C" }));
        jPanel5.add(secc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, 130, 40));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 780, 310));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1232, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseEntered
        gr.setBackground(new Color(0,204,0));
    }//GEN-LAST:event_grMouseEntered

    private void grMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grMouseExited
        gr.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_grMouseExited

    private void grActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grActionPerformed
        CNotas  nt = new CNotas();
        LogicaNotas func = new LogicaNotas();
        double Nota = Double.parseDouble(nota.getText());
        String estado;
        if (Nota >= 12) {
            estado = "Aprobado";
        } else {
            estado = "Desaprobado";
        }
        String Curso = cr.getText();
        int Grado = Integer.parseInt(grado.getSelectedItem().toString());
        nt.setUnidad(Bime.getSelectedItem().toString());
        nt.setIdMatricula(Integer.parseInt(id.getText()));
        
        nt.setNota(Nota);
        nt.setEstado(estado);

        if (accion.equals("guardar")) {
            if (func.Guardar(nt, Curso, Grado)) {
                JOptionPane.showMessageDialog(rootPane, "Nota registrada satisfactoriamente");
                Mostrar();
                Inhabilitar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al registrar la nota");
            }
        }else if (accion.equals("editar")) {
            nt.setIdCalificaciones(Integer.parseInt(idc));
            if (func.editar(nt, Curso, Grado)) {
                JOptionPane.showMessageDialog(rootPane, "Nota editada satisfactoriamente");
                Mostrar();
                Inhabilitar();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al editar la nota");
            }
        }
    }//GEN-LAST:event_grActionPerformed

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
        accion = "editar";
        
        int fila = tab.rowAtPoint(evt.getPoint());
        idc = tab.getValueAt(fila, 1).toString();
        id.setText(tab.getValueAt(fila, 0).toString());
        name.setText(tab.getValueAt(fila, 2).toString() + " " + tab.getValueAt(fila, 3).toString());
        cr.setText(tab.getValueAt(fila, 4).toString());
        Bime.setSelectedItem(tab.getValueAt(fila, 6).toString());
        nota.setText(tab.getValueAt(fila, 7).toString());
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
                CNotas dts = new CNotas();
                LogicaNotas func = new LogicaNotas();

                dts.setIdCalificaciones(Integer.parseInt(bc.getText()));
                func.Eliminar(dts);
                Mostrar();
                Inhabilitar();
            }
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void tabAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabAlumnoMouseClicked
        int fila = tabAlumno.rowAtPoint(evt.getPoint());
        id.setText(tabAlumno.getValueAt(fila, 0).toString());
        name.setText(tabAlumno.getValueAt(fila, 1).toString()+" "+tabAlumno.getValueAt(fila, 2).toString());
        cr.setText(tabAlumno.getValueAt(fila, 5).toString());
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
    try {
        int Grado = Integer.parseInt(grado.getSelectedItem().toString());
        String Seccion = secc.getSelectedItem().toString();
        String Curso = cur.getSelectedItem().toString();
        Buscar_Matricula(Grado, Seccion, Curso);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona un grado válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_bsc3ActionPerformed

    private void curActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_curActionPerformed

    private void gradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradoActionPerformed
        Seleccion();
    }//GEN-LAST:event_gradoActionPerformed

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
    private javax.swing.JComboBox Bime;
    private javax.swing.JTextField bc;
    private javax.swing.JButton bsc;
    private javax.swing.JButton bsc3;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField cr;
    private javax.swing.JComboBox<String> cur;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton gr;
    private javax.swing.JComboBox<String> grado;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel n10;
    private javax.swing.JLabel n7;
    private javax.swing.JTextField name;
    public static javax.swing.JTextField nota;
    private javax.swing.JButton nv;
    private javax.swing.JComboBox<String> secc;
    private javax.swing.JTable tab;
    private javax.swing.JTable tabAlumno;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
    private String accion="guardar";
    String idc;
    private void Habilitar(){
        Bime.setEnabled(true);
        nota.setEnabled(true);
        
        Bime.setSelectedItem("<Seleccionar>");
        nota.setText("");
    }
    private void Inhabilitar(){
        id.setEnabled(false);
        name.setEnabled(false);
        cr.setEnabled(false);
        Bime.setEnabled(false);
        nota.setEnabled(false);
        
        Bime.setSelectedItem("<Seleccionar>");
        nota.setText("");
    }
    
    public void Mostrar() {
        try {
            DefaultTableModel modelo;
            LogicaNotas func = new LogicaNotas();
            modelo = func.Mostrar();
            tab.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + func.totalregistros);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    
    public void Buscar_Matricula(int g, String s, String t) {
        try {
            DefaultTableModel modelo;          
            LogicaMatricula func = new LogicaMatricula();
            modelo = func.Buscar_Notas(g, s, t);
            tabAlumno.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    public void Buscar(String b) {
        try {
            DefaultTableModel modelo;
            LogicaNotas func = new LogicaNotas();
            modelo = func.Buscar(b);
            tab.setModel(modelo);
            total.setText("Total Registros: " + Integer.toString(func.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    public void ocultar_columnas(){
        tab.getColumnModel().getColumn(0).setMaxWidth(0);
        tab.getColumnModel().getColumn(0).setMinWidth(0);
        tab.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    public void Seleccion() {
        String[] cabecera1 = {"<Seleccionar>", "Desarrollo personal, ciudadanía y cívica", "Ciencias sociales", 
                              "Educación para el trabajo", "Educación física", "Comunicación", "Arte y cultura", 
                              "Inglés", "Matemática", "Ciencia y tecnología", "Educación religiosa", "Computación"};
        
        String[] cabecera = {"<Seleccionar>", "Desarrollo personal, ciudadanía y cívica", "Ciencias sociales", 
                             "Educación para el trabajo", "Educación física", "Comunicación", "Arte y cultura", 
                             "Inglés", "Matemática", "Ciencia y tecnología", "Educación religiosa", "Física", 
                             "Biología", "Computación"};
        
        cur.removeAllItems();
        
        if(grado.getSelectedItem().equals("1")){
            for(String item: cabecera1){
                cur.addItem(item);
            }
        }
        if(grado.getSelectedItem().equals("2")){
            for(String item: cabecera1){
                cur.addItem(item);
            }
        }
        if(grado.getSelectedItem().equals("3")){
            for(String item: cabecera1){
                cur.addItem(item);
            }
        }
        if(grado.getSelectedItem().equals("4")){
            for(String item: cabecera){
                cur.addItem(item);
            }
        }
        if(grado.getSelectedItem().equals("5")){
            for(String item: cabecera){
                cur.addItem(item);
            }
        }
    }

    public Notas() {
        initComponents();
        this.setTitle("Registro de Notas");
        Inhabilitar();
        Mostrar();

    }
    
}
