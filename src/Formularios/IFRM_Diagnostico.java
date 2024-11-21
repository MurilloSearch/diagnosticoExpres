package Formularios;

import Clases_Modelo.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class IFRM_Diagnostico extends javax.swing.JInternalFrame {

    IFRM_Receta IFRM_Receta = null;

    public IFRM_Diagnostico() {
        initComponents();
        CBox_DolorIntenso.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        panelAzul1 = new javax.swing.JPanel();
        jLabel_DiagnosticoExpress = new javax.swing.JLabel();
        jLabel_Edad = new javax.swing.JLabel();
        Txt_Edad = new javax.swing.JTextField();
        jLabel_FrecuenciaCar = new javax.swing.JLabel();
        Txt_FrecuenciaCar = new javax.swing.JTextField();
        jLabel_FrecuenciaResp = new javax.swing.JLabel();
        Txt_FrecuenciaResp = new javax.swing.JTextField();
        jLabel_PresionArterial = new javax.swing.JLabel();
        Txt_PresionArterialS = new javax.swing.JTextField();
        jLabel_DivisorPresionArterial = new javax.swing.JLabel();
        Txt_PresionArterialD = new javax.swing.JTextField();
        jLabel_Temperatura = new javax.swing.JLabel();
        Txt_Temperatura = new javax.swing.JTextField();
        jLabel_C = new javax.swing.JLabel();
        panelAzul2 = new javax.swing.JPanel();
        jLabel_SeleccioneSintomas = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_Limpiar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Nombre = new javax.swing.JLabel();
        Txt_Nombre = new javax.swing.JTextField();
        jLabel_ApellidoPat = new javax.swing.JLabel();
        Txt_ApellidoPat = new javax.swing.JTextField();
        jLabel_ApellidoMat = new javax.swing.JLabel();
        Txt_ApellidoMat = new javax.swing.JTextField();
        btn_Generar1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        CBox_DolorIntenso = new javax.swing.JCheckBox();
        CBox_DolorAlOrinar = new javax.swing.JCheckBox();
        CBox_Fiebre = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        CBox_Vomito = new javax.swing.JCheckBox();
        CBox_Diarrea = new javax.swing.JCheckBox();
        CBox_Colico = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        CBox_Tos = new javax.swing.JCheckBox();
        CBox_DolorDeGarganta = new javax.swing.JCheckBox();
        CBox_EscurrimientoNasal = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setTitle("Diagnostico");

        bg.setBackground(new java.awt.Color(248, 248, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelAzul1.setBackground(new java.awt.Color(64, 89, 173));
        panelAzul1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_DiagnosticoExpress.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_DiagnosticoExpress.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_DiagnosticoExpress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_DiagnosticoExpress.setText("Diagnóstico EXPRESS");
        panelAzul1.add(jLabel_DiagnosticoExpress, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 250, 40));

        bg.add(panelAzul1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 40));

        jLabel_Edad.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Edad.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Edad.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Edad.setText("Edad:");
        bg.add(jLabel_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 50, 40));

        Txt_Edad.setBackground(new java.awt.Color(218, 218, 218));
        Txt_Edad.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_Edad.setForeground(new java.awt.Color(51, 51, 51));
        Txt_Edad.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Edad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_Edad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_EdadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_EdadKeyTyped(evt);
            }
        });
        bg.add(Txt_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 50, 40));

        jLabel_FrecuenciaCar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FrecuenciaCar.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_FrecuenciaCar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FrecuenciaCar.setText("F.C");
        bg.add(jLabel_FrecuenciaCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 30, 40));

        Txt_FrecuenciaCar.setBackground(new java.awt.Color(218, 218, 218));
        Txt_FrecuenciaCar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_FrecuenciaCar.setForeground(new java.awt.Color(51, 51, 51));
        Txt_FrecuenciaCar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_FrecuenciaCar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_FrecuenciaCar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_FrecuenciaCarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_FrecuenciaCarKeyTyped(evt);
            }
        });
        bg.add(Txt_FrecuenciaCar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 100, 50, 40));

        jLabel_FrecuenciaResp.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_FrecuenciaResp.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_FrecuenciaResp.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_FrecuenciaResp.setText("F.R");
        bg.add(jLabel_FrecuenciaResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 30, 40));

        Txt_FrecuenciaResp.setBackground(new java.awt.Color(218, 218, 218));
        Txt_FrecuenciaResp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_FrecuenciaResp.setForeground(new java.awt.Color(51, 51, 51));
        Txt_FrecuenciaResp.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_FrecuenciaResp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_FrecuenciaResp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_FrecuenciaRespKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_FrecuenciaRespKeyTyped(evt);
            }
        });
        bg.add(Txt_FrecuenciaResp, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 50, 40));

        jLabel_PresionArterial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_PresionArterial.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_PresionArterial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_PresionArterial.setText("P.A");
        bg.add(jLabel_PresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, 30, 40));

        Txt_PresionArterialS.setBackground(new java.awt.Color(218, 218, 218));
        Txt_PresionArterialS.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_PresionArterialS.setForeground(new java.awt.Color(51, 51, 51));
        Txt_PresionArterialS.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_PresionArterialS.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_PresionArterialS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_PresionArterialSKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_PresionArterialSKeyTyped(evt);
            }
        });
        bg.add(Txt_PresionArterialS, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 50, 40));

        jLabel_DivisorPresionArterial.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_DivisorPresionArterial.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_DivisorPresionArterial.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_DivisorPresionArterial.setText("/");
        bg.add(jLabel_DivisorPresionArterial, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 10, 40));

        Txt_PresionArterialD.setBackground(new java.awt.Color(218, 218, 218));
        Txt_PresionArterialD.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_PresionArterialD.setForeground(new java.awt.Color(51, 51, 51));
        Txt_PresionArterialD.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_PresionArterialD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_PresionArterialD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_PresionArterialDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_PresionArterialDKeyTyped(evt);
            }
        });
        bg.add(Txt_PresionArterialD, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 50, 40));

        jLabel_Temperatura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Temperatura.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Temperatura.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Temperatura.setText("Temp");
        bg.add(jLabel_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 50, 40));

        Txt_Temperatura.setBackground(new java.awt.Color(218, 218, 218));
        Txt_Temperatura.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_Temperatura.setForeground(new java.awt.Color(51, 51, 51));
        Txt_Temperatura.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Txt_Temperatura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_Temperatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_TemperaturaKeyTyped(evt);
            }
        });
        bg.add(Txt_Temperatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 50, 40));

        jLabel_C.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_C.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_C.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_C.setText("°C");
        bg.add(jLabel_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 20, 40));

        panelAzul2.setBackground(new java.awt.Color(83, 103, 184));
        panelAzul2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_SeleccioneSintomas.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel_SeleccioneSintomas.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_SeleccioneSintomas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SeleccioneSintomas.setText("Seleccione los síntomas que presente");
        panelAzul2.add(jLabel_SeleccioneSintomas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, -1, 40));

        bg.add(panelAzul2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 690, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("F.C (Frecuencia Cardiaca). F.R (Frecuencia Respiratoria). P.A (Presión Arterial). Temp (Temperatura en °Celsius)");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, -1));

        btn_Limpiar.setBackground(new java.awt.Color(51, 64, 138));
        btn_Limpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });
        bg.add(btn_Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 480, 150, 40));

        jPanel1.setBackground(new java.awt.Color(248, 248, 255));

        jLabel_Nombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_Nombre.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Nombre.setText("Nombre/s:");

        Txt_Nombre.setBackground(new java.awt.Color(218, 218, 218));
        Txt_Nombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_Nombre.setForeground(new java.awt.Color(51, 51, 51));
        Txt_Nombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Txt_Nombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreKeyTyped(evt);
            }
        });

        jLabel_ApellidoPat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_ApellidoPat.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_ApellidoPat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ApellidoPat.setText("Apellido Paterno:");

        Txt_ApellidoPat.setBackground(new java.awt.Color(218, 218, 218));
        Txt_ApellidoPat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_ApellidoPat.setForeground(new java.awt.Color(51, 51, 51));
        Txt_ApellidoPat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Txt_ApellidoPat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_ApellidoPat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_ApellidoPatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidoPatKeyTyped(evt);
            }
        });

        jLabel_ApellidoMat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_ApellidoMat.setForeground(new java.awt.Color(51, 51, 51));
        jLabel_ApellidoMat.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ApellidoMat.setText("Apellido Materno:");

        Txt_ApellidoMat.setBackground(new java.awt.Color(218, 218, 218));
        Txt_ApellidoMat.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Txt_ApellidoMat.setForeground(new java.awt.Color(51, 51, 51));
        Txt_ApellidoMat.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Txt_ApellidoMat.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Txt_ApellidoMat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_ApellidoMatKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_ApellidoMatKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel_ApellidoPat)
                        .addGap(8, 8, 8)
                        .addComponent(Txt_ApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_ApellidoMat)
                        .addGap(8, 8, 8)
                        .addComponent(Txt_ApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApellidoPat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_ApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_ApellidoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 360, 160));

        btn_Generar1.setBackground(new java.awt.Color(51, 64, 138));
        btn_Generar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Generar1.setForeground(new java.awt.Color(255, 255, 255));
        btn_Generar1.setText("Generar");
        btn_Generar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_Generar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Generar1ActionPerformed(evt);
            }
        });
        bg.add(btn_Generar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 480, 150, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Sintomas Urinarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        CBox_DolorIntenso.setBackground(new java.awt.Color(204, 204, 255));
        CBox_DolorIntenso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_DolorIntenso.setForeground(new java.awt.Color(51, 51, 51));
        CBox_DolorIntenso.setText("Dolor Intenso");

        CBox_DolorAlOrinar.setBackground(new java.awt.Color(204, 204, 255));
        CBox_DolorAlOrinar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_DolorAlOrinar.setForeground(new java.awt.Color(51, 51, 51));
        CBox_DolorAlOrinar.setText("Dolor al orinar");
        CBox_DolorAlOrinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_DolorAlOrinarActionPerformed(evt);
            }
        });

        CBox_Fiebre.setBackground(new java.awt.Color(204, 204, 255));
        CBox_Fiebre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_Fiebre.setForeground(new java.awt.Color(51, 51, 51));
        CBox_Fiebre.setText("Fiebre");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBox_DolorIntenso)
                    .addComponent(CBox_DolorAlOrinar)
                    .addComponent(CBox_Fiebre))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBox_Fiebre)
                .addGap(18, 18, 18)
                .addComponent(CBox_DolorAlOrinar)
                .addGap(18, 18, 18)
                .addComponent(CBox_DolorIntenso)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 200, 190));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Sintomas Estomacales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        CBox_Vomito.setBackground(new java.awt.Color(204, 204, 255));
        CBox_Vomito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_Vomito.setForeground(new java.awt.Color(51, 51, 51));
        CBox_Vomito.setText("Vómito");

        CBox_Diarrea.setBackground(new java.awt.Color(204, 204, 255));
        CBox_Diarrea.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_Diarrea.setForeground(new java.awt.Color(51, 51, 51));
        CBox_Diarrea.setText("Diarrea");

        CBox_Colico.setBackground(new java.awt.Color(204, 204, 255));
        CBox_Colico.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_Colico.setForeground(new java.awt.Color(51, 51, 51));
        CBox_Colico.setText("Cólico");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CBox_Diarrea, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBox_Vomito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBox_Colico, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBox_Colico)
                .addGap(18, 18, 18)
                .addComponent(CBox_Vomito)
                .addGap(18, 18, 18)
                .addComponent(CBox_Diarrea)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 180, 190));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)), "Sintomas Respiratorios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12))); // NOI18N

        CBox_Tos.setBackground(new java.awt.Color(204, 204, 255));
        CBox_Tos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_Tos.setForeground(new java.awt.Color(51, 51, 51));
        CBox_Tos.setText("Tos");

        CBox_DolorDeGarganta.setBackground(new java.awt.Color(204, 204, 255));
        CBox_DolorDeGarganta.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_DolorDeGarganta.setForeground(new java.awt.Color(51, 51, 51));
        CBox_DolorDeGarganta.setText("Dolor de garganta");

        CBox_EscurrimientoNasal.setBackground(new java.awt.Color(204, 204, 255));
        CBox_EscurrimientoNasal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CBox_EscurrimientoNasal.setForeground(new java.awt.Color(51, 51, 51));
        CBox_EscurrimientoNasal.setText("Escurrimiento nasal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBox_Tos)
                    .addComponent(CBox_DolorDeGarganta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CBox_EscurrimientoNasal))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CBox_Tos)
                .addGap(18, 18, 18)
                .addComponent(CBox_DolorDeGarganta)
                .addGap(18, 18, 18)
                .addComponent(CBox_EscurrimientoNasal)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        bg.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 210, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CBox_DolorAlOrinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_DolorAlOrinarActionPerformed
        if (CBox_DolorAlOrinar.isSelected()) {
            CBox_DolorIntenso.setEnabled(true);
        } else {
            CBox_DolorIntenso.setEnabled(false);
            CBox_DolorIntenso.setSelected(false);
        }
    }//GEN-LAST:event_CBox_DolorAlOrinarActionPerformed

    private void Txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyTyped
        LettersOnly(evt);
        if (Txt_Nombre.getText().length() >= 25) {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_NombreKeyTyped

    private void Txt_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_ApellidoPat.requestFocus();
        }
    }//GEN-LAST:event_Txt_NombreKeyPressed

    private void Txt_ApellidoPatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoPatKeyTyped
        LettersOnly(evt);
        if (Txt_ApellidoPat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_ApellidoPatKeyTyped

    private void Txt_ApellidoPatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoPatKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_ApellidoMat.requestFocus();
        }
    }//GEN-LAST:event_Txt_ApellidoPatKeyPressed

    private void Txt_ApellidoMatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoMatKeyTyped
        LettersOnly(evt);
        if (Txt_ApellidoMat.getText().length() >= 15) {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_ApellidoMatKeyTyped

    private void Txt_ApellidoMatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_ApellidoMatKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_Edad.requestFocus();
        }
    }//GEN-LAST:event_Txt_ApellidoMatKeyPressed

    private void Txt_EdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_EdadKeyTyped
        if (Txt_Edad.getText().length() >= 2) {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_EdadKeyTyped

    private void Txt_EdadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_EdadKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_FrecuenciaCar.requestFocus();
        }
    }//GEN-LAST:event_Txt_EdadKeyPressed

    private void Txt_FrecuenciaCarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FrecuenciaCarKeyTyped
        if (Txt_FrecuenciaCar.getText().length() >= 3) {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_FrecuenciaCarKeyTyped

    private void Txt_FrecuenciaCarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FrecuenciaCarKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_FrecuenciaResp.requestFocus();
        }
    }//GEN-LAST:event_Txt_FrecuenciaCarKeyPressed

    private void Txt_FrecuenciaRespKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FrecuenciaRespKeyTyped
        if (Txt_FrecuenciaResp.getText().length() >= 3) {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_FrecuenciaRespKeyTyped

    private void Txt_FrecuenciaRespKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_FrecuenciaRespKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_PresionArterialS.requestFocus();
        }
    }//GEN-LAST:event_Txt_FrecuenciaRespKeyPressed

    private void Txt_PresionArterialSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PresionArterialSKeyTyped
        if (Txt_PresionArterialS.getText().length() >= 3) {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_PresionArterialSKeyTyped

    private void Txt_PresionArterialSKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PresionArterialSKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_PresionArterialD.requestFocus();
        }
    }//GEN-LAST:event_Txt_PresionArterialSKeyPressed

    private void Txt_PresionArterialDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PresionArterialDKeyTyped
        if (Txt_PresionArterialD.getText().length() >= 3) {
            evt.consume();
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_PresionArterialDKeyTyped

    private void Txt_PresionArterialDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_PresionArterialDKeyPressed
        if (evt.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER) {
            Txt_Temperatura.requestFocus();
        }    }//GEN-LAST:event_Txt_PresionArterialDKeyPressed

    private void Txt_TemperaturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_TemperaturaKeyTyped
        if (Txt_Temperatura.getText().length() >= 4) {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && !Txt_Temperatura.getText().contains(".")) {
            return;
        }
        if (evt.getKeyChar() < '0') {
            evt.consume();
        }
        if (evt.getKeyChar() > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_Txt_TemperaturaKeyTyped

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        Limpiar_Formulario();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_Generar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Generar1ActionPerformed
        GenerarReceta();
    }//GEN-LAST:event_btn_Generar1ActionPerformed

    private void GenerarReceta() {
        // Variables Datos del Paciente
        String nombre, apellidoPat, apellidoMat;
        int edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD;
        float temperatura;
        boolean CBoxes = false;

        // Variables para Tipo de Enfermedad
        int Estomacal;
        int Respiratorio;
        int Urinario;

        // Variables de Sintomas
        int Diarrea = 0, Vomito = 0, Colico = 0;
        int DolorGarganta = 0, EscurrimientoNasal = 0, Tos = 0;
        int DolorOrinar = 0, Fiebre = 0, DolorIntenso = 0;

        // Entrada de datos
        nombre = Txt_Nombre.getText();
        if (nombre.isEmpty() || nombre.length() > 18) {
            Txt_Nombre.setText(null);
            Txt_Nombre.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Introduzca un nombre valido.", "Nombre(s)", HEIGHT);
            return;
        }
        apellidoPat = Txt_ApellidoPat.getText();
        if (apellidoPat.isEmpty() || apellidoPat.length() > 12) {
            Txt_ApellidoPat.setText(null);
            Txt_ApellidoPat.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Introduzca un apellido paterno valido.", "Apellido Paterno", HEIGHT);
            return;
        }
        apellidoMat = Txt_ApellidoMat.getText();
        if (apellidoMat.isEmpty() || apellidoMat.length() > 12) {
            Txt_ApellidoMat.setText(null);
            Txt_ApellidoMat.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Introduzca un apellido materno valido.", "Apellido Materno", HEIGHT);
            return;
        }

        // Edad
        try {
            edad = Integer.parseInt(Txt_Edad.getText());
            if (edad > 99) {
                Txt_Edad.setText(null);
                Txt_Edad.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (<99)", "Edad", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_Edad.setText(null);
            Txt_Edad.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Edad", HEIGHT);
            return;
        }

        // Frecuencia Cardíaca
        try {
            frecuenciaC = Integer.parseInt(Txt_FrecuenciaCar.getText());
            if (frecuenciaC > 300 || frecuenciaC < 30) {
                Txt_FrecuenciaCar.setText(null);
                Txt_FrecuenciaCar.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (>30, <300)", "Frecuencia Cardiaca", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_FrecuenciaCar.setText(null);
            Txt_FrecuenciaCar.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Frecuencia Cardíaca", HEIGHT);
            return;
        }

        // Frecuencia Respiratoria
        try {
            frecuenciaR = Integer.parseInt(Txt_FrecuenciaResp.getText());
            if (frecuenciaR > 40 || frecuenciaR < 10) {
                Txt_FrecuenciaResp.setText(null);
                Txt_FrecuenciaResp.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (>10, <40)", "Frecuencia Respiratoria", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_FrecuenciaResp.setText(null);
            Txt_FrecuenciaResp.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Frecuencia Respiratoria", HEIGHT);
            return;
        }

        // Presión Arterial S
        try {
            presionArterialS = Integer.parseInt(Txt_PresionArterialS.getText());
            if (presionArterialS > 300 || presionArterialS < 50) {
                Txt_PresionArterialS.setText(null);
                Txt_PresionArterialS.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (>50, <300)", "Presión Arterial", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_PresionArterialS.setText(null);
            Txt_PresionArterialS.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Presión Arterial", HEIGHT);
            return;
        }

        // Presión Arterial D
        try {
            presionArterialD = Integer.parseInt(Txt_PresionArterialD.getText());
            if (presionArterialD > 200 || presionArterialD < 30) {
                Txt_PresionArterialD.setText(null);
                Txt_PresionArterialD.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (>30,<200)", "Presión Arterial", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_PresionArterialD.setText(null);
            Txt_PresionArterialD.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Presión Arterial", HEIGHT);
            return;
        }

        // Temperatura
        try {
            temperatura = Float.parseFloat(Txt_Temperatura.getText());
            if (temperatura > 45 || temperatura < 20) {
                Txt_Temperatura.setText(null);
                Txt_Temperatura.requestFocus();
                JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un numero valido (>20, <45)", "Temperatura", HEIGHT);
                return;
            }
        } catch (NumberFormatException e) {
            Txt_Temperatura.setText(null);
            Txt_Temperatura.requestFocus();
            JOptionPane.showMessageDialog(rootPane, "Error de Java: Introduce un valor positivo", "Temperatura", HEIGHT);
            return;
        }
        // Verificación de CheckBoxes Activados
        if (CBox_Diarrea.isSelected()) {
            Diarrea++;
            CBoxes = true;
        }
        if (CBox_Vomito.isSelected()) {
            Vomito++;
            CBoxes = true;
        }
        if (CBox_Colico.isSelected()) {
            Colico++;
            CBoxes = true;
        }
        if (CBox_DolorDeGarganta.isSelected()) {
            DolorGarganta++;
            CBoxes = true;
        }
        if (CBox_EscurrimientoNasal.isSelected()) {
            EscurrimientoNasal++;
            CBoxes = true;
        }
        if (CBox_Tos.isSelected()) {
            Tos++;
            CBoxes = true;
        }
        if (CBox_DolorAlOrinar.isSelected()) {
            DolorOrinar++;
            CBoxes = true;
        }
        if (CBox_Fiebre.isSelected()) {
            Fiebre++;
            CBoxes = true;
        }
        if (CBox_DolorIntenso.isSelected()) {
            DolorIntenso++;
            CBoxes = true;
        }

        if (CBoxes == false) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un sintoma.", "Sintoma(s)", HEIGHT);
            return;
        }

        // Cálculo
        Estomacal = Diarrea + Vomito + Colico;
        Respiratorio = DolorGarganta + EscurrimientoNasal + Tos;
        Urinario = DolorOrinar + Fiebre + DolorIntenso;

        // Decisión de Objeto a Usar
        //Filtro por vitales alterados
        if (edad < 18 || edad > 60 || frecuenciaC < 60 || frecuenciaC > 100 || frecuenciaR < 10 || frecuenciaR > 20 || presionArterialS < 90 || presionArterialS > 140 || presionArterialD < 60 || presionArterialD > 110 || temperatura < 28 || temperatura > 39.5) {
            Paciente_Otros_Clase_Derivada Obj_Otros = new Paciente_Otros_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
            Paciente_Otros(Obj_Otros);
            return;
        }
        // Objeto Paciente Respiratorio

        if (Respiratorio > Estomacal && Respiratorio > Urinario) {
            Paciente_Respiratorio_Clase_Derivada Obj_Respiratorio = new Paciente_Respiratorio_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, EscurrimientoNasal, Tos, DolorGarganta);
            Paciente_Respiratorio(Obj_Respiratorio);
            return;

        }
        // Objeto Paciente Estomacal
        if (Estomacal > Respiratorio && Estomacal > Urinario) {
            Paciente_Estomacal_Clase_Derivada Obj_Estomacal = new Paciente_Estomacal_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, Diarrea, Vomito, Colico);
            Paciente_Estomacal(Obj_Estomacal);
            return;
        }

        // Objeto Paciente Urinario
        if (Urinario > Estomacal && Urinario > Respiratorio) {
            Paciente_Urinario_Clase_Derivada Obj_Urinario = new Paciente_Urinario_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura, DolorOrinar, Fiebre, DolorIntenso);
            Paciente_Urinario(Obj_Urinario);
            return;
        }
        Paciente_Otros_Clase_Derivada Obj_Otros = new Paciente_Otros_Clase_Derivada(nombre, apellidoPat, apellidoMat, edad, frecuenciaC, frecuenciaR, presionArterialS, presionArterialD, temperatura);
        Paciente_Otros(Obj_Otros);
    }

    private void Limpiar_Formulario() {
        //Set Textos Null
        Txt_Nombre.setText(null);
        Txt_ApellidoMat.setText(null);
        Txt_ApellidoPat.setText(null);
        Txt_FrecuenciaCar.setText(null);
        Txt_FrecuenciaResp.setText(null);
        Txt_PresionArterialD.setText(null);
        Txt_PresionArterialS.setText(null);
        Txt_Temperatura.setText(null);
        Txt_Edad.setText(null);

        //Set Botones False
        CBox_Colico.setSelected(false);
        CBox_Diarrea.setSelected(false);
        CBox_Vomito.setSelected(false);
        CBox_DolorAlOrinar.setSelected(false);
        CBox_DolorIntenso.setSelected(false);
        CBox_Fiebre.setSelected(false);
        CBox_DolorDeGarganta.setSelected(false);
        CBox_EscurrimientoNasal.setSelected(false);
        CBox_Tos.setSelected(false);
    }

    private void Paciente_Respiratorio(Paciente_Respiratorio_Clase_Derivada Obj_Respiratorio) {
        Obj_Respiratorio.setMedicamento();

        IFRM_Receta = new IFRM_Receta();
        Iniciar_Ventana(IFRM_Receta);
        IFRM_Receta.bg.setBackground(new Color(255, 227, 151));
        IFRM_Receta.txt_Nombre.setText(Obj_Respiratorio.getNombre() + " " + Obj_Respiratorio.getApellidoPat() + " " + Obj_Respiratorio.getApellidoMat());
        IFRM_Receta.txt_Edad.setText(String.valueOf(Obj_Respiratorio.getEdad()));
        IFRM_Receta.txt_FrecuenciaCard.setText(String.valueOf(Obj_Respiratorio.getFrecuenciaC()));
        IFRM_Receta.txt_FrecuenciaResp.setText(String.valueOf(Obj_Respiratorio.getFrecuenciaR()));
        IFRM_Receta.txt_PresionArterialS.setText(String.valueOf(Obj_Respiratorio.getPresionArterialS()));
        IFRM_Receta.txt_PresionArterialD.setText(String.valueOf(Obj_Respiratorio.getPresionArterialD()));
        IFRM_Receta.txt_Temperatura.setText(String.valueOf(Obj_Respiratorio.getTemperatura()));
        IFRM_Receta.txt_Diagnostico.setText(String.valueOf("Infeccion respiratoria aguda"));
        IFRM_Receta.txtArea_Receta.setText(Obj_Respiratorio.getMedicamento());
    }

    private void Paciente_Estomacal(Paciente_Estomacal_Clase_Derivada Obj_Estomacal) {
        Obj_Estomacal.setMedicamento();

        IFRM_Receta = new IFRM_Receta();
        Iniciar_Ventana(IFRM_Receta);
        IFRM_Receta.bg.setBackground(new Color(255, 227, 151));
        IFRM_Receta.txt_Nombre.setText(Obj_Estomacal.getNombre() + " " + Obj_Estomacal.getApellidoPat() + " " + Obj_Estomacal.getApellidoMat());
        IFRM_Receta.txt_Edad.setText(String.valueOf(Obj_Estomacal.getEdad()));
        IFRM_Receta.txt_FrecuenciaCard.setText(String.valueOf(Obj_Estomacal.getFrecuenciaC()));
        IFRM_Receta.txt_FrecuenciaResp.setText(String.valueOf(Obj_Estomacal.getFrecuenciaR()));
        IFRM_Receta.txt_PresionArterialS.setText(String.valueOf(Obj_Estomacal.getPresionArterialS()));
        IFRM_Receta.txt_PresionArterialD.setText(String.valueOf(Obj_Estomacal.getPresionArterialD()));
        IFRM_Receta.txt_Temperatura.setText(String.valueOf(Obj_Estomacal.getTemperatura()));
        IFRM_Receta.txt_Diagnostico.setText(String.valueOf("Infeccion intestinal y/o estomacal"));
        IFRM_Receta.txtArea_Receta.setText(Obj_Estomacal.getMedicamento());
    }

    private void Paciente_Urinario(Paciente_Urinario_Clase_Derivada Obj_Urinario) {
        Obj_Urinario.setMedicamento();

        IFRM_Receta = new IFRM_Receta();
        Iniciar_Ventana(IFRM_Receta);
        IFRM_Receta.bg.setBackground(new Color(255, 227, 151));
        IFRM_Receta.txt_Nombre.setText(Obj_Urinario.getNombre() + " " + Obj_Urinario.getApellidoPat() + " " + Obj_Urinario.getApellidoMat());
        IFRM_Receta.txt_Edad.setText(String.valueOf(Obj_Urinario.getEdad()));
        IFRM_Receta.txt_FrecuenciaCard.setText(String.valueOf(Obj_Urinario.getFrecuenciaC()));
        IFRM_Receta.txt_FrecuenciaResp.setText(String.valueOf(Obj_Urinario.getFrecuenciaR()));
        IFRM_Receta.txt_PresionArterialS.setText(String.valueOf(Obj_Urinario.getPresionArterialS()));
        IFRM_Receta.txt_PresionArterialD.setText(String.valueOf(Obj_Urinario.getPresionArterialD()));
        IFRM_Receta.txt_Temperatura.setText(String.valueOf(Obj_Urinario.getTemperatura()));
        IFRM_Receta.txt_Diagnostico.setText(String.valueOf("Infección de vias urinarias"));
        IFRM_Receta.txtArea_Receta.setText(Obj_Urinario.getMedicamento());
    }

    private void Paciente_Otros(Paciente_Otros_Clase_Derivada Obj_Otros) {
        Obj_Otros.setMedicamento();

        IFRM_Receta = new IFRM_Receta();
        Iniciar_Ventana(IFRM_Receta);

        IFRM_Receta.txt_Nombre.setText(Obj_Otros.getNombre() + " " + Obj_Otros.getApellidoPat() + " " + Obj_Otros.getApellidoMat());
        IFRM_Receta.txt_Edad.setText(String.valueOf(Obj_Otros.getEdad()));
        IFRM_Receta.txt_FrecuenciaCard.setText(String.valueOf(Obj_Otros.getFrecuenciaC()));
        IFRM_Receta.txt_FrecuenciaResp.setText(String.valueOf(Obj_Otros.getFrecuenciaR()));
        IFRM_Receta.txt_PresionArterialS.setText(String.valueOf(Obj_Otros.getPresionArterialS()));
        IFRM_Receta.txt_PresionArterialD.setText(String.valueOf(Obj_Otros.getPresionArterialD()));
        IFRM_Receta.txt_Temperatura.setText(String.valueOf(Obj_Otros.getTemperatura()));
        IFRM_Receta.txt_Diagnostico.setText(String.valueOf("Nulo"));
        IFRM_Receta.txtArea_Receta.setText(Obj_Otros.getMedicamento());

        if (Obj_Otros.getFrecuenciaC() < 60 || Obj_Otros.getFrecuenciaC() > 100 || Obj_Otros.getFrecuenciaR() < 10 || Obj_Otros.getFrecuenciaR() > 20 || Obj_Otros.getPresionArterialS() < 90 || Obj_Otros.getPresionArterialS() > 140 || Obj_Otros.getPresionArterialD() < 60 || Obj_Otros.getPresionArterialD() > 110 || Obj_Otros.getTemperatura() < 28 || Obj_Otros.getTemperatura() > 39.5) {
            IFRM_Receta.bg.setBackground(new Color(236, 112, 99));
            return;
        }
        if (Obj_Otros.getEdad() < 18) {
            IFRM_Receta.bg.setBackground(new Color(168, 177, 249));
        }
        if (Obj_Otros.getEdad() > 60) {
            IFRM_Receta.bg.setBackground(new Color(124, 206, 130));
        }

    }

    private void Iniciar_Ventana(Component Objeto_FRM) {
        if (JInternalFrames_Abiertos(IFRM_Receta)) {
            menuFRM.pEscritorio.add(Objeto_FRM);
            Dimension desktopSize = menuFRM.pEscritorio.getSize();
            Dimension FrameSize = Objeto_FRM.getSize();
            Objeto_FRM.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.height) / 2);
            Objeto_FRM.setVisible(true);
        }

    }

    private boolean JInternalFrames_Abiertos(JInternalFrame jif) { // Creamos un metodo publico de tipo boolean.
        JInternalFrame[] jif_Activos = menuFRM.pEscritorio.getAllFrames(); // Este arreglo almacena todos los JInternalFrames que esten abierto en el jDesktopPane.

        for (int i = 0; i < jif_Activos.length; i++) { // Creamos un ciclo for para recorrer nuestro arreglo utilizando la propiedad length de nuestro arreglo.

            // Validamos con un if si nuestro arreglo en la posición i es igual al JInternalFrame que esta activo en el jDesktopPane, si es igual devolverá true.
            if (jif.getClass().isInstance(jif_Activos[i])) {
                JOptionPane.showMessageDialog(null, "Ya tienes una ventana abierta. \n\nCierra las demás.", "Información", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        }
        return true;
    }

    private void LettersOnly(java.awt.event.KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar()) && !(evt.getKeyChar() == KeyEvent.VK_SPACE) && !(evt.getKeyChar() == KeyEvent.VK_BACK_SPACE)) {
            evt.consume();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CBox_Colico;
    private javax.swing.JCheckBox CBox_Diarrea;
    private javax.swing.JCheckBox CBox_DolorAlOrinar;
    private javax.swing.JCheckBox CBox_DolorDeGarganta;
    private javax.swing.JCheckBox CBox_DolorIntenso;
    private javax.swing.JCheckBox CBox_EscurrimientoNasal;
    private javax.swing.JCheckBox CBox_Fiebre;
    private javax.swing.JCheckBox CBox_Tos;
    private javax.swing.JCheckBox CBox_Vomito;
    private javax.swing.JTextField Txt_ApellidoMat;
    private javax.swing.JTextField Txt_ApellidoPat;
    private javax.swing.JTextField Txt_Edad;
    private javax.swing.JTextField Txt_FrecuenciaCar;
    private javax.swing.JTextField Txt_FrecuenciaResp;
    private javax.swing.JTextField Txt_Nombre;
    private javax.swing.JTextField Txt_PresionArterialD;
    private javax.swing.JTextField Txt_PresionArterialS;
    private javax.swing.JTextField Txt_Temperatura;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_Generar1;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_ApellidoMat;
    private javax.swing.JLabel jLabel_ApellidoPat;
    private javax.swing.JLabel jLabel_C;
    private javax.swing.JLabel jLabel_DiagnosticoExpress;
    private javax.swing.JLabel jLabel_DivisorPresionArterial;
    private javax.swing.JLabel jLabel_Edad;
    private javax.swing.JLabel jLabel_FrecuenciaCar;
    private javax.swing.JLabel jLabel_FrecuenciaResp;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_PresionArterial;
    private javax.swing.JLabel jLabel_SeleccioneSintomas;
    private javax.swing.JLabel jLabel_Temperatura;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel panelAzul1;
    private javax.swing.JPanel panelAzul2;
    // End of variables declaration//GEN-END:variables
}
