import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class UserDashboard extends JFrame {
    private JButton searchBooksButton;
    private JButton borrowBooksButton;
    private JButton returnBooksButton;
    private JButton viewBorrowedBooksButton;

    public UserDashboard() {
        setTitle("User Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        searchBooksButton = new JButton("Search Books");
        searchBooksButton.setBounds(50, 50, 150, 30);
        add(searchBooksButton);

        borrowBooksButton = new JButton("Borrow Books");
        borrowBooksButton.setBounds(50, 100, 150, 30);
        add(borrowBooksButton);

        returnBooksButton = new JButton("Return Books");
        returnBooksButton.setBounds(50, 150, 150, 30);
        add(returnBooksButton);

        viewBorrowedBooksButton = new JButton("View Borrowed Books");
        viewBorrowedBooksButton.setBounds(50, 200, 150, 30);
        add(viewBorrowedBooksButton);

        searchBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Search Books form
                new SearchBooksForm().setVisible(true);
            }
        });

        borrowBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Borrow Books form
                new BorrowBooksForm().setVisible(true);
            }
        });

        returnBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Return Books form
                new ReturnBooksForm().setVisible(true);
            }
        });

        viewBorrowedBooksButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open View Borrowed Books form
                new ViewBorrowedBooksForm().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new UserDashboard().setVisible(true));
    }
}
