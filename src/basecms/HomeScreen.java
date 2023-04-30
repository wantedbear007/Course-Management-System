/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package basecms;
import java.util.*;
import java.sql.ResultSet;
import javax.swing.table.*;

/**
 *
 * @author prata
 */
public class HomeScreen extends javax.swing.JFrame {


    public HomeScreen() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        adminLoginJPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        userpass = new javax.swing.JTextField();
        userid = new javax.swing.JTextField();
        loginbutton = new javax.swing.JButton();
        userGender = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        parentHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        developerBtn = new javax.swing.JButton();
        teacherHome = new javax.swing.JPanel();
        leftUserDesc = new javax.swing.JLabel();
        rightUserIcon = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        adminLogin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        credError = new javax.swing.JLabel();
        adminPage = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        courseBtn = new java.awt.Button();
        addUserBtn = new java.awt.Button();
        studentsBtn = new java.awt.Button();
        teachersBtn = new java.awt.Button();
        newUser = new javax.swing.JPanel();
        backbtn = new java.awt.Button();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        uRegistration = new javax.swing.JTextField();
        uContact = new javax.swing.JTextField();
        uName = new javax.swing.JTextField();
        uEmail = new javax.swing.JTextField();
        uPassword = new javax.swing.JTextField();
        uAge = new javax.swing.JTextField();
        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        others = new javax.swing.JRadioButton();
        uDepartment = new javax.swing.JTextField();
        registerBtn = new java.awt.Button();
        errorF = new javax.swing.JLabel();
        availableUsers = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        backbtn2 = new java.awt.Button();
        jScrollPane2 = new javax.swing.JScrollPane();
        usersTable = new javax.swing.JTable();
        availableCourses = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        backbtn1 = new java.awt.Button();
        jScrollPane1 = new javax.swing.JScrollPane();
        coursesTable = new javax.swing.JTable();
        loginForm = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        userUserName = new javax.swing.JTextField();
        userPassword = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        teacherLogin = new javax.swing.JButton();
        invalidWar = new javax.swing.JLabel();
        availableCoursesTeacher = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        coursesTable1 = new javax.swing.JTable();
        rightUserIcon1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        addNewCourse = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        rightUserIcon2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        uRegistration1 = new javax.swing.JTextField();
        uRegistration2 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        uRegistration3 = new javax.swing.JTextField();
        uRegistration4 = new javax.swing.JTextField();
        uRegistration5 = new javax.swing.JTextField();
        uRegistration7 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton7 = new javax.swing.JButton();
        jLabel44 = new javax.swing.JLabel();
        pendingFees = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        coursesTable2 = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        adminLoginJPanel.setMaximumSize(new java.awt.Dimension(884, 529));
        adminLoginJPanel.setMinimumSize(new java.awt.Dimension(884, 529));
        adminLoginJPanel.setPreferredSize(new java.awt.Dimension(955, 594));
        adminLoginJPanel.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setText("Enter Credentails");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        adminLoginJPanel.add(jLabel2);
        jLabel2.setBounds(600, 100, 270, 130);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel4.setText("Login as Admin");
        adminLoginJPanel.add(jLabel4);
        jLabel4.setBounds(100, 220, 270, 130);

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel5.setText("Password:");
        adminLoginJPanel.add(jLabel5);
        jLabel5.setBounds(600, 340, 85, 23);

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel6.setText("Username: ");
        adminLoginJPanel.add(jLabel6);
        jLabel6.setBounds(600, 290, 98, 23);

        userpass.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userpassActionPerformed(evt);
            }
        });
        adminLoginJPanel.add(userpass);
        userpass.setBounds(700, 340, 140, 29);

        userid.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useridActionPerformed(evt);
            }
        });
        adminLoginJPanel.add(userid);
        userid.setBounds(700, 290, 140, 29);

        loginbutton.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });
        adminLoginJPanel.add(loginbutton);
        loginbutton.setBounds(600, 390, 240, 30);

        adminLoginJPanel.getAccessibleContext().setAccessibleName("");
        adminLoginJPanel.getAccessibleContext().setAccessibleDescription("");
        adminLoginJPanel.getAccessibleContext().setAccessibleParent(adminLoginJPanel);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        parentHome.setToolTipText("");
        parentHome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        parentHome.setMaximumSize(new java.awt.Dimension(1048, 615));
        parentHome.setMinimumSize(new java.awt.Dimension(1048, 615));
        parentHome.setPreferredSize(new java.awt.Dimension(1048, 615));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        jLabel1.setText("Sign In ");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        adminBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        adminBtn.setText("ADMIN");
        adminBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });

        teacherBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        teacherBtn.setText("TEACHER");
        teacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherBtnActionPerformed(evt);
            }
        });

        studentBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        studentBtn.setText("STUDENT");
        studentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBtnActionPerformed(evt);
            }
        });

        desc.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        desc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/thumbnail.png"))); // NOI18N
        desc.setText("Welcome to CMS");
        desc.setName(""); // NOI18N

        developerBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        developerBtn.setText("Developers");

        javax.swing.GroupLayout parentHomeLayout = new javax.swing.GroupLayout(parentHome);
        parentHome.setLayout(parentHomeLayout);
        parentHomeLayout.setHorizontalGroup(
            parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentHomeLayout.createSequentialGroup()
                .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(parentHomeLayout.createSequentialGroup()
                        .addGap(691, 691, 691)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, parentHomeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(parentHomeLayout.createSequentialGroup()
                                .addComponent(developerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                                .addGap(643, 643, 643))
                            .addGroup(parentHomeLayout.createSequentialGroup()
                                .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(teacherBtn)
                                    .addComponent(jLabel1))
                                .addGap(17, 17, 17)))))
                .addGap(124, 124, 124))
        );

        parentHomeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adminBtn, jLabel1, studentBtn, teacherBtn});

        parentHomeLayout.setVerticalGroup(
            parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentHomeLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(parentHomeLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 33, Short.MAX_VALUE))
                    .addGroup(parentHomeLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(126, 126, 126)
                .addComponent(developerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addGap(17, 17, 17))
        );

        parentHomeLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adminBtn, jLabel1, studentBtn, teacherBtn});

        teacherHome.setMaximumSize(new java.awt.Dimension(1048, 615));
        teacherHome.setMinimumSize(new java.awt.Dimension(1048, 615));
        teacherHome.setPreferredSize(new java.awt.Dimension(1048, 615));

        leftUserDesc.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        leftUserDesc.setText("Welcome to Course Mangement System, ");

        rightUserIcon.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rightUserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        rightUserIcon.setText("USER");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/money.png"))); // NOI18N

        jButton3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton3.setText("Available Courses");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/online-learning (1).png"))); // NOI18N

        jButton4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton4.setText("Add New Course");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add-file.png"))); // NOI18N

        jButton5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton5.setText("Student Pending Fees");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout teacherHomeLayout = new javax.swing.GroupLayout(teacherHome);
        teacherHome.setLayout(teacherHomeLayout);
        teacherHomeLayout.setHorizontalGroup(
            teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherHomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(leftUserDesc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightUserIcon)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherHomeLayout.createSequentialGroup()
                .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherHomeLayout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jButton3)
                        .addGap(37, 37, 37)
                        .addComponent(jButton4))
                    .addGroup(teacherHomeLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel36)
                        .addGap(98, 98, 98)
                        .addComponent(jLabel37)))
                .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherHomeLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton5))
                    .addGroup(teacherHomeLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel35)))
                .addContainerGap(258, Short.MAX_VALUE))
        );

        teacherHomeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton3, jButton4, jButton5});

        teacherHomeLayout.setVerticalGroup(
            teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teacherHomeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(teacherHomeLayout.createSequentialGroup()
                        .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftUserDesc)
                            .addComponent(rightUserIcon))
                        .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(teacherHomeLayout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, teacherHomeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel35))))
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teacherHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton4)
                        .addComponent(jButton5))
                    .addComponent(jButton3))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        adminLogin.setMaximumSize(new java.awt.Dimension(1048, 615));
        adminLogin.setMinimumSize(new java.awt.Dimension(1048, 615));
        adminLogin.setPreferredSize(new java.awt.Dimension(1048, 615));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel7.setText("Enter Credentails");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel8.setText("Login as Admin");

        username.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        username.setText("root");
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });

        password.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        password.setText("root");
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel9.setText("Username: ");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("Password: ");

        loginBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminLoginLayout = new javax.swing.GroupLayout(adminLogin);
        adminLogin.setLayout(adminLoginLayout);
        adminLoginLayout.setHorizontalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginBtn)
                            .addGroup(adminLoginLayout.createSequentialGroup()
                                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(148, 148, 148))))
            .addGroup(adminLoginLayout.createSequentialGroup()
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel8))
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(backBtn)))
                .addGap(317, 690, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(credError)
                .addGap(173, 173, 173))
        );
        adminLoginLayout.setVerticalGroup(
            adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminLoginLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(adminLoginLayout.createSequentialGroup()
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(adminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(loginBtn)
                .addGap(59, 59, 59)
                .addComponent(credError)
                .addGap(165, 165, 165))
        );

        adminPage.setMaximumSize(new java.awt.Dimension(1048, 615));
        adminPage.setMinimumSize(new java.awt.Dimension(1048, 615));
        adminPage.setPreferredSize(new java.awt.Dimension(1048, 615));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel11.setText("Welcome Rupali !");

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/student.png"))); // NOI18N
        jLabel16.setText(".");

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/add-user (1).png"))); // NOI18N
        jLabel17.setText(".");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/online-learning.png"))); // NOI18N
        jLabel18.setText(".");

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/teacher.png"))); // NOI18N
        jLabel19.setText(".");

        courseBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        courseBtn.setLabel("Courses");
        courseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBtnActionPerformed(evt);
            }
        });

        addUserBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        addUserBtn.setLabel("Add New User");
        addUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserBtnActionPerformed(evt);
            }
        });

        studentsBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        studentsBtn.setLabel("Students");
        studentsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentsBtnActionPerformed(evt);
            }
        });

        teachersBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        teachersBtn.setLabel("Teachers");
        teachersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teachersBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPageLayout = new javax.swing.GroupLayout(adminPage);
        adminPage.setLayout(adminPageLayout);
        adminPageLayout.setHorizontalGroup(
            adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPageLayout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPageLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(90, 90, 90)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(teachersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(studentsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(138, 138, 138))
        );

        adminPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addUserBtn, courseBtn, studentsBtn, teachersBtn});

        adminPageLayout.setVerticalGroup(
            adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPageLayout.createSequentialGroup()
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminPageLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPageLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel17))
                        .addGap(19, 19, 19)
                        .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teachersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(260, 260, 260))
        );

        adminPageLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addUserBtn, courseBtn, studentsBtn, teachersBtn});

        newUser.setMaximumSize(new java.awt.Dimension(1048, 615));
        newUser.setMinimumSize(new java.awt.Dimension(1048, 615));

        backbtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backbtn.setLabel("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel12.setText("Enter the details below to add new user: ");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setText("Registration Number: ");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Full Name:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel15.setText("Contact number: +91");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setText("Email Address: ");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setText("School Department:");

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setText("Age: ");

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setText("Gender: ");

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel24.setText("Password:");

        jLabel25.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("All fields are mandatory");

        uRegistration.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration.setText(".");
        uRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistrationActionPerformed(evt);
            }
        });

        uContact.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uContact.setText(".");
        uContact.setToolTipText("Enter your contact number");
        uContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uContactActionPerformed(evt);
            }
        });

        uName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uName.setText(".");
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });

        uEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uEmail.setText(".");
        uEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uEmailActionPerformed(evt);
            }
        });

        uPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uPassword.setText(".");
        uPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPasswordActionPerformed(evt);
            }
        });

        uAge.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uAge.setText(".");
        uAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uAgeActionPerformed(evt);
            }
        });

        userGender.add(female);
        female.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        female.setText("Female");

        userGender.add(male);
        male.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        userGender.add(others);
        others.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        others.setText("Others");

        uDepartment.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uDepartment.setText(".");
        uDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uDepartmentActionPerformed(evt);
            }
        });

        registerBtn.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        registerBtn.setLabel("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        errorF.setForeground(new java.awt.Color(236, 0, 0));

        javax.swing.GroupLayout newUserLayout = new javax.swing.GroupLayout(newUser);
        newUser.setLayout(newUserLayout);
        newUserLayout.setHorizontalGroup(
            newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(newUserLayout.createSequentialGroup()
                            .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel24)
                                .addComponent(jLabel20)
                                .addComponent(jLabel15)
                                .addComponent(jLabel14)
                                .addComponent(jLabel22)
                                .addComponent(jLabel21)
                                .addComponent(jLabel23)
                                .addComponent(jLabel25))
                            .addGap(33, 33, 33)
                            .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(errorF)
                                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(uName, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(uContact, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(uEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(uPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addComponent(uRegistration)
                                    .addComponent(uAge, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                                    .addGroup(newUserLayout.createSequentialGroup()
                                        .addComponent(male)
                                        .addGap(18, 18, 18)
                                        .addComponent(female)
                                        .addGap(18, 18, 18)
                                        .addComponent(others))
                                    .addComponent(uDepartment, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))))))
                .addContainerGap(318, Short.MAX_VALUE))
        );
        newUserLayout.setVerticalGroup(
            newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newUserLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jLabel25)
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(uRegistration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(uName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(uContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(uEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(uDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(uAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(female)
                    .addComponent(male)
                    .addComponent(others))
                .addGap(18, 18, 18)
                .addGroup(newUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(uPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(errorF)
                .addGap(13, 13, 13)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        availableUsers.setMaximumSize(new java.awt.Dimension(1048, 615));
        availableUsers.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel27.setText("Resistered Users: ");

        backbtn2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backbtn2.setLabel("Back");
        backbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn2ActionPerformed(evt);
            }
        });

        usersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Registration Number", "Contact Number", "Email Address", "Department", "Age", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(usersTable);

        javax.swing.GroupLayout availableUsersLayout = new javax.swing.GroupLayout(availableUsers);
        availableUsers.setLayout(availableUsersLayout);
        availableUsersLayout.setHorizontalGroup(
            availableUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableUsersLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(availableUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(availableUsersLayout.createSequentialGroup()
                        .addComponent(backbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel27)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        availableUsersLayout.setVerticalGroup(
            availableUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableUsersLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(availableUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27)
                    .addComponent(backbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        availableCourses.setMaximumSize(new java.awt.Dimension(1048, 615));
        availableCourses.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel26.setText("List of Available Online Courses:");

        backbtn1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        backbtn1.setLabel("Back");
        backbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtn1ActionPerformed(evt);
            }
        });

        coursesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.no", "Course Name", "Tutor / Organization", "Duration", "Price", "Rating", "Certification", "Enrolled Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(coursesTable);

        javax.swing.GroupLayout availableCoursesLayout = new javax.swing.GroupLayout(availableCourses);
        availableCourses.setLayout(availableCoursesLayout);
        availableCoursesLayout.setHorizontalGroup(
            availableCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCoursesLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(availableCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 981, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(availableCoursesLayout.createSequentialGroup()
                        .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel26)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        availableCoursesLayout.setVerticalGroup(
            availableCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCoursesLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(availableCoursesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel26)
                    .addComponent(backbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        loginForm.setMaximumSize(new java.awt.Dimension(1048, 615));
        loginForm.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/teacher (1).png"))); // NOI18N
        jLabel28.setText("Login as a Teacher");

        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton1.setText("Back");

        jLabel29.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel29.setText("Enter Credentails");
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel30.setText("Username: ");

        userUserName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userUserName.setText("12212215");
        userUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUserNameActionPerformed(evt);
            }
        });

        userPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userPassword.setText("9907224577");
        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel31.setText("Password: ");

        teacherLogin.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        teacherLogin.setText("Login");
        teacherLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLoginActionPerformed(evt);
            }
        });

        invalidWar.setForeground(new java.awt.Color(245, 0, 0));

        javax.swing.GroupLayout loginFormLayout = new javax.swing.GroupLayout(loginForm);
        loginForm.setLayout(loginFormLayout);
        loginFormLayout.setHorizontalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginFormLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addGap(143, 143, 143)
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidWar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(loginFormLayout.createSequentialGroup()
                                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel31))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel29)
                                    .addComponent(teacherLogin))
                                .addGap(15, 15, 15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        loginFormLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {userPassword, userUserName});

        loginFormLayout.setVerticalGroup(
            loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginFormLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel28)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginFormLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(userUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(loginFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(userPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherLogin)
                        .addGap(103, 103, 103)
                        .addComponent(invalidWar)
                        .addGap(108, 108, 108))))
        );

        availableCoursesTeacher.setMaximumSize(new java.awt.Dimension(1048, 615));
        availableCoursesTeacher.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel32.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel32.setText("List of Available Online Courses:");

        coursesTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.no", "Course Name", "Tutor / Organization", "Duration", "Price", "Rating", "Certification", "Enrolled Students"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(coursesTable1);

        rightUserIcon1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rightUserIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        rightUserIcon1.setText("USER");

        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout availableCoursesTeacherLayout = new javax.swing.GroupLayout(availableCoursesTeacher);
        availableCoursesTeacher.setLayout(availableCoursesTeacherLayout);
        availableCoursesTeacherLayout.setHorizontalGroup(
            availableCoursesTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCoursesTeacherLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(availableCoursesTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availableCoursesTeacherLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(availableCoursesTeacherLayout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightUserIcon1)
                        .addGap(57, 57, 57))))
        );
        availableCoursesTeacherLayout.setVerticalGroup(
            availableCoursesTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCoursesTeacherLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(availableCoursesTeacherLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(rightUserIcon1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );

        addNewCourse.setMaximumSize(new java.awt.Dimension(1048, 615));
        addNewCourse.setMinimumSize(new java.awt.Dimension(1048, 615));
        addNewCourse.setPreferredSize(new java.awt.Dimension(1048, 615));

        jButton6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel33.setText("Enter the details below to add new Course: ");

        rightUserIcon2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rightUserIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        rightUserIcon2.setText("USER");

        jLabel34.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel34.setText("Course Name: ");

        uRegistration1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration1ActionPerformed(evt);
            }
        });

        uRegistration2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration2ActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel38.setText("University / Tutor");

        jLabel39.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel39.setText("Duration");

        jLabel40.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel40.setText("Subscription Price");

        jLabel41.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel41.setText("Rating");

        jLabel42.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel42.setText("Certificate");

        jLabel43.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel43.setText("Enrolled Students");

        uRegistration3.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration3ActionPerformed(evt);
            }
        });

        uRegistration4.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration4ActionPerformed(evt);
            }
        });

        uRegistration5.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration5ActionPerformed(evt);
            }
        });

        uRegistration7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uRegistration7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistration7ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Yes ");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jRadioButton2.setText("No");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jButton7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jButton7.setText("Add Course");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(242, 0, 0));

        javax.swing.GroupLayout addNewCourseLayout = new javax.swing.GroupLayout(addNewCourse);
        addNewCourse.setLayout(addNewCourseLayout);
        addNewCourseLayout.setHorizontalGroup(
            addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewCourseLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addNewCourseLayout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightUserIcon2)
                        .addGap(52, 52, 52))
                    .addGroup(addNewCourseLayout.createSequentialGroup()
                        .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel38)
                            .addComponent(jLabel39)
                            .addComponent(jLabel40)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43))
                        .addGap(18, 18, 18)
                        .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addNewCourseLayout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addNewCourseLayout.createSequentialGroup()
                                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addNewCourseLayout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 273, Short.MAX_VALUE)
                                        .addComponent(jButton7))
                                    .addComponent(uRegistration2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uRegistration1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uRegistration3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uRegistration4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uRegistration5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(uRegistration7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(331, 331, 331))))))
        );
        addNewCourseLayout.setVerticalGroup(
            addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewCourseLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rightUserIcon2)
                    .addComponent(jLabel33)
                    .addComponent(jButton6))
                .addGap(87, 87, 87)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(uRegistration1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uRegistration2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addGap(18, 18, 18)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(uRegistration3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(uRegistration4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(uRegistration5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addGap(22, 22, 22)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(uRegistration7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(addNewCourseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jLabel44))
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pendingFees.setMaximumSize(new java.awt.Dimension(1048, 615));
        pendingFees.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel45.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel45.setText("Student pending fees: ");

        coursesTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.no", "Registration Number", "Pending Fee (In Rupee)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(coursesTable2);

        jButton8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pendingFeesLayout = new javax.swing.GroupLayout(pendingFees);
        pendingFees.setLayout(pendingFeesLayout);
        pendingFeesLayout.setHorizontalGroup(
            pendingFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingFeesLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pendingFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1005, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pendingFeesLayout.createSequentialGroup()
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pendingFeesLayout.setVerticalGroup(
            pendingFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pendingFeesLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(pendingFeesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(adminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(availableCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(availableUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(teacherHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(availableCoursesTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addNewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(pendingFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(parentHome, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(adminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(adminPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(newUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(availableCourses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addComponent(availableUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(loginForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(teacherHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(availableCoursesTeacher, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(addNewCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(pendingFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    userddata array;
    ArrayList<String> userSession = new ArrayList<>();
    
    private void teacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherBtnActionPerformed
        // TODO add your handling code here:
//         loginForm.setVisible(false);
        pendingFees.setVisible(false);
        addNewCourse.setVisible(false);
        availableCoursesTeacher.setVisible(false);
        adminPage.setVisible(false);
        adminLogin.setVisible(false);
        newUser.setVisible(false);
        availableCourses.setVisible(false);
        availableUsers.setVisible(false);
        teacherHome.setVisible(false);
//        parentHome.setVisible(false);
        parentHome.setVisible(false);
        loginForm.setVisible(true);
    }//GEN-LAST:event_teacherBtnActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
                       // TODO add your handling code here:
    }//GEN-LAST:event_studentBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
//        System.out.print("admin button clicked");
        loginForm.setVisible(false);
        teacherHome.setVisible(false);
        adminPage.setVisible(false);
        newUser.setVisible(false);
        availableCourses.setVisible(false);
        availableUsers.setVisible(false);
        parentHome.setVisible(false);
//        trialPanel.setVisible(true);
        adminLogin.setVisible(true);
         
         
    }//GEN-LAST:event_adminBtnActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void useridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_useridActionPerformed

    private void userpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userpassActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        adminLogin.setVisible(false);
        parentHome.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String uName = username.getText();
        String pass = password.getText();
        
        System.out.print("Username: " + uName + " password: " + pass);
            if (uName.equalsIgnoreCase("root") && pass.equalsIgnoreCase("root")) {
                System.out.println("Successfully logged in. ");
                adminLogin.setVisible(false);
                adminPage.setVisible(true);
            } else {
                credError.setText("Invaid credentials ! Try again");
            }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
        availableCourses.setVisible(false);
        adminPage.setVisible(false);
        newUser.setVisible(true);
        
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        adminPage.setVisible(true);
        newUser.setVisible(false);
    }//GEN-LAST:event_backbtnActionPerformed

    private void uRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistrationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistrationActionPerformed

    private void uContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uContactActionPerformed

    private void uNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uNameActionPerformed

    private void uEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uEmailActionPerformed

    private void uPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uPasswordActionPerformed

    private void uAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uAgeActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void uDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uDepartmentActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String userName = uName.getText();
        String userReg = uRegistration.getText();
        String userContact = uContact.getText();
        String userEmail = uEmail.getText();
        String userPassword = uPassword.getText();
        String userAge = uAge.getText();
        String userDepartment = uDepartment.getText();
        String userGender = null;
        
        if (female.isSelected()) {
            userGender = "female";
        } else if (male.isSelected()) {
            userGender = "Male";
        } else {
            userGender = "others";
        }
        
        
        ArrayList<String> invalidFields = new ArrayList<>();
        
        if (userReg.length() != 8) {
                invalidFields.add("Registation number");
            }
        if (!userContact.matches("\\d{10}")) {
                invalidFields.add("Contact number");
            }
        
        if (!userEmail.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")) {
                invalidFields.add("Email address");
            }
       
        if (invalidFields.isEmpty()) {
            Admin.newRegistration(userReg, userName, userContact, userEmail, userDepartment, userAge , userGender, userPassword);
        } else {
            System.out.print("some error occurred !");
//            errorF.setText(userAge);
//            String errorText = "Error in: ";
            StringBuilder errorText = new StringBuilder("Error in: ");
            for (String str : invalidFields) {
                errorText.append(str + ", ");
            }
            
            errorF.setText(errorText.toString());
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void backbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn1ActionPerformed
        // TODO add your handling code here:
        availableCourses.setVisible(false);
        adminPage.setVisible(true);
    }//GEN-LAST:event_backbtn1ActionPerformed

    private void courseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBtnActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel)coursesTable.getModel();
        
        if (tableModel.getRowCount() == 0) {
            try {
        
        ResultSet resultSet = Admin.availableCourses();
        
        while (resultSet.next()) {
//            System.out.println(resultSet.getString("id"));
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String author = resultSet.getString("author");
            String duration = resultSet.getString("duration");
            String price = resultSet.getString("price");
            String rating = resultSet.getString("rating");
            String cerification = resultSet.getString("certification");
            String enroll = resultSet.getString("enroll");
            String[] headData = {id, name, author, duration, price, rating, cerification, enroll};
             
//            
            tableModel.addRow(headData);
            
        }
        } catch (Exception e) {System.out.print(e);}
        }
        
        
       
        newUser.setVisible(false);
        adminPage.setVisible(false);
        availableCourses.setVisible(true);
        availableCourses.updateUI();
        
    }//GEN-LAST:event_courseBtnActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        // TODO add your handling code here:
        availableUsers.setVisible(false);
        adminPage.setVisible(true);
    }//GEN-LAST:event_backbtn2ActionPerformed

    private void teachersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teachersBtnActionPerformed
        // TODO add your handling code here:
           DefaultTableModel tableModel = (DefaultTableModel)usersTable.getModel();
           
           if (tableModel.getRowCount() == 0) {
                     try {
        
        ResultSet resultSet = Admin.registeredUsers();
        
        while (resultSet.next()) {
//            System.out.println(resultSet.getString("id"));
                        String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String reg = resultSet.getString("reg");
            String contact = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String department = resultSet.getString("schooldep");
            String gender = resultSet.getString("sex");
            String age = resultSet.getString("age");
//            String enroll = resultSet.getString("enroll");
            String[] headData = {id, name, reg, contact, email, department,age, gender};
//             DefaultTableModel tableModel = (DefaultTableModel)usersTable.getModel();
//            
            tableModel.addRow(headData);
            
        }
        } catch (Exception e) {System.out.print(e);}
               
           }
           
       
        adminPage.setVisible(false);
        availableUsers.setVisible(true);
        availableUsers.updateUI();
    }//GEN-LAST:event_teachersBtnActionPerformed

    private void studentsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentsBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableModel = (DefaultTableModel)usersTable.getModel();
        
        if (tableModel.getRowCount() == 0) {
        
            try {
        
        ResultSet resultSet = Admin.registeredUsers();
        
        while (resultSet.next()) {
//            System.out.println(resultSet.getString("id"));
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String reg = resultSet.getString("reg");
            String contact = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String department = resultSet.getString("schooldep");
            String gender = resultSet.getString("sex");
            String age = resultSet.getString("age");
//            String enroll = resultSet.getString("enroll");
            String[] headData = {id, name, reg, contact, email, department,age, gender};
            tableModel.addRow(headData);
      
        }
        } catch (Exception e) {System.out.print(e);}
        }
          
//        try {
//        
//        ResultSet resultSet = Admin.registeredUsers();
//        
//        
//        int tableRowCount = tableModel.getRowCount();
//        
//        if (tableRowCount == 0) {
//        
//        }
//        
//        while (resultSet.next()) {
////            System.out.println(resultSet.getString("id"));
//                        String id = resultSet.getString("id");
//            String name = resultSet.getString("name");
//            String reg = resultSet.getString("reg");
//            String contact = resultSet.getString("phone");
//            String email = resultSet.getString("email");
//            String department = resultSet.getString("schooldep");
//            String gender = resultSet.getString("sex");
//            String age = resultSet.getString("age");
////            String enroll = resultSet.getString("enroll");
//                        String[] headData = {id, name, reg, contact, email, department,age, gender};
//            if (tableRowCount == 0) {
//                tableModel.addRow(headData);
//            }
//        }
//        } catch (Exception e) {System.out.print(e);}
       
       
        adminPage.setVisible(false);
        availableUsers.setVisible(true);
        
    }//GEN-LAST:event_studentsBtnActionPerformed

    private void userUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userUserNameActionPerformed

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    private void teacherLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLoginActionPerformed
        // TODO add your handling code here:
        
        String username = userUserName.getText();
        String pass = userPassword.getText();
        String[] credentials = {username, pass};
        ArrayList<String> userData = Resources.isValidUser(credentials, false);
        userSession = userData;
        
        if (!userData.isEmpty()) {
            System.out.print("user available");
            Resources.loginSession(userData);
            String header  = "Welcome to Online Course Management System, " + userData.get(0) + " !";
            String icon = userData.get(0);
            
            rightUserIcon.setText(icon);
            leftUserDesc.setText(header);
            rightUserIcon1.setText(icon);
            loginForm.setVisible(false);
            teacherHome.setVisible(true);
        } else {
            System.out.print("User not available");
            invalidWar.setText("Invalid credentials, Try again !");
        }
        
        
    }//GEN-LAST:event_teacherLoginActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        DefaultTableModel tableModel = (DefaultTableModel)coursesTable1.getModel();
        
        if (tableModel.getRowCount() == 0) {
            try {
        
        ResultSet resultSet = Admin.availableCourses();
        
        while (resultSet.next()) {
//            System.out.println(resultSet.getString("id"));
            String id = resultSet.getString("id");
            String name = resultSet.getString("name");
            String author = resultSet.getString("author");
            String duration = resultSet.getString("duration");
            String price = resultSet.getString("price");
            String rating = resultSet.getString("rating");
            String cerification = resultSet.getString("certification");
            String enroll = resultSet.getString("enroll");
            String[] headData = {id, name, author, duration, price, rating, cerification, enroll};
             
//            
            tableModel.addRow(headData);
            
        }
        } catch (Exception e) {System.out.print(e);}
        }
        
        availableCoursesTeacher.setVisible(true);
        teacherHome.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String userIcon = userSession.get(0);
        rightUserIcon2.setText(userIcon);
        teacherHome.setVisible(false);
        addNewCourse.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
         DefaultTableModel tableModel = (DefaultTableModel)coursesTable2.getModel();
        
        if (tableModel.getRowCount() == 0) {
            try {
        
        ResultSet resultSet = Teacher.pendingFees();
        
        while (resultSet.next()) {
//            System.out.println(resultSet.getString("id"));
            String id = resultSet.getString("id");
            String reg =  resultSet.getString("reg");
            String fees = resultSet.getString("fees");
    
            String[] headData = {id, reg, fees};
             
//            
            tableModel.addRow(headData);
            
        }
        } catch (Exception e) {System.out.print(e);}
        }
        
        
        pendingFees.setVisible(true);
        teacherHome.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        teacherHome.setVisible(true);
        availableCoursesTeacher.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        teacherHome.setVisible(true);
        addNewCourse.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void uRegistration1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration1ActionPerformed

    private void uRegistration2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration2ActionPerformed

    private void uRegistration3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration3ActionPerformed

    private void uRegistration4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration4ActionPerformed

    private void uRegistration5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration5ActionPerformed

    private void uRegistration7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uRegistration7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uRegistration7ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String courseName = uRegistration1.getText();
        String university = uRegistration2.getText();
        String duration = uRegistration3.getText();
        String price = uRegistration4.getText();
        String rating = uRegistration5.getText();
        int certification = 0;
        String enrolledStudents = uRegistration7.getText();
        if (jRadioButton1.isEnabled()) {
            certification = 1;
        } 
        
        
//        ArrayList<String> requiredFields = new ArrayList<>();
        
        
        if (courseName.isEmpty() || university.isEmpty() || duration.isEmpty() || price.isEmpty() || rating.isEmpty() || enrolledStudents.isEmpty()) {
            System.out.print("all fields are mando");
            jLabel44.setText("All fields are mandatory.");
        } else {
            Teacher.addNewCourse(courseName, university, duration, price, rating, certification, enrolledStudents);
            jLabel44.setText("Course Added successfully.");
        }
        
//        System.out.println("course: " + courseName + " university: " + university + " duration: " + duration + " price: " + price + " rating: " + rating + " certification: " + certification);
        
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        teacherHome.setVisible(true);
        pendingFees.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    
    public static void homeScreen() {
        
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
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new HomeScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addNewCourse;
    private java.awt.Button addUserBtn;
    private javax.swing.JButton adminBtn;
    private javax.swing.JPanel adminLogin;
    private static javax.swing.JPanel adminLoginJPanel;
    private javax.swing.JPanel adminPage;
    private javax.swing.JPanel availableCourses;
    private javax.swing.JPanel availableCoursesTeacher;
    private javax.swing.JPanel availableUsers;
    private javax.swing.JButton backBtn;
    private java.awt.Button backbtn;
    private java.awt.Button backbtn1;
    private java.awt.Button backbtn2;
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Button courseBtn;
    private javax.swing.JTable coursesTable;
    private javax.swing.JTable coursesTable1;
    private javax.swing.JTable coursesTable2;
    private javax.swing.JLabel credError;
    private final javax.swing.JLabel desc = new javax.swing.JLabel();
    private javax.swing.JButton developerBtn;
    private javax.swing.JLabel errorF;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel invalidWar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel leftUserDesc;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginForm;
    private javax.swing.JButton loginbutton;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel newUser;
    private javax.swing.JRadioButton others;
    private javax.swing.JPanel parentHome;
    private javax.swing.JTextField password;
    private javax.swing.JPanel pendingFees;
    private java.awt.Button registerBtn;
    private javax.swing.JLabel rightUserIcon;
    private javax.swing.JLabel rightUserIcon1;
    private javax.swing.JLabel rightUserIcon2;
    private javax.swing.JButton studentBtn;
    private java.awt.Button studentsBtn;
    private javax.swing.JButton teacherBtn;
    private javax.swing.JPanel teacherHome;
    private javax.swing.JButton teacherLogin;
    private java.awt.Button teachersBtn;
    private javax.swing.JTextField uAge;
    private javax.swing.JTextField uContact;
    private javax.swing.JTextField uDepartment;
    private javax.swing.JTextField uEmail;
    private javax.swing.JTextField uName;
    private javax.swing.JTextField uPassword;
    private javax.swing.JTextField uRegistration;
    private javax.swing.JTextField uRegistration1;
    private javax.swing.JTextField uRegistration2;
    private javax.swing.JTextField uRegistration3;
    private javax.swing.JTextField uRegistration4;
    private javax.swing.JTextField uRegistration5;
    private javax.swing.JTextField uRegistration7;
    private javax.swing.ButtonGroup userGender;
    private javax.swing.JTextField userPassword;
    private javax.swing.JTextField userUserName;
    private javax.swing.JTextField userid;
    private javax.swing.JTextField username;
    private javax.swing.JTextField userpass;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}

