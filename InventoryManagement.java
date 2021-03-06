import java.awt.event.*;
/**
 * Inventory form created with Net Beans
 * @author Michael McGaffick
 * @version 4/16/18
 */
public class InventoryManagement extends javax.swing.JFrame {

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnHome;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblRemove;
    private javax.swing.JLabel lblAdd;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTextField txtName1;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtName2;
    private javax.swing.JTextField txtName3;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    /**
     * Creates new form InventoryManagement
     */
    public InventoryManagement() {
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

        label1 = new java.awt.Label();
        lblHeading = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblQuantity = new javax.swing.JLabel();
        lblRemove = new javax.swing.JLabel();
        lblAdd = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblName2 = new javax.swing.JLabel();
        txtName1 = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtName2 = new javax.swing.JTextField();
        txtName3 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();

        //Adds function to the buttons
        btnHome.addActionListener(new HomeListener());
        btnAdd.addActionListener(new AddListener());
        btnSearch.addActionListener(new SearchListener());
        btnRemove.addActionListener(new RemoveListener());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        setTitle("Inventory Management");

        label1.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        label1.setText("Inventory Management");

        lblHeading.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblHeading.setText("Name:");

        lblPrice.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblPrice.setText("Price:");

        lblQuantity.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblQuantity.setText("Quantity:");

        lblRemove.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblRemove.setText("Remove an Item");

        lblAdd.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblAdd.setText("Add an Item");

        lblName.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblSearch.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        lblSearch.setText("Search for an Item");

        lblName2.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        lblName2.setText("Name:");

        txtName1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName1.setText("(Name)");

        txtPrice.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtPrice.setText("(Price)");

        txtQuantity.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtQuantity.setText("(Quantity)");

        txtName2.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName2.setText("(Name)");

        txtName3.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        txtName3.setText("(Name)");

        btnAdd.setBackground(new java.awt.Color(102, 255, 102));
        btnAdd.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnAdd.setText("Add");

        btnRemove.setBackground(new java.awt.Color(102, 255, 102));
        btnRemove.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnRemove.setText("Remove");

        btnSearch.setBackground(new java.awt.Color(102, 255, 102));
        btnSearch.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnSearch.setText("Search");

        btnHome.setBackground(new java.awt.Color(153, 255, 153));
        btnHome.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        btnHome.setText("Home");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSearch)
                            .addComponent(lblAdd)
                            .addComponent(lblRemove))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHeading)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblQuantity)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblPrice)
                                            .addGap(34, 34, 34)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName)
                                        .addGap(38, 38, 38)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHome))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeading)
                    .addComponent(txtName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblRemove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName2)
                    .addComponent(txtName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Runs upon start to intialize everything
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
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InventoryManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    /**
     * Listener for the home button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class HomeListener implements ActionListener
    {
        /**
         * Closes the inventory form and opens the home form
         * @param e the action of the button being clicked down
         */
        public void actionPerformed(ActionEvent e)
        {
            Container.im.setVisible(false);
            Container.hf.setVisible(true);
        }
    }

    /**
     * Listener for the add button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class AddListener implements ActionListener
    {
        /**
         * Adds in the current item to the inventory listing
         * @param e the action of the button being clicked down
         */
        public void actionPerformed(ActionEvent e)
        {
            try{
                //Checks for a space and gets rid of it with an underscore
                String name = txtName1.getText().toLowerCase().replaceAll("\\s{1,}", "_");
                String sPrice = txtPrice.getText();
                String sQuantity = txtQuantity.getText();
                double price = Double.parseDouble(sPrice);
                int quantity = Integer.parseInt(sQuantity);
                Container.inv.add(name, price, quantity);
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the search button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class SearchListener implements ActionListener
    {
        /**
         * Searchs for the specified item and prints all information about it
         * @param e the action of the button being clicked down
         */
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                //Removes the space
                Container.inv.search(txtName2.getText().toLowerCase().replaceAll("\\s{1,}", "_"));
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }

    /**
     * Listener for the remove button
     * @author Michael McGaffick
     * @version 4/23/18
     */
    class RemoveListener implements ActionListener
    {
        /**
         * Searchs for the specified item and removes it
         * @param e the action of the button being clicked down
         */
        public void actionPerformed(ActionEvent e)
        {
            try
            {
                //Removes the space
                Container.inv.remove(txtName3.getText().toLowerCase().replaceAll("\\s{1,}", "_"));
            }
            catch(Exception ex)
            {
                System.out.println("\fIncorrect Input... please refer to the user manual for help.");
            }
        }
    }
}