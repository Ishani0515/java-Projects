import java.awt.*;
import java.awt.event.*;

class EmployeeDetails extends Frame implements ActionListener, WindowListener, FocusListener {
    TextField t1;
    TextField t2;
    TextField t3;
    TextField t4;
    Button b;
    Label l1, l2, l3, l4;
    Frame displayFrame;

    EmployeeDetails() {
        setSize(500, 300);
        setTitle("Details Folder");
        setLocation(250, 250);

        l1 = new Label("Enter name:");
        t1 = new TextField();

        l2 = new Label("Enter Email:");
        t2 = new TextField();

        l3 = new Label("Enter Address:");
        t3 = new TextField();

        l4 = new Label("Enter City:");
        t4 = new TextField();

        addWindowListener(this);
        addFocusListener(this);

        b = new Button("Submit");
        setLayout(null);

        l1.setBounds(40, 50, 100, 20);
        l2.setBounds(40, 90, 100, 20);
        l3.setBounds(40, 130, 100, 20);
        l4.setBounds(40, 170, 100, 20);
        t1.setBounds(160, 50, 200, 20);
        t2.setBounds(160, 90, 200, 20);
        t3.setBounds(160, 130, 200, 20);
        t4.setBounds(160, 170, 200, 20);
        b.setBounds(200, 220, 100, 20);
        add(t1);
        add(t2);
        add(t3);
        add(t4);
        add(b);
        add(l2);
        add(l1);
        add(l3);
        add(l4);
        t1.setBackground(Color.black);
        t1.setForeground(Color.white);

        t2.setBackground(Color.black);
        t2.setForeground(Color.white);

        t3.setBackground(Color.black);
        t3.setForeground(Color.white);

        t4.setBackground(Color.black);
        t4.setForeground(Color.white);

        b.addActionListener(this);
        t1.addFocusListener(this);
        t2.addFocusListener(this);
        t3.addFocusListener(this);
        t4.addFocusListener(this);

        setBackground(Color.lightGray);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            displayFrame = new Frame("Display Employee Details");
            displayFrame.setSize(300, 200);
            displayFrame.setLayout(new GridLayout(4,1));

            Label nameLabel = new Label("Name: " + t1.getText());
            Label emailLabel = new Label("Email: " + t2.getText());
            Label addressLabel = new Label("Address: " + t3.getText());
            Label cityLabel = new Label("City: " + t4.getText());

            displayFrame.add(nameLabel);
            displayFrame.add(emailLabel);
            displayFrame.add(addressLabel);
            displayFrame.add(cityLabel);

            displayFrame.setLocation(750,280);  
            displayFrame.setBackground(Color.lightGray);
            displayFrame.setForeground(Color.BLACK);

            displayFrame.setVisible(true);
        }
    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void focusGained(FocusEvent e) {
    }

    public void focusLost(FocusEvent e) {
        t1.setText(t1.getText().toUpperCase());
        t2.setText(t2.getText().toUpperCase());
        t3.setText(t3.getText().toUpperCase());
        t4.setText(t4.getText().toUpperCase());
    }

    public static void main(String args[]) {
        EmployeeDetails ob = new EmployeeDetails();
    }
}