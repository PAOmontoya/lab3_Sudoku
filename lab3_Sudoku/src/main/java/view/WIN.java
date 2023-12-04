package view;

import java.awt.Color;
import javax.swing.BorderFactory;


public class WIN extends javax.swing.JFrame {
    
    public static tablero tableroSudoku;
    
    private int xPos;
    private int yPos;
    
    public WIN() {
        initComponents();
        iniciarComponentes();
        bgPAN.setBorder(BorderFactory.createLineBorder(Color.BLACK,1));
    }
    
    public void iniciarComponentes(){
        tableroSudoku= new tablero();
        tableroSudoku.setTxtAltura(36);
        tableroSudoku.setTxtAncho(36);
        tableroSudoku.setTxtMargen(4);
        tableroSudoku.setTxtTamanoLetra(27);
        
        tableroSudoku.setPanelBackground(new Color(89, 43, 25));
        
        tableroSudoku.setTxtBackground1(Color.WHITE);
        tableroSudoku.setTxtForeground1(Color.BLACK);
        tableroSudoku.setTxtBackground2(new Color(232,186,186));
        tableroSudoku.setTxtForeground2(Color.BLACK);
        tableroSudoku.setTxtBackground3(new Color(203,102,102));
        tableroSudoku.setTxtForeground3(Color.WHITE);
        tableroSudoku.setTxtBackground4(new Color(238, 227, 227));
        tableroSudoku.setTxtForeground4(Color.BLACK);
        
        bgPAN.add(tableroSudoku);
        tableroSudoku.setLocation(25,60);
        tableroSudoku.setVisible(true);
        tableroSudoku.crearSudoku();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPAN = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        newGameBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPAN.setBackground(new java.awt.Color(102, 51, 255));
        bgPAN.setPreferredSize(new java.awt.Dimension(540, 420));
        bgPAN.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                bgPANMouseDragged(evt);
            }
        });
        bgPAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bgPANMousePressed(evt);
            }
        });
        bgPAN.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sudoku");
        bgPAN.add(jLabel1);
        jLabel1.setBounds(140, 20, 100, 30);

        jButton1.setBackground(new java.awt.Color(51, 0, 153));
        jButton1.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Solve");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        bgPAN.add(jButton1);
        jButton1.setBounds(390, 290, 120, 60);

        newGameBTN.setBackground(new java.awt.Color(51, 0, 153));
        newGameBTN.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        newGameBTN.setForeground(new java.awt.Color(255, 255, 255));
        newGameBTN.setText("New Game");
        newGameBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                newGameBTNMousePressed(evt);
            }
        });
        bgPAN.add(newGameBTN);
        newGameBTN.setBounds(390, 80, 120, 60);

        jButton3.setBackground(new java.awt.Color(51, 0, 153));
        jButton3.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        bgPAN.add(jButton3);
        jButton3.setBounds(390, 150, 120, 60);

        jButton4.setBackground(new java.awt.Color(51, 0, 153));
        jButton4.setFont(new java.awt.Font("Franklin Gothic Medium Cond", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Check");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        bgPAN.add(jButton4);
        jButton4.setBounds(390, 220, 120, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPAN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private modesWIN modes;
    private void newGameBTNMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newGameBTNMousePressed
        if(modes!=null){
            modes.setVisible(true);
        }else{
            modes = new modesWIN(tableroSudoku);
            modes.setVisible(true);;
        }
    }//GEN-LAST:event_newGameBTNMousePressed

    private void bgPANMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgPANMousePressed
        xPos=evt.getX();
        yPos=evt.getY();
    }//GEN-LAST:event_bgPANMousePressed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        tableroSudoku.resolver();
    }//GEN-LAST:event_jButton1MousePressed

    private void bgPANMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bgPANMouseDragged
        this.setLocation(evt.getXOnScreen() - xPos, evt.getYOnScreen()- yPos);
    }//GEN-LAST:event_bgPANMouseDragged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableroSudoku.limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tableroSudoku.comprobar();
    }//GEN-LAST:event_jButton4ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(WIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPAN;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton newGameBTN;
    // End of variables declaration//GEN-END:variables
}
