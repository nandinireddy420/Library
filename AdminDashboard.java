import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminDashboard extends JFrame {
    private JButton addBookButton;
    private JButton removeBookButton;
    private JButton manageUsersButton;
    private JButton viewStatsButton;

    public AdminDashboard() {
        setTitle("Admin Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        addBookButton = new JButton("Add Book");
        addBookButton.setBounds(50, 50, 150, 30);
        add(addBookButton);

        removeBookButton = new JButton("Remove Book");
        removeBookButton.setBounds(50, 100, 150, 30);
        add(removeBookButton);

        manageUsersButton = new JButton("Manage Users");
        manageUsersButton.setBounds(50, 150, 150, 30);
        add(manageUsersButton);

        viewStatsButton = new JButton("View Statistics");
        viewStatsButton.setBounds(50, 200, 150, 30);
        add(viewStatsButton);

        addBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Add Book form
                new AddBookForm().setVisible(true);
            }
        });

        removeBookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Remove Book form
                new RemoveBookForm().setVisible(true);
            }
        });

        manageUsersButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open Manage Users form
                new ManageUsersForm().setVisible(true);
            }
        });

        viewStatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open View Statistics form
                new ViewStatsForm().setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AdminDashboard().setVisible(true));
    }
}
