import java.awt.*;
import java.awt.event.*;

class ColourMergeProject extends Frame implements ActionListener, WindowListener {
    Button b;
    Label l7, l8, c1, c2, res;
    TextField t1, t2, t3;

    ColourMergeProject() {
        setSize(600, 300);
        setTitle("Color Preview Box");
        setLocation(400, 250);
        Label l1 = new Label("Enter value for red:");
        t1 = new TextField();
        Label l2 = new Label("Enter value for green:");
        t2 = new TextField();
        Label l3 = new Label("Enter value for blue:");
        t3 = new TextField();

        addWindowListener(this);

        Label l4 = new Label("0-255");
        Label l5 = new Label("0-255");
        Label l6 = new Label("0-255");
        c1 = new Label();
        c2 = new Label();
        res = new Label();
        l7 = new Label();
        l8 = new Label("Preview");
        b = new Button("Show Color");
        setLayout(null);
        l1.setBounds(40, 50, 130, 20);
        t1.setBounds(200, 50, 100, 20);
        t2.setBounds(200, 100, 100, 20);
        l2.setBounds(40, 100, 130, 20);
        l3.setBounds(40, 150, 130, 20);
        t3.setBounds(200, 150, 100, 20);
        l4.setBounds(320, 50, 60, 20);
        l5.setBounds(320, 100, 60, 20);
        l6.setBounds(320, 150, 60, 20);
        l7.setBounds(400, 20, 180, 150);
        res.setBounds(430, 180, 190, 20);
        l8.setBounds(450, 220, 100, 20);
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        b.setBounds(140, 200, 100, 20);
        c1.setBounds(0, 250, 600, 5);
        c1.setBackground(Color.cyan);
        c2.setBounds(0, 258, 600, 5);
        c2.setBounds(0, 258, 600, 5);
        c2.setBackground(Color.magenta);
        add(t1);
        add(t2);
        add(t3);
        add(b);
        add(l2);
        add(l1);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(c1);
        add(c2);
        add(res);
        b.addActionListener(this);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (t1.getText().length() > 0 && t2.getText().length() > 0 && t3.getText().length() > 0) {
            int r = Integer.parseInt(t1.getText());
            int g = Integer.parseInt(t2.getText());
            int blueInput = Integer.parseInt(t3.getText());
            if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && blueInput >= 0 && blueInput <= 255) {
                l7.setText("");
                l7.setBackground(new Color(r, g, blueInput));
                l8.setForeground(new Color(r, g, blueInput));
                res.setText("new Color(" + r + "," + g + "," + blueInput + ")");
            } else {
                l7.setFont(new Font("Arial", Font.BOLD, 20));
                l7.setText("Wrong Color code");
                l7.setBackground(Color.black);
                l7.setForeground(Color.white);
            }
        } else {
            l7.setFont(new Font("Arial", Font.BOLD, 20));
            l7.setText("Fill All the Fields");
            l7.setBackground(Color.black);
            l7.setForeground(Color.white);
        }

    }

    public static void main(String args[]) {
        new ColourMergeProject();
    }

    public void windowOpened(WindowEvent e) {
        System.out.println();
    }

    public void windowClosed(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {
        System.out.println();
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println();
    }

    public void windowIconified(WindowEvent e) {
        System.out.println();
    }

    public void windowDeiconified(WindowEvent e) {
    }
}
