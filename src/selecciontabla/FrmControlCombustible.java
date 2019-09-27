/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selecciontabla;

import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author CBN
 */
public class FrmControlCombustible extends javax.swing.JFrame {

    /**
     * Creates new form FrmControlCombustible
     */
    ArrayList<ControlCombustible> controlCombustible;
    long i;
    Calendar c;
    int idMod;

    public FrmControlCombustible() {
        initComponents();
        controlCombustible = new ArrayList();
        c = Calendar.getInstance();
        i = controlCombustible.size() + 1;
        txtCantGalones.setText("");
        txtTotalPagado.setText("");
        btnModificar.setEnabled(false);
        mostrarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtTotalPagado = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantGalones = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRegistros = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu = new javax.swing.JMenu();
        menuGuardar = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();
        menuModificar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Cant Galones");

        txtTotalPagado.setText("txtTotalPagado");

        jLabel3.setText("Total pagado");

        txtCantGalones.setText("txtCantGalones");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        tableRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRegistrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRegistros);

        menu.setText("Archivo");

        menuGuardar.setText("Guardar");
        menu.add(menuGuardar);

        menuSalir.setText("Modificar");
        menu.add(menuSalir);

        menuModificar.setText("Salir");
        menu.add(menuModificar);

        jMenuBar1.add(menu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addComponent(btnGuardar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtTotalPagado)
                                .addComponent(txtCantGalones, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTotalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCantGalones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        agregar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tableRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRegistrosMouseClicked
        // TODO add your handling code here:
        seleccionarDato(tableRegistros.rowAtPoint(evt.getPoint()));
    }//GEN-LAST:event_tableRegistrosMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificar();
    }//GEN-LAST:event_btnModificarActionPerformed

    public void seleccionarDato(int dato) {
        idMod = dato;
        txtCantGalones.setText(Double.toString(controlCombustible.get(idMod).getCantCombustible()));
        txtTotalPagado.setText(Integer.toString(controlCombustible.get(idMod).getValorTanqueo()));
        btnGuardar.setEnabled(false);
        btnModificar.setEnabled(true);
    }

    public void modificar() {
        controlCombustible.get(idMod).setValorTanqueo(Integer.parseInt(txtTotalPagado.getText()));
        controlCombustible.get(idMod).setCantCombustible(Double.parseDouble(txtCantGalones.getText()));
        txtCantGalones.setText("");
        txtTotalPagado.setText("");
        mostrarTabla();
        btnGuardar.setEnabled(true);
        btnModificar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Dato modificado con exito", "Control Combustible", JOptionPane.INFORMATION_MESSAGE);
    }

    public void agregar() {
        controlCombustible.add(new ControlCombustible(i, obtenerFechaActual(), Double.parseDouble(txtCantGalones.getText()), Integer.parseInt(txtTotalPagado.getText())));
        i++;
        txtCantGalones.setText("");
        txtTotalPagado.setText("");
        mostrarTabla();
        JOptionPane.showMessageDialog(null, "Dato agregado con exito", "Control Combustible", JOptionPane.INFORMATION_MESSAGE);
    }

    public void mostrarTabla() {
        String[] columnNames = {"Id", "Fecha", "Total pagado", "Cant. Galones"};
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(columnNames);
        Object[] fila = new Object[tableModel.getColumnCount()];

        for (int i = 0; i < controlCombustible.size(); i++) {

            fila[0] = controlCombustible.get(i).getIdRegistro();
            fila[1] = controlCombustible.get(i).getFechaRegistro();
            fila[2] = controlCombustible.get(i).getValorTanqueo();
            fila[3] = controlCombustible.get(i).getCantCombustible();
            tableModel.addRow(fila);
        }
        tableRegistros.setModel(tableModel);
    }

    public String obtenerFechaActual() {
        String fecha;
        String dia = Integer.toString(c.get(Calendar.DATE));
        String mes = Integer.toString(c.get(Calendar.MONTH));
        String anio = Integer.toString(c.get(Calendar.YEAR));
        fecha = dia + "/" + mes + "/" + anio;
        return fecha;
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
            java.util.logging.Logger.getLogger(FrmControlCombustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmControlCombustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmControlCombustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmControlCombustible.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmControlCombustible().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuModificar;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JTable tableRegistros;
    private javax.swing.JTextField txtCantGalones;
    private javax.swing.JTextField txtTotalPagado;
    // End of variables declaration//GEN-END:variables
}
