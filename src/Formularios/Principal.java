package Formularios;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JEditorPane;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Principal extends javax.swing.JFrame implements Runnable{

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        hra = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        user = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        administracion = new javax.swing.JMenu();
        alum = new javax.swing.JMenuItem();
        doce = new javax.swing.JMenuItem();
        Matricular = new javax.swing.JMenu();
        Asistencia = new javax.swing.JMenu();
        Reporte = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        Pensiones = new javax.swing.JMenu();
        RegistrarNotas = new javax.swing.JMenu();
        Ayuda = new javax.swing.JMenu();
        acerca = new javax.swing.JMenuItem();
        Sesion = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        Claro = new javax.swing.JMenuItem();
        Oscuro = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jLabel2.setFont(new java.awt.Font("Roboto Condensed Black", 0, 24)); // NOI18N
        jLabel2.setText("HORA:");

        hra.setFont(new java.awt.Font("Roboto Condensed", 0, 24)); // NOI18N
        hra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hra.setText("jLabel3");

        jLabel1.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("COLEGIO PRIVADO \"AMIGOS SCHOOL\"");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0.png"))); // NOI18N

        escritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(hra, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1158, Short.MAX_VALUE)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hra, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hra, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        user.setText("jMenu2");
        user.setFont(new java.awt.Font("Roboto", 1, 16)); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F11, 0));
        jMenuItem1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/19.png"))); // NOI18N
        jMenuItem1.setText("Cerrar Sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        user.add(jMenuItem1);

        jMenuBar1.add(user);

        administracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/1.png"))); // NOI18N
        administracion.setText("Administración");
        administracion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        alum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        alum.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        alum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8.png"))); // NOI18N
        alum.setText("Alumno");
        alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumActionPerformed(evt);
            }
        });
        administracion.add(alum);

        doce.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_NUMPAD2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        doce.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        doce.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9.png"))); // NOI18N
        doce.setText("Docente");
        doce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doceActionPerformed(evt);
            }
        });
        administracion.add(doce);

        jMenuBar1.add(administracion);

        Matricular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/21.png"))); // NOI18N
        Matricular.setText("Matricular");
        Matricular.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Matricular.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MatricularMouseClicked(evt);
            }
        });
        jMenuBar1.add(Matricular);

        Asistencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        Asistencia.setText("Asistencia");
        Asistencia.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Asistencia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AsistenciaMouseClicked(evt);
            }
        });
        jMenuBar1.add(Asistencia);

        Reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/3.png"))); // NOI18N
        Reporte.setText("Reporte");
        Reporte.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReporteMouseClicked(evt);
            }
        });

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/asistencia.png"))); // NOI18N
        jMenuItem8.setText("Asistencia");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem8);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/matricula.png"))); // NOI18N
        jMenuItem7.setText("Matricula");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem7);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nota.png"))); // NOI18N
        jMenuItem3.setText("Notas");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem3);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pension.png"))); // NOI18N
        jMenuItem9.setText("Pensiones");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem9);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/8.png"))); // NOI18N
        jMenuItem5.setText("Alumno");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/9.png"))); // NOI18N
        jMenuItem6.setText("Docente");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        Reporte.add(jMenuItem6);

        jMenuBar1.add(Reporte);

        Pensiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/4.png"))); // NOI18N
        Pensiones.setText("Pensiones");
        Pensiones.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Pensiones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PensionesMouseClicked(evt);
            }
        });
        jMenuBar1.add(Pensiones);

        RegistrarNotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/5.png"))); // NOI18N
        RegistrarNotas.setText("Registrar Notas");
        RegistrarNotas.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        RegistrarNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarNotasMouseClicked(evt);
            }
        });
        jMenuBar1.add(RegistrarNotas);

        Ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/6.png"))); // NOI18N
        Ayuda.setText("Ayuda");
        Ayuda.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        acerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_QUOTE, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        acerca.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        acerca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/17.png"))); // NOI18N
        acerca.setText("Acerca de");
        acerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaActionPerformed(evt);
            }
        });
        Ayuda.add(acerca);

        jMenuBar1.add(Ayuda);

        Sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/28.png"))); // NOI18N
        Sesion.setText("Configuración");
        Sesion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25.png"))); // NOI18N
        jMenu1.setText("Temas");
        jMenu1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N

        Claro.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Claro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/27.png"))); // NOI18N
        Claro.setText("Claro");
        Claro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaroActionPerformed(evt);
            }
        });
        jMenu1.add(Claro);

        Oscuro.setFont(new java.awt.Font("Roboto Condensed", 0, 14)); // NOI18N
        Oscuro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/26.png"))); // NOI18N
        Oscuro.setText("Oscuro");
        Oscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OscuroActionPerformed(evt);
            }
        });
        jMenu1.add(Oscuro);
        jMenu1.add(jSeparator1);

        Sesion.add(jMenu1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F12, 0));
        jMenuItem2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/20.png"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Sesion.add(jMenuItem2);

        jMenuBar1.add(Sesion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumActionPerformed
        Alumno alu = new Alumno();
        escritorio.add(alu);
        alu.toFront();
        alu.setVisible(true);
    }//GEN-LAST:event_alumActionPerformed

    private void doceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doceActionPerformed
        Docente doc = new Docente();
        escritorio.add(doc);
        doc.toFront();
        doc.setVisible(true);
    }//GEN-LAST:event_doceActionPerformed

    private void AsistenciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AsistenciaMouseClicked
        Asistencia doc = new Asistencia();
        escritorio.add(doc);
        doc.toFront();
        doc.setVisible(true);
    }//GEN-LAST:event_AsistenciaMouseClicked

    private void RegistrarNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarNotasMouseClicked
        Notas doc = new Notas();
        escritorio.add(doc);
        doc.toFront();
        doc.setVisible(true);
    }//GEN-LAST:event_RegistrarNotasMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        Inicio_Sesion is = new Inicio_Sesion();
        is.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void acercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaActionPerformed
        JOptionPane.showMessageDialog(escritorio,
                    "Gestión de Colegio v1.2\nDesarrollado por: SmitBZ\n\n"
                    + "Este programa permite gestionar estudiantes, profesores, notas y pensiones de estudiantes.\n",
                    "Acerca de",
        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_acercaActionPerformed

    private void PensionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PensionesMouseClicked
        Pensiones pen = new Pensiones();
        escritorio.add(pen);
        pen.toFront();
        pen.setVisible(true);
    }//GEN-LAST:event_PensionesMouseClicked

    private void MatricularMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MatricularMouseClicked
        Matricula mtr = new Matricula();
        escritorio.add(mtr);
        mtr.toFront();
        mtr.setVisible(true);
    }//GEN-LAST:event_MatricularMouseClicked

    private void ReporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReporteMouseClicked
/*        Reporte rpt = new Reporte();
        escritorio.add(rpt);
        rpt.toFront();
        rpt.setVisible(true);*/
    }//GEN-LAST:event_ReporteMouseClicked

    private void OscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OscuroActionPerformed
        TemaOscuro();        
    }//GEN-LAST:event_OscuroActionPerformed

    private void ClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaroActionPerformed
        TemaClaro();
    }//GEN-LAST:event_ClaroActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        ReporteNotas rn = new ReporteNotas();
        escritorio.add(rn);
        rn.toFront();
        rn.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        ReporteAsistencia ra = new ReporteAsistencia();
        escritorio.add(ra);
        ra.toFront();
        ra.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        ReporteMatriculas rm = new ReporteMatriculas();
        escritorio.add(rm);
        rm.toFront();
        rm.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        ReportePensiones rp = new ReportePensiones();
        escritorio.add(rp);
        rp.toFront();
        rp.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        ReporteDocente rd = new ReporteDocente();
        escritorio.add(rd);
        rd.setVisible(true);
        rd.toFront(); 
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        ReporteAlumno rp = new ReporteAlumno();
        escritorio.add(rp);
        rp.setVisible(true);
        rp.toFront();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Asistencia;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuItem Claro;
    private javax.swing.JMenu Matricular;
    private javax.swing.JMenuItem Oscuro;
    private javax.swing.JMenu Pensiones;
    private javax.swing.JMenu RegistrarNotas;
    private javax.swing.JMenu Reporte;
    private javax.swing.JMenu Sesion;
    private javax.swing.JMenuItem acerca;
    private javax.swing.JMenu administracion;
    private javax.swing.JMenuItem alum;
    private javax.swing.JMenuItem doce;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel hra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu user;
    // End of variables declaration//GEN-END:variables
    
    String hora, minutos, segundos, ampm;
    Thread h1;
    
    public void setUsuario(String nombreCompleto) {
        user.setText(nombreCompleto);
    }
    
    private void Ayuda() {
        JDialog ayudaDialogo = new JDialog(this, "Ayuda", true);
        ayudaDialogo.setSize(1024, 768);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setEditable(false);

        try {
            URL ayudaURL = getClass().getResource("/Adicionales/index.html");
            if (ayudaURL != null) {
                editorPane.setPage(ayudaURL);
            } else {
                editorPane.setContentType("text/html");
                editorPane.setText("<html><body><h1>Error</h1><p>No se pudo cargar la ayuda.</p></body></html>");
            }
        } catch (IOException e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html><body><h1>Error</h1><p>No se pudo cargar la ayuda.</p></body></html>");
        }

        JScrollPane scrollPane = new JScrollPane(editorPane);
        ayudaDialogo.add(scrollPane, BorderLayout.CENTER);
        ayudaDialogo.setVisible(true);
    }
    

    public void Hora() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();

        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";

        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }
    
    @Override
    public void run() {
        Thread ct = Thread.currentThread();
        while (ct == h1) {
            Hora();
            hra.setText(hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public Principal() {
        initComponents();
        this.setTitle("COLEGIO PRIVADO AMIGOS SCHOOL");
        this.setExtendedState(MAXIMIZED_BOTH);
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);
        setVisible(true);
        setIconImage(new ImageIcon(getClass().getResource("/Imagenes/LG.png")).getImage()); 
    }
    private void TemaOscuro() {
        try {
            UIManager.setLookAndFeel(new FlatMacDarkLaf());
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }

    private void TemaClaro() {
        try {
            UIManager.setLookAndFeel(new FlatMacLightLaf());
            javax.swing.SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        }
    }
    
    public static void main(String args[]) {
        try {
            FlatMacLightLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
}
