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
        pnlMenu.setVisible(false);
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
        jLabel13 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido_p = new javax.swing.JTextField();
        txtApellido_m = new javax.swing.JTextField();
        txtFechaNac = new javax.swing.JTextField();
        txtDirecion = new javax.swing.JTextField();
        txtDistrito = new javax.swing.JTextField();
        txtProvincia = new javax.swing.JTextField();
        txtMonto = new javax.swing.JTextField();
        txtCodAula = new javax.swing.JTextField();
        txtColProc = new javax.swing.JTextField();
        btnRecord = new javax.swing.JButton();
        cmbSexo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDepartamento = new javax.swing.JTextField();
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
        btnCloseMenu = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        pnlBase = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblResult = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblResultTotal = new javax.swing.JLabel();
        lblMonto = new javax.swing.JLabel();
        btnOpenMenu = new javax.swing.JButton();

        jLabel1.setText("NOMBRE");

        jLabel2.setText("APELLIDO PATERNO");

        jLabel3.setText("APELLIDO MATERNO");

        jLabel4.setText("SEXO");

        jLabel5.setText("FECHA DE NACIMIENTO");

        jLabel6.setText("DIRECION");

        jLabel8.setText("DISTRITO");

        jLabel9.setText("PROVINCIA");

        jLabel10.setText("MONTO");

        jLabel11.setText("CODIGO DE AULA");

        jLabel13.setText("COLEGIO DE PROCEDENCIA");

        txtMonto.setText("250");

        btnRecord.setText("REGISTRAR");
        btnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecordActionPerformed(evt);
            }
        });

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MASCULINO", "FEMENINO", "HELIPCOTERO APACHE" }));

        jLabel7.setText("DNI");

        jLabel17.setText("DEPARTAMENTO");

        txtDepartamento.setText("PIURA");

        javax.swing.GroupLayout dlgRegisterLayout = new javax.swing.GroupLayout(dlgRegister.getContentPane());
        dlgRegister.getContentPane().setLayout(dlgRegisterLayout);
        dlgRegisterLayout.setHorizontalGroup(
            dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgRegisterLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(dlgRegisterLayout.createSequentialGroup()
                                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addGroup(dlgRegisterLayout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(122, 122, 122)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCodAula, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtApellido_p, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtApellido_m, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtFechaNac, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtDirecion, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtDistrito, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtMonto, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(txtColProc, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(cmbSexo, 0, 222, Short.MAX_VALUE)
                                        .addComponent(txtDni))))
                            .addGroup(dlgRegisterLayout.createSequentialGroup()
                                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel17))
                                .addGap(169, 169, 169)
                                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(txtDepartamento)))))
                    .addGroup(dlgRegisterLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(btnRecord)))
                .addGap(0, 21, Short.MAX_VALUE))
        );
        dlgRegisterLayout.setVerticalGroup(
            dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgRegisterLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(20, 20, 20)
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
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDistrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtCodAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(dlgRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtColProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnRecord)
                .addGap(81, 81, 81))
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

        btnCloseMenu.setBackground(new java.awt.Color(255, 255, 255));
        btnCloseMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\edgar\\Desktop\\PROGRAMACIÒN\\java\\colegio\\assets\\img\\cerrar.png")); // NOI18N
        btnCloseMenu.setBorder(null);
        btnCloseMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseMenuActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCloseMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnStudents)
                .addGap(20, 20, 20)
                .addComponent(btnTeacher)
                .addGap(20, 20, 20)
                .addComponent(btnCourses)
                .addGap(20, 20, 20)
                .addComponent(btnInscribir)
                .addGap(18, 18, 18)
                .addComponent(btnMatricula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(pnlBaseLayout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193)
                        .addComponent(lblMonto)
                        .addGap(18, 18, 18)
                        .addComponent(lblResultTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(283, 388, Short.MAX_VALUE))))
        );
        pnlBaseLayout.setVerticalGroup(
            pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBaseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlBaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete)
                    .addComponent(lblMonto)
                    .addComponent(lblResultTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
        );

        btnOpenMenu.setBackground(java.awt.SystemColor.activeCaptionBorder);
        btnOpenMenu.setIcon(new javax.swing.ImageIcon("C:\\Users\\edgar\\Desktop\\PROGRAMACIÒN\\java\\colegio\\assets\\img\\menu.png")); // NOI18N
        btnOpenMenu.setBorder(null);
        btnOpenMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnOpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnOpenMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
            
            PreparedStatement stm1 = con.prepareStatement("INSERT INTO matriculas (monto,colegio_proc,cod_aula,dni_estudiante) VALUES (?,?,?,?)");
            stm1.setInt(1, Integer.parseInt(txtMonto.getText()));
            stm1.setString(2, txtColProc.getText());
            stm1.setInt(3, Integer.parseInt(txtCodAula.getText()));
            stm1.setInt(4, Integer.parseInt(txtDni.getText()));
            stm1.executeUpdate();
            
            ResultSet rs =  Operations.getInstancia().getData("SELECT cod_matricula FROM matriculas WHERE dni_estudiante = " + Integer.parseInt(txtDni.getText()));
            
            int cod_matricula = 0;
            
            while(rs.next()){
                cod_matricula = rs.getInt("cod_matricula");
            }
            
            
            PreparedStatement stm = con.prepareStatement("INSERT INTO alumnos VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            stm.setInt(1, Integer.parseInt(txtDni.getText()));
            stm.setString(2, txtNombre.getText().toUpperCase());
            stm.setString(3, txtApellido_p.getText().toUpperCase());
            stm.setString(4, txtApellido_m.getText().toUpperCase());
            stm.setString(5, (String) cmbSexo.getSelectedItem());
            stm.setDate(6, (Date.valueOf(txtFechaNac.getText())));
            stm.setString(7, txtDistrito.getText().toUpperCase());
            stm.setString(8, txtProvincia.getText().toUpperCase());
            stm.setString(9, txtDirecion.getText().toUpperCase());
            stm.setInt(10, cod_matricula);
            stm.setInt(11, Integer.parseInt(txtCodAula.getText()));
            stm.setString(12, txtDepartamento.getText());
            
            stm.executeUpdate();
            //crear cuenta estudainte
            dlgRegister.dispose();
            resetForm(new JTextField[]{txtNombre, txtApellido_p, txtApellido_m, txtFechaNac, txtDistrito, txtProvincia, txtDirecion, txtMonto, txtCodAula, txtColProc});
            JOptionPane.showMessageDialog(null, "REGISTRO EXITOSO");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "DATOS INCORRECTOS");
        }
    }//GEN-LAST:event_btnRecordActionPerformed

    //ver tabla de matriculas
    private void btnMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatriculaActionPerformed
        btnCloseMenuActionPerformed(evt);
        tblResult.setSize(1210,  468);
        viewElements("REGISTRO DE MATRICULAS", false, true,true);
        ResultSet rs = Operations.getInstancia().getData("SELECT SUM(monto) AS total FROM matriculas");
        try {
            while (rs.next()) {
                lblResultTotal.setText("" + rs.getInt("total"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"COD MATRICULA", "DNI EST", "MONTO", "COD AULA", "COLEGIO_PROC"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM matriculas"), 4);
    }//GEN-LAST:event_btnMatriculaActionPerformed

    //lanza el jdialog para inscibir un alumno
    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        initDlg(dlgRegister, 526, 715, "INSCRIPCIÓN DE ESTUDIANTE");
    }//GEN-LAST:event_btnInscribirActionPerformed

    //Ver tabla de cursos
    private void btnCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursesActionPerformed
        btnCloseMenuActionPerformed(evt);
        tblResult.setSize(1210,  468);
        viewElements("REGISTRO DE CURSOS", true, false,false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"COD CURSO", "TITULO", "DURACION"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM cursos ORDER BY titulo"), 3);
    }//GEN-LAST:event_btnCoursesActionPerformed

    //Ver tabla de profesores
    private void btnTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTeacherActionPerformed
        btnCloseMenuActionPerformed(evt);
        tblResult.setSize(1210,  468);
        viewElements("REGISTRO DE PROFESORES", true, false,false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"DNI PROF", "NOMBRES", "APELLIDO P", "APELLIDO M", "SEXO", "FECHA DE NAC", "DIRRECIÓN", "DISTRITO", "PROVINCIA", "DEPARTAMENTO"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM profesores ORDER BY apellido_p"), 2);
    }//GEN-LAST:event_btnTeacherActionPerformed

    //Ver tabla de estudiantes
    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        btnCloseMenuActionPerformed(evt);
        tblResult.setSize(1210,  468);
        viewElements("REGISTRO DE ESTUDIANTES", false, false,false);
        tblResult.setModel(new javax.swing.table.DefaultTableModel(new Object[][]{}, new String[]{"DNI EST", "NOMBRES", "APELLIDO P", "APELLIDO M", "SEXO", "FECHA DE NAC", "DIRRECIÓN", "DISTRITO", "PROVINCIA", "DEPARTAMENTO", "COD AULA", "COD MATRICULA"}));
        fillTable(Operations.getInstancia().getData("SELECT * FROM alumnos ORDER BY apellido_p,apellido_m"), 1);
    }//GEN-LAST:event_btnStudentsActionPerformed

    //cargar elementos dinamicamente
    public void viewElements(String title, boolean viewBtnAdd, boolean viewLblMonto, boolean result) {
        lblTitle.setText(title);
        btnDelete.setVisible(true);
        jScrollPane1.setVisible(true);
        btnAdd.setVisible(viewBtnAdd);
        lblMonto.setVisible(viewLblMonto);
        lblResultTotal.setVisible(result);
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
                infoRows = new Object[]{rs.getInt("dni_estudiante"), rs.getString("nombres"), rs.getString("apellido_p"), rs.getString("apellido_m"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("direccion"), rs.getString("distrito"), rs.getString("provincia"), rs.getString("departamento"), rs.getInt("cod_aula"), rs.getInt("cod_matricula")};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 2) {
            try {
                infoRows = new Object[]{rs.getInt("dni_profesor"), rs.getString("nombres"), rs.getString("apellido_p"), rs.getString("apellido_m"), rs.getString("sexo"), rs.getDate("fecha_nac"), rs.getString("direccion"), rs.getString("distrito"), rs.getString("provincia"), rs.getString("departamento")};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 3) {
            try {
                infoRows = new Object[]{rs.getInt("cod_curso"), rs.getString("titulo"), rs.getInt("duracion") + " hrs"};
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        if (cod == 4) {
            try {
                infoRows = new Object[]{rs.getInt("cod_matricula"), rs.getInt("dni_estudiante"), rs.getString("monto"), rs.getString("cod_aula"), rs.getString("colegio_proc")};
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
                resetForm(new JTextField[]{txtTitulo, txtDuracion});
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
    public void resetForm(JTextField[] txt) {
        for (JTextField element : txt) {
            element.setText("");
        }
    }
    
    private void btnCloseMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseMenuActionPerformed
        pnlMenu.setVisible(false);
        btnOpenMenu.setVisible(true);
    }//GEN-LAST:event_btnCloseMenuActionPerformed

    private void btnOpenMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenMenuActionPerformed
        pnlMenu.setVisible(true);
        btnOpenMenu.setVisible(false);
    }//GEN-LAST:event_btnOpenMenuActionPerformed

  

    //mostrar interfaz
    public static void view() {
        java.awt.EventQueue.invokeLater(() -> {
            new AdmiInterface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCloseMenu;
    private javax.swing.JButton btnCourses;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnMatricula;
    private javax.swing.JButton btnOpenMenu;
    private javax.swing.JButton btnRecord;
    private javax.swing.JButton btnRegisterCourse;
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton btnTeacher;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JDialog dlgRegister;
    private javax.swing.JDialog dlgRegisterCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
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
    private javax.swing.JTextField txtCodAula;
    private javax.swing.JTextField txtColProc;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtDirecion;
    private javax.swing.JTextField txtDistrito;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtProvincia;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
