/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminasmario;

import java.awt.event.*;
import java.awt.*;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author mario
 */
public class Buscaminas extends javax.swing.JFrame implements ActionListener{

    /**
     * Creates new form Buscaminas
     */
    
    
    public Buscaminas() {
        initComponents();
        
        crearTablero();
        ponerBonbas();
        
        //addListeners();
    }


    public void crearTablero(){
        
        //int jugando = 0;
        //int perdido = 1;
        //int ganado = 2;
        
        //inr tapada = 0;
        //int descubierta = 1;
        //int bandera = 2;
        //casillaVistas = 0;
        int tablero = 4;
        int minas = 6;
        int filas = 0;
        int columnas = 0;
        int celdaVacia = 0;
        
        
        jPanel1.setLayout(new GridLayout(tablero, tablero));
        
        
        for (filas = 0; filas < tablero; filas++){
            for ( columnas = 0; columnas < tablero; columnas++){
            
                
                JButton btn= new JButton();
                
                
                //btn.setText(""+celdaVacia);
                
                String nombre = new Integer(filas).toString();
                
                nombre += new Integer(columnas).toString();
                btn.setActionCommand(nombre);
                jPanel1.add(btn);
                btn.addActionListener(this);
                
                //btn.setText(""+(int)(rnd.nextDouble()* 2 + 0));
                 
                
                                                          
                
            }
        }
        int minasx[]= sinRepetir(minas, filas);
        int minasy[]= sinRepetir(minas, columnas);
        for (int i = 0; i < minas; i++){
            JButton btn= new JButton();
            jPanel1.add(btn);
            btn.setText("1");
        }
        
    }
    
    
    public void ponerBonbas(){
        
        

        
    }
    
    public int[] sinRepetir(int cantidad, int aux){
        Random aleatorio = new Random();
        
        int a[]= new int[cantidad];
        int cont = 0;
        boolean bandera;
        boolean cero = false;
        
        while(cont < cantidad){
            int numero = (int)(aleatorio.nextDouble() * aux);
            bandera = true;
            
            for (int i = 0; i < cantidad; i++) {
                if(numero == a[i]){
                    bandera = false;
                }
                if(cero&&numero==1){
                    cero = true;
                    numero = 0;
                }
                if(bandera){
                    a[cont] = numero;
                    cont++;
                }
            }
        }
        return a;
    }
    
    
    public void estadoDeCelda(){
      
        int tablero = 4;
        //int minas = 10;
        int celdaVacia = 0;
        
        
        for (int filas = 0; filas < tablero; filas++){
            for (int columnas = 0; columnas < tablero; columnas++){
            
                JButton btn= new JButton();
                jPanel1.add(btn);
                btn.addActionListener(this);
                //btn.setBackground(Color.blue);
                
                
                                                        
                
            }
        }
        
        
        
    }
    
    
    public void ponerBombas(){
        
        
    }
    
    /*public void addListeners(){
        int tablero = 4;
        
        JButton btn= new JButton();
        
        for (int filas = 0; filas < tablero; filas++){
            for (int columnas = 0; columnas < tablero; columnas++){
                btn.addActionListener(new ActionListener(){
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        JButton evento = (JButton)evt.getSource();
                        JOptionPane.showMessageDialog(null, evento.getActionCommand());
                    }
                });
                
            }
        }
    }*/
    
    public void Devolver(){
    
        
    }
    
    
    public void Principal(){
        try {
            IniciaJuego();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void IniciaJuego(){
        
    }
    
    
    @Override
    
    public void actionPerformed(ActionEvent e) {
      JButton evento = (JButton)e.getSource();
      System.out.println("Se ha presionado el boton "+evento.getActionCommand());
     
      }
      
     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setText("tiempo");

        jTextField2.setText("minas");

        jButton1.setText("reset");

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 342));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 342, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscaminas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscaminas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
