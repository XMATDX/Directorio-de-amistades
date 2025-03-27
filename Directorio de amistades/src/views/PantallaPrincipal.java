/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.DirectorioAmistades.views;

import autonoma.DirectorioAmistades.models.Amigo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * Clase donde se va mostra todos los iconos de las cosa que va hacer el 
 *  este sistema .
 * 
 * @author  Mateo Quintero
 * @version 0.1
 * @since   2025/03/20
 * @see     autonoma.DirectorioAmistades.views
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private  ArrayList<Amigo> amigos;
    public PantallaPrincipal( ArrayList<Amigo> amigos) {
        
        this.amigos = amigos;
        
        initComponents();
        
        //para que ejecute en la mitad
        this.setLocationRelativeTo(null);
        
    }
    private void moueseEntered(JPanel panel){
        
        // cuzndo el mouese esta ensima de menu
        // da color al panel
        panel.setBackground(new Color(54,0,110));
    
    }
    
    
    private void moueseExited(JPanel panel){
        
      // cundo el mouese esta fuera del menu
      // da color al panel
      panel.setBackground(new Color(153,153,255));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        letrero = new javax.swing.JPanel();
        TxtLetrero = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JPanel();
        ImanAgregarAmigo = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JPanel();
        ImanBuscarAmigo = new javax.swing.JLabel();
        TxtAgrgarAmigo = new javax.swing.JLabel();
        TxtAgregarAmigo = new javax.swing.JLabel();
        BtnInformacion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        BtnSalir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 240));

        letrero.setBackground(new java.awt.Color(153, 153, 255));

        TxtLetrero.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtLetrero.setForeground(new java.awt.Color(51, 51, 51));
        TxtLetrero.setText("Directorio de amistades ");

        javax.swing.GroupLayout letreroLayout = new javax.swing.GroupLayout(letrero);
        letrero.setLayout(letreroLayout);
        letreroLayout.setHorizontalGroup(
            letreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, letreroLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addComponent(TxtLetrero)
                .addGap(60, 60, 60))
        );
        letreroLayout.setVerticalGroup(
            letreroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(letreroLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(TxtLetrero)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        BtnAgregar.setBackground(new java.awt.Color(153, 153, 255));
        BtnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnAgregarMouseExited(evt);
            }
        });

        ImanAgregarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/DirectorioAmistades/imagenes/IconAgregar.png"))); // NOI18N
        ImanAgregarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImanAgregarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImanAgregarAmigoMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout BtnAgregarLayout = new javax.swing.GroupLayout(BtnAgregar);
        BtnAgregar.setLayout(BtnAgregarLayout);
        BtnAgregarLayout.setHorizontalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnAgregarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImanAgregarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnAgregarLayout.setVerticalGroup(
            BtnAgregarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnAgregarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ImanAgregarAmigo)
                .addContainerGap())
        );

        ImanAgregarAmigo.getAccessibleContext().setAccessibleName("ImAgregar");

        BtnBuscar.setBackground(new java.awt.Color(153, 153, 255));
        BtnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnBuscarMouseExited(evt);
            }
        });

        ImanBuscarAmigo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/DirectorioAmistades/imagenes/IconBuscar.png"))); // NOI18N
        ImanBuscarAmigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ImanBuscarAmigoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ImanBuscarAmigoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ImanBuscarAmigoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BtnBuscarLayout = new javax.swing.GroupLayout(BtnBuscar);
        BtnBuscar.setLayout(BtnBuscarLayout);
        BtnBuscarLayout.setHorizontalGroup(
            BtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImanBuscarAmigo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        BtnBuscarLayout.setVerticalGroup(
            BtnBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ImanBuscarAmigo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TxtAgrgarAmigo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        TxtAgrgarAmigo.setForeground(new java.awt.Color(0, 0, 0));
        TxtAgrgarAmigo.setText("Agregar Amigo ");

        TxtAgregarAmigo.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        TxtAgregarAmigo.setForeground(new java.awt.Color(0, 0, 0));
        TxtAgregarAmigo.setText("Buscar Amigo");

        BtnInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnInformacionMouseClicked(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Informacion");

        javax.swing.GroupLayout BtnInformacionLayout = new javax.swing.GroupLayout(BtnInformacion);
        BtnInformacion.setLayout(BtnInformacionLayout);
        BtnInformacionLayout.setHorizontalGroup(
            BtnInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnInformacionLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        BtnInformacionLayout.setVerticalGroup(
            BtnInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnInformacionLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Salir");

        javax.swing.GroupLayout BtnSalirLayout = new javax.swing.GroupLayout(BtnSalir);
        BtnSalir.setLayout(BtnSalirLayout);
        BtnSalirLayout.setHorizontalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnSalirLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        BtnSalirLayout.setVerticalGroup(
            BtnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAgrgarAmigo))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(TxtAgregarAmigo))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 117, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(letrero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(BtnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(letrero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAgregarAmigo)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtAgrgarAmigo)
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //////////////////////////////////////////////////////////
    /// Agregar amigo Color
    private void BtnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseEntered
        // cundo el mouese esta ensima de  Agregar amigo
        this.moueseEntered(BtnAgregar);
    }//GEN-LAST:event_BtnAgregarMouseEntered

    private void BtnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAgregarMouseExited
        // cundo el mouese esta fuera de  Agregar amigo
        this.moueseExited(BtnAgregar);
    }//GEN-LAST:event_BtnAgregarMouseExited

    private void ImanAgregarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImanAgregarAmigoMouseEntered
       // cundo el mouese esta ensima de  Agregar amigo
        this.moueseEntered(BtnAgregar);
    }//GEN-LAST:event_ImanAgregarAmigoMouseEntered

    //////////////////////////////////////////////////////////
    /// Buscar Amigo clic
    private void ImanBuscarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImanBuscarAmigoMouseClicked
       // cundo el mouese le da clic de  Buscar Amigo
       
       JfBucarAmigo ventanaBucar = new JfBucarAmigo (this,true,this.amigos);
       ventanaBucar.setVisible(true);
    }//GEN-LAST:event_ImanBuscarAmigoMouseClicked

    //////////////////////////////////////////////////////////
    /// Buscar Amigo Color
    private void ImanBuscarAmigoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImanBuscarAmigoMouseEntered
        // cundo el mouese esta ensima de  Buscar Amigo
        this.moueseEntered(BtnBuscar);
    }//GEN-LAST:event_ImanBuscarAmigoMouseEntered

    private void BtnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseEntered
        this.moueseEntered(BtnBuscar);
    }//GEN-LAST:event_BtnBuscarMouseEntered

    private void ImanAgregarAmigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImanAgregarAmigoMouseClicked
        
        JfAgregarAmigo ventanaAmigos = new JfAgregarAmigo (this,true,this.amigos);
        ventanaAmigos.setVisible(true);
        
    }//GEN-LAST:event_ImanAgregarAmigoMouseClicked

    private void ImanBuscarAmigoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ImanBuscarAmigoMouseExited
        this.moueseExited(BtnBuscar);
    }//GEN-LAST:event_ImanBuscarAmigoMouseExited

    private void BtnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnBuscarMouseExited
        
        this.moueseExited(BtnBuscar);
    }//GEN-LAST:event_BtnBuscarMouseExited

    //Parar salir
    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        //Parar salir
        this.dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

        //mostrar informacion
    private void BtnInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnInformacionMouseClicked
      JOptionPane.showMessageDialog(null, """
                           \u2981\tTaller de Directorio Amistades.
                           \u2981\tAsignatura Fundamentos de POO .
                           \u2981\tdesarrolladores Mateo Quintero Morales.""");
    }//GEN-LAST:event_BtnInformacionMouseClicked

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnAgregar;
    private javax.swing.JPanel BtnBuscar;
    private javax.swing.JPanel BtnInformacion;
    private javax.swing.JPanel BtnSalir;
    private javax.swing.JLabel ImanAgregarAmigo;
    private javax.swing.JLabel ImanBuscarAmigo;
    private javax.swing.JLabel TxtAgregarAmigo;
    private javax.swing.JLabel TxtAgrgarAmigo;
    private javax.swing.JLabel TxtLetrero;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel letrero;
    // End of variables declaration//GEN-END:variables


}
