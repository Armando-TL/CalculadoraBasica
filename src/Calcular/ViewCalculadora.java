package Calcular;

// @author amdtr

import java.awt.Image;
import java.awt.Toolkit;

public final class ViewCalculadora extends javax.swing.JFrame {

    private final ControlTeclado controlTeclado;

    public ViewCalculadora() {
        initComponents();
        //this.setUndecorated(false);
        setIconImage(getIconImage());
        controlTeclado = new ControlTeclado(contenedor, txt1, resultado);
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txt1 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnC = new javax.swing.JButton();
        btnCe = new javax.swing.JButton();
        ceros = new javax.swing.JButton();
        div = new javax.swing.JButton();
        multi = new javax.swing.JButton();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eigth = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        four = new javax.swing.JButton();
        five = new javax.swing.JButton();
        six = new javax.swing.JButton();
        one = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        punto = new javax.swing.JButton();
        cero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(10, 37, 56));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(275, 120));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt1.setBackground(new java.awt.Color(255, 255, 255));
        txt1.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        txt1.setForeground(new java.awt.Color(128, 142, 152));
        txt1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 270, 40));

        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setFont(new java.awt.Font("Myanmar Text", 1, 36)); // NOI18N
        resultado.setForeground(new java.awt.Color(248, 249, 250));
        resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 59, 270, 50));

        contenedor.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 120));

        jPanel2.setBackground(new java.awt.Color(12, 47, 71));
        jPanel2.setToolTipText("");
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnC.setBackground(new java.awt.Color(12, 47, 71));
        btnC.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        btnC.setForeground(new java.awt.Color(223, 105, 105));
        btnC.setText("C");
        btnC.setAlignmentY(0.0F);
        btnC.setBorder(null);
        btnC.setBorderPainted(false);
        btnC.setContentAreaFilled(false);
        btnC.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnC.setFocusPainted(false);
        btnC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel2.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 45, 45));

        btnCe.setBackground(new java.awt.Color(12, 47, 71));
        btnCe.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        btnCe.setForeground(new java.awt.Color(223, 105, 105));
        btnCe.setText("CE");
        btnCe.setAlignmentY(0.0F);
        btnCe.setBorder(null);
        btnCe.setBorderPainted(false);
        btnCe.setContentAreaFilled(false);
        btnCe.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCe.setFocusPainted(false);
        btnCe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeActionPerformed(evt);
            }
        });
        jPanel2.add(btnCe, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 130, 45));

        ceros.setBackground(new java.awt.Color(12, 47, 71));
        ceros.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        ceros.setForeground(new java.awt.Color(249, 248, 250));
        ceros.setText("00");
        ceros.setAlignmentY(0.0F);
        ceros.setBorder(null);
        ceros.setBorderPainted(false);
        ceros.setContentAreaFilled(false);
        ceros.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ceros.setFocusPainted(false);
        ceros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ceros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerosActionPerformed(evt);
            }
        });
        jPanel2.add(ceros, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 45, 45));

        div.setBackground(new java.awt.Color(12, 47, 71));
        div.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        div.setForeground(new java.awt.Color(39, 134, 134));
        div.setText("/");
        div.setAlignmentY(0.0F);
        div.setBorder(null);
        div.setBorderPainted(false);
        div.setContentAreaFilled(false);
        div.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        div.setFocusPainted(false);
        div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });
        jPanel2.add(div, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 45, 45));

        multi.setBackground(new java.awt.Color(12, 47, 71));
        multi.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        multi.setForeground(new java.awt.Color(39, 134, 134));
        multi.setText("x");
        multi.setAlignmentY(0.0F);
        multi.setBorder(null);
        multi.setBorderPainted(false);
        multi.setContentAreaFilled(false);
        multi.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        multi.setFocusPainted(false);
        multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiActionPerformed(evt);
            }
        });
        jPanel2.add(multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 45, 45));

        suma.setBackground(new java.awt.Color(12, 47, 71));
        suma.setFont(new java.awt.Font("Myanmar Text", 0, 20)); // NOI18N
        suma.setForeground(new java.awt.Color(39, 134, 134));
        suma.setText("+");
        suma.setAlignmentY(0.0F);
        suma.setBorder(null);
        suma.setBorderPainted(false);
        suma.setContentAreaFilled(false);
        suma.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        suma.setFocusPainted(false);
        suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });
        jPanel2.add(suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 45, 45));

        resta.setBackground(new java.awt.Color(12, 47, 71));
        resta.setFont(new java.awt.Font("Myanmar Text", 0, 24)); // NOI18N
        resta.setForeground(new java.awt.Color(39, 134, 134));
        resta.setText("-");
        resta.setAlignmentY(0.0F);
        resta.setBorder(null);
        resta.setBorderPainted(false);
        resta.setContentAreaFilled(false);
        resta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        resta.setFocusPainted(false);
        resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });
        jPanel2.add(resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 45, 45));

        igual.setBackground(new java.awt.Color(12, 47, 71));
        igual.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        igual.setForeground(new java.awt.Color(249, 248, 250));
        igual.setText("=");
        igual.setAlignmentY(0.0F);
        igual.setBorder(null);
        igual.setBorderPainted(false);
        igual.setContentAreaFilled(false);
        igual.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        igual.setFocusPainted(false);
        igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });
        jPanel2.add(igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 45, 45));

        seven.setBackground(new java.awt.Color(12, 47, 71));
        seven.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(249, 248, 250));
        seven.setText("7");
        seven.setAlignmentY(0.0F);
        seven.setBorder(null);
        seven.setBorderPainted(false);
        seven.setContentAreaFilled(false);
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seven.setFocusPainted(false);
        seven.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        jPanel2.add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 45, 45));

        eigth.setBackground(new java.awt.Color(12, 47, 71));
        eigth.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        eigth.setForeground(new java.awt.Color(249, 248, 250));
        eigth.setText("8");
        eigth.setAlignmentY(0.0F);
        eigth.setBorder(null);
        eigth.setBorderPainted(false);
        eigth.setContentAreaFilled(false);
        eigth.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eigth.setFocusPainted(false);
        eigth.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eigthActionPerformed(evt);
            }
        });
        jPanel2.add(eigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 45, 45));

        nine.setBackground(new java.awt.Color(12, 47, 71));
        nine.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(249, 248, 250));
        nine.setText("9");
        nine.setAlignmentY(0.0F);
        nine.setBorder(null);
        nine.setBorderPainted(false);
        nine.setContentAreaFilled(false);
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nine.setFocusPainted(false);
        nine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        jPanel2.add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 45, 45));

        four.setBackground(new java.awt.Color(12, 47, 71));
        four.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        four.setForeground(new java.awt.Color(249, 248, 250));
        four.setText("4");
        four.setAlignmentY(0.0F);
        four.setBorder(null);
        four.setBorderPainted(false);
        four.setContentAreaFilled(false);
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        four.setFocusPainted(false);
        four.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        jPanel2.add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 45, 45));

        five.setBackground(new java.awt.Color(12, 47, 71));
        five.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        five.setForeground(new java.awt.Color(249, 248, 250));
        five.setText("5");
        five.setAlignmentY(0.0F);
        five.setBorder(null);
        five.setBorderPainted(false);
        five.setContentAreaFilled(false);
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        five.setFocusPainted(false);
        five.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        jPanel2.add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 45, 45));

        six.setBackground(new java.awt.Color(12, 47, 71));
        six.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        six.setForeground(new java.awt.Color(249, 248, 250));
        six.setText("6");
        six.setAlignmentY(0.0F);
        six.setBorder(null);
        six.setBorderPainted(false);
        six.setContentAreaFilled(false);
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        six.setFocusPainted(false);
        six.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        jPanel2.add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 45, 45));

        one.setBackground(new java.awt.Color(12, 47, 71));
        one.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        one.setForeground(new java.awt.Color(249, 248, 250));
        one.setText("1");
        one.setAlignmentY(0.0F);
        one.setBorder(null);
        one.setBorderPainted(false);
        one.setContentAreaFilled(false);
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        one.setFocusPainted(false);
        one.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        jPanel2.add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 45, 45));

        two.setBackground(new java.awt.Color(12, 47, 71));
        two.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        two.setForeground(new java.awt.Color(249, 248, 250));
        two.setText("2");
        two.setAlignmentY(0.0F);
        two.setBorder(null);
        two.setBorderPainted(false);
        two.setContentAreaFilled(false);
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        two.setFocusPainted(false);
        two.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        jPanel2.add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 45, 45));

        three.setBackground(new java.awt.Color(12, 47, 71));
        three.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        three.setForeground(new java.awt.Color(249, 248, 250));
        three.setText("3");
        three.setAlignmentY(0.0F);
        three.setBorder(null);
        three.setBorderPainted(false);
        three.setContentAreaFilled(false);
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        three.setFocusPainted(false);
        three.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        jPanel2.add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 45, 45));

        punto.setBackground(new java.awt.Color(12, 47, 71));
        punto.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        punto.setForeground(new java.awt.Color(249, 248, 250));
        punto.setText(".");
        punto.setAlignmentY(0.0F);
        punto.setBorder(null);
        punto.setBorderPainted(false);
        punto.setContentAreaFilled(false);
        punto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        punto.setFocusPainted(false);
        punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puntoActionPerformed(evt);
            }
        });
        jPanel2.add(punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 45, 45));

        cero.setBackground(new java.awt.Color(12, 47, 71));
        cero.setFont(new java.awt.Font("Myanmar Text", 0, 18)); // NOI18N
        cero.setForeground(new java.awt.Color(249, 248, 250));
        cero.setText("0");
        cero.setAlignmentY(0.0F);
        cero.setBorder(null);
        cero.setBorderPainted(false);
        cero.setContentAreaFilled(false);
        cero.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cero.setFocusPainted(false);
        cero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceroActionPerformed(evt);
            }
        });
        jPanel2.add(cero, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 45, 45));

        contenedor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 280, 270));

        getContentPane().add(contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        contenedor.requestFocusInWindow();
        String t = txt1.getText();
        if (!t.equals("")) {
            txt1.setText(txt1.getText().substring(0, t.length() - 1));
        }
    }//GEN-LAST:event_btnCActionPerformed

    private void btnCeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeActionPerformed
        contenedor.requestFocusInWindow();
        if (!txt1.getText().equals("")) {
            txt1.setText("");
        }
        if (!resultado.getText().equals("")) {
            resultado.setText("");
        }

    }//GEN-LAST:event_btnCeActionPerformed

    private void cerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerosActionPerformed
        addNumber("00");
    }//GEN-LAST:event_cerosActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        controlTeclado.operador('/');
    }//GEN-LAST:event_divActionPerformed

    private void multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiActionPerformed
        controlTeclado.operador('*');
    }//GEN-LAST:event_multiActionPerformed

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        controlTeclado.operador('+');
    }//GEN-LAST:event_sumaActionPerformed

    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        controlTeclado.operador('-');
    }//GEN-LAST:event_restaActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        contenedor.requestFocusInWindow();
        controlTeclado.respuesta();

    }//GEN-LAST:event_igualActionPerformed

    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        addNumber("7");
    }//GEN-LAST:event_sevenActionPerformed

    private void eigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eigthActionPerformed
        addNumber("8");
    }//GEN-LAST:event_eigthActionPerformed

    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        addNumber("9");
    }//GEN-LAST:event_nineActionPerformed

    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        addNumber("4");
    }//GEN-LAST:event_fourActionPerformed

    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        addNumber("5");
    }//GEN-LAST:event_fiveActionPerformed

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        addNumber("6");
    }//GEN-LAST:event_sixActionPerformed

    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        addNumber("1");
    }//GEN-LAST:event_oneActionPerformed

    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        addNumber("2");
    }//GEN-LAST:event_twoActionPerformed

    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
        addNumber("3");
    }//GEN-LAST:event_threeActionPerformed

    private void puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puntoActionPerformed
        controlTeclado.operador('.');
    }//GEN-LAST:event_puntoActionPerformed

    private void ceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceroActionPerformed
        addNumber("0");
    }//GEN-LAST:event_ceroActionPerformed

    public void addNumber(String dato) {
        txt1.setText(txt1.getText() + dato);
        contenedor.requestFocusInWindow();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCe;
    private javax.swing.JButton cero;
    private javax.swing.JButton ceros;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton div;
    private javax.swing.JButton eigth;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JButton igual;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton multi;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton punto;
    private javax.swing.JButton resta;
    private javax.swing.JLabel resultado;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton suma;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JLabel txt1;
    // End of variables declaration//GEN-END:variables
}
