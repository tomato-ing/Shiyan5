package Shiyan5;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.nio.file.Files;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Window extends JFrame implements ActionListener
{
	
	String save="";
	JTextField text_1 = new JTextField(20);
	JTextField text_2= new JTextField(20);
	JTextField text_3= new JTextField(20);
	JTextArea txt= new JTextArea(10,25);
	JButton b1 = new JButton("确定");
	JButton b2 = new JButton("退出");
	JRadioButton box1 = new JRadioButton("C语言");
    JRadioButton box2 = new JRadioButton("Python");
    JRadioButton box3 = new JRadioButton("Java");
    JRadioButton box4 = new JRadioButton("导论");
	Window()
	{
		JRadioButton box1 = new JRadioButton("C语言");
		//Box1 bo1=new Box1();
		box1.addActionListener(this);
	    JRadioButton box2 = new JRadioButton("Python");
	    //Box2 bo2=new Box2();
	    box2.addActionListener(this);
	    JRadioButton box3 = new JRadioButton("Java");
	    //Box3 bo3=new Box3();
	    box3.addActionListener(this);
	    JRadioButton box4 = new JRadioButton("导论");
	    //Box4 bo4=new Box4();

	    box4.addActionListener(this);
	    ButtonGroup bg=new ButtonGroup();
	    bg.add(box1);
	    bg.add(box2);
	    bg.add(box3);
	    bg.add(box4);
		JLabel lable_1 = new JLabel("姓名：");
		JLabel lable_2 = new JLabel("班级：");
		JLabel lable_3 = new JLabel("学号：");
		JLabel lable_4 = new JLabel("您所选的课程是：                                     ");
		setTitle("学生选课系统");     //设置窗体
	    setSize(300,400);
	    setVisible(true);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setResizable(false);
	    setLayout(new FlowLayout());

	    add(lable_1);
	    add(text_1);
	    add(lable_2);
	    add(text_2);
	    add(lable_3);
	    add(text_3);
	    add(lable_4);
	    add(box1);
	    add(box2);
	    add(box3);
	    add(box4);

	    add(txt);
   	    add(b1);
   	    add(b2);
	    validate();
	    //text_3.addActionListener(this);
	    
	    Button3 Tuichu = new Button3();
    	b2.addActionListener(Tuichu);
    		
    	Button1 Queding=new Button1();
    	b1.addActionListener(Queding);
	}
	public void actionPerformed(ActionEvent ae){
		String a =text_1.getText();
		String b =text_2.getText();
		String c =text_3.getText();
		txt.append("姓名："+a+"\n");
		txt.append("班级："+b+"\n");
		txt.append("学号："+c+"\n");
		txt.append("所选课程："+ae.getActionCommand());
     }
}
	

class Button3 implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.exit(0);	

	}
}
class Button1 implements ActionListener{

	public static String path = "stu.txt";
	public void actionPerformed(ActionEvent e) {
		try {
			String save=txt.append();
			FileWriter f1 = new FileWriter("stu.txt");
			f1.write(save);
			f1.close();
		}
		catch (Exception ex) {
		}
		
	}
	
}


public  class Shiyan5 
{
	public static void main(String[] args)
	{
		Window win=new Window();
		
	}
	 
	 
}
