/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import dominio.Propiedad;
import javax.swing.JOptionPane;
import negocio.PropiedadControl;

/**
 *
 * @author angel
 */
public class FrmPropiedad extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmPropiedad
     */
    
    private final PropiedadControl CONTROL;
    private Propiedad obj;
    
    public FrmPropiedad() {
        initComponents();
        this.CONTROL = new PropiedadControl();
        this.obj = new Propiedad();
        this.list("");
        showList();
        txtId.setVisible(false);
    }
    private void list(String texto){
        try {
            table.setModel(this.CONTROL.listar(texto));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    private void messageOk(String text){
        JOptionPane.showMessageDialog(this, text, "Sistema DDA", JOptionPane.INFORMATION_MESSAGE);
    }
    private void messageError(String text){
        JOptionPane.showMessageDialog(this, text, "Sistema DDA", JOptionPane.ERROR_MESSAGE);
    }
    private void messageWarning(String text){
        JOptionPane.showMessageDialog(this, text, "Sistema DDA", JOptionPane.WARNING_MESSAGE);
    }
    private int messageQuestion(String text){
        int resp = 0;
        resp = JOptionPane.showConfirmDialog(this, text, "Sistema DDA", JOptionPane.YES_NO_OPTION);
        return resp;
    }
    private void showList(){
        tabGeneral.setSelectedIndex(0);
        tabGeneral.setEnabledAt(0, true);
        tabGeneral.setEnabledAt(1, false);
    }
    private void showMaintenance(){
        tabGeneral.setSelectedIndex(1);
        tabGeneral.setEnabledAt(0, false);
        tabGeneral.setEnabledAt(1, true);
    }
    private void clean(){
        this.txtName.setText("");
        this.txtId.setText("");
        this.txtCaract.setText("");
        this.txtDir.setText("");
        this.spinPrice.setValue(0);
    }
    private void loadComboBoxCat(){
        comBoxState.removeAllItems();
        comBoxState.addItem("Alquilado");
        comBoxState.addItem("Disponible");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabGeneral = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        lblName3 = new javax.swing.JLabel();
        lblName4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCaract = new javax.swing.JTextArea();
        spinPrice = new javax.swing.JSpinner();
        comBoxState = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtDir = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setText("Buscar");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        btnSearch.setText("Buscar");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(table);

        btnNew.setText("Nueva");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSearch)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNew)
                    .addComponent(btnEdit)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Listado", jPanel1);

        lblName.setText("Dirección:");

        btnSave.setText("Guardar");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Actualizar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setText("ID:");

        lblName1.setText("Características:");

        lblName2.setText("Precio Alquiler:");

        lblName3.setText("Estado:");

        lblName4.setText("Nombre:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtCaract.setColumns(20);
        txtCaract.setRows(5);
        jScrollPane2.setViewportView(txtCaract);

        spinPrice.setDoubleBuffered(true);
        spinPrice.setName(""); // NOI18N

        txtDir.setColumns(20);
        txtDir.setRows(5);
        jScrollPane3.setViewportView(txtDir);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName4)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(jLabel2))
                                        .addGap(45, 45, 45))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(lblName1)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblName3)
                                        .addGap(42, 42, 42))
                                    .addComponent(lblName2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(spinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(comBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancel)))
                .addContainerGap(232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName4)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comBoxState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancel))
                .addGap(37, 37, 37))
        );

        tabGeneral.addTab("Mantenimiento", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabGeneral)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed

    private void txtBuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyPressed
        // TODO add your handling code here:
        this.list(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyPressed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        this.list(txtBuscar.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        showMaintenance();
        loadComboBoxCat();
        clean();
        txtId.setVisible(false);
        btnUpdate.setVisible(false);
        btnSave.setVisible(true);
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (table.getSelectedRowCount() != 1) {
            messageWarning("Seleccione una fila primero");
            return;
        }

        String id = String.valueOf(table.getValueAt(table.getSelectedRow(), 0));
        String code = String.valueOf(table.getValueAt(table.getSelectedRow(), 1));
        String name = String.valueOf(table.getValueAt(table.getSelectedRow(), 2));
        String description = String.valueOf(table.getValueAt(table.getSelectedRow(), 3));
        String price = String.valueOf(table.getValueAt(table.getSelectedRow(), 5));
        String cate = String.valueOf(table.getValueAt(table.getSelectedRow(), 6));

        showMaintenance();
        loadComboBoxCat();
        this.btnUpdate.setVisible(true);
        this.btnSave.setVisible(false);

        int priceInt = (int) Double.parseDouble(price);
        txtId.setText(id);
        txtId.setVisible(true);
        txtId.setEnabled(false);
        txtName.setText(code);
        txtDir.setText(name);
        txtCaract.setText(description);
        spinPrice.setValue(priceInt);
        comBoxState.setSelectedItem(cate);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String resp = "";
        String id;
        int i = table.getSelectedRow();
        if(i == -1){
            messageError("Seleciones una fila primero");
        }else{
            if(messageQuestion("¿Desea eliminar el registro?") == 0){
                id = String.valueOf(table.getValueAt(i, 0));
                resp = CONTROL.eliminar(Integer.parseInt(id));
                if(resp.equals("OK")){
                    messageOk("Registro eliminado");
                    this.list("");
                }else{
                    messageError(resp);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String resp = "";
        String dir, name, caract, est;
        double price;
        name = txtName.getText();
        dir = txtDir.getText();
        caract = txtCaract.getText();
        price = Double.valueOf(spinPrice.getValue().toString());
        est = comBoxState.getSelectedItem().toString();
        if(name.equals("")){
            messageWarning("Ingrese el nombre");
        }else{
            obj.setNombre(name);
            obj.setDireccion(dir);
            obj.setCaracteristicas(caract);
            obj.setPrecioAlquiler(price);
            obj.setEstado(est);
            resp = CONTROL.insertar(obj);
            if(resp.equals("OK")){
                messageOk("Registro Insertado");
                clean();
                this.list("");
                showList();
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        String resp = "";
        int id;
        String dir, name, caract, est;
        double price;
        id = Integer.parseInt(txtId.getText());
        name = txtName.getText();
        dir = txtDir.getText();
        caract = txtCaract.getText();
        price = Double.valueOf(spinPrice.getValue().toString());
        est = comBoxState.getSelectedItem().toString();
        if (name.isEmpty()) {
            messageWarning("You should input a name!");
            return;
        }
        obj.setId(id);
        obj.setNombre(name);
            obj.setDireccion(dir);
            obj.setCaracteristicas(caract);
            obj.setPrecioAlquiler(price);
            obj.setEstado(est);
        resp = CONTROL.actualizar(obj);
        if (resp.equals("OK")) {
            messageOk("Registro actualizado");
            clean();
            this.list("");
            showList();
        } else {
            messageError("Error: " + resp);
            clean();
            //this.list("",10,1);
            showList();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        clean();
        showList();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> comBoxState;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JSpinner spinPrice;
    private javax.swing.JTabbedPane tabGeneral;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtCaract;
    private javax.swing.JTextArea txtDir;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}