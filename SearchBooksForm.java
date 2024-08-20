import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchBooksForm extends JFrame {
    private JTextField searchField;
    private JButton searchButton;
    private JTextArea resultsArea;

    public SearchBooksForm() {
        setTitle("Search Books");
        setSize(400, 300);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(null);

        JLabel searchLabel = new JLabel("Search:");
        searchLabel.setBounds(10, 20, 80, 25);
        add(searchLabel);

        searchField = new JTextField(20);
        searchField.setBounds(100, 20, 165, 25);
        add(searchField);

        searchButton = new JButton("Search");
        searchButton.setBounds(10, 50, 255, 25);
        add(searchButton);

        resultsArea = new JTextArea();
        resultsArea.setBounds(10, 80, 355, 150);
        add(resultsArea);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Search logic
                String query = searchField.getText();
                if (!query.isEmpty()) {
                    // Simulate search results
                    resultsArea.setText("Results for: " + query + "\n");
                    resultsArea.append("Book 1\nBook 2\nBook 3");
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a search query.");
                }
            }
        });
    }
}
