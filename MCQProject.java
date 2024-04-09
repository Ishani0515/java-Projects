import java.awt.*;
import java.awt.event.*;

class MCQProject extends Frame implements ActionListener, WindowListener, ItemListener {
    Label l, l1, l2, res;
    Button b;
    int i = 0, r = 0;
    Checkbox c1, c2, c3, c4;
    CheckboxGroup cg;
    String uans = "";
    Questions que[];
    Image im1, im2, im3, im;

    MCQProject() {
        setSize(800, 500);
        setTitle("Quiz");
        setLocation(250, 100);
        setBackground(Color.lightGray);

        que = new Questions[20];

        l1 = new Label("Welcome");
        l2 = new Label("Multiple Choice Quiz");
        l = new Label("");
        res = new Label("Result=" + r + " / " + que.length);
         
        
        cg = new CheckboxGroup();
        c1 = new Checkbox("", cg, true);
        c2 = new Checkbox("", cg, false);
        c3 = new Checkbox("", cg, false);
        c4 = new Checkbox("", cg, false);

        b = new Button("Check");
        b.addActionListener(this);

        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        c4.addItemListener(this);

        setLayout(null);
        l.setBounds(50, 120, 700, 40);
        res.setBounds(600, 80, 150, 30);
       
        c1.setBounds(70, 200, 300, 50);
        c2.setBounds(70, 250, 300, 50);
        c3.setBounds(70, 300, 300, 50);
        c4.setBounds(70, 350, 300, 50);
        b.setBounds(350, 420, 100, 50);

        l1.setBounds(20, 50, 80, 20);
        l1.setFont(new Font("Arial", Font.BOLD, 15));
        l2.setBounds(250, 30, 300, 40);
        l2.setFont(new Font("Arial", Font.BOLD, 30));
        l2.setBackground(Color.yellow);
        l2.setForeground(Color.black);

        add(l);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(b);
        add(res);
        add(l1);
        add(l2);
        
        
        addWindowListener(this);
        setVisible(true);
        load();
    }

    void load() {
        que[0] = new Questions("Q.1) What is the name of the Java compiler?", "java", "javap", "javac", "javad", "javac");
        que[1] = new Questions("Q.2) What is the name of the Java Interpreter?", "java", "javap", "javac", "javad", "java");
        que[2] = new Questions("Q.3) What is main()?", "main thread", "predefined method", "jvm start with main", "all the above", "all the above");
        que[3] = new Questions("Q.4) Father of java", "james Gosling", "Bill", "Martin", "Charles", "james Gosling");
        que[4] = new Questions("Q.5) What is keyword?", "reserved word", "compiler", "data type", "data", "reserved word");
        que[5] = new Questions("Q.6) Which package is used for event handling", "java.io", "java.awt", "java.awt.event", "java.net", "java.awt.event");
        que[6] = new Questions("Q.7) Number of primitive data types in Java are?", "6", "7", "8", "9", "8");
        que[7] = new Questions("Q.8) What is the size of float and double in java?", "32 and 64", "32 and 32", " 64 and 64", "64 and 32", "32 and 64");
        que[8] = new Questions("Q.9) Which of the following is not a Java features?", "Dynamic", "Architecture Neutral", "Use of pointers", "Object-oriented", "Use of pointers");
        que[9] = new Questions(" Q.10) _____ is used to find and fix bugs in the Java programs.", "JVM", "JRE", "JDK", "JDB", "JDB");
        que[10] = new Questions("Q.11) Which keyword is used for accessing the features of a package?", "package", "import", "extends", "export", "import");
        que[11] = new Questions("Q.12) How many threads can be executed at a time?", "Only one thread", "Multiple threads", "Only main (main() method) thread", "Two threads", "Multiple threads");
        que[12] = new Questions("Q.13) What makes the Java platform independent?", "Advanced programming language", "It uses bytecode for execution", "Class compilation", "All of these", "It uses bytecode for execution");
        que[13] = new Questions("Q.14) What are the types of memory allocated in memory in java?", "Heap memory", "Stack memory", "Both A and B", "None of these", "Both A and B");
        que[14] = new Questions("Q.15) What is the entry point of a program in Java?", "main() method", "The first line of code", "Last line of code", "main class", "main() method");
        que[15] = new Questions("Q.16) Which keyword in java is used for exception handling?", "exep", "excepHand", "throw", "All of these", "throw");
        que[16] = new Questions("Q.17) Which class in Java is used to take input from the user?", "Scanner", "Input", "Applier", "None of these", "Scanner");
        que[17] = new Questions("Q.18) Method used to take a string as input in Java?", "next()", "nextLine()", "Both A. and B.", "None of these", "Both A. and B.");
        que[18] = new Questions("Q.19) Which of the following is the correct syntax to create a variable in Java?", "var name;", "int name;", "var name int;", "All of these", "int name;");
        que[19] = new Questions("Q.20) Which of these is a type of variable in Java?", "Instance Variable", "Local Variable", "Static Variable", "All of these", "All of these");

            }

    public void actionPerformed(ActionEvent e) {
        if (uans.equals(que[i].ans))
            r += 1;
        else
            r -= 1;
        res.setText("Result=" + r + " / " + que.length);
        i++;
      repaint();
    }


    public void itemStateChanged(ItemEvent e) {
        Checkbox chk = cg.getSelectedCheckbox();
        if (chk == c1) uans = que[i].op1;
        else if (chk == c2) uans = que[i].op2;
        else if (chk == c3) uans = que[i].op3;
        else if (chk == c4) uans = que[i].op4;
    }

    public void paint(Graphics g) {
        cg.setCurrent(null);
        l.setText(que[i].qt);
        c1.setLabel(que[i].op1);
        c2.setLabel(que[i].op2);
        c3.setLabel(que[i].op3);
        c4.setLabel(que[i].op4);
     if(((float)r/que.length)*100>=80.0f)
         {im1=Toolkit.getDefaultToolkit().getImage("gold.jpg"); im=im1;}

         else if(((float)r/que.length)*100>=70.0f && ((float)r/que.length)*100<80.0f)
         {im2=Toolkit.getDefaultToolkit().getImage("silver.jpg"); im=im2;}

         else if(((float)r/que.length)*100>=40.0f && ((float)r/que.length)*100<70.0f)
         {im3=Toolkit.getDefaultToolkit().getImage("bronze.jpg");  im=im3;}

         g.drawImage(im,550,200,200,200,this);
        System.out.println(((float) r / que.length) * 100);
    }



    public static void main(String args[]) {
        new MCQProject();
    }

    public void windowOpened(WindowEvent e) {}

    public void windowClosed(WindowEvent e) {}

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {}

    public void windowDeactivated(WindowEvent ee) {}

    public void windowIconified(WindowEvent ee) {}

    public void windowDeiconified(WindowEvent ee) {}
}