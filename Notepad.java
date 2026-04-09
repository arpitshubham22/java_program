import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Notepad extends Frame implements ActionListener 
{
TextArea txt;
public Notepad()
{
txt=new TextArea(20,70);
add(txt);
MenuBar bar=new MenuBar();
Menu file=new Menu("File");
Menu edit=new Menu("Edit");
Menu format=new Menu("Format");
Menu view=new Menu("View");
Menu help=new Menu("Help");
MenuItem New=new MenuItem("New");
MenuItem open=new MenuItem("Open");
MenuItem save=new MenuItem("Save");
MenuItem saveas=new MenuItem("Save As");
MenuItem pagesetup=new MenuItem("Page Setup");
MenuItem exit=new MenuItem("Exit");
MenuItem cut=new MenuItem("Cut");
MenuItem copy=new MenuItem("Copy");
MenuItem paste=new MenuItem("Paste");
MenuItem clear=new MenuItem("Clear");
MenuItem date=new MenuItem("Date");
MenuItem time=new MenuItem("Time");
MenuItem find=new MenuItem("Find");
MenuItem replace=new MenuItem("Replace");
MenuItem goto1=new MenuItem("GoTo");
MenuItem wordwrap=new MenuItem("Word Wrap");
MenuItem font=new MenuItem("Font");
MenuItem an=new MenuItem("About Notepad");
file.add(New);
file.add(open);
file.add(save);
file.add(saveas);
file.add(pagesetup);
//file.add(print);
file.add(exit);
edit.add(cut);
edit.add(copy);
edit.add(paste);
edit.add(clear);
edit.add(date);
edit.add(time);
edit.add(find);
edit.add(replace);
edit.add(goto1);
format.add(wordwrap);
format.add(font);
help.add(an);
bar.add(file);
bar.add(edit);
bar.add(format);
bar.add(help);
setMenuBar(bar);
setSize(300,200);
setVisible(true);
setTitle("notepad");
New.addActionListener(this);
open.addActionListener(this);
save.addActionListener(this);
saveas.addActionListener(this);
pagesetup.addActionListener(this);
//print.addActionListener(this);
exit.addActionListener(this);
cut.addActionListener(this);
copy.addActionListener(this);
paste.addActionListener(this);
clear.addActionListener(this);
date.addActionListener(this);
time.addActionListener(this);
find.addActionListener(this);
replace.addActionListener(this);
goto1.addActionListener(this);
wordwrap.addActionListener(this);
font.addActionListener(this);
an.addActionListener(this);
}


public void actionPerformed(ActionEvent e)
{
String s=e.getActionCommand();
if(s.equals("New"))
txt.setText("");
else if(s.equals("Open"))
{
FileDialog fd=new FileDialog(this);
fd.show();
if(fd.getFile()!=null)
{
try
{
FileInputStream f=new FileInputStream(fd.getFile());
int l=f.available();
byte b1[]=new byte[l];
f.read(b1);
txt.setText(new String(b1));
f.close();
}
catch(Exception e1)
{
System.out.println(e1);
}
}
}
else if(s.equals("Save"))
{
FileDialog fd=new FileDialog(this,"save",FileDialog.SAVE);
fd.show();
if(fd.getFile()!=null)
{
try
{
FileOutputStream f=new FileOutputStream(fd.getFile());
String s1=txt.getText();
byte b1[]=s1.getBytes();
f.write(b1);
f.close();
}
catch(Exception e1)
{
System.out.println(e1);
}
}
}
else if(s.equals("Exit"))
System.exit(0);

}
public static void main(String arr[])
{
new Notepad();
}
}


