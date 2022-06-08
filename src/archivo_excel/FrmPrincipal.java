/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package archivo_excel;

import ConexionDAO.Conexion;
import DTO.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alexg
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
   
    DefaultTableModel TablaModelo = new DefaultTableModel();
    List<Datos> listaDatos = new ArrayList<Datos>();       
    int id = 0;             
    
    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        cargartitulostabla();
        cargar();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtsexo = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtcelular = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnexportar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Edad", "Sexo", "Correo", "Celular"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TablaMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnexportar.setText("Exportar");
        btnexportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexportarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("Registro");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setText("Edad");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Sexo");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Correo");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel6.setText("Celular");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtedad, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcelular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAgregar)
                            .addComponent(btnactualizar)
                            .addComponent(btneliminar)
                            .addComponent(btnexportar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jLabel1)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtedad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtcelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addComponent(btnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnactualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnexportar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
          Conexion conexion = new Conexion();
         Datos datos = new Datos();
        
        datos.setNombre(txtnombre.getText());
        datos.setEdad (Integer.valueOf(txtedad.getText()));
        datos.setSexo(txtsexo.getText());
        datos.setCorreo(txtcorreo.getText());
        datos.setCelular((txtcelular.getText()));
        
         if(conexion.insertar(datos)){
            JOptionPane.showMessageDialog(this, "Se grabo correctamente...");
            TablaModelo= (DefaultTableModel) Tabla.getModel();
            TablaModelo.getDataVector().removeAllElements();
            cargar();
          }else{
            JOptionPane.showMessageDialog(this, "Error al grabar...");
         
         }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        // TODO add your handling code here:
        Conexion conexion = new Conexion();
         Datos datos = new Datos();
         int vid = 0;
         
        datos.setId(vid);
        datos.setNombre(txtnombre.getText());
        datos.setEdad (Integer.valueOf(txtedad.getText()));
        datos.setSexo(txtsexo.getText());
        datos.setCorreo(txtcorreo.getText());
        datos.setCelular((txtcelular.getText()));
        
           if(conexion.actualizar(datos)){
            JOptionPane.showMessageDialog(this, "Se actualizo correctamente...");
            TablaModelo= (DefaultTableModel) Tabla.getModel();
            TablaModelo.getDataVector().removeAllElements();
            cargar();
          }else{
            JOptionPane.showMessageDialog(this, "Error al actualizar...");
         
         }
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        Datos datos = new Datos();
        Conexion conexion = new Conexion();
        int vid = 0;

        datos.setId(vid);

        if (conexion.borrar(vid)){
            JOptionPane.showMessageDialog(this, "Se borrar correctamente....", "borrar",JOptionPane.INFORMATION_MESSAGE);
            TablaModelo = (DefaultTableModel) Tabla.getModel();
            TablaModelo.getDataVector().removeAllElements();
            cargar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al borrar los datos", "Error",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btneliminarActionPerformed

    private void TablaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMousePressed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Se preciono algun lugar de la tabla","Seleccion",JOptionPane.INFORMATION_MESSAGE);
        int columna = Tabla.getSelectedColumn();
        int fila = Tabla.getSelectedRow();
        String cadena = Tabla.getValueAt(fila, columna).toString();
        JOptionPane.showMessageDialog(null, "Columna -> " + columna + "\n fila -> " + fila + "\n informacion en la celda -> " + cadena,"Posicion seleccionada ",JOptionPane.INFORMATION_MESSAGE);
        txtnombre.setText(Tabla.getValueAt(fila, 1).toString());
        txtedad.setText(Tabla.getValueAt(fila, 2).toString());
        txtsexo.setText(Tabla.getValueAt(fila, 3).toString());
        txtcorreo.setText(Tabla.getValueAt(fila, 4).toString());
        txtcelular.setText(Tabla.getValueAt(fila, 5).toString());
        id = Integer.valueOf(Tabla.getValueAt(fila, 0).toString());
    }//GEN-LAST:event_TablaMousePressed

    private void btnexportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexportarActionPerformed
        // TODO add your handling code here:
        JFileChooser seleccionarArchivo = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
        
        seleccionarArchivo.setFileFilter(filtro);
        
        int seleccionar = seleccionarArchivo.showOpenDialog(this);
        if(seleccionar == JFileChooser.APPROVE_OPTION){
            File archivo = seleccionarArchivo.getSelectedFile();
            guerdarArchivo(archivo);
        }       
        
    }//GEN-LAST:event_btnexportarActionPerformed

    public void guerdarArchivo(File archivo){
        
        FileWriter fichero = null;
        PrintWriter pw = null;
        
        try{
            fichero = new FileWriter(archivo);
            pw = new PrintWriter(fichero);
            
            for(Datos datos: listaDatos){
                String linea = datos.getNombre()+","+datos.getEdad()+","+datos.getSexo()+","+datos.getCorreo()+","+datos.getCelular();
                pw.println(linea);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            try{
               if(fichero!=null){
                   fichero.close();
               } 
            } catch (Exception e){  
                e.printStackTrace();
            }
        }
    }
     private void cargar(){
         Conexion conexion = new Conexion();
         if (conexion.consultartodos()){
             listaDatos = conexion.getListaDatos();
         }else{
             JOptionPane.showMessageDialog(this, "Error al cargar los datos", "Error",JOptionPane.INFORMATION_MESSAGE);
         }
     
         if (listaDatos.size() > 0 && listaDatos !=null ){
             cargarcontenido();
         }
    }
    
    private void cargarcontenido(){
        Object[] filatabla = new Object[6];
        for (Datos datos : listaDatos){
            filatabla[0]= datos.getId();
            filatabla[1]=datos.getNombre();
            filatabla[2]=datos.getEdad();
            filatabla[3]=datos.getSexo();
            filatabla[4]=datos.getCorreo();
            filatabla[5]=datos.getCelular();
            TablaModelo.addRow(filatabla);
        }
        Tabla.setModel(TablaModelo);
    }
    public void cargartitulostabla(){
        TablaModelo.addColumn("id");
        TablaModelo.addColumn("nombre");
        TablaModelo.addColumn("edad");
        TablaModelo.addColumn("sexo");
        TablaModelo.addColumn("correo");
        TablaModelo.addColumn("celular");
        Tabla.setModel(TablaModelo);
    }
   
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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnexportar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    // End of variables declaration//GEN-END:variables
}
