import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.awt.Color;
public class Index
{
    JFrame frame;
    JLabel l1,l2,l3,l4;
    JScrollPane jsp;
    JButton b1,b2,b3;
    Index()
    {
        initialize();
        configure();
        
    }
    void initialize()
    {
  
        frame = new JFrame("Movie Application");
        frame.setSize(400,600);
         //Frame 
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    void configure()
    {
        l1 = new JLabel("MovieApp");
        l1.setFont(new Font("Serif",Font.BOLD,20));
        l1.setForeground(Color.white);
        l1.setBounds(150,5,200,50);
        frame.add(l1);
        JTextArea textArea = new JTextArea(20,20);
        JScrollPane jsp1 = new JScrollPane(textArea);
        jsp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
        jsp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
         
        //l2 = new JLabel("")
       
    }
}