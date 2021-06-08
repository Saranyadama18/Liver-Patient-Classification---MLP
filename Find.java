
package Home;

import javax.swing.JOptionPane;

public class Find extends javax.swing.JFrame {

    public Find()
    {
        initComponents();
        System.out.println("Training:\n\n");
        Train t = new Train();
        t.start();
        w11 = t.w11;
        w12 = t.w12;
        w13 = t.w13;
        w14 = t.w14;
        w15 = t.w15;
        w16 = t.w16;
        w17 = t.w17;
        w18 = t.w18;
        w19 = t.w19;
        w110 = t.w110;
        w21 = t.w21;
        w22 = t.w22;
        w23 = t.w23;
        w24 = t.w24;
        w25 = t.w25;
        w26 = t.w26;
        w27 = t.w27;
        w28 = t.w28;
        w29 = t.w29;
        w210 = t.w210;
        System.out.println("\n\nTesting:\n");
        calc();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bw1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bw2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        bw3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        bw4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bw5 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        bw6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        bw7 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bw8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        bw9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        bw10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Liver Patient");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Name:");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Age:");

        bw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Gender:");

        bw2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bw2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Total Bilirubin:");

        bw3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Direct Bilirubin:");

        bw4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw4ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Total Protiens:");

        bw5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bw2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw4, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw5, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Albumin:");

        bw6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw6ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("A/G Ratio:");

        bw7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw7ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("SGPT:");

        bw8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw8ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("SGOT:");

        bw9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw9ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("SGOT:");

        bw10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bw10ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Check");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw6, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw7, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw8, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw9, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bw10, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bw10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        
    }//GEN-LAST:event_nameActionPerformed

    private void bw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw1ActionPerformed

    private void bw3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw3ActionPerformed

    private void bw4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw4ActionPerformed

    private void bw5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw5ActionPerformed

    private void bw6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw6ActionPerformed

    private void bw7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw7ActionPerformed

    private void bw8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw8ActionPerformed

    private void bw9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw9ActionPerformed

    private void bw10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bw10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bw10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        a[0] = bw1.getText();
        a[1] = (String) bw2.getSelectedItem();
        a[2] = bw3.getText();
        a[3] = bw4.getText();
        a[4] = bw5.getText();
        a[5] = bw6.getText();
        a[6] = bw7.getText();
        a[7] = bw8.getText();
        a[8] = bw9.getText();
        a[9] = bw10.getText();
        forh1();
        forh2();
        calc1();
        sub1 = h11 - h1;
        sub2 = h21 - h2;
        String n = name.getText();
        if(sub1 < sub2)
        {
            JOptionPane.showMessageDialog(null,n +" is liver Patient");
        }
        else
        {
            JOptionPane.showMessageDialog(null,n +" is Normal");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void calc()
    {
        w1 = (int) Math.round(w11);
        w2 = (int) Math.round(w12);
        w3 = (int) Math.round(w13);
        w4 = (int) Math.round(w14);
        w5 = (int) Math.round(w15);
        w6 = (int) Math.round(w16);
        w7 = (int) Math.round(w17);
        w8 = (int) Math.round(w18);
        w9 = (int) Math.round(w19);
        w10 = (int) Math.round(w110);
        h1 = w1+w2+w3+w4+w5+w6+w7+w8+w9+w10;
        w1 = (int) Math.round(w21);
        w2 = (int) Math.round(w22);
        w3 = (int) Math.round(w23);
        w4 = (int) Math.round(w24);
        w5 = (int) Math.round(w25);
        w6 = (int) Math.round(w26);
        w7 = (int) Math.round(w27);
        w8 = (int) Math.round(w28);
        w9 = (int) Math.round(w29);
        w10 = (int) Math.round(w210);
        h2 = w1+w2+w3+w4+w5+w6+w7+w8+w9+w10;
    }
    public void calc1()
    {
        w1 = (int) Math.round(w11);
        w2 = (int) Math.round(w12);
        w3 = (int) Math.round(w13);
        w4 = (int) Math.round(w14);
        w5 = (int) Math.round(w15);
        w6 = (int) Math.round(w16);
        w7 = (int) Math.round(w17);
        w8 = (int) Math.round(w18);
        w9 = (int) Math.round(w19);
        w10 = (int) Math.round(w110);
        h11 = w1+w2+w3+w4+w5+w6+w7+w8+w9+w10;
        w1 = (int) Math.round(w21);
        w2 = (int) Math.round(w22);
        w3 = (int) Math.round(w23);
        w4 = (int) Math.round(w24);
        w5 = (int) Math.round(w25);
        w6 = (int) Math.round(w26);
        w7 = (int) Math.round(w27);
        w8 = (int) Math.round(w28);
        w9 = (int) Math.round(w29);
        w10 = (int) Math.round(w210);
        h21 = w1+w2+w3+w4+w5+w6+w7+w8+w9+w10;
    }
    public static void setValues()
    {
        try
        {
            in1 = Double.parseDouble(a[0]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[0]);
            in1 = sim * 1.0;
        }
        if(a[1].equals("Male"))
        {
            in2 = 1.0;
        }
        else
        {
            in2 = 2.0;
        }
        try
        {
            in3 = Double.parseDouble(a[2]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[2]);
            in3 = sim * 1.0;
        }
        try
        {
            in4 = Double.parseDouble(a[3]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[3]);
            in4 = sim * 1.0;
        }
        try
        {
            in5 = Double.parseDouble(a[4]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[4]);
            in5 = sim * 1.0;
        }
        try
        {
            in6 = Double.parseDouble(a[5]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[5]);
            in6 = sim * 1.0;
        }
        try
        {
            in7 = Double.parseDouble(a[6]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[6]);
            in7 = sim * 1.0;
        }
        try
        {
            in8 = Double.parseDouble(a[7]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[7]);
            in8 = sim * 1.0;
        }
        try
        {
            in9 = Double.parseDouble(a[8]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[8]);
            in9 = sim * 1.0;
        }
        try
        {
            in10 = Double.parseDouble(a[9]);
        }catch(Exception e)
        {
            sim = Integer.parseInt(a[9]);
            in10 = sim * 1.0;
        }
    }
    public static Boolean activation()
    {
        int t = 0;
        int val = (int) Math.round(yin);
        if(val > val)
        {
            t = 1;
        }
        else if(val == val)
        {
            t = 0;
        }
        else if(val < val)
        {
            t = -1;
        }
        if(c1 == t)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void update()
    {
        in11 = 1.0;
        w11 = (w11 + (alpha*in11*in1));
        w12 = (w12 + (alpha*in11*in2));
        w13 = (w13 + (alpha*in11*in3));
        w14 = (w14 + (alpha*in11*in4));
        w15 = (w15 + (alpha*in11*in5));
        w16 = (w16 + (alpha*in11*in6));
        w17 = (w17 + (alpha*in11*in7));
        w18 = (w18 + (alpha*in11*in8));
        w19 = (w19 + (alpha*in11*in9));
        w110 = (w110 + (alpha*in11*in10));
        b1 = (b1 + (alpha*in11));
    }
    public static void update1()
    {
        in11 = 2.0;
        w21 = (w21 + (alpha*in11*in1));
        w22 = (w22 + (alpha*in11*in2));
        w23 = (w23 + (alpha*in11*in3));
        w24 = (w24 + (alpha*in11*in4));
        w25 = (w25 + (alpha*in11*in5));
        w26 = (w26 + (alpha*in11*in6));
        w27 = (w27 + (alpha*in11*in7));
        w28 = (w28 + (alpha*in11*in8));
        w29 = (w29 + (alpha*in11*in9));
        w210 = (w210 + (alpha*in11*in10));
        b2 = (b2 + (alpha*in11));
    }
    public void forh1()
    {
        c1 = 1;
        setValues();
        yin = (b1+(in1*w11)+(in2*w12)+(in3*w13)+(in4*w14)+(in5*w15)+(in6*w16)+(in7*w17)+(in8*w18)+(in9*w19)+(in10*w110));
        Boolean bool = activation();
        if(bool)
            {
                update();
            }
        iter++;
            if(iter <100)
            {
                forh1();
            }
    }
    public void forh2()
    {
        c1 = 2;
        setValues();
        yin = (b2+(in1*w21)+(in2*w22)+(in3*w23)+(in4*w24)+(in5*w25)+(in6*w26)+(in7*w27)+(in8*w28)+(in9*w29)+(in10*w210));
        Boolean bool = activation();
        if(bool)
            {
                update1();
            }
        iter1++;
            if(iter1 <100)
            {
                forh2();
            }
    }
    static int c1,sub1,sub2;
    static int alpha = 1,i=0,iter=0,iter1=0;
    static Double yin = null;
    static Double w11,w12,w13,w14,w15,w16,w17,w18,w19,w110;
    static Double w21,w22,w23,w24,w25,w26,w27,w28,w29,w210;
    static int w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,h1,h2,h11,h21;
    static Double in1=null,in2=null,in3=null,in4=null,in5=null,in6=null,in7=null,in8=null,in9=null,in10=null,in11=null,b1=0.0,b2=0.0;
    static int sim=0,thi=0;
    static String[] a = new String[11];
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Find().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bw1;
    private javax.swing.JTextField bw10;
    private javax.swing.JComboBox<String> bw2;
    private javax.swing.JTextField bw3;
    private javax.swing.JTextField bw4;
    private javax.swing.JTextField bw5;
    private javax.swing.JTextField bw6;
    private javax.swing.JTextField bw7;
    private javax.swing.JTextField bw8;
    private javax.swing.JTextField bw9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
