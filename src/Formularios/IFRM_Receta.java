package Formularios;

public class IFRM_Receta extends javax.swing.JInternalFrame {

    public IFRM_Receta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbl_Nombre = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        lbl_Anos = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();
        txt_FrecuenciaCard = new javax.swing.JTextField();
        txtFrecuenciaCard = new javax.swing.JLabel();
        lbl_FrecuenciaResp = new javax.swing.JLabel();
        txt_FrecuenciaResp = new javax.swing.JTextField();
        txt_PresionArterialS = new javax.swing.JTextField();
        lbl_PresionArterial = new javax.swing.JLabel();
        txt_PresionArterialD = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_Celsius = new javax.swing.JLabel();
        txt_Temperatura = new javax.swing.JTextField();
        lbl_Temperatura = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea_Receta = new javax.swing.JTextArea();
        lbl_Diagnostico = new javax.swing.JLabel();
        txt_Diagnostico = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Receta");

        bg.setBackground(new java.awt.Color(255, 227, 151));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("RECETA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, -1, 40));

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 40));

        lbl_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Nombre.setText("Nombre:");
        bg.add(lbl_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 30));

        txt_Nombre.setEditable(false);
        txt_Nombre.setBackground(new java.awt.Color(255, 255, 255));
        txt_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        bg.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 430, 30));

        lbl_Anos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Anos.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Anos.setText("años");
        bg.add(lbl_Anos, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, 40, 30));

        txt_Edad.setEditable(false);
        txt_Edad.setBackground(new java.awt.Color(255, 255, 255));
        txt_Edad.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Edad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Edad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_Edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EdadActionPerformed(evt);
            }
        });
        bg.add(txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 60, 40, 30));

        txt_FrecuenciaCard.setEditable(false);
        txt_FrecuenciaCard.setBackground(new java.awt.Color(255, 255, 255));
        txt_FrecuenciaCard.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_FrecuenciaCard.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FrecuenciaCard.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_FrecuenciaCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FrecuenciaCardActionPerformed(evt);
            }
        });
        bg.add(txt_FrecuenciaCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 40, 30));

        txtFrecuenciaCard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtFrecuenciaCard.setForeground(new java.awt.Color(51, 51, 51));
        txtFrecuenciaCard.setText("F.C");
        bg.add(txtFrecuenciaCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, 30));

        lbl_FrecuenciaResp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_FrecuenciaResp.setForeground(new java.awt.Color(51, 51, 51));
        lbl_FrecuenciaResp.setText("F.R");
        bg.add(lbl_FrecuenciaResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, -1, 30));

        txt_FrecuenciaResp.setEditable(false);
        txt_FrecuenciaResp.setBackground(new java.awt.Color(255, 255, 255));
        txt_FrecuenciaResp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_FrecuenciaResp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_FrecuenciaResp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_FrecuenciaResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_FrecuenciaRespActionPerformed(evt);
            }
        });
        bg.add(txt_FrecuenciaResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 40, 30));

        txt_PresionArterialS.setEditable(false);
        txt_PresionArterialS.setBackground(new java.awt.Color(255, 255, 255));
        txt_PresionArterialS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_PresionArterialS.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PresionArterialS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_PresionArterialS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PresionArterialSActionPerformed(evt);
            }
        });
        bg.add(txt_PresionArterialS, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 40, 30));

        lbl_PresionArterial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_PresionArterial.setForeground(new java.awt.Color(51, 51, 51));
        lbl_PresionArterial.setText("P.A");
        bg.add(lbl_PresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 40, 30));

        txt_PresionArterialD.setEditable(false);
        txt_PresionArterialD.setBackground(new java.awt.Color(255, 255, 255));
        txt_PresionArterialD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_PresionArterialD.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_PresionArterialD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_PresionArterialD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PresionArterialDActionPerformed(evt);
            }
        });
        bg.add(txt_PresionArterialD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, 40, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("/");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, 30));

        txt_Celsius.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_Celsius.setForeground(new java.awt.Color(51, 51, 51));
        txt_Celsius.setText("°C");
        bg.add(txt_Celsius, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 20, 30));

        txt_Temperatura.setEditable(false);
        txt_Temperatura.setBackground(new java.awt.Color(255, 255, 255));
        txt_Temperatura.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Temperatura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_Temperatura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_Temperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_TemperaturaActionPerformed(evt);
            }
        });
        bg.add(txt_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 100, 40, 30));

        lbl_Temperatura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Temperatura.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Temperatura.setText("Temp");
        bg.add(lbl_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 60, 30));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        txtArea_Receta.setEditable(false);
        txtArea_Receta.setBackground(new java.awt.Color(255, 255, 255));
        txtArea_Receta.setColumns(20);
        txtArea_Receta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtArea_Receta.setForeground(new java.awt.Color(51, 51, 51));
        txtArea_Receta.setRows(5);
        jScrollPane1.setViewportView(txtArea_Receta);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 590, 250));

        lbl_Diagnostico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Diagnostico.setForeground(new java.awt.Color(51, 51, 51));
        lbl_Diagnostico.setText("Diagnóstico:");
        bg.add(lbl_Diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

        txt_Diagnostico.setEditable(false);
        txt_Diagnostico.setBackground(new java.awt.Color(255, 255, 255));
        txt_Diagnostico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_Diagnostico.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        txt_Diagnostico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DiagnosticoActionPerformed(evt);
            }
        });
        bg.add(txt_Diagnostico, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 410, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
        
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txt_EdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EdadActionPerformed

    private void txt_FrecuenciaCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FrecuenciaCardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FrecuenciaCardActionPerformed

    private void txt_FrecuenciaRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_FrecuenciaRespActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_FrecuenciaRespActionPerformed

    private void txt_PresionArterialSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PresionArterialSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PresionArterialSActionPerformed

    private void txt_PresionArterialDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PresionArterialDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PresionArterialDActionPerformed

    private void txt_TemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_TemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_TemperaturaActionPerformed

    private void txt_DiagnosticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DiagnosticoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DiagnosticoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_Anos;
    private javax.swing.JLabel lbl_Diagnostico;
    private javax.swing.JLabel lbl_FrecuenciaResp;
    private javax.swing.JLabel lbl_Nombre;
    private javax.swing.JLabel lbl_PresionArterial;
    private javax.swing.JLabel lbl_Temperatura;
    public static javax.swing.JTextArea txtArea_Receta;
    private javax.swing.JLabel txtFrecuenciaCard;
    private javax.swing.JLabel txt_Celsius;
    public static javax.swing.JTextField txt_Diagnostico;
    public static javax.swing.JTextField txt_Edad;
    public static javax.swing.JTextField txt_FrecuenciaCard;
    public static javax.swing.JTextField txt_FrecuenciaResp;
    public static javax.swing.JTextField txt_Nombre;
    public static javax.swing.JTextField txt_PresionArterialD;
    public static javax.swing.JTextField txt_PresionArterialS;
    public static javax.swing.JTextField txt_Temperatura;
    // End of variables declaration//GEN-END:variables
}
