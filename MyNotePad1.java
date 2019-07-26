import java.awt.*;
import java.awt.event.*;
import java.awt.MenuBar;
import java.io.*;

class MyNotePad1 implements ActionListener{
Frame f=new Frame("my notepad(MadeBy RATNAKAR)");
MenuBar mb=new MenuBar();
Menu m1=new Menu("file");
Menu m2=new Menu("color");
Menu m3=new Menu("font");
MenuItem mi1=new MenuItem("save");
MenuItem mi2=new MenuItem("open");
MenuItem mi3=new MenuItem("exit");
MenuItem mi4=new MenuItem("red");
MenuItem mi5=new MenuItem("yellow");
MenuItem mi6=new MenuItem("blue");
MenuItem mi7=new MenuItem("bold");
MenuItem mi8=new MenuItem("itallic");
TextArea ta=new TextArea();
MyNotePad1(){
m1.add(mi1);
m1.add(mi2);
m1.add(mi3);
m2.add(mi4);
m2.add(mi5);
m2.add(mi6);
m3.add(mi7);
m3.add(mi8);
mb.add(m1);
mb.add(m2);
mb.add(m3);
f.setMenuBar(mb);
f.add(ta);
mi1.addActionListener(this);
mi2.addActionListener(this);
mi3.addActionListener(this);
mi4.addActionListener(this);
mi5.addActionListener(this);
mi6.addActionListener(this);
mi7.addActionListener(this);
mi8.addActionListener(this);
f.setSize(400,500);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e){
String s=e.getActionCommand();
if(s.equals("exit")){
System.exit(0);}
if(s.equals("red"))
{ta.setBackground(Color.red);
}
if(s.equals("yellow"))
{ta.setBackground(Color.yellow);
}
if(s.equals("blue"))
{ta.setBackground(Color.blue);
}
if(s.equals("bold")){
Font f1=new Font("arial",Font.BOLD,25);
ta.setFont(f1);}
if(s.equals("itellic")){
Font f2=new Font("arial",Font.ITALIC,18);
ta.setFont(f2);}

if(s.equals("save")){
FileDialog fd=new FileDialog(f,"save",FileDialog.SAVE);
fd.setVisible(true);
String dir=fd.getDirectory();
String fname=fd.getFile();
String fpath=dir+"/"+fname;
writeFile(fpath);}}
public void writeFile(String path){
try{String data=ta.getText();
//String data=fd.getFiles();
FileOutputStream fos=new FileOutputStream(path);
byte b[]=data.getBytes();
fos.write(b);
fos.close();}
catch(Exception e){}
}
/*if(s.equals("open")){
FileDialog fd1=new FileDialog(f,"open",FileDialog.LOAD);
fd1.setVisible(true);
String dir=fd1.getDirectory();
String fname=fd1.getFile();
String fpath=dir+"/"+fname;
readFile(fpath);}
public void readFile(String path){
try{//String data=ta.getText();
//String data=fd.getFiles();
FileInputStream fis=new FileInputStream(path);
int size=fis.available();
byte b[]=new byte[size];
fis.read(b);
String data=new String(b);
ta.setText(data);
fis.close();}}
catch(Exception e){}*/


public static void main(String...p){
new MyNotePad1();
}}