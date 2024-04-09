import java.awt.*;
import java.awt.event.*;
class AtoZ extends Frame implements ActionListener
{
   Image im;
   String res="";
   Label head,input;
   Button b1,b2,b3;
    AtoZ()
    {
       setSize(400,340);
       head=new Label("SCHOOL DAYS");
       input=new Label();
       b1=new Button("SlideShow");
       b2=new Button("ReverseSlide");
       b3=new Button("VerbalTest");
       head.setFont(new Font("Arial",Font.BOLD,30));
       input.setFont(new Font("Arial",Font.BOLD,20));
        setLayout(null);
       head.setBounds(20,40,300,50);
       input.setBounds(100,250,100,20);
       b1.setBounds(20,280,100,20);
       b2.setBounds(130,280,100,20);
       b3.setBounds(240,280,100,20);

     im=Toolkit.getDefaultToolkit().getImage("my.jpeg");
       add(input);
       add(head); add(b1);add(b2);add(b3);
       b1.addActionListener(this);
       b2.addActionListener(this);
       b3.addActionListener(this);
       setVisible(true);
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
       String az[]={"a.png.jpg","b.png.jpg","c.png.jpg","3.jpeg","F.jpeg","H.jpeg","O.jpeg,"};
         if(s==1)
         {
            try{
             for(int i=0;i<az.length;i++)
             {
                im=Toolkit.getDefaultToolkit().getImage(az[i]);
                Thread.sleep(1000); System.out.println(i+" "+az[i]);
              }
               }
               catch(InterruptedException ee){}  
         }
         else if(s==2)
         {
           try{
             for(int i=az.length-1;i>=0;i--)
             {
                im=Toolkit.getDefaultToolkit().getImage(az[i]);
                Thread.sleep(1000); System.out.println(i+" "+az[i]);
              }
               }
               catch(InterruptedException ee){}  

         }
         else if(s==3)
         {}
         repaint();          
    }
    public static void main(String args[])
    {
      AtoZ ob=new AtoZ();
    }
}
