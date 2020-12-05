package mobilePlans;
/* Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
   OOP CA 2 - due for Sat, 5th Dec 2020 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenu extends JFrame implements ActionListener {

    private JMenu plansMenu, customersMenu, operatorsMenu, reportingMenu;
    private JLabel welcomeMsg, progImg;
    private JPanel wlcMain;

    ArrayList<Plans> plans = new ArrayList<>();
    ArrayList<Customers> customers = new ArrayList<>();
    //private Plans plans;
    //private Customers customers;

    public MainMenu() {
        setTitle("Mobile Plans Administration");
        setSize(350,250);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

        Container contentPane = getContentPane();
        setLayout(new FlowLayout());

        //addPlans();
        //addCustomers();
        //addOperators();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.WHITE);

        menuBar.add(plansMenu);
        menuBar.add(customersMenu);
        menuBar.add(operatorsMenu);
        menuBar.add(reportingMenu);
    }

    public static void main(String[] args) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
