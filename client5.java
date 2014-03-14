import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
import java.awt.event.*;
public class client5 extends JFrame implements ActionListener
{
BufferedReader br;
PrintWriter pw;
Socket s;
JButton b1;
JTextArea ta;
JTextField tf;
String str;
public client5()
    {
try {
    setLayout(new FlowLayout(0));
    ta=new JTextArea(20,20);
    add(ta);
    tf=new JTextField(20);
    add(tf);
    b1=new JButton("Send");
    add(b1);
    b1.addActionListener(this);
    setSize(400,400);
    setVisible(true);
    s=new Socket("localhost",110);
    br=new BufferedReader(new InputStreamReader(s.getInputStream()));
    pw=new PrintWriter(s.getOutputStream(),true);
    while(true)
        {
        str=br.readLine();
        ta.setText(str);
        }
    }
catch(Exception ee)
    {
    System.out.println(ee);
    }
    }
public void actionPerformed(ActionEvent ee)
    {
    if(ee.getSource()==b1)
        {
        str=tf.getText();
        pw.println(str);
        }
    }
 
public static void main(String arg[])
    {
    new client();
    }
}