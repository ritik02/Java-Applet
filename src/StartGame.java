
import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * StartGame.java
 *
 * Created on Jul 1, 2015, 11:08:34 AM
 */
/**
 *
 * @author SURESH
 */
public class StartGame extends javax.swing.JFrame {

    /** Creates new form StartGame */
    public StartGame() {
        initComponents();
        Graphics g = null;
        
       

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelName = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RMP GAMES");
        setBackground(new java.awt.Color(51, 255, 0));
        setForeground(new java.awt.Color(153, 255, 204));

        labelName.setFont(new java.awt.Font("Tahoma", 0, 14));
        labelName.setText("Enter Your Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton1.setText("Arkanoid");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36));
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("!!RMP GAMES!!");

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton2.setText("Spongebob Shooter");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton3.setText("Raeman");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("2 Player");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 18));
        jButton5.setText("Bomb");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(labelName))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(labelName)
                .addGap(6, 6, 6)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String na = name.getText();
     bean.names=na;   // JOptionPane.showMessageDialog(null, "Hello " + na);
        JFrame f = new JFrame();
        f.setSize(800, 800);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        f.getContentPane().add(panel);
        arakanoid applet = new arakanoid();
        applet.setVisible(true);

        panel.add(applet, BorderLayout.CENTER);
        panel.setVisible(true);

        panel.setSize(600, 600);
        applet.init();
        f.pack();
        f.setSize(800, 800);

//		CustomContainer loadGame = new CustomContainer();
//		f.add(loadGame);
        f.setVisible(true);
        // gui5 gui=new gui5();
        //add(loadGame);
        //loadGame.setSize(300, 300);
        // main.show();
        //loadGame.setVisible(true);
      //  setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String na = name.getText();
     bean.names=na;   // JOptionPane.showMessageDialog(null, "Hello " + na);
        JFrame f = new JFrame();
        f.setSize(800, 800);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        f.getContentPane().add(panel);
        spongebob applet = new spongebob();
        applet.setVisible(true);

        panel.add(applet, BorderLayout.CENTER);
        panel.setVisible(true);

        panel.setSize(600, 600);
        applet.init();
        f.pack();
        f.setSize(800, 800);

//		CustomContainer loadGame = new CustomContainer();
//		f.add(loadGame);
        f.setVisible(true);
      //  setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String na = name.getText();
        bean.names=na;
        // JOptionPane.showMessageDialog(null, "Hello " + na);
        JFrame f = new JFrame();
        f.setSize(800, 800);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        f.getContentPane().add(panel);
       gui5 applet = new gui5();
        applet.setVisible(true);

        panel.add(applet, BorderLayout.CENTER);
        panel.setVisible(true);

        panel.setSize(600, 600);
        applet.init();
        f.pack();
        f.setSize(800, 800);

//		CustomContainer loadGame = new CustomContainer();
//		f.add(loadGame);
        f.setVisible(true);
      //  setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String na = name.getText();
        bean.names=na;
        // JOptionPane.showMessageDialog(null, "Hello " + na);
        JFrame f = new JFrame();
        f.setSize(1400, 1400);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        f.getContentPane().add(panel);
      raeman applet = new raeman();
        applet.setVisible(true);

        panel.add(applet, BorderLayout.CENTER);
        panel.setVisible(true);

        panel.setSize(1000, 1000);
        applet.init();
        f.pack();
        f.setSize(1400, 1400);

//		CustomContainer loadGame = new CustomContainer();
//		f.add(loadGame);
        f.setVisible(true);
      //  setVisible(false); //    // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

         String na = name.getText();
        bean.names=na;
        // JOptionPane.showMessageDialog(null, "Hello " + na);
        JFrame f = new JFrame();
        f.setSize(1400, 1400);
        setLayout(new BorderLayout());
        JPanel panel = new JPanel(new BorderLayout());
        f.getContentPane().add(panel);
     fight applet = new fight();
        applet.setVisible(true);

        panel.add(applet, BorderLayout.CENTER);
        panel.setVisible(true);

        panel.setSize(1000, 1000);
        applet.init();
        f.pack();
        f.setSize(1400, 1400);

//		CustomContainer loadGame = new CustomContainer();
//		f.add(loadGame);
        f.setVisible(true);
       // setVisible(false); // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new StartGame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}