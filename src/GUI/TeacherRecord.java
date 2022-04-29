/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author M Azhar Durrani
 */
public class TeacherRecord extends javax.swing.JFrame {

    Connection con=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form TeacherRecord
     */
    public TeacherRecord() {
        initComponents();
        con=Connect.ConnectDB();
        Get_Data();
        setLocationRelativeTo(null);
    }
    
    private void Get_Data(){
        String sql = "select TeacherID as [Teacher ID], FirstName as [First Name], LastName as [Last Name], FatherName as [Father Name], EmailAddress as [Email Address], ContactNo as [Contact Number], CNIC as [CNIC], Salary as [Salary], Designation as [Designation], AcademicQualification as [Academic Qualification], Address as [Address], Gender as [Gender] from TeacherRecord";
        try{
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            dataTableTeacher.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataTableTeacher = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        staffRecord = new javax.swing.JButton();
        teacherForm = new javax.swing.JButton();
        staffForm = new javax.swing.JButton();
        studentRecord = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Teacher Record");

        dataTableTeacher.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        dataTableTeacher.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Fathers Name", "CNIC", "Date Of Birth", "Mobile Number", "Address", "Gender", "Email Address", "Designation ", "Salary", "Identification", "Qualifications", "Experience", "Joining Date"
            }
        ));
        dataTableTeacher.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTableTeacherMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(dataTableTeacher);

        backButton.setText("Main Menu");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        staffRecord.setText("Staff Record");
        staffRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffRecordActionPerformed(evt);
            }
        });

        teacherForm.setText("Teacher Form");
        teacherForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherFormActionPerformed(evt);
            }
        });

        staffForm.setText("Staff Form");
        staffForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffFormActionPerformed(evt);
            }
        });

        studentRecord.setText("Student Record");
        studentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentRecordActionPerformed(evt);
            }
        });

        jButton11.setText("Logout");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton1.setText("Export To Excell");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Print Receipt");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(staffRecord)
                .addGap(18, 18, 18)
                .addComponent(teacherForm)
                .addGap(18, 18, 18)
                .addComponent(staffForm)
                .addGap(18, 18, 18)
                .addComponent(studentRecord)
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {backButton, jButton11, staffForm, staffRecord, studentRecord, teacherForm});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffRecord)
                    .addComponent(backButton)
                    .addComponent(teacherForm)
                    .addComponent(staffForm)
                    .addComponent(studentRecord)
                    .addComponent(jButton11)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {backButton, jButton11, staffForm, staffRecord, studentRecord, teacherForm});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dataTableTeacherMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTableTeacherMouseClicked
            try{
            con = Connect.ConnectDB();
            int row = dataTableTeacher.getSelectedRow();
            String tableClick = dataTableTeacher.getModel().getValueAt(row, 0).toString();
            String sql = "select * from TeacherRecord where TeacherID='"+tableClick+"'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            if(rs.next()){
                this.hide();
                TeacherForm teacher=new TeacherForm();
                teacher.setVisible(true);
                String add1 = rs.getString("TeacherID");
                teacher.teacherIdField.setText(add1);
                String add2 = rs.getString("FirstName");
                teacher.firstNameField.setText(add2);
                String add3 = rs.getString("LastName");
                teacher.lastNameField.setText(add3);
                String add4 = rs.getString("FatherName");
                teacher.fatherNameField.setText(add4);
                String add5 = rs.getString("EmailAddress");
                teacher.emailAddress.setText(add5);
                String add6 = rs.getString("ContactNo");
                teacher.mobileField.setText(add6);
                String add7 = rs.getString("CNIC");
                teacher.cnicField.setText(add7);
                String add8 = rs.getString("Salary");
                teacher.salaryField.setText(add8);
                String add9 = rs.getString("Designation");
                teacher.designationField.setText(add9);
                String add10 = rs.getString("AcademicQualification");
                teacher.aqField.setText(add10);
                String add11 = rs.getString("Address");
                teacher.addressField.setText(add11);
                String add12 = rs.getString("Gender");
                teacher.cmbGender.setSelectedItem(add12);
                String add14 = rs.getString("Experience");
                teacher.experienceField.setText(add14);
                String add13 = rs.getString("DateOfJoinning");
                teacher.joinningDateField.setText(add13);
                teacher.deleteButton.setEnabled(true);
                teacher.saveButton.setEnabled(false);
            }
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_dataTableTeacherMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       MainMenu m =new MainMenu();
       m.setVisible(true);
       this.hide();
    }//GEN-LAST:event_backButtonActionPerformed

    private void staffRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffRecordActionPerformed
        StaffRecord record=new StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffRecordActionPerformed

    private void teacherFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherFormActionPerformed
        TeacherForm form=new TeacherForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_teacherFormActionPerformed

    private void staffFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffFormActionPerformed
        StaffForm form=new StaffForm();
        this.hide();
        form.setVisible(true);
    }//GEN-LAST:event_staffFormActionPerformed

    private void studentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentRecordActionPerformed
        StudentRecord record = new StudentRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_studentRecordActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        Login login=new Login();
        this.hide();
        login.setVisible(true);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TeacherRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JTable dataTableTeacher;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton staffForm;
    private javax.swing.JButton staffRecord;
    private javax.swing.JButton studentRecord;
    private javax.swing.JButton teacherForm;
    // End of variables declaration//GEN-END:variables
}
