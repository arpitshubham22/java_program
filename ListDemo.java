import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
class ListDemo extends JFrame implements ListSelectionListener
{
JList jl;
public ListDemo()
{
String option[]={"KEYBOARD","MOUSE","PRINTER","SCANNER","MONITOR"};
jl=new JList(option);
setLayout(new FlowLayout());
add(new JScrollPane(jl));
setTitle("ListDemo");
setVisible(true);
setSize(300,275);
jl.setVisibleRowCount(3);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jl.addListSelectionListener(this);
}
public void valueChanged(ListSelectionEvent e)
{
String s=(String)jl.getSelectedValue();
String msg="selected value="+s;
JOptionPane.showMessageDialog(this,msg);
}
public static void main(String arr[])
{
new ListDemo();
}
}	