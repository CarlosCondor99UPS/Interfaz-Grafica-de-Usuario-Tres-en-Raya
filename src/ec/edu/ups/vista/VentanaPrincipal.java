/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author tians
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private int[][] matriz = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private boolean terminado = false;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setSize(725, 500);

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn00 = new javax.swing.JToggleButton();
        btn20 = new javax.swing.JToggleButton();
        btn10 = new javax.swing.JToggleButton();
        btn01 = new javax.swing.JToggleButton();
        btn11 = new javax.swing.JToggleButton();
        btn21 = new javax.swing.JToggleButton();
        btn02 = new javax.swing.JToggleButton();
        btn12 = new javax.swing.JToggleButton();
        btn22 = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnReset = new javax.swing.JButton();
        lblGanador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(90, 90));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 330, 400, 10);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(300, 110, 10, 330);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 110, 10, 330);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 210, 400, 10);

        btn00.setBackground(new java.awt.Color(0, 162, 232));
        btn00.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        getContentPane().add(btn00);
        btn00.setBounds(40, 110, 110, 90);

        btn20.setBackground(new java.awt.Color(0, 162, 232));
        btn20.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn20ActionPerformed(evt);
            }
        });
        getContentPane().add(btn20);
        btn20.setBounds(40, 350, 110, 90);

        btn10.setBackground(new java.awt.Color(0, 162, 232));
        btn10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10);
        btn10.setBounds(40, 230, 110, 90);

        btn01.setBackground(new java.awt.Color(0, 162, 232));
        btn01.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });
        getContentPane().add(btn01);
        btn01.setBounds(180, 110, 110, 90);

        btn11.setBackground(new java.awt.Color(0, 162, 232));
        btn11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11);
        btn11.setBounds(180, 230, 110, 90);

        btn21.setBackground(new java.awt.Color(0, 162, 232));
        btn21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });
        getContentPane().add(btn21);
        btn21.setBounds(180, 350, 110, 90);

        btn02.setBackground(new java.awt.Color(0, 162, 232));
        btn02.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn02ActionPerformed(evt);
            }
        });
        getContentPane().add(btn02);
        btn02.setBounds(320, 110, 110, 90);

        btn12.setBackground(new java.awt.Color(0, 162, 232));
        btn12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12);
        btn12.setBounds(320, 230, 110, 90);

        btn22.setBackground(new java.awt.Color(0, 162, 232));
        btn22.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn22ActionPerformed(evt);
            }
        });
        getContentPane().add(btn22);
        btn22.setBounds(320, 350, 110, 90);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("Tres en Raya");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(240, 10, 330, 60);

        btnReset.setBackground(new java.awt.Color(102, 102, 0));
        btnReset.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnReset.setText("REINICIAR");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset);
        btnReset.setBounds(460, 230, 240, 90);

        lblGanador.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        lblGanador.setForeground(new java.awt.Color(51, 255, 51));
        jPanel1.add(lblGanador);
        lblGanador.setBounds(490, 350, 230, 70);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 730, 750);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        if (terminado == false && btn20.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn20.setIcon(bola);
            matriz[2][0] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed

        if (terminado == false && btn10.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn10.setIcon(bola);
            matriz[1][0] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        if (terminado == false && btn01.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn01.setIcon(bola);
            matriz[0][1] = 1;
            ganador();
            turnoMaquina();
    }//GEN-LAST:event_btn01ActionPerformed
    }
    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (terminado == false && btn11.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn11.setIcon(bola);
            matriz[1][1] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        if (terminado == false && btn21.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn21.setIcon(bola);
            matriz[2][1] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
        if (terminado == false && btn02.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn02.setIcon(bola);
            matriz[0][2] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (terminado == false && btn12.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn12.setIcon(bola);
            matriz[1][2] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
        if (terminado == false && btn22.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn22.setIcon(bola);
            matriz[2][2] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
        if (terminado == false && btn00.getIcon() == null) {
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn00.setIcon(bola);
            matriz[0][0] = 1;
            ganador();
            turnoMaquina();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btn00.setIcon(null);
        btn01.setIcon(null);
        btn02.setIcon(null);
        btn10.setIcon(null);
        btn11.setIcon(null);
        btn12.setIcon(null);
        btn20.setIcon(null);
        btn21.setIcon(null);
        btn22.setIcon(null);
        btn00.setSelected(false);
        btn01.setSelected(false);
        btn02.setSelected(false);
        btn10.setSelected(false);
        btn11.setSelected(false);
        btn12.setSelected(false);
        btn20.setSelected(false);
        btn21.setSelected(false);
        btn22.setSelected(false);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        lblGanador.setText("");
        terminado = false;
    }//GEN-LAST:event_btnResetActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public boolean contar() {
        int cont = 0, cont2 = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    cont++;
                } else if (matriz[i][j] == -1) {
                    cont2++;
                }
            }
        }
        if (cont > 2 || cont2 > 2) {
            return true;
        }
        return false;
    }

    public void ganador() {
        if (contar()) {
            //3 posibilidades verticales
            if (matriz[0][0] != 0 && matriz[1][0] != 0 && matriz[2][0] != 0) {
                if (matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) {
                    if (matriz[0][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            if (matriz[0][1] != 0 && matriz[1][1] != 0 && matriz[2][1] != 0) {
                if (matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]) {
                    if (matriz[0][1] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            if (matriz[0][2] != 0 && matriz[1][2] != 0 && matriz[2][2] != 0) {
                if (matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2]) {
                    if (matriz[0][2] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }

            //3 posibilidades horizontales
            if (matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0) {
                if (matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) {
                    if (matriz[0][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            if (matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0) {
                if (matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]) {
                    if (matriz[1][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            if (matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0) {
                if (matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) {
                    if (matriz[2][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }

            //2 posibilidades diagonales
            if (matriz[2][0] != 0 && matriz[1][1] != 0 && matriz[0][2] != 0) {
                if (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2]) {
                    if (matriz[2][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            if (matriz[0][0] != 0 && matriz[1][1] != 0 && matriz[2][2] != 0) {
                if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
                    if (matriz[0][0] == 1) {
                        lblGanador.setText("GANASTE");
                        terminado = true;
                        return;
                    } else {
                        lblGanador.setText("PERDISTE");
                        terminado = true;
                        return;
                    }
                }
            }
            int cont = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == 1 || matriz[i][j] == -1) {
                        cont++;
                    }
                }
            }
            if (cont == 9 && terminado == false) {
                lblGanador.setText("EMPATE");
                terminado = true;
                return;
            }
        }
    }

    public void turnoMaquina() {
        boolean vacio = false;
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1 || matriz[i][j] == -1) {
                    cont++;
                }
            }
        }
        if (cont < 9 && terminado == false) {
            do {
                int turnoMaquina = (int) (Math.random() * (3) + 0);
                int turnoMaquina2 = (int) (Math.random() * (3) + 0);
                if (matriz[turnoMaquina][turnoMaquina2] == 0) {
                    ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/xAzul.png");
                    if (turnoMaquina == 0 && turnoMaquina2 == 0) {
                        btn00.setIcon(bola);
                        matriz[0][0] = -1;
                    } else if (turnoMaquina == 0 && turnoMaquina2 == 1) {
                        btn01.setIcon(bola);
                        matriz[0][1] = -1;
                    } else if (turnoMaquina == 0 && turnoMaquina2 == 2) {
                        btn02.setIcon(bola);
                        matriz[0][2] = -1;
                    } else if (turnoMaquina == 1 && turnoMaquina2 == 0) {
                        btn10.setIcon(bola);
                        matriz[1][0] = -1;
                    } else if (turnoMaquina == 1 && turnoMaquina2 == 1) {
                        btn11.setIcon(bola);
                        matriz[1][1] = -1;
                    } else if (turnoMaquina == 1 && turnoMaquina2 == 2) {
                        btn12.setIcon(bola);
                        matriz[1][2] = -1;
                    } else if (turnoMaquina == 2 && turnoMaquina2 == 0) {
                        btn20.setIcon(bola);
                        matriz[2][0] = -1;
                    } else if (turnoMaquina == 2 && turnoMaquina2 == 1) {
                        btn21.setIcon(bola);
                        matriz[2][1] = -1;
                    } else if (turnoMaquina == 2 && turnoMaquina2 == 2) {
                        btn22.setIcon(bola);
                        matriz[2][2] = -1;
                    }
                    matriz[turnoMaquina][turnoMaquina2] = -1;
                    ganador();
                    vacio = true;
                }
            } while (vacio == false);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn00;
    private javax.swing.JToggleButton btn01;
    private javax.swing.JToggleButton btn02;
    private javax.swing.JToggleButton btn10;
    private javax.swing.JToggleButton btn11;
    private javax.swing.JToggleButton btn12;
    private javax.swing.JToggleButton btn20;
    private javax.swing.JToggleButton btn21;
    private javax.swing.JToggleButton btn22;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGanador;
    // End of variables declaration//GEN-END:variables
}
