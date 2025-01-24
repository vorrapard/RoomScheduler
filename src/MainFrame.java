/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;

public class MainFrame extends javax.swing.JDialog {

    public MainFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void rebuildFacultyNameComboBoxes()
    {
        facultyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));  
        facultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));   
        facultyStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));   
    }
       
    public void rebuildDatesComboBoxes()
    {
        datesComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));    
        reservationDatesComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));            
    }  
    
    public void rebuildRoomComboBoxes()
    {
        dropRoomComboBox.setModel(new javax.swing.DefaultComboBoxModel(RoomQueries.getAllRooms().toArray()));             
    }
    
    public void rebuildReservationsTable()
    {
        reservationsTable.setText(ReservationsTable.displayReservationsTable());
    }
    
    public void rebuildWaitlistTable()
    {
        waitlistTable.setText(WaitlistTable.displayWaitlistTable());
    }  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        addFacultyNameTextField = new javax.swing.JTextField();
        addFacultyButton = new javax.swing.JButton();
        addFacultyStatusLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        facultyNameComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        datesComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        seatTextField = new javax.swing.JTextField();
        reserveRoomButton = new javax.swing.JButton();
        reserveRoomStatusBar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        reservationsTable = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        reservationDatesComboBox = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        facultyComboBox = new javax.swing.JComboBox<>();
        cancelReservationButton = new javax.swing.JButton();
        cancelReservationLabel = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        waitlistTable = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        statusWaitListTable = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        facultyStatusComboBox = new javax.swing.JComboBox<>();
        statusButton = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        statusReservationsTable = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        addDateSpinner = new javax.swing.JSpinner();
        addDateButton = new javax.swing.JButton();
        addDateStatusBar = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        addRoomButton = new javax.swing.JButton();
        addRoomStatusBar = new javax.swing.JLabel();
        addRoomNameTextField = new javax.swing.JTextField();
        addRoomSeatsTextField = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        dropRoomComboBox = new javax.swing.JComboBox<>();
        dropRoomButton = new javax.swing.JButton();
        dropRoomStatusBar = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Room Scheduler");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Faculty Name:");

        addFacultyButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addFacultyButton.setText("Submit");
        addFacultyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFacultyButtonActionPerformed(evt);
            }
        });

        addFacultyStatusLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        addFacultyStatusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addFacultyStatusLabel.setText("                ");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Add new faculty");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(addFacultyButton))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(addFacultyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 42, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addFacultyNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(25, 25, 25)
                .addComponent(addFacultyButton)
                .addGap(18, 18, 18)
                .addComponent(addFacultyStatusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Faculty", jPanel2);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Faculty Name:");

        facultyNameComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        facultyNameComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Date:");

        datesComboBox.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        datesComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Seats:");

        seatTextField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        reserveRoomButton.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        reserveRoomButton.setText("Submit");
        reserveRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserveRoomButtonActionPerformed(evt);
            }
        });

        reserveRoomStatusBar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        reserveRoomStatusBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reserveRoomStatusBar.setText("    ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(datesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(facultyNameComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(seatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(reserveRoomStatusBar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(reserveRoomButton)
                .addContainerGap(242, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(facultyNameComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(datesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(seatTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(reserveRoomButton)
                .addGap(18, 18, 18)
                .addComponent(reserveRoomStatusBar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reserve Room", jPanel3);

        reservationsTable.setColumns(20);
        reservationsTable.setRows(5);
        jScrollPane2.setViewportView(reservationsTable);
        this.rebuildReservationsTable();

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setText("Cancel Reservation");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel10.setText("Date:");

        reservationDatesComboBox.setModel(new javax.swing.DefaultComboBoxModel(Dates.getAllDates().toArray()));

        jLabel11.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel11.setText("Faculty Name");

        facultyComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));

        cancelReservationButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelReservationButton.setText("Cancel reservation");
        cancelReservationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelReservationButtonActionPerformed(evt);
            }
        });

        cancelReservationLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cancelReservationLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelReservationLabel.setText(" ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reservationDatesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                        .addComponent(cancelReservationButton)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cancelReservationLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(reservationDatesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(facultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelReservationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancelReservationLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Reservations", jPanel4);

        waitlistTable.setColumns(20);
        waitlistTable.setRows(5);
        jScrollPane3.setViewportView(waitlistTable);
        this.rebuildWaitlistTable();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Wait List", jPanel5);

        statusWaitListTable.setColumns(20);
        statusWaitListTable.setRows(5);
        jScrollPane4.setViewportView(statusWaitListTable);
        this.rebuildWaitlistTable();

        jLabel17.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel17.setText("Faculty Name:");

        facultyStatusComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        facultyStatusComboBox.setModel(new javax.swing.DefaultComboBoxModel(Faculty.getAllFaculty().toArray()));

        statusButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        statusButton.setText("Enter");
        statusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusButtonActionPerformed(evt);
            }
        });

        statusReservationsTable.setColumns(20);
        statusReservationsTable.setRows(5);
        jScrollPane5.setViewportView(statusReservationsTable);
        this.rebuildWaitlistTable();

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(facultyStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(statusButton)
                        .addGap(79, 79, 79))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(facultyStatusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Status", jPanel11);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Add Date");

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("Date:");

        addDateSpinner.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_WEEK_IN_MONTH));

        addDateButton.setText("Add");
        addDateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDateButtonActionPerformed(evt);
            }
        });

        addDateStatusBar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addDateStatusBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addDateStatusBar.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(addDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addDateButton)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addDateStatusBar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel12)
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(addDateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addDateButton))
                .addGap(48, 48, 48)
                .addComponent(addDateStatusBar)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Date Management", jPanel6);

        jPanel8.setBackground(new java.awt.Color(204, 255, 204));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Add Room");

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setText("Name:");

        jLabel15.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel15.setText("Seats:");

        addRoomButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addRoomButton.setText("Add");
        addRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomButtonActionPerformed(evt);
            }
        });

        addRoomStatusBar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        addRoomStatusBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addRoomStatusBar.setText(" ");

        addRoomNameTextField.setColumns(6);
        addRoomNameTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addRoomNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomNameTextFieldActionPerformed(evt);
            }
        });

        addRoomSeatsTextField.setColumns(6);
        addRoomSeatsTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        addRoomSeatsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRoomSeatsTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(18, 18, 18)
                                        .addComponent(addRoomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(18, 18, 18)
                                        .addComponent(addRoomNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(addRoomButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(addRoomStatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(addRoomNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(addRoomSeatsTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(addRoomButton)
                .addGap(31, 31, 31)
                .addComponent(addRoomStatusBar)
                .addGap(33, 33, 33))
        );

        jPanel9.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Drop Room");

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("Select Room:");

        dropRoomComboBox.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dropRoomComboBox.setModel(new javax.swing.DefaultComboBoxModel(RoomQueries.getAllRooms().toArray()));

        dropRoomButton.setText("Drop");
        dropRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dropRoomButtonActionPerformed(evt);
            }
        });

        dropRoomStatusBar.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        dropRoomStatusBar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dropRoomStatusBar.setText(" ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dropRoomButton)
                            .addComponent(dropRoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dropRoomStatusBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(dropRoomComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addComponent(dropRoomButton)
                .addGap(35, 35, 35)
                .addComponent(dropRoomStatusBar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Room Management", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addFacultyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFacultyButtonActionPerformed
        
        String name = addFacultyNameTextField.getText();
        //Check if the name enter is empty
        if (name.equals(""))
        {
            addFacultyStatusLabel.setText("Please enter faculty name");
        }
        else
        {
            // Add faculty name to the database
            Faculty.addFaculty(name);
            addFacultyStatusLabel.setText(name+" has been added to the Faculty.");

            // rebuild the reservation faculty combo box.
            rebuildFacultyNameComboBoxes();
        }
        
    }//GEN-LAST:event_addFacultyButtonActionPerformed

    private void reserveRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserveRoomButtonActionPerformed
        //get information from the combobox and textfield
        String filledFacultyName = (String)facultyNameComboBox.getSelectedItem();
        Date filledDate = (Date) datesComboBox.getSelectedItem();
        Integer filledSeats = Integer.parseInt(seatTextField.getText()); 
        
               
        //get an array list of avaliable rooms by seatings
        ArrayList<String> allPossibleRoom = new ArrayList<String>();        
        allPossibleRoom = RoomQueries.getAllPossibleRoom(filledSeats);
        
        //get an array list of reserved rooms by that date
        ArrayList<String> allReservedRoom = new ArrayList<String>();        
        allReservedRoom = ReservationQueries.getRoomsReservedByDate(filledDate);
        
        //substract the avaliable rooms by reserved rooms
        ArrayList<String> allAvaliableRoom = new ArrayList<String>(); 
        int i,j;
        Boolean reserved;
        for(i=0; i<allPossibleRoom.size(); i++)
        {
            reserved = false;
            for(j=0; j<allReservedRoom.size(); j++)
            {
                if(allPossibleRoom.get(i).equals(allReservedRoom.get(j)))
                {
                    reserved = true;
                }   
            }            
            if(reserved == false)
            {
                allAvaliableRoom.add(allPossibleRoom.get(i));
            }
        }     
        
        //If there's no room avaliable, put into waitlist
        if (allAvaliableRoom.isEmpty())
        {
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            WaitlistEntry newWaitlistEntry = new WaitlistEntry(filledFacultyName, filledDate, filledSeats, currentTimestamp);
            WaitlistQueries.addWaitlistEntry(newWaitlistEntry);
            String statusBar = String.format("%s %s %s %d %s %s", "A waitlist has been made for faculty name", newWaitlistEntry.getFacultyName(), "with", newWaitlistEntry.getSeats(), "seats on", newWaitlistEntry.getDate());
            reserveRoomStatusBar.setText(statusBar);
            this.rebuildWaitlistTable();
            
        }
        
        //If not, add to the reservation with the best fit seating
        else
        {
            //The allPossibleRoom arrayList is already order with seats and seats more than the filledseat
            //So, just choose the first item in the arrayList
            java.sql.Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
            ReservationEntry newReservationEntry = new ReservationEntry(filledFacultyName, allAvaliableRoom.get(0), filledDate, filledSeats, currentTimestamp);
            ReservationQueries.addReservationsEntry(newReservationEntry);
            String statusBar = String.format("%s %s %s %d %s %s %s %s","A reservation has been made for faculty name", newReservationEntry.getFacultyName(),"with", newReservationEntry.getSeats(),"seats room", newReservationEntry.getRoom(),"on", newReservationEntry.getDate());
            reserveRoomStatusBar.setText(statusBar);
            this.rebuildReservationsTable();
                        
        } 
         
    }//GEN-LAST:event_reserveRoomButtonActionPerformed

    private void cancelReservationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelReservationButtonActionPerformed
        // TODO add your handling code here:
        String filledFacultyName = (String)facultyComboBox.getSelectedItem();
        Date filledDate = (Date) reservationDatesComboBox.getSelectedItem();
        Boolean exist = false;
        
        exist = ReservationQueries.checkReservationsFacultyDate(filledFacultyName, filledDate);
        String statusBar;
        
        if(exist = true)
        {
            ReservationQueries.deleteReservation(filledFacultyName, filledDate);
            statusBar = String.format("%s %s %s %s %s", "A reservation for faculty named", filledFacultyName, "on date", filledDate, "has been canceled"); 
        }
        else
        {
            WaitlistQueries.deleteWaitlist(filledFacultyName, filledDate);
            statusBar = String.format("%s %s %s %s %s", "A waitlist for faculty named", filledFacultyName, "on date", filledDate, "has been canceled"); 
        }    

        cancelReservationLabel.setText(statusBar);
    }//GEN-LAST:event_cancelReservationButtonActionPerformed

    private void addDateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDateButtonActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        String spinnerValue = formater.format(addDateSpinner.getValue());
        Date date = Date.valueOf(spinnerValue);
        Dates.addDate(date);
        
        //update date combo boxes
        rebuildDatesComboBoxes();   
        addDateStatusBar.setText(String.format("%s %s %s", "Date", date, "has been added to the database"));
    }//GEN-LAST:event_addDateButtonActionPerformed

    private void addRoomNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRoomNameTextFieldActionPerformed

    private void addRoomSeatsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomSeatsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addRoomSeatsTextFieldActionPerformed

    private void addRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRoomButtonActionPerformed
        // TODO add your handling code here:
        String roomName = addRoomNameTextField.getText();
        Integer roomSeats = Integer.parseInt(addRoomSeatsTextField.getText());
        
        RoomEntry roomEntry = new RoomEntry(roomName, roomSeats);
        RoomQueries.addRoom(roomEntry);
        rebuildRoomComboBoxes();
        
        addRoomStatusBar.setText("Room " + roomEntry.getName() + " with " + roomEntry.getSeats() + " seats has been added to the database");
    }//GEN-LAST:event_addRoomButtonActionPerformed

    private void dropRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dropRoomButtonActionPerformed
        // TODO add your handling code here:
        String roomName = (String)dropRoomComboBox.getSelectedItem();
        RoomQueries.dropRoom(roomName);
        
        dropRoomStatusBar.setText("Room " + roomName + " has been dropped");
        rebuildRoomComboBoxes();
    }//GEN-LAST:event_dropRoomButtonActionPerformed

    private void statusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusButtonActionPerformed
        // TODO add your handling code here:
        String faculty = (String)facultyStatusComboBox.getSelectedItem();
        statusReservationsTable.setText(StatusReservationsTable.displayStatusReservationsTable(faculty));
        statusWaitListTable.setText(StatusWaitListTable.displayStatusWaitListTable(faculty));        
    }//GEN-LAST:event_statusButtonActionPerformed
   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame dialog = new MainFrame(new javax.swing.JFrame(), true);
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
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDateButton;
    private javax.swing.JSpinner addDateSpinner;
    private javax.swing.JLabel addDateStatusBar;
    private javax.swing.JButton addFacultyButton;
    private javax.swing.JTextField addFacultyNameTextField;
    private javax.swing.JLabel addFacultyStatusLabel;
    private javax.swing.JButton addRoomButton;
    private javax.swing.JTextField addRoomNameTextField;
    private javax.swing.JTextField addRoomSeatsTextField;
    private javax.swing.JLabel addRoomStatusBar;
    private javax.swing.JButton cancelReservationButton;
    private javax.swing.JLabel cancelReservationLabel;
    private javax.swing.JComboBox<String> datesComboBox;
    private javax.swing.JButton dropRoomButton;
    private javax.swing.JComboBox<String> dropRoomComboBox;
    private javax.swing.JLabel dropRoomStatusBar;
    private javax.swing.JComboBox<String> facultyComboBox;
    private javax.swing.JComboBox<String> facultyNameComboBox;
    private javax.swing.JComboBox<String> facultyStatusComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> reservationDatesComboBox;
    private javax.swing.JTextArea reservationsTable;
    private javax.swing.JButton reserveRoomButton;
    private javax.swing.JLabel reserveRoomStatusBar;
    private javax.swing.JTextField seatTextField;
    private javax.swing.JButton statusButton;
    private javax.swing.JTextArea statusReservationsTable;
    private javax.swing.JTextArea statusWaitListTable;
    private javax.swing.JTextArea waitlistTable;
    // End of variables declaration//GEN-END:variables
}
