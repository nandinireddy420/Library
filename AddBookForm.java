import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddBookForm extends JFrame {
    private JTextField titleField;
    private JTextField authorField;
    private JButton addButton;

    public AddBookForm() {
        setTitle("Add Book");
        setSize(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel titleLabel = new JLabel("Title:");
        titleLabel.setBounds(10, 20, 80, 25);
        add(titleLabel);

        titleField = new JTextField(20);
        titleField.setBounds(100, 20, 165, 25);
        add(titleField);

        JLabel authorLabel = new JLabel("Author:");
        authorLabel.setBounds(10, 50, 80, 25);
        add(authorLabel);

        authorField = new JTextField(20);
        authorField.setBounds(100, 50, 165, 25);
        add(authorField);

        addButton = new JButton("Add Book");
        addButton.setBounds(10, 80, 255, 25);
        add(addButton);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add book logic
                String title = titleField.getText();
                String author = authorField.getText();
                if (!title.isEmpty() && !author.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Book Added: " + title + " by " + author);
                    // Save to database or file
                } else {
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.");
                }
            }
        });
    }
}
