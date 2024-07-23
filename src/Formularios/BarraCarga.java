package Formularios;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import javax.swing.JDialog;

/**
 *
 * @author Smit
 */
public class BarraCarga extends javax.swing.JDialog {
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        curvasPanel1 = new Clases.CurvasPanel();
        jLabel1 = new javax.swing.JLabel();
        pro = new javax.swing.JProgressBar();
        inicio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        curvasPanel1.setBackground(new java.awt.Color(221, 221, 221));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/0.png"))); // NOI18N

        pro.setForeground(new java.awt.Color(0, 255, 51));

        inicio.setFont(new java.awt.Font("Roboto Light", 0, 14)); // NOI18N
        inicio.setForeground(new java.awt.Color(255, 255, 255));
        inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inicio.setText("Iniciando");

        javax.swing.GroupLayout curvasPanel1Layout = new javax.swing.GroupLayout(curvasPanel1);
        curvasPanel1.setLayout(curvasPanel1Layout);
        curvasPanel1Layout.setHorizontalGroup(
            curvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, curvasPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(curvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(curvasPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(curvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)))
                .addContainerGap())
        );
        curvasPanel1Layout.setVerticalGroup(
            curvasPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(curvasPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(pro, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inicio)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvasPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(curvasPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    doTask("Iniciando ...", 10);
                    doTask("Cargando ...", 20);
                    doTask("Cargando ...", 30);
                    doTask("Cargando ...", 40);
                    doTask("Cargando ...", 50);
                    doTask("Cargando ...", 60);
                    doTask("Cargando ...", 70);
                    doTask("Cargando ...", 80);
                    doTask("Cargando ...", 90);
                    doTask("Cargando ...", 100);
                    doTask("Gracias por la espera :)", 100);
                    dispose();
                    curvasPanel1.Finilizar();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Clases.CurvasPanel curvasPanel1;
    private javax.swing.JLabel inicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar pro;
    // End of variables declaration//GEN-END:variables
    
    private void doTask(String taskName, int progress) throws Exception {
        inicio.setText(taskName);
        Thread.sleep(1000); //  For Test
        pro.setValue(progress);
    }    
    
    public BarraCarga(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();        
        getContentPane().setBackground(new Color(221, 221, 221));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
    }
    public static void main(String args[]) {
         try {
//            UIManager.setLookAndFeel( new FlatLightLaf() );
            FlatMacLightLaf.setup();
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BarraCarga dialog = new BarraCarga(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
}
