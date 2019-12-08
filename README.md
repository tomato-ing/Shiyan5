#                                             计181    于紫萱   2018310753
#                                               综合性实验 学生选课系统设计
一、实验目的

1.分析学生选课系统,将本学期所学知识进行系统的梳理和结合，完善学生选课系统，以此为工具更好地理解、运用本学期所学知识

2.使用GUI窗体及其组件设计窗体界面，有文本框、标签、按钮等组件，形成一个简单的选课系统界面

3.完成学生选课过程业务逻辑编程，通过清晰的逻辑，理清各组件之间的关系，完成监听事件的设定

4.基于文件保存并读取数据，将学生所选课程，追加到stu.txt文本中

5.处理异常，学会使用try catch语句，能通过throw语句抛出异常

二、实验要求

1.设计GUI窗体，支持学生注册、课程新加、学生选课、学生退课、打印学生选课列表等操作

2.基于事件模型对业务逻辑编程，实现在界面上支持上述操作

3.针对操作过程中可能会出现的各种异常，做异常处理

4.基于输入/输出编程，支持学生、课程、教师等数据的读写操作

三、实验过程
    
   本次实验需要完成学生选课操作，即录入学生信息，学生选择课程，并将相应内容基于输入/输出存储文件。
    
   先是创建了JFrame及相应组件，创建好一个GUI窗体，通过想要实现的功能，来布局组件，包含姓名、班级、学号的文本框，和TextArea,在选择相应课程后，在TextArea中显示学生的姓名、班级、学号信息，便于学生核对信息，在信息无误之后，点击确定键，则利用File()创建一个stu.txt文件，将TextArea中内容写入txt文件，在GUI窗体中还设置了退出按钮，通过监听器的设置进行退出窗口操作。
    
   本次实验完成度，依旧，不高。构思的设计随着自己能力的不足，逐步压缩精简。但是本次实验在期末考试梳理了这学期所学重点后，逻辑较以往明显清晰，成功的构造了监听接口和监听事件，虽然OutputStream和InputStram在代码中没有真正实现意义，但也尝试着将其加入。

四、核心代码
1.GUI窗体
  将一些在后续编程中需要注册监听事件的对象写在方法外，成为成员变量，便于后于方法调用
  
     class A extends xx implements ActionListener{
     JFrame xxx= new JFrame();
     A(){
     add(xxx);
     ....
     }
     }
 
 2.监听器注册
 需要多个监听器对不同组件进行相应的操作，注册监听事件
 
    Button3 Tuichu = new Button3();
    b2.addActionListener(Tuichu);
 
 对监听事件进行相应处理，创建类，实现监听接口
 
    class Button3 implements ActionListener{
	   public void actionPerformed(ActionEvent e) {
		  System.exit(0);	
	   }
   }

3.异常处理
在actionPerformed（ActionEvent e）方法内进行相应的异常处理

    try{
    ....
    }
    catch(Exception){
    ...
    }

4.文件写入
此部分代码未实现（我的代码系统提示需要get的文件不是全局变量）

      String save=txt.append();
			FileWriter f1 = new FileWriter("stu.txt");
			f1.write(save);
			f1.close();
      
      
    public void testFileOutputStream() {
        File file = new File("test7.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
            fos.write(new String("...").getBytes());
        }
        catch (Exception e) {
            e.printStackTrace();
        } 
        finally {
       
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
         
五、程序运行

   能够实现窗体组件的的布局，能够实现将输入在文本框的信息追加到文本区，将所选课程也追加到文本区，点击确定键，将文本区所呈现的信息写入到一个.txt文件中（此部分目前来讲我还没能实现），点击退出键退出程序。
   
   
 六、实验及学期总结
 
   通过期末的系统性复习，为本次编程提供充足的理论的基础，对这些语句、方法的使用，有了进一步的理解，在本次代码实现的时候，有了更好的理解。
   
   本次实验为综合性实验，将GUI、监听事件、异常处理、文件输入输出结合在一起，呈现出一个初步的学生选课系统，我在本次实验中，创建了简单的窗体，并设置了监听器，将输入的文字进行追加到文本区，设置了异常处理机制，也编写了输入输出代码，但是此部分没有实现。在本次实验中，虽然最新学到的输入输出流没有实现，但是在之前实验中没有实现的，例如监听器和异常处理机制，有了进步，更了解了接口和继承的区别，对Java语言的框架有了更清晰的逻辑关系。在此次实验和期末考试前，对于这门语言我还是处于一个非常迷糊的状态，通过系统性的学习，有了好转，了解了类与类间的关系，接口与继承的区别和使用方法，如何构造方法，如在不同类中相互调用函数，使程序更加清晰简便、效率更高，学会了创建窗体、监听器、异常处理、文件输入输出等方法的使用，编程素养不断提升。
  
  在本次实验再次翻阅资料的时候，发现在ppt中有许多和考试以及实验相关的知识点，由于自己的付出不够多，脑子不够用，导致我每次实验完成度上都不好，包括最后的考试中情况也很糟糕。但通过理论与实践的相结合，认知和操作上还是呈不断进步的趋势，虽然这门课已经结束，但是仍会保持热情的态度学习计算机语言与相关知识。感谢老师的认真教学，如果可以还是很希望再次上张老师的课的，当然，除重修以外。
 
 
 
 
 
 
 
 
 
 





 
