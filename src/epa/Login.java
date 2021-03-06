
package epa;
import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import javax.swing.*;

public class Login extends JPanel {

    final int pWidth = 300;
    final int pHeight = 220;
    JMenuBar bar;
    JMenuItem reg;
    JMenu pri;
    
    public Login(JPanel EPAMain, JMenuBar bar,JMenuItem reg, JMenu pri) {
        initComponents();
        this.setSize(pWidth,pHeight);
        int x = (EPAMain.getWidth()-pWidth)/2;
        int y = (EPAMain.getHeight()-pHeight)/2;
        this.setLocation(x,y);
        this.bar=bar;
        this.reg=reg;
        this.pri=pri;
        this.bar.setVisible(false);
        this.reg.setVisible(false);
        this.pri.setVisible(false);
        this.setVisible(true);
        if (utility.DBConnection.getStatus() == true){
            tfIPAddress.setEnabled(false);
            bnConnect.setEnabled(false);
            bnLogin.setEnabled(true);
            tfIPAddress.setText(utility.IPAddress.getAddress());
        }else{
            tfIPAddress.setEnabled(true);
            bnConnect.setEnabled(true);
            bnLogin.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUserCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        bnLogin = new javax.swing.JButton();
        bnCancel = new javax.swing.JButton();
        tfIPAddress = new javax.swing.JTextField();
        bnConnect = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Unathourized Users not allowed");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User Code:");

        tfUserCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfUserCodeFocusLost(evt);
            }
        });
        tfUserCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUserCodeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Password:");

        pfPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pfPasswordKeyPressed(evt);
            }
        });

        bnLogin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnLogin.setText("Login");
        bnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnLoginActionPerformed(evt);
            }
        });
        bnLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                bnLoginKeyPressed(evt);
            }
        });

        bnCancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bnCancel.setText("Cancel");
        bnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnCancelActionPerformed(evt);
            }
        });

        tfIPAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIPAddressActionPerformed(evt);
            }
        });

        bnConnect.setText("Connect");
        bnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnConnectActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("IP Address:");
        jLabel4.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(bnLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bnCancel))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfUserCode)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfIPAddress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bnConnect)
                        .addGap(7, 7, 7))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnConnect)
                    .addComponent(tfIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfUserCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bnLogin)
                    .addComponent(bnCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnLoginActionPerformed
        if (tfUserCode.getText().isEmpty() || pfPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Complete all fieds");
            return;
        }
        String usercode = tfUserCode.getText();
        String pass = pfPassword.getText();
        String password="";
        String sLevel="";
        String s = "select password, level from registration where User_Code='"+usercode+"'";
        try{
            ResultSet rs = utility.DBConnection.getStatement().executeQuery(s);
            while(rs.next()){
                password=rs.getString("password");
                sLevel = rs.getString("level");
            }
            if (pass.equals(password)){
                this.setVisible(false);
                this.bar.setVisible(true);
                if (sLevel.equals("3")){
                    this.pri.setVisible(true);
                    this.reg.setVisible(true);
                }else if (sLevel.equals("2")){
                    this.pri.setVisible(false);
                    this.reg.setVisible(true);
                }else if (sLevel.equals("1")){
                    this.pri.setVisible(false);
                    this.reg.setVisible(false);
                }
            }else{
                JOptionPane.showMessageDialog(null,"Password Mismatch");
                pfPassword.setText("");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
            tfUserCode.setText("");
            pfPassword.setText("");
        }
        
        
    }//GEN-LAST:event_bnLoginActionPerformed

    private void bnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnCancelActionPerformed
        System.exit(0);
    }//GEN-LAST:event_bnCancelActionPerformed

    private void bnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnConnectActionPerformed
        utility.DBConnection.Connection(tfIPAddress.getText().trim());
        if (utility.DBConnection.getStatus()== true){
            tfIPAddress.setEnabled(false);
            bnConnect.setEnabled(false);
            bnLogin.setEnabled(true);
            //saving
            utility.IPAddress.saveAddress(tfIPAddress.getText());
        }else{
            tfIPAddress.setEnabled(true);
            bnConnect.setEnabled(true);
            bnLogin.setEnabled(false);
        }
    }//GEN-LAST:event_bnConnectActionPerformed

    private void bnLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bnLoginKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            bnLogin.doClick();
        }
    }//GEN-LAST:event_bnLoginKeyPressed

    private void pfPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfPasswordKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            bnLogin.doClick();
        }
    }//GEN-LAST:event_pfPasswordKeyPressed

    private void tfUserCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tfUserCodeFocusLost
        tfUserCode.setText(tfUserCode.getText().toUpperCase());
    }//GEN-LAST:event_tfUserCodeFocusLost

    private void tfUserCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUserCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUserCodeActionPerformed

    private void tfIPAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIPAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIPAddressActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnCancel;
    private javax.swing.JButton bnConnect;
    private javax.swing.JButton bnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField tfIPAddress;
    private javax.swing.JTextField tfUserCode;
    // End of variables declaration//GEN-END:variables
}
