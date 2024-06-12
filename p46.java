// Java Database Connectivity (JDBC):
// Create a database of employee with the following fields.
// • Name
// • Code
// • Designation
// • Salary
// 2
// a) Write a java program to create GUI java application to take
// employee data from the TextFields and store it in database
// using JDBC connectivity.
// b) Write a JDBC Program to retrieve all the records from the
// employee database




import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class p46 extends JFrame implements ActionListener {
    private JTextField nameField, codeField, designationField, salaryField;
    private JButton addButton;

    public p46() {
        setTitle("Employee Database");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(5, 2, 5, 5));

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(15);

        JLabel codeLabel = new JLabel("Code:");
        codeField = new JTextField(15);

        JLabel designationLabel = new JLabel("Designation:");
        designationField = new JTextField(15);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(15);

        addButton = new JButton("Add Employee");
        addButton.addActionListener(this);

        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(codeLabel);
        panel.add(codeField);
        panel.add(designationLabel);
        panel.add(designationField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(addButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addButton) {
            String name = nameField.getText();
            String code = codeField.getText();
            String designation = designationField.getText();
            double salary = Double.parseDouble(salaryField.getText());

            try {
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "");
                Statement stmt = con.createStatement();
                String query = "INSERT INTO employee (Name, Code, Designation, Salary) VALUES ('" + name + "', '" + code + "', '" + designation + "', " + salary + ")";
                stmt.executeUpdate(query);
                JOptionPane.showMessageDialog(this, "Employee added successfully!");
                con.close();
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p46());
    }
}
