package admi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JDialog;

//paquetes del proyecto
import database.Operations;
import javax.swing.JTextField;


public class AdmiInterface extends javax.swing.JFrame {

    public AdmiInterface() {
        initComponents();
        setLocationRelativeTo(null);
        btnAdd.setVisible(false);
        jScrollPane1.setVisible(false);
        btnDelete.setVisible(false);
        lblMonto.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgRegister = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido_p = new javax.swing.JTextField();
        txtApellido_m = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtGrado = new javax.swing.JTextField();
        txtSeccion = new javax.swing.JTextField();
        txtColProc = new javax.swing.JTextField();
        btnRecord = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        cmbSexo = new javax.swing.JComboBox<>();
        dlgRegisterCourse = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtDuracion = new javax.swing.JTextField();
        btnRegisterCourse = new javax.swing.JButton();
        pnlMenu = new javax.swing.JPanel();
        btnStudents = new javax.swing.JButton();
        btnTeacher = new javax.swing.JButton();
        btnCourses = new javax.swing.JButton();
        btnInscribir = new javax.swing.JButton();
        btnMatricula = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        pnlBase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblResultTotal = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO PATERNO");

        jLabel3.setText("APELLIDO MATERNO");

        jLabel4.setText("SEXO");

        jLabel5.setText("FECHA DE NACIMIENTO");

        jLabel6.setText("DIRECION");

        jLabel8.setText("DISTRITO");

        jLabel9.setText("PROVINCIA");

        jLabel10.setText("MONTO");

        jLabel11.setText("GRADO");

        jLabel12.setText("SECCIÓN");

        jLabel13.setText("COLEGIO DE PROCEDENCIA");

        btnRecord.setText("REGISTRAR");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        jLabel14.setText("Categoria");

        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PRIMARIA ", "SECUNDARIA" }));

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO", "HELIPCOTERO APACHE" }));

        javax.swing.GroupLayout dlgRegisterLayout = new javax.swing.GroupLayout(dlgRegister.getContentPane());
        dlgRegister.getContentPane().setLayout(dlgRegisterLayout);
        dlgRegisterLayout.setHorizontalGroup(
            dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtColProc, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtApellido_p, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                        .addComponent(txtNombre)
                        .addComponent(txtApellido_m)
                        .addComponent(txtFechaNac)
                        .addComponent(txtDirecion)
                        .addComponent(txtSeccion)
                        .addComponent(cmbSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(btnRecord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgRegisterLayout.setVerticalGroup(
            dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellido_p, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtGrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtSeccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(btnRecord)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel15.setText("TITULO");

        jLabel16.setText("DURACIÓN");

        btnRegisterCourse.setText("REGISTRAR");
        btnRegisterCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterCourseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgRegisterCourseLayout = new javax.swing.GroupLayout(dlgRegisterCourse.getContentPane());
        dlgRegisterCourse.getContentPane().setLayout(dlgRegisterCourseLayout);
        dlgRegisterCourseLayout.setHorizontalGroup(
            dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterCourseLayout.createSequentialGroup()
                .addGroup(dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgRegisterCourseLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(25, 25, 25)
                        .addGroup(dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTitulo)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)))
                    .addGroup(dlgRegisterCourseLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnRegisterCourse)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        dlgRegisterCourseLayout.setVerticalGroup(
            dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterCourseLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(dlgRegisterCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnRegisterCourse)
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(255, 255, 255));

        btnStudents.setBackground(new java.awt.Color(255, 255, 255));
        btnStudents.setText("REGISTRO DE ESTUDIANTES");
        btnStudents.setBorder(null);
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        btnTeacher.setBackground(new java.awt.Color(255, 255, 255));
        btnTeacher.setText("REGISTRO DE PROFESORES");
        btnTeacher.setBorder(null);
        btnTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTeacherActionPerformed(evt);
            }
        });

        btnCourses.setBackground(new java.awt.Color(255, 255, 255));
        btnCourses.setText("REGISTRO DE CURSOS");
        btnCourses.setBorder(null);
        btnCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoursesActionPerformed(evt);
            }
        });

        btnInscribir.setBackground(new java.awt.Color(255, 255, 255));
        btnInscribir.setText("INSCRIBIR ALUMNO");
        btnInscribir.setBorder(null);
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnMatricula.setBackground(new java.awt.Color(255, 255, 255));
        btnMatricula.setText("REGISTRO DE MATRICULAS");
        btnMatricula.setBorder(null);
        btnMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlMenuLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCourses, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTeacher, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(btnStudents)
                .addGap(20, 20, 20)
                .addComponent(btnTeacher)
                .addGap(20, 20, 20)
                .addComponent(btnCourses)
                .addGap(20, 20, 20)
                .addComponent(btnInscribir)
                .addGap(18, 18, 18)
                .addComponent(btnMatricula)
                .addContainerGap(326, Short.MAX_VALUE))
        );

        lblTitle.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        tblResult.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblResult.setEnabled(false);
        jScrollPane1.setViewportView(tblResult);

        btnAdd.setBackground(new java.awt.Color(0, 255, 51));
        btnAdd.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnAdd.setText("AGREGAR");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(250, 0, 0));
        btnDelete.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("ELIMINAR");
        btnDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblMonto.setText("MONTO TOTAL");

        javax.swing.GroupLayout pnlBaseLayout = new javax.swing.GroupLayout(pnlBase);
        pnlBase.setLayout(pnlBaseLayout);
        pnlBaseLayout.setHorizontalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBaseLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMonto)
                .addGap(37, 37, 37)
                .addComponent(lblResultTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(241, 241, 241))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblResultTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMonto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(6, 6, 6)
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitle)
                .addGap(25, 25, 25)
                .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Eliminar un registro de alguna de las tablas
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
            String[] info = lblTitle.getText().split(" ");
            if (info[2].equals("ESTUDIANTES")) {
                int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL CODIGO DEL ESTUDIANTE"));
                Operations.getInstancia().executeQuery("DELETE FROM alumnos WHERE cod_estudiante = " + cod);
                btnStudentsActionPerformed(evt);
            }
            if (info[2].equals("PROFESORES")) {
                int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL CODIGO DEL PROFESOR"));
                Operations.getInstancia().executeQuery("DELETE FROM profesores WHERE cod_profesor = " + cod);
                btnTeacherActionPerformed(evt);
            }
            if (info[2].equals("CURSOS")) {
                int cod = Integer.parseInt(JOptionPane.showInputDialog(null, "INGRESE EL CODIGO DEL CURSO"));
                Operations.getInstancia().executeQuery("DELETE FROM cursos WHERE cod_curso = " + cod);
                btnCoursesActionPerformed(evt);
            }
        } catch (HeadlessException | NumberFormatException e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    //registrar informacion de un estudiante
    private void btnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecordActionPerformed
        try (Connection con = database.Operations.getInstancia().init()) {
            PreparedStatement stm = con.prepareStatement("INSERT INTO alumnos (nombres,apellido_p,apellido_m,sexo,fecha_nac,distrito,provincia,direccion) VALUES (?,?,?,?,?,?,?,?,?)");
            stm.setString(1, txtNombre.getText().toUpperCase());
            stm.setString(2, txtApellido_p.getText().toUpperCase());
            stm.setString(3, txtApellido_m.getText().toUpperCase());
            stm.setString(4, (String) cmbSexo.getSelectedItem());
            stm.setDate(5, (Date.valueOf(txtFechaNac.getText())));
            stm.setString(6, txtDistrito.getText().toUpperCase());
            stm.setString(7, txtProvincia.getText().toUpperCase());
            stm.setString(8, txtDirecion.getText().toUpperCase());

            PreparedStatement stm1 = con.prepareStatement("INSERT INTO matriculas (nombres,apellido_p,apellido_m,monto,grado,seccion,categoria,colegio_proc) VALUES (?,?,?,?,?,?,?,?)");
            stm1.setString(1, txtNombre.getText().toUpperCase());
            stm1.setString(2, txtApellido_p.getText().toUpperCase());
            stm1.setString(3, txtApellido_m.getText().toUpperCase());
            stm1.setInt(4, Integer.parseInt(txtMonto.getText()));
            stm1.setInt(5, Integer.parseInt(txtGrado.getText()));
            stm1.setString(6, txtSeccion.getText());
            stm1.setString(7, (String) cmbCategoria.getSelectedItem());
            stm1.setString(8, txtColProc.getText());
            stm.executeUpdate();
            stm1.executeUpdate();
            dlgRegister.dispose();
            resetForm(new JTextField[]{txtNombre,txtApellido_p,txtApellido_m,txtFechaNac,txtDistrito,txtProvincia,txtDirecion,txtMonto,txtGrado,txtSeccion,txtColProc});
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
        }
    }//GEN-LAST:event_btnRecordActionPerformed

    //ver tabla de matriculas
    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        viewElements("REGISTRO DE MATRICULAS", false, true);
        ResultSet rs = Operations.getInstancia().getData("SELECT SUM(monto) AS total FROM matriculas");
        try {
            while (rs.next()) {
                lblResultTotal.setText("" + rs.getInt("total"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"COD MATRICULA", "NOMBRE", "APELLIDO P", "APELLIDO M", "MONTO", "GRADO", "SECCION", "COLEGIO_PROC"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM matriculas"), 4);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    //lanza el jdialog para inscibir un alumno
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        initDlg(dlgRegister, 507, 705, "INSCRIPCIÓN DE ESTUDIANTE");
    }//GEN-LAST:event_btnInscribirActionPerformed

    //Ver tabla de cursos
    private void btnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursesActionPerformed
        viewElements("REGISTRO DE CURSOS", true, false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"ID", "TITULO", "DURACION"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM cursos"), 3);
    }//GEN-LAST:event_btnCoursesActionPerformed

    //Ver tabla de profesores
    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        viewElements("REGISTRO DE PROFESORES", true, false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"COD PROF", "NOMBRE", "APELLIDO P", "APELLIDO M", "SEXO", "FECHA DE NAC", "DISTRITO", "PROVINCIA", "CIUDAD", "DIRRECIÓN"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM profesores"), 2);
    }//GEN-LAST:event_btnTeacherActionPerformed

    //Ver tabla de estudiantes
    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        viewElements("REGISTRO DE ESTUDIANTES", false, false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"COD EST", "NOMBRE", "APELLIDO P", "APELLIDO M", "SEXO", "FECHA DE NAC", "DISTRITO", "PROVINCIA","DIRRECIÓN"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM alumnos"), 1);
    }//GEN-LAST:event_btnStudentsActionPerformed

    //cargar elementos dinamicamente
    public void viewElements(String title, boolean viewBtnAdd, boolean viewLblMonto) {
        lblTitle.setText(title);
        btnDelete.setVisible(true);
        jScrollPane1.setVisible(true);
        btnAdd.setVisible(viewBtnAdd);
        lblMonto.setVisible(viewLblMonto);
    }

    //llenar tabla
    private void fillTable(ResultSet rs, int cod) {
        resetTable();
        DefaultTableModel model = (DefaultTableModel) tblResult.getModel();
        try {
            while (rs.next()) {
                model.addRow(completeRows(rs, cod));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    //resetear tabla
    private void resetTable() {
        DefaultTableModel model = (DefaultTableModel) tblResult.getModel();
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    //obtener informacion de la db
    private Object[] completeRows(ResultSet rs, int cod) {
        Object[] infoRows = {};
        if (cod == 1) {
            try {
                infoRows = new Object[]{"00" + rs.getInt("cod_estudiante"), rs.getString("nombres"), rs.getString("apellido_p"), rs.getString("apellido_m"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("distrito"), rs.getString("provincia"), rs.getString("direccion")};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 2) {
            try {
                infoRows = new Object[]{"00" + rs.getInt("cod_profesor"), rs.getString("nombres"), rs.getString("apellido_p"), rs.getString("apellido_m"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("distrito"), rs.getString("provincia"), rs.getString("ciudad"), rs.getString("direccion")};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 3) {
            try {
                infoRows = new Object[]{"00" + rs.getInt("cod_curso"), rs.getString("titulo"), rs.getInt("duracion") + " hrs"};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 4) {
            try {
                infoRows = new Object[]{"00" + rs.getInt("cod_matricula"), rs.getString("nombres"), rs.getString("apellido_p"), rs.getString("apellido_m"), rs.getInt("monto"), rs.getInt("grado"), rs.getString("seccion"), rs.getString("colegio_proc")};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return infoRows;
    }

    //añadir algun registro de una de las tablas
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        String[] info = lblTitle.getText().split(" ");
        if (info[2].equals("PROFESORES")) {

        }
        if (info[2].equals("CURSOS")) {
            initDlg(dlgRegisterCourse, 330, 220, "REGISTRAR UN CURSO");
        }

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRegisterCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterCourseActionPerformed

        String[] info = lblTitle.getText().split(" ");
        if (info[2].equals("PROFESORES")) {

        }
        if (info[2].equals("CURSOS")) {
            try (Connection con = database.Operations.getInstancia().init()) {
                PreparedStatement stm = con.prepareStatement("INSERT INTO cursos (titulo,duracion) VALUES (?,?)");
                stm.setString(1, txtTitulo.getText().toUpperCase());
                stm.setInt(2, Integer.parseInt(txtDuracion.getText()));
                stm.executeUpdate();
                dlgRegisterCourse.dispose();
                resetForm(new JTextField[]{txtTitulo,txtDuracion});
            } catch (SQLException | HeadlessException | NumberFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }//GEN-LAST:event_btnRegisterCourseActionPerformed

    //mostrar un jdialog
    public void initDlg(JDialog dlg, int width, int height, String title) {
        dlg.setSize(width, height);
        dlg.setResizable(false);
        dlg.setTitle(title);
        dlg.setLocationRelativeTo(null);
        dlg.setVisible(true);
    }
    
    //limpiar JtextFields 
    public void resetForm(JTextField[] txt){
        for(JTextField element: txt ){
            element.setText("");
        }
    }
    
    //mostrar interfaz
    public static void view() {
        java.awt.EventQueue.invokeLater(() -> {
            new AdmiInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JDialog dlgRegister;
    private javax.swing.JDialog dlgRegisterCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblResultTotal;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBase;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JTable tblResult;
    private javax.swing.JTextField txtApellido_m;
    private javax.swing.JTextField txtApellido_p;
    private javax.swing.JTextField txtColProc;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtGrado;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtSeccion;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
