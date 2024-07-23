package Formularios;

import Clases.CProfesor;
import Clases.LogicaProfesor;
import java.awt.Color;
import java.awt.HeadlessException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Docente extends javax.swing.JInternalFrame {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        last = new javax.swing.JTextField();
        tel = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        drc = new javax.swing.JTextField();
        fecha = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        contra = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        espe = new javax.swing.JComboBox<>();
        nv = new javax.swing.JButton();
        gr = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        n1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        total = new javax.swing.JLabel();
        eliminar = new javax.swing.JButton();
        bsc = new javax.swing.JButton();
        bc = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Docente");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LG.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Profesor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 30));

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setText("Dirección:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        name.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 44, 270, -1));

        last.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        jPanel1.add(last, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 271, -1));

        tel.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        tel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telKeyTyped(evt);
            }
        });
        jPanel1.add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 260, -1));

        jLabel28.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel28.setText("DNI:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 30));

        gen.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Masculino", "Femenino" }));
        jPanel1.add(gen, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 125, 30));

        jLabel30.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel30.setText("Sexo:");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, -1, 30));

        dni.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        dni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dniKeyTyped(evt);
            }
        });
        jPanel1.add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 118, -1));

        jLabel19.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel19.setText("F. Nacimiento:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, 30));

        drc.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        drc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drcActionPerformed(evt);
            }
        });
        drc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                drcKeyTyped(evt);
            }
        });
        jPanel1.add(drc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 270, -1));
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 217, -1));

        jLabel18.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel18.setText("Telefono:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, 30));

        jLabel20.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel20.setText("Correo:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 40));

        correo.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                correoKeyTyped(evt);
            }
        });
        jPanel1.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 260, -1));

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setText("F.  Contrato:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 30));
        jPanel1.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 217, -1));

        jLabel31.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel31.setText("Curso a Cargo:");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 30));

        espe.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        espe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>", "Lengua y Literatura", "Matemáticas", "Ciencias Naturales", "Ciencias Sociales", "Inglés", "Educación Física", "Arte", "Tecnología", "Formación Ética y Ciudadana", "Biología", "Física", "Química", "Historia", "Geografía" }));
        espe.setToolTipText("");
        jPanel1.add(espe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 240, 30));

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

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto Condensed", 0, 18))); // NOI18N
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        n1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        n1.setText("Buscar:");
        jPanel3.add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 60, 40));

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 820, 400));

        total.setFont(new java.awt.Font("Roboto Thin", 1, 18)); // NOI18N
        total.setText("N° de Registros:");
        jPanel3.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, -1, 40));

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
        jPanel3.add(eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 130, 40));

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
        jPanel3.add(bsc, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, -1, 40));

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
        jPanel3.add(bc, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, 40));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nv, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nv, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gr, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dniKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();

        int numerocaracteres=8;
        if(dni.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_dniKeyTyped

    private void drcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_drcKeyTyped

    }//GEN-LAST:event_drcKeyTyped

    private void correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_correoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_correoKeyTyped

    private void drcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drcActionPerformed

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
        if(Validacion()==false){
            LocalDate FechaN;
            LocalDate Fecha;

            FechaN = fecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Fecha = contra.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            CProfesor pr = new CProfesor();
            LogicaProfesor funcion = new LogicaProfesor();
            pr.setFecha(FechaN);
            pr.setContrato(Fecha);
            pr.setNombre(name.getText());
            pr.setApellidos(last.getText());
            pr.setDNI(dni.getText());
            pr.setSexo(gen.getSelectedItem().toString());
            pr.setDireccion(drc.getText());
            pr.setEspecialidad(espe.getSelectedItem().toString());
            pr.setTelefono(tel.getText());
            pr.setCorreo(correo.getText());

            if(accion.equals("guardar")){
                if(funcion.Guardar(pr)){
                    JOptionPane.showInternalMessageDialog(rootPane, "El docente fue registrado satisfactoriamente");
                    Mostrar();
                    Inhabilitar();
                }
            }else if(accion.equals("editar")){
                pr.setDNI(dni.getText());

                if(funcion.Editar(pr)){
                    JOptionPane.showConfirmDialog(rootPane, "El docente fue editada satisfactoriamente");
                    Mostrar();
                    Inhabilitar();
                }
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

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        gr.setText("Editar");
        Habilitar();
        eliminar.setEnabled(true);
        accion="editar";
        int fila =tabla.rowAtPoint(evt.getPoint());
        name.setText(tabla.getValueAt(fila, 1).toString());
        last.setText(tabla.getValueAt(fila, 2).toString());
        dni.setText(tabla.getValueAt(fila, 4).toString());
        gen.setSelectedItem(tabla.getValueAt(fila,5).toString());
        tel.setText(tabla.getValueAt(fila, 6).toString());
        correo.setText(tabla.getValueAt(fila, 7).toString());
        drc.setText(tabla.getValueAt(fila, 3).toString());
        espe.setSelectedItem(tabla.getValueAt(fila,8).toString());
        fecha.setDate(java.sql.Date.valueOf(tabla.getValueAt(fila, 9).toString()));
        contra.setDate(java.sql.Date.valueOf(tabla.getValueAt(fila, 10).toString()));
    }//GEN-LAST:event_tablaMouseClicked

    private void telKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telKeyTyped
        char c=evt.getKeyChar();
        if(c<'0' || c>'9' )evt.consume();

        int numerocaracteres=9;
        if(dni.getText().length()>=numerocaracteres){
            JOptionPane.showMessageDialog(rootPane, "No puedes ingresar mas");
        }
    }//GEN-LAST:event_telKeyTyped

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
        eliminar.setBackground(new Color(148, 17, 7));
    }//GEN-LAST:event_eliminarMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
        eliminar.setBackground(new Color(225,26,11));
    }//GEN-LAST:event_eliminarMouseExited

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        if(!bc.getText().equals("")){
            int confirmacion=JOptionPane.showConfirmDialog(rootPane, "Esta seguro de Eliminar el profesor","Confirmar",2);

            if(confirmacion==0){
                CProfesor dts = new CProfesor();
                LogicaProfesor func = new LogicaProfesor();

                dts.setDNI(bc.getText());
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
    private com.toedter.calendar.JDateChooser contra;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField dni;
    private javax.swing.JTextField drc;
    private javax.swing.JButton eliminar;
    private javax.swing.JComboBox<String> espe;
    private com.toedter.calendar.JDateChooser fecha;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton gr;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField last;
    private javax.swing.JLabel n1;
    private javax.swing.JTextField name;
    private javax.swing.JButton nv;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField tel;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
    
    private String accion="guardar";
    private void Habilitar(){
        name.setEnabled(true);
        last.setEnabled(true);
        dni.setEnabled(true);
        gen.setEnabled(true);
        drc.setEnabled(true);
        fecha.setEnabled(true);
        contra.setEnabled(true);
        tel.setEnabled(true);
        espe.setEnabled(true);
        correo.setEnabled(true);

        
        name.setText("");
        last.setText("");
        dni.setText("");
        correo.setText("");
        gen.setSelectedItem("<Seleccionar>");
        drc.setText("");
        tel.setText("");
        espe.setSelectedItem("<Seleccionar>");
    }
    private void Inhabilitar(){
        
        name.setEnabled(false);
        last.setEnabled(false);
        dni.setEnabled(false);
        gen.setEnabled(false);
        drc.setEnabled(false);
        fecha.setEnabled(false);
        fecha.setEnabled(false);
        contra.setEnabled(false);
        tel.setEnabled(false);
        espe.setEnabled(false);
        correo.setEnabled(false);
        
        name.setText("");
        last.setText("");
        dni.setText("");
        drc.setText("");
        tel.setText("");
        correo.setText("");
    }
    
    public void ocultar_columnas(){
        tabla.getColumnModel().getColumn(0).setMaxWidth(0);
        tabla.getColumnModel().getColumn(0).setMinWidth(0);
        tabla.getColumnModel().getColumn(0).setPreferredWidth(0);
    }
    
    public void Mostrar() {
        try {
            DefaultTableModel modelo;
            LogicaProfesor func = new LogicaProfesor();
            modelo = func.Mostrar();
            tabla.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + func.totalregistros);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(rootPane, "Error al mostrar los datos: " + e.getMessage());
        }
    }
    
    public void Buscar(String dni) {
        try {
            DefaultTableModel modelo;
            LogicaProfesor fun = new LogicaProfesor();
            modelo = fun.Buscar(dni);
            tabla.setModel(modelo);
            ocultar_columnas();
            total.setText("Total Registros: " + Integer.toString(fun.totalregistros));  
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    public boolean Validacion(){
        if(name.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el nombre del docente");
            name.requestFocus();
            return true;
        }
        if(last.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el apelliudo del docente");
            last.requestFocus();
            return true;
        }
        if(dni.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el dni del docente");
            dni.requestFocus();
            return true;
        }
        if(gen.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar el género del docente");
            return true;
        }
        if(drc.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar la dirección del docente");
            drc.requestFocus();
            return true;
        }
        if(tel.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el telefono del docente");
            tel.requestFocus();
            return true;
        }
        if(correo.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Debes ingresar el correo del docente");
            correo.requestFocus();
            return true;
        }
        if(espe.getSelectedItem()=="<Selecionar>"){
            JOptionPane.showMessageDialog(rootPane, "Debes seleccionar la especialidad");
            return true;
        }
        return false;
    }
    
    public Docente() {
        initComponents();
        this.setTitle("Registro de Docente");
        Inhabilitar();
        Mostrar();
    }
}
