package mobilePlans;
//MainMenu.java
/* Neil Sebbey (T00198203) - Software Development Stream (Yr. 2)
 * OOP CA 2 - due for Sat, 5th Dec 2020
 * @author  Neil Sebbey
 * @version 1.0
 * @since   14-11-2020  */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class MainMenu extends JFrame implements ActionListener {
    /*****************************************************
     *    Code from a sample program in Problem Solving Session (Wk 8)
     *    Title:    RestaurantApp.java, lines 35-44
     *    Author: John Brosnan & DJ
     *    Site owner/sponsor:  NA
     *    Date: 15/11/2020
     *    Code version:  edited 15 November 2020
     *    Availability:  X:\Object Oriented Programming\ProblemSolving\ProblemSolving8
     *                   \problemsolvingweek8\exercisea\RestaurantApp.java (Accessed 20/11/2020)
     *    Modified:  Code refactored (Identifiers renamed)
     *****************************************************/
    // code
    private JMenu plansMenu, customersMenu, operatorsMenu, programMenu;
    private JLabel welcomeMsg, progImg;
    private JPanel wlcMain;

    /** Array Lists */
    ArrayList<Plan> plans = new ArrayList<>();
    ArrayList<Customer> customers = new ArrayList<>();
    ArrayList<Operator> operators = new ArrayList<>();
    Plan plan;
    Customer customer;
    Operator operator;

    /** Main Menu parameters*/
    public MainMenu() {
        setTitle("Mobile Plans Administration");
        setSize(550, 350);
        setLocationRelativeTo(null);
        setResizable(false);

        setIconImage(new ImageIcon(getClass().getResource("icon.png")).getImage());

        Container contentPane = getContentPane();
        setLayout(new FlowLayout());

        addPlansMenu();
        addCustomersMenu();
        addOperatorsMenu();
        addProgramMenu();

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        menuBar.setBackground(Color.WHITE);

        menuBar.add(plansMenu);
        menuBar.add(customersMenu);
        menuBar.add(operatorsMenu);
        menuBar.add(programMenu);

        wlcMain = new JPanel();
        wlcMain.add(Box.createVerticalStrut(10));
        wlcMain.setLayout(new BoxLayout(wlcMain, BoxLayout.Y_AXIS));

        welcomeMsg = new JLabel("Welcome to the Mobile Plans Administration program");
        welcomeMsg.setFont(new Font("sans-serif", 3, 16));
        welcomeMsg.setForeground(Color.GREEN);

        welcomeMsg.setAlignmentX(Component.CENTER_ALIGNMENT);
        wlcMain.add(welcomeMsg);
        wlcMain.add(Box.createVerticalStrut(15));

        //add images
        try {
            progImg = new JLabel();
            progImg.setIcon(new ImageIcon(getClass().getResource("icon.png")));

            progImg.setAlignmentX(Component.CENTER_ALIGNMENT);
            wlcMain.add(progImg);
        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "Invalid Image File in Main Screen");
        }

        wlcMain.add(Box.createVerticalStrut(20));

        add(wlcMain);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        open();
    }

    public static void main(String[] args) {
        new MainMenu();
    }

    /** Menu Bar Items
     ** -- Plans Menu -- */
    public void addPlansMenu() {
        JMenuItem item;

        plansMenu = new JMenu("Plans");
        plansMenu.setMnemonic(KeyEvent.VK_P);

        item = new JMenuItem("Add Plan");
        item.setMnemonic(KeyEvent.VK_A);
        item.addActionListener(this);
        plansMenu.add(item);

        item = new JMenuItem("Modify Plan");
        item.setMnemonic(KeyEvent.VK_M);
        item.addActionListener(this);
        plansMenu.add(item);

        item = new JMenuItem("Delete Plan");
        item.setMnemonic(KeyEvent.VK_D);
        item.addActionListener(this);
        plansMenu.add(item);

        item = new JMenuItem("View Plans");
        item.setMnemonic(KeyEvent.VK_V);
        item.addActionListener(this);
        plansMenu.add(item);
    }

    /** -- Customers Menu -- */
    public void addCustomersMenu() {
        JMenuItem item;

        customersMenu = new JMenu("Customers");
        customersMenu.setMnemonic(KeyEvent.VK_C);

        item = new JMenuItem("Add Customer");
        item.setMnemonic(KeyEvent.VK_A);
        item.addActionListener(this);
        customersMenu.add(item);

        item = new JMenuItem("Modify Customer");
        item.setMnemonic(KeyEvent.VK_M);
        item.addActionListener(this);
        customersMenu.add(item);

        item = new JMenuItem("Delete Customer");
        item.setMnemonic(KeyEvent.VK_D);
        item.addActionListener(this);
        customersMenu.add(item);

        item = new JMenuItem("View Customers");
        item.setMnemonic(KeyEvent.VK_V);
        item.addActionListener(this);
        customersMenu.add(item);
    }

    /** -- Operators Menu -- */
    public void addOperatorsMenu() {
        JMenuItem item;

        operatorsMenu = new JMenu("Operators");
        operatorsMenu.setMnemonic(KeyEvent.VK_P);

        item = new JMenuItem("Add Operator");
        item.setMnemonic(KeyEvent.VK_A);
        item.addActionListener(this);
        operatorsMenu.add(item);

        item = new JMenuItem("Modify Operator");
        item.setMnemonic(KeyEvent.VK_M);
        item.addActionListener(this);
        operatorsMenu.add(item);

        item = new JMenuItem("Delete Operator");
        item.setMnemonic(KeyEvent.VK_D);
        item.addActionListener(this);
        operatorsMenu.add(item);

        item = new JMenuItem("View Operators");
        item.setMnemonic(KeyEvent.VK_V);
        item.addActionListener(this);
        operatorsMenu.add(item);
    }

    /** -- Program Menu -- */
    public void addProgramMenu() {
        //ProgramMenu consists of an Exit button as another way to quit the program
        JMenuItem item;

        programMenu = new JMenu("Program");
        programMenu.setMnemonic(KeyEvent.VK_R);

        item = new JMenuItem("Find Plans");
        item.setMnemonic(KeyEvent.VK_F);
        item.addActionListener(this);
        programMenu.add(item);

        item = new JMenuItem("About");
        item.setMnemonic(KeyEvent.VK_A);
        item.addActionListener(this);
        programMenu.add(item);

        item = new JMenuItem("Exit");
        item.setMnemonic(KeyEvent.VK_X);
        item.addActionListener(this);
        programMenu.add(item);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);

                if (option == JOptionPane.YES_OPTION) {
                    try {
                        save();
                        JOptionPane.showMessageDialog(null, "Data saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
                    } catch (IOException e1) {
                        JOptionPane.showMessageDialog(null, "Not able to save the file");
                        e1.printStackTrace();
                    }

                    System.exit(0);
                }
            }
        });

    }
    // End of Menu Bar Items

    //Save and open data
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src/mobilePlans/MobilePlans.dat"));
        os.writeObject(plans);
        os.writeObject(customers);
        os.writeObject(operators);
        os.close();
        /*
        os = new ObjectOutputStream(new FileOutputStream("Customers.dat"));
        os.writeObject(customers);
        os.close();
        ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Operators.dat"));
        os.writeObject(operators);
        os.close();

         */
    }

    public void open() {
        try {
            File file = new File("src/mobilePlans/MobilePlans.dat");
            /*File file = new File("Customers.dat");
            File file = new File("Operators.dat");

             */

            if (file.exists()) {

                ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
                plans = (ArrayList<Plan>) is.readObject();
                customers = (ArrayList<Customer>) is.readObject();
                operators = (ArrayList<Operator>) is.readObject();
                is.close();

                /* ///This is no longer needed one file can load three array lists
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
                customers = (ArrayList<Customers>) is.readObject();
                is.close();

                ObjectInputStream is = new ObjectInputStream(new FileInputStream(file));
                operators = (ArrayList<Operators>) is.readObject();
                is.close();

                 */

                JOptionPane.showMessageDialog(null, file.getName() + " file has been loaded successfully into the system", "Open", JOptionPane.INFORMATION_MESSAGE);
            } else {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "File has been created!", "Created " + file.getName() + " file", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ClassNotFoundException cnfe) {
            JOptionPane.showMessageDialog(null, "Class not found", "Error", JOptionPane.ERROR_MESSAGE);
            cnfe.printStackTrace();
        } catch (FileNotFoundException fnfe) {
            JOptionPane.showMessageDialog(null, "File not found", "Error", JOptionPane.ERROR_MESSAGE);
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            JOptionPane.showMessageDialog(null, "Problem reading from the file", "Error", JOptionPane.ERROR_MESSAGE);
            ioe.printStackTrace();
        }
    }
    //End of Save and Open data functions

    //Plans Functions
    public void addPlan() {
        String planIdAS;
        String name;
        String description;
        String operatorIdAS;
        String minutesAS;
        String textsAS;
        String dataGBAS;
        String pricePMAS;

        /*****************************************************
         *    Title:    What does the "Integer" in "Integer.parseInt()" do? (lines 3-4)
         *    Author: Roman
         *    Site owner/sponsor:  stackoverflow.com
         *    Date: 01/02/2020
         *    Code version:  edited 30 November 2020 at 01:22
         *    Availability:  https://stackoverflow.com/questions/59923097/what-does-the-integer-in-integer-parseint-do (Accessed 28 November 2020)
         *    Modified:  Code refactored (Identifiers renamed)
         *****************************************************/
        // code
        planIdAS = JOptionPane.showInputDialog(" --- Plan IDs --- " + "\n1x - Vodafone\n2x - Three\n3x - Eir/GoMo" +
                "\n4x - Tesco Mobile\n5x - 48\n\nx1-x3 (Prepay Plans)\nx4-x9 (Bill Pay & SIM-only plans)" +
                "\n\nPlease enter Plan ID: ");
        int planId = Integer.parseInt(planIdAS);
        name = JOptionPane.showInputDialog("Enter name");
        description = JOptionPane.showInputDialog("Enter description");
        operatorIdAS = JOptionPane.showInputDialog(" --- Operator IDs --- " + "\n1 - Vodafone\n2 - Three\n3 - Eir/GoMo" +
                "\n4 - Tesco Mobile\n5 - 48" + "\n\nEnter Operator ID: ");
        int operatorId = Integer.parseInt(operatorIdAS);
        minutesAS = JOptionPane.showInputDialog("Enter minutes of calls (for unlimited, please enter 10000): ");
        int minutes = Integer.parseInt(minutesAS);
        textsAS = JOptionPane.showInputDialog("Enter amount of texts (for unlimited, please enter 10000): ");
        int texts = Integer.parseInt(textsAS);
        dataGBAS = JOptionPane.showInputDialog("Enter amount of data in GB (for unlimited, please enter 80.00): ");
        double dataGB = Double.parseDouble(dataGBAS);
        pricePMAS = JOptionPane.showInputDialog("Enter price per month");
        double pricePM = Double.parseDouble(pricePMAS);
        // End of refactored code

        plan = new Plan(planId, name, description, operatorId, minutes, texts, dataGB, pricePM);
        plans.add(plan);

        JOptionPane.showMessageDialog(null, "Plan - " + name + " - has been added!", "Plan added",
                JOptionPane.INFORMATION_MESSAGE);
    }

    public void modifyPlan() {
        ArrayList<Plan> foundPlans = new ArrayList<Plan>();
        String searchIDPlanModAS = JOptionPane.showInputDialog("Please enter a plan ID to amend/modify details");
        int searchIDPlanMod = Integer.parseInt(searchIDPlanModAS);

        for(Plan pl: plans)
            if(pl.getPlanId()==searchIDPlanMod)
                foundPlans.add(pl);

        String text="";

        for (Plan pl : foundPlans)
            if (pl != null) {
                text += pl + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following plan matches your ID Search\n\n" + text +
                "\n\nEnter the ID of the plan your wish to amend/modify to confirm"));

        Plan planToModify=null;

        for (Plan pl : foundPlans)
            if (pl != null && pl.getPlanId()==searchID)
                planToModify = pl;

        String modifyChoice = JOptionPane.showInputDialog("The details of the plan you wish to amend/modify are: \n\n" +
                planToModify + "\n\n1. Amend Name and Description\n2. Amend Allowances and Price\n3. Amend Operator ID\n4. Cancel Amendment");

        int modifyChoiceAI = Integer.parseInt(modifyChoice);

        while(modifyChoiceAI<1 || modifyChoiceAI > 4) {
            modifyChoice = JOptionPane.showInputDialog("The details of the plan you wish to amend/modify are: \n\n" +
                    planToModify + "\n\n1. Amend Name and Description\n2. Amend Allowances and Price\n3. Amend Operator ID\n4. Cancel Amendment" +
                    "\n\nInvalid choice entered! You must select options betwen 1 and 4");

            modifyChoiceAI = Integer.parseInt(modifyChoice);
        }

        switch(modifyChoice){
            case "1":
                String newName = JOptionPane.showInputDialog("Please enter the new name");
                planToModify.setName(newName);

                String newDescription = JOptionPane.showInputDialog("Please enter the new description");
                planToModify.setDescription(newDescription);

                break;

            case "2":
                String newMinutesAS = JOptionPane.showInputDialog("Please enter new call minutes (10000 = Unlimited)");
                int newMinutes = Integer.parseInt(newMinutesAS);
                planToModify.setMinutes(newMinutes);

                String newTextsAS = JOptionPane.showInputDialog("Please enter new texts (10000 = Unlimited)");
                int newTexts = Integer.parseInt(newTextsAS);
                planToModify.setTexts(newTexts);

                String newDataGBAS = JOptionPane.showInputDialog("Please enter new data allowance in GB (80.00 = Unlimited)");
                double newDataGB = Double.parseDouble(newDataGBAS);
                planToModify.setDataGB(newDataGB);

                String newPricePMAS = JOptionPane.showInputDialog("Please enter new price per month");
                double newPricePM = Double.parseDouble(newPricePMAS);
                planToModify.setPricePM(newPricePM);

                break;

            case "3":
                JOptionPane.showMessageDialog(null,"--- Operator IDs ---" + "\n" +
                        "1 - Vodafone\n2 - Three\n3 - Eir / GoMo\n4 - Tesco Mobile\n5 - 48\n6 to 9 - Other","Modify Operator ID",JOptionPane.INFORMATION_MESSAGE);

                String newOperatorIdAS = JOptionPane.showInputDialog("Please enter new Operator ID");
                int newOperatorId = Integer.parseInt(newOperatorIdAS);
                planToModify.setOperatorId(newOperatorId);

                break;
        }
        JOptionPane.showMessageDialog(null,"Plan details are modified!",
                "Plan Details Modified",JOptionPane.INFORMATION_MESSAGE);
        foundPlans.clear();
    }

    public void deletePlan() {
        ArrayList<Plan> foundPlans = new ArrayList<Plan>();
        String searchIDPlanDelAS = JOptionPane.showInputDialog("Please enter an ID number of the plan you wish to delete");
        int searchIDPlanDel = Integer.parseInt(searchIDPlanDelAS);

        for(Plan pl: plans)
            if(pl.getPlanId()==searchIDPlanDel)
                foundPlans.add(pl);

        String text="";

        for (Plan pl : foundPlans)
            if (pl != null) {
                text += pl + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following plan matched your ID Search phrase\n\n" + text +
                "\n\nPlease enter the ID of the plan you wish to be deleted to confirm"));

        Plan planToDelete=null;

        for (Plan pl : foundPlans)
            if (pl != null && pl.getPlanId()==searchID)
                planToDelete = pl;

        int deleteChoice = JOptionPane.showConfirmDialog(null,"The details of the plan you wish to delete are:\n\n" +
                planToDelete + "\n\nAre you sure you wish to delete this plan?","Confirm deleting plan Details",JOptionPane.YES_NO_CANCEL_OPTION);

        if(deleteChoice==JOptionPane.YES_OPTION) {
            plans.remove(planToDelete);
            JOptionPane.showMessageDialog(null,"The details of this plan have been removed from the system.",
                    "Plan Details Removed",JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null,"The details of this plan are not removed from the system." +
                    " This process has been cancelled.","Plan Not Deleted",JOptionPane.INFORMATION_MESSAGE);

        foundPlans.clear();
    }

    public void viewPlans() {
        JComboBox planCombo = new JComboBox();
        JTextArea output = new JTextArea();

        output.setText("Plan Details:\n\n");

        if(plans.size() < 1) {
            JOptionPane.showMessageDialog(null,"No plans are stored on the system. Please add a new plan.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else {
            Iterator<Plan> iterator = plans.iterator();

            while(iterator.hasNext()) {
                planCombo.addItem(iterator.next().getPlanId() + "\n");
            }

            JOptionPane.showMessageDialog(null,"--- Plan IDs for each operator ---" + "\n" +
                    "1x - Vodafone\n2x - Three\n3x - Eir / GoMo\n4x - Tesco Mobile\n5x - 48\n\n" + "Prepay Plans - x1-x3" +
                    "\nBill Pay or SIM-only Plans - x4-x9","View Plans",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,planCombo,"Select plan ID to view details",JOptionPane.PLAIN_MESSAGE);

            int selected = planCombo.getSelectedIndex();
            output.append(plans.get(selected).toString());

            JOptionPane.showMessageDialog(null,output,"Plan Details",JOptionPane.PLAIN_MESSAGE);
        }
    }

    // Customers Functions
    public void addCustomer() {
        String custIdAS;
        String surname;
        String forename;
        String email;
        String address;
        String city;
        String county;
        String eircode;
        String planIdAS;

        custIdAS = JOptionPane.showInputDialog("Please enter a customer ID");
        int custId = Integer.parseInt(custIdAS);
        surname = JOptionPane.showInputDialog("Please enter customer's Surname");
        forename = JOptionPane.showInputDialog("Enter customer's Forename");
        email = JOptionPane.showInputDialog("Enter customer's Email address");
        address = JOptionPane.showInputDialog("Enter customer's Home address");
        city = JOptionPane.showInputDialog("Enter customer's City");
        county = JOptionPane.showInputDialog("Enter customer's county");
        eircode = JOptionPane.showInputDialog("Enter customer's Eircode");
        planIdAS = JOptionPane.showInputDialog("Enter customer's plan");
        int planId = Integer.parseInt(planIdAS);


        customer = new Customer(custId, surname, forename, email, address, city, county, eircode, planId);
        customers.add(customer);

        JOptionPane.showMessageDialog(null, "Customer, " + forename + " " + surname +
        ", ID: " + custIdAS + ", added to the system!","Customer Added", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modifyCustomer() {
        ArrayList<Customer> foundCustomers = new ArrayList<Customer>();
        String searchEmail = JOptionPane.showInputDialog("Please enter a customer's email address to amend/modify a customer's details");

        for(Customer cu: customers)
            if(cu.getEmail().toLowerCase().contains(searchEmail.toLowerCase()))
                foundCustomers.add(cu);

            String text="";

            for (Customer cu : foundCustomers)
                if (cu != null) {
                    text += cu + "\n";

                }

            int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following customers match your Email Search\n\n" + text +
                    "\n\nEnter the ID of the customer your want to amend/modify"));

            Customer customerToModify=null;

            for (Customer cu : foundCustomers)
                if (cu != null && cu.getCustId()==searchID)
                    customerToModify = cu;

            String modifyChoice = JOptionPane.showInputDialog("The details of the customer you wish to amend/modify are: \n\n" +
            customerToModify + "\n\n1. Amend Name\n2. Amend Email\n3.Amend Address\n4. Amend Operator ID\n5.Cancel Amendment");

            int modifyChoiceAI = Integer.parseInt(modifyChoice);

            while(modifyChoiceAI<1 || modifyChoiceAI > 5) {
                modifyChoice = JOptionPane.showInputDialog("The details of the customer you wish to amend/modify are: \n\n" +
                customerToModify + "\n\n1. Amend Name\n2. Amend Email\n3.Amend Address\n4. Amend Operator ID\n5.Cancel Amendment" +
                "\n\nInvalid choice entered! You must select options betwen 1 and 5");

                modifyChoiceAI = Integer.parseInt(modifyChoice);
            }

            switch(modifyChoice){
                case "1":
                    String newSurname = JOptionPane.showInputDialog("Please enter the new surname");
                    customerToModify.setSurname(newSurname);

                    String newForename = JOptionPane.showInputDialog("Please enter the new surname");
                    customerToModify.setForename(newForename);

                    break;

                case "2":
                    String newEmail = JOptionPane.showInputDialog("Please enter the new email address of the customer");
                    customerToModify.setEmail(newEmail);

                    break;

                case "3":
                    String newAddress = JOptionPane.showInputDialog("Please enter customer's new address");
                    customerToModify.setAddress(newAddress);

                    String newCity = JOptionPane.showInputDialog("Please enter customer's new city");
                    customerToModify.setCity(newCity);

                    String newCounty = JOptionPane.showInputDialog("Please enter customer's new county");
                    customerToModify.setCounty(newCounty);

                    String newEircode = JOptionPane.showInputDialog("Please enter customer's new Eircode");
                    customerToModify.setEircode(newEircode);

                    break;

                case "4":
                    String newPlanId = JOptionPane.showInputDialog("Please enter customer's new operator ID:" +
                    "\n\n--- Plan IDs for each Mobile Operator ---" + "\n1x - Vodafone" + "\n2x - Three" +
                    "\n3x - Eir/GoMo" + "\n4x - Tesco Mobile" + "\n5x - 48" + "\n\nx1-x3 (Prepay Plans)" +
                    "\nx4-x9 (Bill Pay & SIM Only <x7 - x9> Plans");
                    int newPlanIdAI = Integer.parseInt(newPlanId);
                    customerToModify.setPlanId(newPlanIdAI);

                    break;
            }
            JOptionPane.showMessageDialog(null,"Customer details are modified!",
                    "Customer Details Modified",JOptionPane.INFORMATION_MESSAGE);
            foundCustomers.clear();
    }

    public void deleteCustomer() {
        ArrayList<Customer> foundCustomers = new ArrayList<Customer>();
        String searchEmail = JOptionPane.showInputDialog("Please enter the email address of the customer you wish to delete");

        for(Customer cu: customers)
            if(cu.getEmail().toLowerCase().contains(searchEmail.toLowerCase()))
                foundCustomers.add(cu);

        String text="";

        for (Customer cu : foundCustomers)
            if (cu != null) {
                text += cu + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following customers matched your Email Search phrase\n\n" + text +
                "\n\nPlease enter the ID of the customer you want to be deleted"));

        Customer customerToDelete=null;

        for (Customer cu : foundCustomers)
            if (cu != null && cu.getCustId()==searchID)
                customerToDelete = cu;

        int deleteChoice = JOptionPane.showConfirmDialog(null,"The details of the customer you wish to delete are:\n\n" +
                customerToDelete + "\n\nAre you sure you wish to delete this customer?","Confirm deleting Customer Details",JOptionPane.YES_NO_CANCEL_OPTION);

        if(deleteChoice==JOptionPane.YES_OPTION) {
            customers.remove(customerToDelete);
            JOptionPane.showMessageDialog(null,"The details of this customer have been removed from the system.",
                    "Customer Details Removed",JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null,"The details of this customer are not removed from the system." +
                    " This process has been cancelled.","Customer Not Deleted",JOptionPane.INFORMATION_MESSAGE);

        foundCustomers.clear();
    }

    public void viewCustomers() {
        JTextArea output = new JTextArea();

        output.setText("Customer Details:\n\n");

        if(customers.size() < 1) {
            JOptionPane.showMessageDialog(null,"No customers are stored on the system. Please add a new customer.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else {
            ArrayList<Customer> foundCustomers = new ArrayList<Customer>();
            String searchEmail = JOptionPane.showInputDialog("Please enter the email address of the customer you wish to view");

            for(Customer cu: customers)
                if(cu.getEmail().toLowerCase().contains(searchEmail.toLowerCase()))
                    foundCustomers.add(cu);

            String text="";

            for (Customer cu : foundCustomers)
                if (cu != null) {
                    text += cu + "\n";
                }

            JOptionPane.showMessageDialog(null,"The following customers matched your Email Search phrase. The details are:\n\n" + text,
                    "Customer Details Found",JOptionPane.INFORMATION_MESSAGE);
        }
    }


    // Operators Functions
    public void addOperator() {
        String operatorIdAS;
        String name;
        String prePay;
        String billPay;
        String simOnly;
        String MVNO;

        operatorIdAS = JOptionPane.showInputDialog("Enter Operator ID: ");
        int operatorId = Integer.parseInt(operatorIdAS);
        name = JOptionPane.showInputDialog("Enter the name of the operator: ");
        prePay = JOptionPane.showInputDialog("Enter Yes or No if the operator offers Prepay Plans: ");
        billPay = JOptionPane.showInputDialog("Enter Yes or No if the operator offers Bill Pay Plans: ");
        simOnly = JOptionPane.showInputDialog("Enter Yes or No if the operator offers SIM-only Plans: ");
        MVNO = JOptionPane.showInputDialog("A Mobile Virtual Network Operator is a mobile service provider that " +
                "\ndoes not own infrastructure. Vodafone, Three and Eir are Mobile \nNetwork Operators (MNO) that own " +
                "infrastructure." + "\n\nEnter Yes or No if the operator is an MVNO, " +
            "i.e. running off a main \nnetwork (example: Tesco Mobile running off Three's network): ");

        operator = new Operator(operatorId, name, prePay, billPay, simOnly, MVNO);
        operators.add(operator);

        JOptionPane.showMessageDialog(null, "Operator - " + name + " (ID: " + operatorIdAS +
            ") - has been added!", "Operator added", JOptionPane.INFORMATION_MESSAGE);
    }

    public void modifyOperator() {
        ArrayList<Operator> foundOperators = new ArrayList<Operator>();
        String searchIDOpModAS = JOptionPane.showInputDialog("Please enter an operator's ID to amend/modify details");
        int searchIDOpMod = Integer.parseInt(searchIDOpModAS);

        for(Operator op: operators)
            if(op.getOperatorId()==searchIDOpMod)
                foundOperators.add(op);

        String text="";

        for (Operator op : foundOperators)
            if (op != null) {
                text += op + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following operator matches your ID Search\n\n" + text +
                "\n\nEnter the ID of the operator your wish to amend/modify to confirm"));

        Operator operatorToModify=null;

        for (Operator op : foundOperators)
            if (op != null && op.getOperatorId()==searchID)
                operatorToModify = op;

        String modifyChoice = JOptionPane.showInputDialog("The details of the operator you wish to amend/modify are: \n\n" +
                operatorToModify + "\n\n1. Amend Name\n2. Amend Offers\n3. Amend Operator Details\n4. Cancel Amendment");

        int modifyChoiceAI = Integer.parseInt(modifyChoice);

        while(modifyChoiceAI<1 || modifyChoiceAI > 4) {
            modifyChoice = JOptionPane.showInputDialog("The details of the operator you wish to amend/modify are: \n\n" +
                    operatorToModify + "\n\n1. Amend Name\n2. Amend Offers\n3. Amend Operator Details\n4. Cancel Amendment" +
                    "\n\nInvalid choice entered! You must select options betwen 1 and 4");

            modifyChoiceAI = Integer.parseInt(modifyChoice);
        }

        switch(modifyChoice){
            case "1":
                String newName = JOptionPane.showInputDialog("Please enter the new name");
                operatorToModify.setName(newName);

                break;

            case "2":
                String newPrePay = JOptionPane.showInputDialog("Please enter Yes or No whether the operator still offers Prepay Plans");
                operatorToModify.setPrePay(newPrePay);

                String newBillPay = JOptionPane.showInputDialog("Please enter Yes or No whether the operator still offers Bill Pay Plans");
                operatorToModify.setBillPay(newBillPay);

                String newSimOnly = JOptionPane.showInputDialog("Please enter Yes or No whether the operator still offers SIM Only Plans");
                operatorToModify.setSimOnly(newSimOnly);

                break;

            case "3":
                String newMVNO = JOptionPane.showInputDialog("Please enter Yes or No if the operator is a Mobile Virtual Network Operator");
                operatorToModify.setMVNO(newMVNO);

                break;
        }
        JOptionPane.showMessageDialog(null,"Operator details are modified!",
                "Operator Details Modified",JOptionPane.INFORMATION_MESSAGE);
        foundOperators.clear();
    }

    public void deleteOperator() {
        /*****************************************************
         *    Title:  How can i search an arrray of object with a value in java (lines 3-5)
         *    Author: SMA
         *    Site owner/sponsor:  stackoverflow.com
         *    Date: December 2014
         *    Code version:  edited 6 December 2014 at 12:28
         *    Availability:  https://stackoverflow.com/questions/27331557/how-can-i-search-an-arrray-of-object-with-a-value-in-java (Accessed 02 November 2020)
         *    Modified:  Code refactored (Identifiers renamed)
         *****************************************************/
        // code
        ArrayList<Operator> foundOperators = new ArrayList<Operator>();
        String searchIDOpDelAS = JOptionPane.showInputDialog("Please enter an operator's ID to delete");
        int searchIDOpDel = Integer.parseInt(searchIDOpDelAS);

        for(Operator op: operators)
            if(op.getOperatorId()==searchIDOpDel)
                foundOperators.add(op);
            // end of refactored code

        String text="";

        for (Operator op : foundOperators)
            if (op != null) {
                text += op + "\n";
            }

        int searchID = Integer.parseInt(JOptionPane.showInputDialog("The following operator matches your ID Search phrase\n\n" + text +
                "\n\nPlease enter the ID of the operator you wish to be deleted to confirm"));

        Operator operatorToDelete=null;

        for (Operator op : foundOperators)
            if (op != null && op.getOperatorId()==searchID)
                operatorToDelete = op;

        int deleteChoice = JOptionPane.showConfirmDialog(null,"The details of the operator you wish to delete are:\n\n" +
                operatorToDelete + "\n\nAre you sure you wish to delete this operator?","Confirm deleting operator Details",JOptionPane.YES_NO_CANCEL_OPTION);

        if(deleteChoice==JOptionPane.YES_OPTION) {
            operators.remove(operatorToDelete);
            JOptionPane.showMessageDialog(null,"The details of this operator have been removed from the system.",
                    "Operator Details Removed",JOptionPane.INFORMATION_MESSAGE);
        } else
            JOptionPane.showMessageDialog(null,"The details of this operator are not removed from the system." +
                    " This process has been cancelled.","Operator Not Deleted",JOptionPane.INFORMATION_MESSAGE);

        foundOperators.clear();
    }

    public void viewOperators() {
        JComboBox operatorCombo = new JComboBox();
        JTextArea output = new JTextArea();

        output.setText("Operator Details:\n\n");

        if(operators.size() < 1) {
            JOptionPane.showMessageDialog(null,"No operators are stored on the system. Please add a new operator.","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else {
            Iterator<Operator> iterator = operators.iterator();

            while(iterator.hasNext()) {
                operatorCombo.addItem(iterator.next().getOperatorId() + "\n");
            }

            JOptionPane.showMessageDialog(null,"--- Operator IDs ---" + "\n" +
                    "1 - Vodafone\n2 - Three\n3 - Eir / GoMo\n4 - Tesco Mobile\n5 - 48\n6 to 9 - Other","View Operators",JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,operatorCombo,"Select plan ID to view details",JOptionPane.PLAIN_MESSAGE);

            int selected = operatorCombo.getSelectedIndex();
            output.append(operators.get(selected).toString());

            JOptionPane.showMessageDialog(null,output,"Operator Details",JOptionPane.PLAIN_MESSAGE);
        }
    }

    // Program Menu Functions
    public void findPlan() {
        ArrayList<Plan> foundPlans = new ArrayList<Plan>();
        String customerMins = JOptionPane.showInputDialog("Please enter the minimum minutes that the customer needs\n(unlimited = 10000+): ");
        int customerMinsAI = Integer.parseInt(customerMins);

        String customerTexts = JOptionPane.showInputDialog("Please enter the minimum texts that the customer needs\n(unlimited = 10000+): ");
        int customerTextsAI = Integer.parseInt(customerTexts);

        String customerDataGB = JOptionPane.showInputDialog("Please enter the minimum data allowance in GB that the customer needs\n(unlimited = 80.00+): ");
        double customerDataGBAD = Double.parseDouble(customerDataGB);

        String customerPricePM = JOptionPane.showInputDialog("Please enter the minimum price that the customer is willing to pay: ");
        double customerPricePMAD = Double.parseDouble(customerPricePM);

        for (Plan pl : plans)
            if(pl.getMinutes()>=customerMinsAI && pl.getTexts()>=customerTextsAI && pl.getDataGB()>=customerDataGBAD && pl.getPricePM()>=customerPricePMAD) {
                foundPlans.add(pl);
            }

        String text="";

        for (Plan pl : foundPlans)
            if (pl != null) {
                text += pl + "\n";
            }

        /*****************************************************
         *    Title:  Adding a Scrollable JTextArea (Java)
         *    Author: kleopatra
         *    Site owner/sponsor:  stackoverflow.com
         *    Date: January 2012
         *    Code version:  edited 13 January 2012 at 10:47
         *    Availability:  https://stackoverflow.com/questions/8849063/adding-a-scrollable-jtextarea-java (Accessed 02 November 2020)
         *    Modified:  Code refactored (Identifiers renamed)
         *****************************************************/
        //Code
        //FRAME
        JFrame results = new JFrame ();
        results.setSize(600,450);
        results.setResizable(false);
        //

        //TEXT AREA
        JTextArea resultOut = new JTextArea();
        resultOut.setSize(550,400);

        resultOut.setLineWrap(true);
        resultOut.setEditable(false);
        resultOut.setVisible(true);

        JScrollPane scroll = new JScrollPane (resultOut);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        results.add(scroll);
        results.setVisible(true);
        results.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //End of non-original code

        resultOut.append("There are mobile plans that suit the needs of this customer: \n\n" + text + "\n ");
    }

    public void aboutProgram() {
        JOptionPane.showMessageDialog(null, "Mobile Plans Administration Program" +
                        "\nVersion 1.0 \nCreated by: \nNeil Sebbey - Software Development Student, IT Tralee\n\n(C) 2020",
                "About this Program", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exitProgram() {
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            try {
                save();
                JOptionPane.showMessageDialog(null, "Data saved successfully", "Saved", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException e1) {
                JOptionPane.showMessageDialog(null, "Not able to save the file");
                e1.printStackTrace();
            }

            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Menu Bar Actions
        String menuName = e.getActionCommand();

        //Plans functionality
        if (menuName == "Add Plan") {
            addPlan();
        } else if (menuName == "Modify Plan") {
            modifyPlan();
        } else if (menuName == "Delete Plan") {
            deletePlan();
        } else if (menuName == "View Plans") {
            viewPlans();

            // Customers functionality
        } else if (menuName == "Add Customer") {
            addCustomer();
        } else if (menuName == "Modify Customer") {
            modifyCustomer();
        } else if (menuName == "Delete Customer") {
            deleteCustomer();
        } else if (menuName == "View Customers") {
            viewCustomers();

            //Operators functionality
        } else if (menuName == "Add Operator") {
            addOperator();
        } else if (menuName == "Modify Operator") {
            modifyOperator();
        } else if (menuName == "Delete Operator") {
            deleteOperator();
        } else if (menuName == "View Operators") {
            viewOperators();

            //Program functionality
        } else if (menuName == "Find Plans") {
            findPlan();
        } else if (menuName == "About") {
            aboutProgram();
        } else if (menuName == "Exit") {
            exitProgram();
        }
    }
}
