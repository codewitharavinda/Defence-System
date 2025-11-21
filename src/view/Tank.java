package view;

import controller.ControlRoom;
import obs.Observer;

public class Tank extends javax.swing.JFrame implements Observer{
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Tank.class.getName());
    
    private ControlRoom controlroom;
    
    public Tank(ControlRoom controlRoom) {
        initComponents();
        setVisible(true);
        this.controlroom=controlRoom;
        
        btnTankRedar.setEnabled(false);
        btnTankMissile.setEnabled(false);
        btnTankShoot.setEnabled(false);
        btnTankRotate.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnTankSolider = new javax.swing.JSpinner();
        spnTankAmmo = new javax.swing.JSpinner();
        txtTankArea = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnTankShoot = new javax.swing.JButton();
        btnTankMissile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnTankRedar = new javax.swing.JButton();
        txtFieldTank = new javax.swing.JTextField();
        btnTankSend = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTankMessage = new javax.swing.JTextArea();
        sldTank = new javax.swing.JSlider();
        btnTankRotate = new javax.swing.JButton();
        btnTankPosition = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtTankArea.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtTankArea.setText("Area Not Cleared");

        jLabel2.setText("Ammo Count");

        btnTankShoot.setText("Shoot");

        btnTankMissile.setText("Missile Operation");
        btnTankMissile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankMissileActionPerformed(evt);
            }
        });

        jLabel3.setText("Solider Count");

        btnTankRedar.setText("Redar Operation");
        btnTankRedar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankRedarActionPerformed(evt);
            }
        });

        btnTankSend.setText("Send");
        btnTankSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankSendActionPerformed(evt);
            }
        });

        txtTankMessage.setColumns(20);
        txtTankMessage.setRows(5);
        jScrollPane1.setViewportView(txtTankMessage);

        sldTank.setMajorTickSpacing(20);
        sldTank.setOrientation(javax.swing.JSlider.VERTICAL);
        sldTank.setPaintLabels(true);
        sldTank.setPaintTicks(true);

        btnTankRotate.setText("Rotate Operation");
        btnTankRotate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankRotateActionPerformed(evt);
            }
        });

        btnTankPosition.setText("Position");
        btnTankPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTankPositionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtFieldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnTankSend, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnTankShoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnTankRedar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(btnTankRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnTankMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1))))
                                .addComponent(txtTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(spnTankSolider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(btnTankPosition, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(sldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(txtTankArea, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTankShoot, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTankMissile, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTankRedar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTankRotate, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnTankSolider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnTankAmmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTankPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTankSend, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sldTank, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTankMissileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankMissileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankMissileActionPerformed

    private void btnTankRedarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankRedarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankRedarActionPerformed

    private void btnTankSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankSendActionPerformed
        String Msg = "Tank: " + txtFieldTank.getText();
        MainController.sendMsgTo(Msg);
        txtFieldTank.setText("");
    }//GEN-LAST:event_btnTankSendActionPerformed

    private void btnTankRotateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankRotateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTankRotateActionPerformed

    private void btnTankPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTankPositionActionPerformed
        if(!(btnTankPosition.isSelected())){
                btnTankShoot.setEnabled(false);
                btnTankMissile.setEnabled(false);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
        }
    }//GEN-LAST:event_btnTankPositionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTankMissile;
    private javax.swing.JCheckBox btnTankPosition;
    private javax.swing.JButton btnTankRedar;
    private javax.swing.JButton btnTankRotate;
    private javax.swing.JButton btnTankSend;
    private javax.swing.JButton btnTankShoot;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider sldTank;
    private javax.swing.JSpinner spnTankAmmo;
    private javax.swing.JSpinner spnTankSolider;
    private javax.swing.JTextField txtFieldTank;
    private javax.swing.JLabel txtTankArea;
    private javax.swing.JTextArea txtTankMessage;
    // End of variables declaration//GEN-END:variables

    @Override
    public void areaClear(boolean AreaClear) {
        if (AreaClear) {
            txtTankArea.setText("Area Cleared");
        }else{
            txtTankArea.setText("Area Not Cleared");
        }
    }

    @Override
    public void getMsg(String Msg) {
        txtTankMessage.append("Main Controller: " + Msg +"\n");
    }

    @Override
    public void setPosition(int position) {
        if (btnTankPosition.isSelected()){
            //Assending
            if (position>80){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankRedar.setEnabled(true);
                btnTankRotate.setEnabled(true);
            
            } else if (position>60){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankRedar.setEnabled(true);
                btnTankRotate.setEnabled(false);
            
            } else if (position>40){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
             
            } else if (position>20){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(false);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
            }
            
            //disending
            if (position<20){
                btnTankShoot.setEnabled(false);
                btnTankMissile.setEnabled(false);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
            
            } else if (position<40){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(false);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
            
            } else if (position<60){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankRedar.setEnabled(false);
                btnTankRotate.setEnabled(false);
             
            } else if (position<80){
                btnTankShoot.setEnabled(true);
                btnTankMissile.setEnabled(true);
                btnTankRedar.setEnabled(true);
                btnTankRotate.setEnabled(false);
            }
        }

    }

    @Override
    public void setPrvtMsg(String name, String msg) {
        if("Tank".equals(name)){
            txtTankMessage.append("Main Controller: " + msg +"\n"); 
        }
    }
    
}
