// AWT & Swing, Event Handling:
// Write a GUI program to develop an application that receives a string in
// one text field, and count number ofvowels in a string and returns it in
// another text field, when the button named “CountVowel” is clicked.
// When the button named “Reset” is clicked it will resetthe value of
// textfield one and Textfield two.
// When the button named “Exit” is clicked it will closed the application







import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p45 extends JFrame implements ActionListener {
    private JTextField inputField, resultField;
    private JButton countButton, resetButton, exitButton;

    public p45() {
        setTitle("Vowel Counter");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        JLabel inputLabel = new JLabel("Enter a string:");
        inputField = new JTextField(15);

        JLabel resultLabel = new JLabel("Number of vowels:");
        resultField = new JTextField(15);
        resultField.setEditable(false);

        countButton = new JButton("CountVowel");
        resetButton = new JButton("Reset");
        exitButton = new JButton("Exit");

        countButton.addActionListener(this);
        resetButton.addActionListener(this);
        exitButton.addActionListener(this);

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(resultLabel);
        panel.add(resultField);
        panel.add(countButton);
        panel.add(resetButton);
        panel.add(exitButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == countButton) {
            String input = inputField.getText().toLowerCase();
            int vowelCount = countVowels(input);
            resultField.setText(Integer.toString(vowelCount));
        } else if (e.getSource() == resetButton) {
            inputField.setText("");
            resultField.setText("");
        } else if (e.getSource() == exitButton) {
            System.exit(0);
        }
    }

    private int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new p45());
    }
}
