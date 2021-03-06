import java.awt.event.*;
/**
 * Table Management form created with Net Beans
 * @author Michael McGaffick
 * @version 4/16/18
 */
public class TableManagement extends javax.swing.JFrame {
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStatus;
    private javax.swing.JButton btnImport;
    private javax.swing.JButton btnExport;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnEmpty;
    private javax.swing.JButton btnSeat;
    private javax.swing.JLabel jlblHead0;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblSize;
    private javax.swing.JLabel lblKey;
    private javax.swing.JLabel lblModify;
    private javax.swing.JLabel lblChange;
    private javax.swing.JTextField txtFileName;
    private javax.swing.JTextField txtChangeSize;
    private javax.swing.JTextField txtImportFileName;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtModify;
    private java.awt.Label lblHead;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form TableManagement
     */
    public TableManagement() {
        initComponents();
    }

    /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new java.awt.Label();
        lblAdd = new javax.swing.JLabel();
        lblSize = new javax.swing.JLabel();
        txtChangeSize = new javax.swing.JTextField();
        lblManage = new javax.swing.JLabel();
        txtImportFileName = new javax.swing.JTextField();
        lblKey = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        lblModify = new javax.swing.JLabel();
        lblChange = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        btnEmpty = new javax.swing.JButton();
        btnSeat = new javax.swing.JButton();
        btnStatus = new javax.swing.JButton();
        jlblHead0 = new javax.swing.JLabel();
        btnImport = new javax.swing.JButton();
        txtModify = new javax.swing.JTextField();
        txtFileName = new javax.swing.JTextField();
        btnExport = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        //Adds functions to all of the buttons
        btnHome.addActionListener(new HomeListener());
        btnAdd.addActionListener(new AddListener());
        btnClean.addActionListener(new CleanListener());
        btnSeat.addActionListener(new SeatListener());
        btnEmpty.addActionListener(new EmptyListener());
        btnStatus.addActionListener(new StatusListener());
        btnUpdate.addActionListener(new ChangeSizeListener());
        btnImport.addActionListener(new ImportListener());
        btnExport.addActionListener(new ExportListener());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Table Management");

        lblHead.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblHead.setText("Table Management");

        lblAdd.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblAdd.setText("Add a Table");

        lblSize.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblSize.setText("Size:");

        txtChangeSize.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtChangeSize.setText("(Size)");

        lblManage.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblManage.setText("Manage Table:");

        txtImportFileName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtImportFileName.setText("(File Name).txt");

        lblKey.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblKey.setText("Key:");

        txtKey.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtKey.setText("(Key)");

        lblModify.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblModify.setText("Modify Status");

        lblChange.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblChange.setText("Change Size:");

        txtSize.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtSize.setText("(Size)");

        btnUpdate.setBackground(new java.awt.Color(102, 255, 102));
        btnUpdate.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnUpdate.setText("Update");

        btnClean.setBackground(new java.awt.Color(102, 255, 102));
        btnClean.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnClean.setText("Clean");

        btnEmpty.setBackground(new java.awt.Color(102, 255, 102));
        btnEmpty.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnEmpty.setText("Empty");

        btnSeat.setBackground(new java.awt.Color(102, 255, 102));
        btnSeat.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnSeat.setText("Seat");

        btnStatus.setBackground(new java.awt.Color(102, 255, 102));
        btnStatus.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnStatus.setText("Get Status");

        jlblHead0.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jlblHead0.setText("Table Map Functions");

        btnImport.setBackground(new java.awt.Color(102, 255, 102));
        btnImport.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnImport.setText("Import Map from File");

        txtModify.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtModify.setText("(Table Key)");

        txtFileName.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtFileName.setText("(File Name).txt");

        btnExport.setBackground(new java.awt.Color(102, 255, 102));
        btnExport.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnExport.setText("Export Map to File");

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnAdd.setText("Add");

        btnHome.setBackground(new java.awt.Color(102, 255, 102));
        btnHome.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnHome.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblManage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModify, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblModify)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtChangeSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEmpty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClean)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSeat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnStatus))
                    .addComponent(jlblHead0)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnImport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtImportFileName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblAdd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(lblSize)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lblKey)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)
                            .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdd)
                    .addComponent(btnHome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSize)
                    .addComponent(lblKey)
                    .addComponent(txtKey, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManage)
                    .addComponent(txtModify, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModify)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClean)
                    .addComponent(btnEmpty)
                    .addComponent(btnSeat)
                    .addComponent(btnStatus))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblChange)
                    .addComponent(txtChangeSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblHead0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImport)
                    .addComponent(txtImportFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFileName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExport)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Basically adds the components and intializes the form
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TableManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class HomeListener implements ActionListener
    {
        /**
         * Closes the table management form and opens the home form
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            Container.tm.setVisible(false);
            Container.hf.setVisible(true);
        }
    }

    /**
     * A listener needed for the add button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class AddListener implements ActionListener
    {
        /**
         * Adds the specified size and key to a the table map in order to create a new tabl
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.map.put(txtKey.getText().toLowerCase(),new Table(Integer.parseInt(txtSize.getText())));
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the cleans button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class CleanListener implements ActionListener
    {
        /**
         * Cleans the specified table, making it able to seat customer
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.map.modifyTable("clean", txtModify.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class SeatListener implements ActionListener
    {
        /**
         * Seats customers at the specified table if requirements are met
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                Container.map.modifyTable("seat", txtModify.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class EmptyListener implements ActionListener
    {
        /**
         * Empties the specified table, meaning customers have left
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try {
                Container.map.modifyTable("empty", txtModify.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class StatusListener implements ActionListener
    {
        /**
         * Gets the status of the table whether it is dirty or if it has customers
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try {
                Container.map.getStatus(txtModify.getText().toLowerCase());
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class ChangeSizeListener implements ActionListener
    {
        /**
         * Changes the table's size based on the new size
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                Container.map.changeSize(txtModify.getText().toLowerCase(),Integer.parseInt(txtChangeSize.getText()));
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class ImportListener implements ActionListener
    {
        /**
         * Overwrites current table data with data from the specified file
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                FileHandler.loadTablemap(txtImportFileName.getText());
            }

            catch(Exception ex)
            {
                System.out.println("\fFailure to load the specified file.  Refer to the user guide for help.");
            }
        }
    }

    /**
     * A listener needed for the home button
     * @author Michael McGaffick
     * @version 4/24/18
     */
    class ExportListener implements ActionListener
    {
        /**
         * Saves the current table data to the specified file
         * @param e the action of the specified button being clicked
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                FileHandler.saveTablemap(txtFileName.getText());
            }

            catch(Exception ex)
            {
                System.out.println("\fFailure to save to the specified file.  Refer to the user guide for help.");
            }
        }
    }
}
