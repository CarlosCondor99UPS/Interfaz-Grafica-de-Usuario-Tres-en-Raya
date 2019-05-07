/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import static java.awt.Color.BLACK;
import static java.awt.Color.RED;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

/**
 *
 * @author tians
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    //Declaracion de variables
    private int[][] matriz = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
    private boolean terminado = false;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setSize(725, 500);
        this.setTitle("Juego Tres en Raya - Carlos Condor");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblVertical3 = new javax.swing.JLabel();
        lblDiagonal1 = new javax.swing.JLabel();
        lblVertical2 = new javax.swing.JLabel();
        lblVertical1 = new javax.swing.JLabel();
        lblHorizontal1 = new javax.swing.JLabel();
        lblHorizontal2 = new javax.swing.JLabel();
        lblHorizontal3 = new javax.swing.JLabel();
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
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(90, 90));
        getContentPane().setLayout(null);

        lblVertical3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblVertical3);
        lblVertical3.setBounds(370, 110, 10, 330);
        getContentPane().add(lblDiagonal1);
        lblDiagonal1.setBounds(40, 110, 390, 330);

        lblVertical2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblVertical2);
        lblVertical2.setBounds(230, 110, 10, 330);

        lblVertical1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblVertical1);
        lblVertical1.setBounds(90, 110, 10, 330);

        lblHorizontal1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblHorizontal1);
        lblHorizontal1.setBounds(40, 390, 390, 10);

        lblHorizontal2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblHorizontal2);
        lblHorizontal2.setBounds(40, 150, 390, 10);

        lblHorizontal3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(lblHorizontal3);
        lblHorizontal3.setBounds(40, 270, 390, 10);

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
        jPanel1.setBounds(0, 0, 730, 460);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 10));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(160, 110, 10, 330);
        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 110, 390, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn20ActionPerformed
        //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn20.getIcon() == null) {
            //Se setea la imagen del circulo rojo 
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn20.setIcon(bola);
            //Se setea a la matriz como 1 en el turno del huamno
            matriz[2][0] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn20ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn10.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn10.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[1][0] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn01.getIcon() == null) {
            //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn01.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[0][1] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
    }//GEN-LAST:event_btn01ActionPerformed
    }
    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn11.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn11.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[1][1] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn21.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn21.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[2][1] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn02ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn02.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn02.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[0][2] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn02ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn12.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn12.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[1][2] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn22ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn22.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn22.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[2][2] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn22ActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
         //Si el boton se selecciona, no tiene icono y aun no termina el juego
        if (terminado == false && btn00.getIcon() == null) {
             //Se setea la imagen del circulo rojo
            ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/bolaRoja.png");
            btn00.setIcon(bola);
             //Se setea a la matriz como 1 en el turno del huamno
            matriz[0][0] = 1;
            //Se ejecuta el metodo ganador, para comprobar si ya existe algun ganador
            ganador();
            //Se ejecutra el metodo turnoMaquina para la eleccion del computador
            turnoMaquina();
        }
    }//GEN-LAST:event_btn00ActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //Boton reset, pone todas las variables a su valor original
        //Los botones a null
        btn00.setIcon(null);
        btn01.setIcon(null);
        btn02.setIcon(null);
        btn10.setIcon(null);
        btn11.setIcon(null);
        btn12.setIcon(null);
        btn20.setIcon(null);
        btn21.setIcon(null);
        btn22.setIcon(null);
        //Se deseleccionan
        btn00.setSelected(false);
        btn01.setSelected(false);
        btn02.setSelected(false);
        btn10.setSelected(false);
        btn11.setSelected(false);
        btn12.setSelected(false);
        btn20.setSelected(false);
        btn21.setSelected(false);
        btn22.setSelected(false);
        //Se borran las lineas que demuestran el ganador
        lblHorizontal1.setBorder(null);
        lblHorizontal2.setBorder(null);
        lblHorizontal3.setBorder(null);
        lblVertical1.setBorder(null);
        lblVertical2.setBorder(null);
        lblVertical3.setBorder(null);
        lblDiagonal1.setIcon(null);
        //Se vuelve a llenar de 0 la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        //Se quita si gano o no
        lblGanador.setText("");
        //Se define false a termina ya que se reinicia el juego
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
    
    //Metodo para contar cuantos circulos o equis existen
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
        //Si existe mas de 3 se puede comparar
        if (cont > 2 || cont2 > 2) {
            return true;
        }
        return false;
    }
    
    //Metodo que decide el ganador
    public void ganador() {
        //Si el metodo contar devuelve true
        if (contar()) {
            //3 posibilidades verticales que se comparan
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[0][0] != 0 && matriz[1][0] != 0 && matriz[2][0] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[0][0] == matriz[1][0] && matriz[1][0] == matriz[2][0]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[0][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                        //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical1.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical1.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[0][1] != 0 && matriz[1][1] != 0 && matriz[2][1] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[0][1] == matriz[1][1] && matriz[1][1] == matriz[2][1]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[0][1] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical2.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical2.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[0][2] != 0 && matriz[1][2] != 0 && matriz[2][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[0][2] == matriz[1][2] && matriz[1][2] == matriz[2][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[0][2] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical3.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblVertical3.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }

            //3 posibilidades horizontales
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[0][0] != 0 && matriz[0][1] != 0 && matriz[0][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[0][0] == matriz[0][1] && matriz[0][1] == matriz[0][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[0][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal2.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal2.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[1][0] != 0 && matriz[1][1] != 0 && matriz[1][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[1][0] == matriz[1][1] && matriz[1][1] == matriz[1][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[1][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal3.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal3.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[2][0] != 0 && matriz[2][1] != 0 && matriz[2][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[2][0] == matriz[2][1] && matriz[2][1] == matriz[2][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[2][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal1.setBorder(javax.swing.BorderFactory.createLineBorder(BLACK, 10));
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        lblHorizontal1.setBorder(javax.swing.BorderFactory.createLineBorder(RED, 10));
                        return;
                    }
                }
            }
            
            //2 posibilidades diagonales
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[2][0] != 0 && matriz[1][1] != 0 && matriz[0][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[2][0] == matriz[1][1] && matriz[1][1] == matriz[0][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[2][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        ImageIcon icon=new ImageIcon("src/ec/edu/ups/imagenes/diagonal1.png");
                        lblDiagonal1.setIcon(icon);
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        ImageIcon icon=new ImageIcon("src/ec/edu/ups/imagenes/diagonal1.png");
                        lblDiagonal1.setIcon(icon);
                        return;
                    }
                }
            }
            
            //Si en la matriz la linea vertical esta llena 
            if (matriz[0][0] != 0 && matriz[1][1] != 0 && matriz[2][2] != 0) {
                //Si las 3 posiciones son iguales
                if (matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
                    //Se compara si son circulos 1 o equis -1
                    if (matriz[0][0] == 1) {
                        //Si son 1 el humano gana
                        lblGanador.setText("GANASTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        ImageIcon icon=new ImageIcon("src/ec/edu/ups/imagenes/diagonal2.png");
                        lblDiagonal1.setIcon(icon);
                        return;
                    } else {
                        //Si son -1 la maquina gana
                        lblGanador.setText("PERDISTE");
                         //Se termina el juego
                        terminado = true;
                        //Se setea la linea que muestra en donde gana
                        ImageIcon icon=new ImageIcon("src/ec/edu/ups/imagenes/diagonal2.png");
                        lblDiagonal1.setIcon(icon);
                        return;
                    }
                }
            }
            
            //Se realiza un conteo para saber si ya se jugo todos los botones
            int cont = 0;
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == 1 || matriz[i][j] == -1) {
                        cont++;
                    }
                }
            }
            //Si es ya se contaron todos existe un empate
            if (cont == 9 && terminado == false) {
                //Se setea un empate
                lblGanador.setText("EMPATE");
                //Se termina el juego
                terminado = true;
                return;
            }
        }
    }
    
    //Metodo para el turno de la maquina
    public void turnoMaquina() {
        //Se declara una variable boolean
        boolean vacio = false;
        //Se hace un conteo para saber si no es empate
        int cont = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1 || matriz[i][j] == -1) {
                    cont++;
                }
            }
        }
        //Mientras sea menor que 9 y no se haya terminado el juego
        if (cont < 9 && terminado == false) {
            //Bucle para encontrar un numero aleatorio que no este ya en juego
            do {
                //Se declara dos posiciones que son las posiciones en la matriz
                int turnoMaquina = (int) (Math.random() * (3) + 0);
                int turnoMaquina2 = (int) (Math.random() * (3) + 0);
                //Se compara si los valores escogidos no tienen ningun circulo o equis
                if (matriz[turnoMaquina][turnoMaquina2] == 0) {
                    //Se obtiene la imagen de equis
                    ImageIcon bola = new ImageIcon("src/ec/edu/ups/imagenes/xAzul.png");
                    //If para saber en que posiciones se setea el icon
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
                    //Se ejecuta el metodo para saber si ya gano alguien
                    ganador();
                    //Se setea a true ya que se encontro un espacio vacio para el turno de la maquina
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiagonal1;
    private javax.swing.JLabel lblGanador;
    private javax.swing.JLabel lblHorizontal1;
    private javax.swing.JLabel lblHorizontal2;
    private javax.swing.JLabel lblHorizontal3;
    private javax.swing.JLabel lblVertical1;
    private javax.swing.JLabel lblVertical2;
    private javax.swing.JLabel lblVertical3;
    // End of variables declaration//GEN-END:variables
}
