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
//        teacherHome.setVisible(false);
//        adminLogin.setVisible(false);
//        adminPage.setVisible(false);
//        newUser.setVisible(false);
//        availableUsers.setVisible(false);
//        availableCourses.setVisible(false);
//        loginForm.setVisible(false);
//        availableCoursesTeacher.setVisible(false);
//        addNewCourse.setVisible(false);
//        pendingFees.setVisible(false);
//        studentLogin.setVisible(false);
//        studentHome.setVisible(false);
//        availableCourseStudents.setVisible(false);
//        studentProfile.setVisible(false);
            removeScreens(false);
        
    }

    
//    turn visibility off
    public void removeScreens(boolean parent) {
        parentHome.setVisible(!parent);
        teacherHome.setVisible(false);
        adminLogin.setVisible(false);
        adminPage.setVisible(false);
        newUser.setVisible(false);
        availableUsers.setVisible(false);
        availableCourses.setVisible(false);
        loginForm.setVisible(false);
        availableCoursesTeacher.setVisible(false);
        addNewCourse.setVisible(false);
        pendingFees.setVisible(false);
        studentLogin.setVisible(false);
        studentHome.setVisible(false);
        availableCourseStudents.setVisible(false);
        studentProfile.setVisible(false);
        sPendingFee.setVisible(false);
        developerPage.setVisible(false);
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
        availableCourseStudents = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        coursesTable3 = new javax.swing.JTable();
        rightUserIcon4 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        parentHome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminBtn = new javax.swing.JButton();
        teacherBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        teacherHome = new javax.swing.JPanel();
        leftUserDesc = new javax.swing.JLabel();
        rightUserIcon = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
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
        jButton17 = new javax.swing.JButton();
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
        studentLogin = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        userUserName1 = new javax.swing.JTextField();
        userPassword1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        teacherLogin1 = new javax.swing.JButton();
        invalidWar1 = new javax.swing.JLabel();
        studentHome = new javax.swing.JPanel();
        leftUserDesc1 = new javax.swing.JLabel();
        rightUserIcon3 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        studentProfile = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();
        pReg = new javax.swing.JLabel();
        pContact = new javax.swing.JLabel();
        pEmail = new javax.swing.JLabel();
        pDept = new javax.swing.JLabel();
        pAge = new javax.swing.JLabel();
        pGender = new javax.swing.JLabel();
        pPassword = new javax.swing.JLabel();
        sPendingFee = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        developerPage = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();

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

        availableCourseStudents.setMaximumSize(new java.awt.Dimension(1048, 615));
        availableCourseStudents.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel53.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel53.setText("List of Available Online Courses:");

        coursesTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(coursesTable3);

        rightUserIcon4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rightUserIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        rightUserIcon4.setText("USER");

        jButton13.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton13.setText("Back");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout availableCourseStudentsLayout = new javax.swing.GroupLayout(availableCourseStudents);
        availableCourseStudents.setLayout(availableCourseStudentsLayout);
        availableCourseStudentsLayout.setHorizontalGroup(
            availableCourseStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCourseStudentsLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(availableCourseStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(availableCourseStudentsLayout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 989, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(availableCourseStudentsLayout.createSequentialGroup()
                        .addComponent(jButton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rightUserIcon4)
                        .addGap(57, 57, 57))))
        );
        availableCourseStudentsLayout.setVerticalGroup(
            availableCourseStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(availableCourseStudentsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(availableCourseStudentsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel53)
                    .addComponent(rightUserIcon4)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
                .addContainerGap())
        );

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
                        .addComponent(desc, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
                        .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teacherBtn)
                            .addComponent(jLabel1))
                        .addGap(19, 19, 19)))
                .addGap(124, 124, 124))
        );

        parentHomeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adminBtn, jLabel1, studentBtn, teacherBtn});

        parentHomeLayout.setVerticalGroup(
            parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(parentHomeLayout.createSequentialGroup()
                .addGroup(parentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(parentHomeLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(desc, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                    .addGroup(parentHomeLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(146, 146, 146))
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

        jButton16.setText("Logout");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton16)
                .addGap(39, 39, 39))
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
                            .addComponent(rightUserIcon)
                            .addComponent(jButton16))
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

        jButton17.setText("Logout");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout adminPageLayout = new javax.swing.GroupLayout(adminPage);
        adminPage.setLayout(adminPageLayout);
        adminPageLayout.setHorizontalGroup(
            adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPageLayout.createSequentialGroup()
                .addGap(0, 88, Short.MAX_VALUE)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addUserBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addComponent(courseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(teachersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(studentsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(124, 124, 124))
            .addGroup(adminPageLayout.createSequentialGroup()
                .addGap(364, 364, 364)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPageLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addGap(71, 71, 71))
        );

        adminPageLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addUserBtn, courseBtn, studentsBtn, teachersBtn});

        adminPageLayout.setVerticalGroup(
            adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPageLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(adminPageLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addUserBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(adminPageLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(39, 39, 39)
                        .addGroup(adminPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19))
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
        uRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uRegistrationActionPerformed(evt);
            }
        });

        uContact.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uContact.setToolTipText("Enter your contact number");
        uContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uContactActionPerformed(evt);
            }
        });

        uName.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uNameActionPerformed(evt);
            }
        });

        uEmail.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uEmailActionPerformed(evt);
            }
        });

        uPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        uPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uPasswordActionPerformed(evt);
            }
        });

        uAge.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
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
        jLabel27.setText("Registered Users: ");

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
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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

        studentLogin.setMaximumSize(new java.awt.Dimension(1048, 615));
        studentLogin.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel46.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/student (1).png"))); // NOI18N
        jLabel46.setText("Login as a Student");

        jButton9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel47.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel47.setText("Enter Credentails");
        jLabel47.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel48.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel48.setText("Username: ");

        userUserName1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userUserName1.setText("12212215");
        userUserName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userUserName1ActionPerformed(evt);
            }
        });

        userPassword1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        userPassword1.setText("9907224577");
        userPassword1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPassword1ActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel49.setText("Password: ");

        teacherLogin1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        teacherLogin1.setText("Login");
        teacherLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherLogin1ActionPerformed(evt);
            }
        });

        invalidWar1.setForeground(new java.awt.Color(245, 0, 0));

        javax.swing.GroupLayout studentLoginLayout = new javax.swing.GroupLayout(studentLogin);
        studentLogin.setLayout(studentLoginLayout);
        studentLoginLayout.setHorizontalGroup(
            studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentLoginLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton9)
                    .addGroup(studentLoginLayout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addGap(143, 143, 143)
                        .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invalidWar1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentLoginLayout.createSequentialGroup()
                                .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(studentLoginLayout.createSequentialGroup()
                                        .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel49))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(userUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(userPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel47)
                                    .addComponent(teacherLogin1))
                                .addGap(15, 15, 15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        studentLoginLayout.setVerticalGroup(
            studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentLoginLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton9)
                .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentLoginLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel46)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(userUserName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(studentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(userPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(teacherLogin1)
                        .addGap(103, 103, 103)
                        .addComponent(invalidWar1)
                        .addGap(108, 108, 108))))
        );

        studentHome.setMaximumSize(new java.awt.Dimension(1048, 615));
        studentHome.setMinimumSize(new java.awt.Dimension(1048, 615));

        leftUserDesc1.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        leftUserDesc1.setText("Welcome to Course Mangement System, ");

        rightUserIcon3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        rightUserIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/user (1).png"))); // NOI18N
        rightUserIcon3.setText("USER");

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/money.png"))); // NOI18N

        jButton10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton10.setText("Available Courses");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/online-learning (1).png"))); // NOI18N

        jButton11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton11.setText("Profile Details");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cv.png"))); // NOI18N

        jButton12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton12.setText("Pending Fees");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton18.setText("Logout");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentHomeLayout = new javax.swing.GroupLayout(studentHome);
        studentHome.setLayout(studentHomeLayout);
        studentHomeLayout.setHorizontalGroup(
            studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentHomeLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(leftUserDesc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rightUserIcon3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton18)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, studentHomeLayout.createSequentialGroup()
                .addGroup(studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentHomeLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabel51)
                        .addGap(67, 67, 67)
                        .addComponent(jLabel52)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel50))
                    .addGroup(studentHomeLayout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jButton10)
                        .addGap(46, 46, 46)
                        .addComponent(jButton11)
                        .addGap(55, 55, 55)
                        .addComponent(jButton12)))
                .addContainerGap(267, Short.MAX_VALUE))
        );

        studentHomeLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton11, jButton12});

        studentHomeLayout.setVerticalGroup(
            studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentHomeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(leftUserDesc1)
                    .addComponent(rightUserIcon3)
                    .addComponent(jButton18))
                .addGap(177, 177, 177)
                .addGroup(studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(18, 18, 18)
                .addGroup(studentHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addComponent(jButton12)
                    .addComponent(jButton10))
                .addContainerGap(194, Short.MAX_VALUE))
        );

        studentProfile.setMaximumSize(new java.awt.Dimension(1045, 615));
        studentProfile.setMinimumSize(new java.awt.Dimension(1045, 615));
        studentProfile.setPreferredSize(new java.awt.Dimension(1045, 615));

        jLabel54.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel54.setText("Profile Details: ");

        jButton14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton14.setText("Back");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jLabel55.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel55.setText("Full Name:");

        jLabel56.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel56.setText("Registration Number: ");

        jLabel57.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel57.setText("Contact Number: ");

        jLabel58.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel58.setText("Email Address:");

        jLabel59.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel59.setText("Department: ");

        jLabel60.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel60.setText("Age: ");

        jLabel61.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel61.setText("Gender: ");

        jLabel62.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel62.setText("Password: ");

        pName.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pName.setText("Full Name:");

        pReg.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pReg.setText("Full Name:");

        pContact.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pContact.setText("Full Name:");

        pEmail.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pEmail.setText("Full Name:");

        pDept.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pDept.setText("Full Name:");

        pAge.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pAge.setText("Full Name:");

        pGender.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pGender.setText("Full Name:");

        pPassword.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        pPassword.setText("Full Name:");

        javax.swing.GroupLayout studentProfileLayout = new javax.swing.GroupLayout(studentProfile);
        studentProfile.setLayout(studentProfileLayout);
        studentProfileLayout.setHorizontalGroup(
            studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentProfileLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel55)
                    .addGroup(studentProfileLayout.createSequentialGroup()
                        .addComponent(jButton14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel54)
                            .addComponent(jLabel57, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel58, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel61, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel60, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel59, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pName)
                    .addComponent(pReg)
                    .addComponent(pContact)
                    .addComponent(pEmail)
                    .addComponent(pDept)
                    .addComponent(pAge)
                    .addComponent(pGender)
                    .addComponent(pPassword))
                .addContainerGap(605, Short.MAX_VALUE))
        );
        studentProfileLayout.setVerticalGroup(
            studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentProfileLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton14)
                    .addComponent(jLabel54))
                .addGap(54, 54, 54)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(pName))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(pReg))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel57)
                    .addComponent(pContact))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel58)
                    .addComponent(pEmail))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel59)
                    .addComponent(pDept))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(pAge))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel61)
                    .addComponent(pGender))
                .addGap(18, 18, 18)
                .addGroup(studentProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(pPassword))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        sPendingFee.setMaximumSize(new java.awt.Dimension(1048, 615));
        sPendingFee.setMinimumSize(new java.awt.Dimension(1048, 615));

        jLabel63.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel63.setText("Your Fee Details");

        jButton15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton15.setText("Back");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jLabel64.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel64.setText("Pending Fees:");

        jLabel65.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel65.setText("Full Name:");

        jLabel66.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel66.setText("Registration Number:");

        jLabel67.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel67.setText("Pending Amount: Rs");

        jLabel68.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel68.setText("null");

        jLabel69.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel69.setText("null");

        jLabel70.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel70.setText("null");

        javax.swing.GroupLayout sPendingFeeLayout = new javax.swing.GroupLayout(sPendingFee);
        sPendingFee.setLayout(sPendingFeeLayout);
        sPendingFeeLayout.setHorizontalGroup(
            sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPendingFeeLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jButton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64)
                    .addComponent(jLabel63)
                    .addGroup(sPendingFeeLayout.createSequentialGroup()
                        .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67))
                        .addGap(18, 18, 18)
                        .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70))))
                .addContainerGap(698, Short.MAX_VALUE))
        );
        sPendingFeeLayout.setVerticalGroup(
            sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPendingFeeLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel63)
                    .addComponent(jButton15))
                .addGap(45, 45, 45)
                .addComponent(jLabel64)
                .addGap(32, 32, 32)
                .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jLabel68))
                .addGap(18, 18, 18)
                .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jLabel69))
                .addGap(18, 18, 18)
                .addGroup(sPendingFeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jLabel70))
                .addContainerGap(359, Short.MAX_VALUE))
        );

        developerPage.setMaximumSize(new java.awt.Dimension(1048, 615));
        developerPage.setMinimumSize(new java.awt.Dimension(1048, 615));
        developerPage.setPreferredSize(new java.awt.Dimension(1048, 615));

        jButton19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back (1).png"))); // NOI18N
        jButton19.setText("Back");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel71.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel71.setText("Application Details");

        jLabel72.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel72.setText("App Name: Course Management System");

        jLabel73.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel73.setText("App Version: 0.1 Beta");

        jLabel74.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel74.setText("Programming Language: Java");

        jLabel75.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel75.setText("Backend Database: MySQL");

        jLabel76.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel76.setText("Dependencies Used: Java Swing, Java AWT ");

        jLabel77.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel77.setText("Platform Supported: Microsoft Windows, MacOS, Linux");

        jLabel78.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel78.setText("Last Updated: May 01, 2023 19:30");

        jLabel79.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel79.setText("Developers:");

        jLabel80.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel80.setText("12213891 - Rupali Sinha");

        jLabel81.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel81.setText("12213886 - Ankit Kumar");

        jLabel82.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        jLabel82.setText("12213885 - Amartya Sharma");

        jLabel83.setText("Amendments: Wantedbear007");
        jLabel83.setToolTipText("");

        javax.swing.GroupLayout developerPageLayout = new javax.swing.GroupLayout(developerPage);
        developerPage.setLayout(developerPageLayout);
        developerPageLayout.setHorizontalGroup(
            developerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(developerPageLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(developerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel83)
                    .addComponent(jLabel82)
                    .addComponent(jLabel81)
                    .addComponent(jLabel80)
                    .addComponent(jLabel79)
                    .addComponent(jLabel78)
                    .addComponent(jLabel77)
                    .addComponent(jLabel76)
                    .addComponent(jLabel75)
                    .addComponent(jLabel74)
                    .addComponent(jLabel73)
                    .addComponent(jLabel72)
                    .addComponent(jLabel71))
                .addContainerGap(444, Short.MAX_VALUE))
        );
        developerPageLayout.setVerticalGroup(
            developerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(developerPageLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(developerPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel71)
                    .addComponent(jButton19))
                .addGap(45, 45, 45)
                .addComponent(jLabel72)
                .addGap(18, 18, 18)
                .addComponent(jLabel73)
                .addGap(18, 18, 18)
                .addComponent(jLabel74)
                .addGap(18, 18, 18)
                .addComponent(jLabel75)
                .addGap(18, 18, 18)
                .addComponent(jLabel76)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addGap(18, 18, 18)
                .addComponent(jLabel78)
                .addGap(30, 30, 30)
                .addComponent(jLabel79)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel80)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel81)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel82)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel83)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(parentHome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1083, Short.MAX_VALUE)
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(studentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(33, Short.MAX_VALUE)
                    .addComponent(studentHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(availableCourseStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(sPendingFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(developerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
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
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(studentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(22, Short.MAX_VALUE)
                    .addComponent(studentHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(2, 2, 2)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(availableCourseStudents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(studentProfile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(sPendingFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(developerPage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
//    userddata array;
    ArrayList<String> userSession = new ArrayList<>();
    
    private void teacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherBtnActionPerformed
        // TODO add your handling code here:
//         loginForm.setVisible(false);
            removeScreens(true);
//        pendingFees.setVisible(false);
//        addNewCourse.setVisible(false);
//        availableCoursesTeacher.setVisible(false);
//        adminPage.setVisible(false);
//        adminLogin.setVisible(false);
//        newUser.setVisible(false);
//        availableCourses.setVisible(false);
//        availableUsers.setVisible(false);
//        teacherHome.setVisible(false);
////        parentHome.setVisible(false);
//        parentHome.setVisible(false);
        loginForm.setVisible(true);
    }//GEN-LAST:event_teacherBtnActionPerformed

    private void studentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBtnActionPerformed
                       // TODO add your handling code here:
                       removeScreens(true);
                       parentHome.setVisible(false);
                       studentLogin.setVisible(true);
    }//GEN-LAST:event_studentBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
//        System.out.print("admin button clicked");
//        loginForm.setVisible(false);
//        teacherHome.setVisible(false);
//        adminPage.setVisible(false);
//        newUser.setVisible(false);
//        availableCourses.setVisible(false);
//        availableUsers.setVisible(false);
//        parentHome.setVisible(false);
//        trialPanel.setVisible(true);
        removeScreens(true);
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
//        adminLogin.setVisible(false);
        removeScreens(true);
        parentHome.setVisible(true);
//        teacherHome.setVisible(false);
////        adminLogin.setVisible(false);
//        adminPage.setVisible(false);
//        newUser.setVisible(false);
//        availableUsers.setVisible(false);
//        availableCourses.setVisible(false);
//        loginForm.setVisible(false);
//        availableCoursesTeacher.setVisible(false);
//        addNewCourse.setVisible(false);
//        pendingFees.setVisible(false);
//        studentLogin.setVisible(false);
        
    }//GEN-LAST:event_backBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:
        String uName = username.getText();
        String pass = password.getText();
        
        System.out.print("Username: " + uName + " password: " + pass);
            if (uName.equalsIgnoreCase("root") && pass.equalsIgnoreCase("root")) {
                System.out.println("Successfully logged in. ");
                removeScreens(true);
//                adminLogin.setVisible(false);
                adminPage.setVisible(true);
            } else {
                credError.setText("Invaid credentials ! Try again");
            }
    }//GEN-LAST:event_loginBtnActionPerformed

    private void addUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserBtnActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
//        availableCourses.setVisible(false);
//        adminPage.setVisible(false);
        newUser.setVisible(true);
        
    }//GEN-LAST:event_addUserBtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        adminPage.setVisible(true);
//        newUser.setVisible(false);
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
//        availableCourses.setVisible(false);
        removeScreens(true);
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
        
        
       removeScreens(true);
//        newUser.setVisible(false);
//        adminPage.setVisible(false);
        availableCourses.setVisible(true);
//        availableCourses.updateUI();
        
    }//GEN-LAST:event_courseBtnActionPerformed

    private void backbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtn2ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
//        availableUsers.setVisible(false);
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
           
       
//        adminPage.setVisible(false);
        removeScreens(true);
        availableUsers.setVisible(true);
//        availableUsers.updateUI();
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

       
       removeScreens(true);
//        adminPage.setVisible(false);
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
//            loginForm.setVisible(false);
            removeScreens(true);
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
        removeScreens(true);
        availableCoursesTeacher.setVisible(true);
//        teacherHome.setVisible(false);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        String userIcon = userSession.get(0);
        rightUserIcon2.setText(userIcon);
//        teacherHome.setVisible(false);
        removeScreens(true);
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
        
        removeScreens(true);
        pendingFees.setVisible(true);
//        teacherHome.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        teacherHome.setVisible(true);
//        availableCoursesTeacher.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        teacherHome.setVisible(true);
//        addNewCourse.setVisible(false);
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
        removeScreens(true);
        teacherHome.setVisible(true);
//        pendingFees.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void userUserName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userUserName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userUserName1ActionPerformed

    private void userPassword1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPassword1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPassword1ActionPerformed

    private void teacherLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherLogin1ActionPerformed
        // TODO add your handling code here:
        String username = userUserName1.getText();
        String pass = userPassword1.getText();
        String[] credentials = {username, pass};
        ArrayList<String> userData = Resources.isValidUser(credentials, false);
        userSession = userData;
        
        if (!userData.isEmpty()) {
            System.out.print("user available");
            Resources.loginSession(userData);
            String header  = "Welcome to Online Course Management System, " + userData.get(0) + " !";
            String icon = userData.get(0);
            
            rightUserIcon3.setText(icon);
            leftUserDesc1.setText(header);
//            rightUserIcon1.setText(icon);
//            studentLogin.setVisible(false);
            removeScreens(true);
            studentHome.setVisible(true);
        } else {
            System.out.print("User not available");
            invalidWar1.setText("Invalid credentials, Try again !");
        }
    }//GEN-LAST:event_teacherLogin1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        parentHome.setVisible(true);
//        pendingFees.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        rightUserIcon4.setText(userSession.get(0));
        DefaultTableModel tableModel = (DefaultTableModel)coursesTable3.getModel();
        
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
        
        rightUserIcon4.setText(userSession.get(0));
        removeScreens(true);
        availableCourseStudents.setVisible(true);
//        studentHome.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        studentProfile.setVisible(true);
//        studentHome.setVisible(false);
        for (String str : userSession) {
            System.out.println(str);
        }
        
        pName.setText(userSession.get(0));
        pReg.setText(userSession.get(1));
        pContact.setText(userSession.get(2));
        pEmail.setText(userSession.get(3));
        pDept.setText(userSession.get(4));
        pAge.setText(userSession.get(5));
        pGender.setText(userSession.get(6));
        pPassword.setText(userSession.get(7));
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        
        String registration = null;
        String pending = null;
        try  {
            ResultSet resultSet = Students.pendingFees();
            
            while (resultSet.next()) {
                registration = resultSet.getString("reg");
                pending = resultSet.getString("fees");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        
        jLabel68.setText(userSession.get(0));
        jLabel69.setText(registration);
        jLabel70.setText(pending);
//        studentHome.setVisible(false);
        removeScreens(true);
        sPendingFee.setVisible(true);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
//        rightUserIcon4.set
        removeScreens(true);
        studentHome.setVisible(true);
//        availableCourseStudents.setVisible(false);
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        studentHome.setVisible(true);
//        studentProfile.setVisible(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        removeScreens(true);
        studentHome.setVisible(true);
//        sPendingFee.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        removeScreens(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        removeScreens(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        removeScreens(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        parentHome.setVisible(true);
//        removeScreens(true);
        developerPage.setVisible(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        removeScreens(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public static void homeScreen() {
        
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
    private javax.swing.JPanel availableCourseStudents;
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
    private javax.swing.JTable coursesTable3;
    private javax.swing.JLabel credError;
    private final javax.swing.JLabel desc = new javax.swing.JLabel();
    private javax.swing.JPanel developerPage;
    private javax.swing.JLabel errorF;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel invalidWar;
    private javax.swing.JLabel invalidWar1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel leftUserDesc;
    private javax.swing.JLabel leftUserDesc1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPanel loginForm;
    private javax.swing.JButton loginbutton;
    private javax.swing.JRadioButton male;
    private javax.swing.JPanel newUser;
    private javax.swing.JRadioButton others;
    private javax.swing.JLabel pAge;
    private javax.swing.JLabel pContact;
    private javax.swing.JLabel pDept;
    private javax.swing.JLabel pEmail;
    private javax.swing.JLabel pGender;
    private javax.swing.JLabel pName;
    private javax.swing.JLabel pPassword;
    private javax.swing.JLabel pReg;
    private javax.swing.JPanel parentHome;
    private javax.swing.JTextField password;
    private javax.swing.JPanel pendingFees;
    private java.awt.Button registerBtn;
    private javax.swing.JLabel rightUserIcon;
    private javax.swing.JLabel rightUserIcon1;
    private javax.swing.JLabel rightUserIcon2;
    private javax.swing.JLabel rightUserIcon3;
    private javax.swing.JLabel rightUserIcon4;
    private javax.swing.JPanel sPendingFee;
    private javax.swing.JButton studentBtn;
    private javax.swing.JPanel studentHome;
    private javax.swing.JPanel studentLogin;
    private javax.swing.JPanel studentProfile;
    private java.awt.Button studentsBtn;
    private javax.swing.JButton teacherBtn;
    private javax.swing.JPanel teacherHome;
    private javax.swing.JButton teacherLogin;
    private javax.swing.JButton teacherLogin1;
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
    private javax.swing.JTextField userPassword1;
    private javax.swing.JTextField userUserName;
    private javax.swing.JTextField userUserName1;
    private javax.swing.JTextField userid;
    private javax.swing.JTextField username;
    private javax.swing.JTextField userpass;
    private javax.swing.JTable usersTable;
    // End of variables declaration//GEN-END:variables
}

