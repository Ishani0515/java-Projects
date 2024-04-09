
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

class ImgDemo extends Frame implements KeyListener,ActionListener,WindowListener
{
   Image im;
   String res="";
   Label head,input;
   Button b1,b2,b3;
  int c = 0, m = 0;
    ImgDemo()
    {  
       setSize(400,350);
       head=new Label("SCHOOL DAYS");
       input=new Label();
       b1=new Button("SlideShow");
       b2=new Button("ReverseSlide");
       b3=new Button("VerbalTest");
       b1.setBackground(Color.white);
       b2.setBackground(Color.white);
       b3.setBackground(Color.white);
       head.setFont(new Font("Arial",Font.BOLD,40));
       input.setFont(new Font("Arial",Font.BOLD,18));
       setLayout(null);
       head.setBounds(50,40,300,50);
       input.setBounds(100,250,100,20);
       b1.setBounds(20,280,100,20);
       b2.setBounds(130,280,100,20);
       b3.setBounds(240,280,100,20);
       add(input);
       add(head);
       addKeyListener(this);
       setLocation(440,150);
       setVisible(true);
    }
    public void keyPressed(KeyEvent e)
    {
     c++;
        if (c % 2 == 0)
            input.setForeground(Color.blue);
        else if (c % 2 != 0)
            input.setForeground(Color.red);
        m++;
        setSize(400,350);
        if (m % 2 == 0)
            this.setBackground(Color.lightGray);
        else if (m % 2 != 0)
            this.setBackground(Color.cyan);
        char ch=e.getKeyChar();
        String val="";

         if(ch=='A'||ch=='a')
         { res="a.png.jpg"; val="Apple";}
         else if(ch=='B'||ch=='b')
         {res="b.png.jpg";val="Ball";}
        else if (ch == 'C' || ch == 'c')
         {res="c.png.jpg";val = "Cat";}
        else if (ch == 'D' || ch == 'd')
         {res="d.png.jpg";val = "Dog";}
        else if (ch == 'E' || ch == 'e')
         {res="e.png.jpg";val = "Elephant";}
        else if (ch == 'F' || ch == 'f')
         {res="f.png.jpg";val = "Fish";}
        else if (ch == 'G' || ch == 'g')
         {res="g.png.jpg";val = "Gun";}
        else if (ch == 'H' || ch == 'h')
         {res="h.png.jpg";val = "Hen";}
        else if (ch == 'I' || ch == 'i')
         {res="i.png.jpg";val = "Icecream";}
        else if (ch == 'J' || ch == 'j')
         {res="j.png.jpg";val = "Jocker";}
        else if (ch == 'K' || ch == 'k')
         {res="k.png.jpg";val = "Kite";}
        else if (ch == 'L' || ch == 'l')
         {res="l.png.jpg";val = "Lion";}
        else if (ch == 'M' || ch == 'm')
         {res="m.png.jpg";val = "Monkey";}
        else if (ch == 'N' || ch == 'n')
         {res="n.png.jpg";val = "Nest";}
        else if (ch == 'O' || ch == 'o')
         {res="o.png.jpg";val = "Owl";}
        else if (ch == 'P' || ch == 'p')
         {res="p.png.jpg";val = "Parrot";}
        else if (ch == 'Q' || ch == 'q')
         {res="q.png.jpg";val = "Queen";}
        else if (ch == 'R' || ch == 'r')
         {res="r.png.jpg";val = "Rabbit";}
        else if (ch == 'S' || ch == 's')
         {res="s.png.jpg";val = "S-un";}
        else if (ch == 'T' || ch == 't')
         {res="t.png.jpg";val = "Tiger";}
        else if (ch == 'U' || ch == 'u')
         {res="u.png.jpg";val = "Umbrella";}
        else if (ch == 'V' || ch == 'v')
         {res="v.png.jpg";val = "Violin";}
        else if (ch == 'W' || ch == 'w')
         {res="w.png.jpg";val = "Watch";}
        else if (ch == 'X' || ch == 'x')
         {res="x.png.jpg";val = "X-mas";}
        else if (ch == 'Y' || ch == 'y')
         {res="y.png.jpg";val = "Yak";}
        else if (ch == 'Z' || ch == 'z')
         {res="z.png.jpg";val = "Zebra";}
        System.out.println(ch+"   "+res);

   im=Toolkit.getDefaultToolkit().getImage(res);
       input.setText(""+ch+" "+val);
       add(input);
       add(head); add(b1);add(b2);add(b3);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       setVisible(true);
    repaint();
    }
    public void keyReleased(KeyEvent e)
    {}
    public void keyTyped(KeyEvent e)
    {
    
    }  
   

    public void paint(Graphics g)
    {
       g.drawImage(im,100,80,200,170,this);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
           show(1);
       else if(e.getSource()==b2)
           show(2);
       else if(e.getSource()==b3)
           show(3);
    }
    void show(int s)
  {
  String az[]={"a.png.jpg","b.png.jpg","c.png.jpg","d.png.jpg","e.png.jpg","f.png.jpg","g.png.jpg","h.png.jpg","i.png.jpg","j.png.jpg","k.png.jpg","l.png.jpg","m.png.jpg","n.png.jpg","o.png.jpg","p.png.jpg","q.png.jpg","r.png.jpg","s.png.jpg","t.png.jpg","u.png.jpg","v.png.jpg","w.png.jpg","x.png.jpg","y.png.jpg","z.png.jpg",};

 String val[] = {"Apple", "Ball", "Cat", "Dog", "Elephant", "Fish", "Gun", "Hen", "Icecream", "Jocker", "Kite", "Lion", "Monkey", "Nest", "Owl", "Parrot", "Queen", "Rabbit", "Sun", "Tiger", "Umbrella", "Violin", "Watch", "X-mas", "Yak", "Zebra"};

String[] imagesToShow;
String[] valuesToShow;
if (s == 2) 
{
imagesToShow = reverseArray(az);
valuesToShow = reverseArray(val);
}
 else 
{
 imagesToShow = az;
 valuesToShow = val;
}
Timer timer = new Timer();
TimerTask task = new TimerTask() 
{
int currentIndex = 0;
public void run() 
{
if (currentIndex >= imagesToShow.length) {
timer.cancel();
}
else 
{
im = Toolkit.getDefaultToolkit().getImage(imagesToShow[currentIndex]);
input.setText(imagesToShow[currentIndex] + " - " + valuesToShow[currentIndex]);
repaint();
currentIndex++;
 }
 }
 };

 int delay = 1500;
 timer.scheduleAtFixedRate(task, 0, delay);
 }

private String[] reverseArray(String[] arr) 
{
String[] reversedArr = new String[arr.length];
for (int i = 0; i < arr.length; i++)
 {
 reversedArr[i] = arr[arr.length - 1 - i];
 }
 return reversedArr;
 }

 public static void main(String args[])
 {
 ImgDemo ob=new ImgDemo();
 }
public void windowOpened(WindowEvent e) {
       }

    public void windowClosed(WindowEvent e) {
    }

    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public void windowActivated(WindowEvent e) {
            }

    public void windowDeactivated(WindowEvent e) {
           }

    public void windowIconified(WindowEvent e) {
            }

    public void windowDeiconified(WindowEvent e) {
    }
}


