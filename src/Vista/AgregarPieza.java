/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Vista;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import Clases.*;
import Excepciones.*;
import javax.swing.JOptionPane;
import java.util.Date;


public class AgregarPieza extends javax.swing.JDialog {
    VentanaPrincipal vp2 = (VentanaPrincipal) this.getParent();
    Date fecha = new Date();
    
    public AgregarPieza(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(vp2);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textCodigoPieza = new javax.swing.JTextField();
        textPesoPieza = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaDescrip = new javax.swing.JTextArea();
        botonAgregar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        textCantidadPiezas = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        comboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        textCodigoCorrespondienteClientes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Pieza");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        jLabel6.setFont(new java.awt.Font("Consolas", 0, 18)); // NOI18N
        jLabel6.setText("Pieza");

        jLabel7.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel7.setText("Código:");

        jLabel8.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel8.setText("Peso:");

        textCodigoPieza.setBackground(new java.awt.Color(204, 204, 204));

        textPesoPieza.setBackground(new java.awt.Color(204, 204, 204));
        textPesoPieza.setToolTipText("El peso que introduzca será en kilogramos");
        textPesoPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPesoPiezaActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel9.setText("Descripción:");

        textAreaDescrip.setBackground(new java.awt.Color(204, 204, 204));
        textAreaDescrip.setColumns(20);
        textAreaDescrip.setRows(5);
        jScrollPane1.setViewportView(textAreaDescrip);

        botonAgregar.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonSalir.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        botonSalir.setText("Salir");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel10.setText("Cantidad de Piezas:");

        textCantidadPiezas.setBackground(new java.awt.Color(204, 204, 204));
        textCantidadPiezas.setToolTipText("Números naturales distintos de 0");

        jLabel11.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel11.setText("Tipo de Pieza:");

        comboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plástica", "Metálica", "Mixtas" }));
        comboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        jLabel1.setText("Código del Cliente Correspondiente:");

        textCodigoCorrespondienteClientes.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textCodigoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPesoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(242, 242, 242)
                            .addComponent(botonAgregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonSalir))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(textCodigoCorrespondienteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(229, 229, 229)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(31, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel7)
                    .addComponent(textCodigoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPesoPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(comboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(textCantidadPiezas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textCodigoCorrespondienteClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAgregar)
                    .addComponent(botonSalir))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPesoPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPesoPiezaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPesoPiezaActionPerformed

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        boolean error = false;
        switch(comboBox1.getSelectedIndex()){
            case 0 -> {
                try{
                    
                    try{
                        comprobar(textCodigoCorrespondienteClientes.getText());
                        try{
                            vp2.getE().addPieza(new PiezaPlastica(textCodigoPieza.getText(), textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                            vp2.getE().addSolicitud(new Solicitud(textCodigoCorrespondienteClientes.getText(),textCodigoPieza.getText(),fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900)));
                        }catch(CamposVacios | SolicitudIgual e){
                            error = true;
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    catch(NoExisteCliente e){
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }
                }catch(Positivos | PiezaIgual p){
                    error = true;
                    JOptionPane.showMessageDialog(null, p.getMessage());
                }catch(NumberFormatException e){
                    error = true;
                    JOptionPane.showMessageDialog(null, "Los campos de peso y cantidad de piezas deben ser números");
                }
            }

            case 1 -> {
                try{
                    try{
                        comprobar(textCodigoCorrespondienteClientes.getText());
                        try{
                            vp2.getE().addPieza(new PiezaMetalica(textCodigoPieza.getText(), textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                            vp2.getE().addSolicitud(new Solicitud(textCodigoCorrespondienteClientes.getText(),textCodigoPieza.getText(),fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900)));
                        }catch(CamposVacios | SolicitudIgual e){
                            error = true;
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    catch(NoExisteCliente e){
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }
                }catch(Positivos | PiezaIgual p){
                    error = true;
                    JOptionPane.showMessageDialog(null, p.getMessage());
                }catch(NumberFormatException e){
                    error = true;
                    JOptionPane.showMessageDialog(null, "Los campos de peso y cantidad de piezas deben ser números");
                }
            }

            case 2 -> {
                try{
                    try{
                        comprobar(textCodigoCorrespondienteClientes.getText());
                        try{
                            vp2.getE().addPieza(new PiezasMixtas(textCodigoPieza.getText(), textAreaDescrip.getText(), Double.parseDouble(textPesoPieza.getText()), Integer.parseInt(textCantidadPiezas.getText())));
                            vp2.getE().addSolicitud(new Solicitud(textCodigoCorrespondienteClientes.getText(),textCodigoPieza.getText(),fecha.getDate()+"/"+(fecha.getMonth()+1)+"/"+(fecha.getYear()+1900)));
                        }catch(CamposVacios | SolicitudIgual e){
                            error = true;
                            JOptionPane.showMessageDialog(null, e.getMessage());
                        }
                    }
                    catch(NoExisteCliente e){
                        error = true;
                        JOptionPane.showMessageDialog(null, "El código no corresponde a ningún cliente");
                    }
                }catch(Positivos | PiezaIgual p){
                    error = true;
                    JOptionPane.showMessageDialog(null, p.getMessage());
                }catch(NumberFormatException e){
                    error = true;
                    JOptionPane.showMessageDialog(null, "Los campos de peso y cantidad de piezas deben ser números");
                }
            }

        }
        
        if(error == false){
            vp2.imprimirListaSolicitudes();
            setVisible(false);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        setVisible(false);
    }//GEN-LAST:event_botonSalirActionPerformed

    private void comboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarPieza.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AgregarPieza dialog = new AgregarPieza(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    public void comprobar(String codigo) throws NoExisteCliente{
        for(int i=0; i<vp2.getE().getClientes().size(); i++){
            if(vp2.getE().getClientes().get(i).getCodigo().equals(codigo)){
                break;
            }else{
                if(i == vp2.getE().getClientes().size()-1){
                    throw new NoExisteCliente("No existe el cliente correspondiente");
                }
                
                
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonSalir;
    private javax.swing.JComboBox<String> comboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textAreaDescrip;
    private javax.swing.JTextField textCantidadPiezas;
    private javax.swing.JTextField textCodigoCorrespondienteClientes;
    private javax.swing.JTextField textCodigoPieza;
    private javax.swing.JTextField textPesoPieza;
    // End of variables declaration//GEN-END:variables
    public JTextArea getTextAreaDescrip() {
        return textAreaDescrip;
    }

    public JTextField getTextCantidadPiezas() {
        return textCantidadPiezas;
    }
    public JTextField getTextCodigoPieza() {
        return textCodigoPieza;
    }
    public JTextField getTextPesoPieza() {
        return textPesoPieza;
    }
    
}
