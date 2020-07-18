/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmanagement;

import hotelmanagement.Room;

/**
 *
 * @author Maryam
 */
public class RoomForm extends javax.swing.JFrame {
    User u;
    Room r;
    public RoomForm() {
        initComponents();
    }
    public RoomForm(User u) {
        initComponents();
        this.u = u;
         r = new Room(u);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SingleBedRoomButton = new javax.swing.JCheckBox();
        kingSizedBedRoomButton = new javax.swing.JCheckBox();
        PentHouseButton = new javax.swing.JCheckBox();
        SuiteButton = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BookRoomButton = new javax.swing.JButton();
        ResetButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SingleBedRoomButton.setBackground(new java.awt.Color(56, 173, 169));
        SingleBedRoomButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        SingleBedRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        SingleBedRoomButton.setText("Single-Bed Room");
        SingleBedRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SingleBedRoomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SingleBedRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 152, 200, -1));

        kingSizedBedRoomButton.setBackground(new java.awt.Color(56, 173, 169));
        kingSizedBedRoomButton.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        kingSizedBedRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        kingSizedBedRoomButton.setText("King-Sized Bed Room");
        kingSizedBedRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kingSizedBedRoomButtonActionPerformed(evt);
            }
        });
        getContentPane().add(kingSizedBedRoomButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 230, -1));

        PentHouseButton.setBackground(new java.awt.Color(56, 173, 169));
        PentHouseButton.setForeground(new java.awt.Color(255, 255, 255));
        PentHouseButton.setText("Pent House");
        PentHouseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PentHouseButtonActionPerformed(evt);
            }
        });
        getContentPane().add(PentHouseButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 272, -1, -1));

        SuiteButton.setBackground(new java.awt.Color(56, 173, 169));
        SuiteButton.setForeground(new java.awt.Color(255, 255, 255));
        SuiteButton.setText("Suite");
        SuiteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuiteButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SuiteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 333, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rooms");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 109, 139, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Prices");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 109, 139, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("2,500");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 161, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("6,000");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 219, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("10,000");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 342, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("10,000");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 281, -1, -1));

        jPanel1.setBackground(new java.awt.Color(56, 173, 169));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Room Categories");

        BookRoomButton.setBackground(new java.awt.Color(56, 173, 169));
        BookRoomButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        BookRoomButton.setForeground(new java.awt.Color(255, 255, 255));
        BookRoomButton.setText("BOOK ROOM");
        BookRoomButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        BookRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookRoomButtonActionPerformed(evt);
            }
        });

        ResetButton.setBackground(new java.awt.Color(56, 173, 169));
        ResetButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        ResetButton.setForeground(new java.awt.Color(255, 255, 255));
        ResetButton.setText("RESET");
        ResetButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        ResetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetButtonActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(56, 173, 169));
        CancelButton.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(255, 255, 255));
        CancelButton.setText("CANCEL");
        CancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(BookRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BookRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SingleBedRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SingleBedRoomButtonActionPerformed
    
        if(SingleBedRoomButton.isSelected()  ){
      
          if(r.isSingleBedAvailable())
              r.BookSingleBedroom();
      
      }
          
          
    }//GEN-LAST:event_SingleBedRoomButtonActionPerformed

    private void kingSizedBedRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kingSizedBedRoomButtonActionPerformed
     
        if(kingSizedBedRoomButton.isSelected()  ){
      
          if(r.isKingSizedAvailable())
              r.BookKingSizedBedroom();
      
      }
    }//GEN-LAST:event_kingSizedBedRoomButtonActionPerformed

    private void PentHouseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PentHouseButtonActionPerformed
       if(PentHouseButton.isSelected()  ){
      
          if(r.isPentHouseAvailable())
              r.BookPentHouse();
      
      }
        
    }//GEN-LAST:event_PentHouseButtonActionPerformed

    private void SuiteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuiteButtonActionPerformed
    if(SuiteButton.isSelected()  ){
      
          if(r.isSuiteAvailable())
              r.BookSuite();
      
      }
        
    }//GEN-LAST:event_SuiteButtonActionPerformed

    private void BookRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookRoomButtonActionPerformed
        if(SingleBedRoomButton.isSelected()  ){
      
          if(r.isSingleBedAvailable())
              r.BookSingleBedroom();
      
      }
        if(kingSizedBedRoomButton.isSelected()  ){
      
          if(r.isKingSizedAvailable())
              r.BookKingSizedBedroom();
      
      }
        if(PentHouseButton.isSelected()  ){
      
          if(r.isPentHouseAvailable())
              r.BookPentHouse();
      
      }
       if(SuiteButton.isSelected()  ){
      
          if(r.isSuiteAvailable())
              r.BookSuite();
      
      }
       TotalRooms tr = new TotalRooms(r,u);
     tr.setVisible(true);
     tr.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_BookRoomButtonActionPerformed

    private void ResetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetButtonActionPerformed
       SingleBedRoomButton.setSelected(false);
       kingSizedBedRoomButton.setSelected(false);
       PentHouseButton.setSelected(false);
       SuiteButton.setSelected(false);
      
    }//GEN-LAST:event_ResetButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
      this.hide();
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookRoomButton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JCheckBox PentHouseButton;
    private javax.swing.JButton ResetButton;
    private javax.swing.JCheckBox SingleBedRoomButton;
    private javax.swing.JCheckBox SuiteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox kingSizedBedRoomButton;
    // End of variables declaration//GEN-END:variables
}
