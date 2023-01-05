
package Vista;

import Clases.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;


public class VentanaPrincipal extends javax.swing.JFrame {
    private final Empresa e = new Empresa();
    
    public VentanaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaClientes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        listSolicitudes = new javax.swing.JList<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        archivoGuardar = new javax.swing.JMenuItem();
        archivoCargar = new javax.swing.JMenuItem();
        Solicitudes = new javax.swing.JMenu();
        nuevoCliente = new javax.swing.JMenuItem();
        nuevaPieza = new javax.swing.JMenuItem();
        datosPieza = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empresa de Encargos");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));

        listaClientes.setBackground(new java.awt.Color(204, 204, 204));
        listaClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 14))); // NOI18N
        listaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaClientes);

        listSolicitudes.setBackground(new java.awt.Color(204, 204, 204));
        listSolicitudes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Solicitudes de Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Consolas", 0, 14))); // NOI18N
        listSolicitudes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(listSolicitudes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");

        archivoGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        archivoGuardar.setText("Guardar Como");
        archivoGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(archivoGuardar);

        archivoCargar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        archivoCargar.setText("Abrir Archivo");
        archivoCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoCargarActionPerformed(evt);
            }
        });
        jMenu1.add(archivoCargar);

        jMenuBar1.add(jMenu1);

        Solicitudes.setText("Solicitudes");

        nuevoCliente.setText("Nuevo Cliente");
        nuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoClienteActionPerformed(evt);
            }
        });
        Solicitudes.add(nuevoCliente);

        nuevaPieza.setText("Solicitar Nueva Pieza");
        nuevaPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevaPiezaActionPerformed(evt);
            }
        });
        Solicitudes.add(nuevaPieza);

        datosPieza.setText("Datos de una pieza");
        datosPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datosPiezaActionPerformed(evt);
            }
        });
        Solicitudes.add(datosPieza);

        jMenuBar1.add(Solicitudes);

        setJMenuBar(jMenuBar1);

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

    private void nuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoClienteActionPerformed
        AgregarCliente v1 = new AgregarCliente(this, rootPaneCheckingEnabled);
        v1.setVisible(true);
    }//GEN-LAST:event_nuevoClienteActionPerformed

    private void nuevaPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevaPiezaActionPerformed
        if(getE().getClientes().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe Introducir al menos un cliente primero");
        }else{
            AgregarPieza v2 = new AgregarPieza(this, rootPaneCheckingEnabled);
            v2.setVisible(true);
            
        }
    }//GEN-LAST:event_nuevaPiezaActionPerformed

    private void listaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaClientesMouseClicked
        String codigo = getE().getClientes().get(listaClientes.getSelectedIndex()).getCodigo();
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i=0; i<getE().getSolicitudes().size(); i++){
            if(getE().getSolicitudes().get(i).getCodigoClienteCorrespondiente().equals(codigo)){
                numeros.add(i);
            }
        }
        int[] ejasi = new int[numeros.size()];
        for(int i=0; i<ejasi.length; i++){
            ejasi[i]=numeros.get(i);
        }
        listSolicitudes.setSelectedIndices(ejasi);
    }//GEN-LAST:event_listaClientesMouseClicked

    private void datosPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datosPiezaActionPerformed
        int indice = getIndice();
        if(indice >= 0){
            mostrarDatosPieza(getE().getSolicitudes().get(indice).getCodigoPiezaCorrespondiente());
        }
    }//GEN-LAST:event_datosPiezaActionPerformed

    private void archivoGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoGuardarActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int r = jfc.showSaveDialog(null);
            if(r == JFileChooser.APPROVE_OPTION){
                ObjectOutputStream guardar = new ObjectOutputStream(Files.newOutputStream(jfc.getSelectedFile().toPath()));
                guardar.writeObject(getE().getClientes());
                guardar.writeObject(getE().getPiezas());
                guardar.writeObject(getE().getSolicitudes());
            }
        }catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_archivoGuardarActionPerformed

    private void archivoCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoCargarActionPerformed
        try {
            JFileChooser jfc = new JFileChooser();
            jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
            int r = jfc.showOpenDialog(null);
            if(r == JFileChooser.APPROVE_OPTION){
            ObjectInputStream cargar = new ObjectInputStream(Files.newInputStream(jfc.getSelectedFile().toPath())); //va el filechoser
            getE().setClientes((ArrayList<Cliente>)cargar.readObject());
            getE().setPiezas((ArrayList<Pieza>)cargar.readObject());
            getE().setSolicitudes((ArrayList<Solicitud>)cargar.readObject());
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        imprimirListaCliente();
        imprimirListaSolicitudes();
    }//GEN-LAST:event_archivoCargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    public Empresa getE() {
        return e;
    }


    public void imprimirListaCliente(){
        DefaultListModel <String> modelo = new DefaultListModel<>();
        for(int i=0; i<getE().getClientes().size(); i++){
            modelo.add(i, "Código: "+getE().getClientes().get(i).getCodigo()+" || Correo: "+getE().getClientes().get(i).getCorreo()+" || Forma de Pago: "+getE().getClientes().get(i).getFormaPago());
        }
        listaClientes.setModel(modelo);
    }

    
    public void imprimirListaSolicitudes(){
        DefaultListModel <String> modelo = new DefaultListModel<>();
        for(int i=0; i<getE().getSolicitudes().size(); i++){
            modelo.add(i, (i+1)+".- Código del Cliente: "+getE().getSolicitudes().get(i).getCodigoClienteCorrespondiente()+" || Código de la Pieza: "+getE().getSolicitudes().get(i).getCodigoPiezaCorrespondiente()+" || Fecha: "+getE().getSolicitudes().get(i).getFecha());
        }
        listSolicitudes.setModel(modelo);    
    }
    public void seleccionarSolicitudes(){
        
        int index = listaClientes.getSelectedIndex();
        String codigo = getE().getClientes().get(index).getCodigo();
        for(int i=0; i<getE().getSolicitudes().size(); i++){
            if(getE().getSolicitudes().get(i).getCodigoClienteCorrespondiente().equals(codigo)){
                listSolicitudes.setSelectedIndex(i);
            }
        }
    }
    public int getIndice()throws NumberFormatException{
        try{
            int indice = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el número de la solicitud de la pieza que desea: ", "Datos de una pieza", 1));
            if(indice == 0 || indice > getE().getSolicitudes().size()){
                JOptionPane.showMessageDialog(null, "Por favor asegúrese de que el número le corresponda a una solicitud y sea distinto de 0", "Rectifique", 1);
            }else{
                return indice-1;
            }      
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El índice debe ser un número natural distinto de 0", "Error", 2);
        }
        return -1;  
    }
    
    public void mostrarDatosPieza(String s){
        for (int i=0; i<getE().getPiezas().size(); i++){
            if(getE().getPiezas().get(i).getCodigo().equals(s)){
                JOptionPane.showMessageDialog(null, "Código: "+getE().getPiezas().get(i).getCodigo()+"\nPeso: "+getE().getPiezas().get(i).getPeso()+"Kg\nCantidad de Piezas: "+getE().getPiezas().get(i).getCantidadPiezas()+"\nDescripción: "+getE().getPiezas().get(i).getDescripcion()+"\nCosto de la pieza: $"+getE().getPiezas().get(i).calcularCosto(getE().getPiezas().get(i).getPeso()), "Resultado", 1);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Solicitudes;
    private javax.swing.JMenuItem archivoCargar;
    private javax.swing.JMenuItem archivoGuardar;
    private javax.swing.JMenuItem datosPieza;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> listSolicitudes;
    private javax.swing.JList<String> listaClientes;
    private javax.swing.JMenuItem nuevaPieza;
    private javax.swing.JMenuItem nuevoCliente;
    // End of variables declaration//GEN-END:variables

    public JList<String> getListaClientes() {
        return listaClientes;
    }
}
