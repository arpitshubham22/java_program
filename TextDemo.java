import java.awt.*;
import java.awt.event.*;

class TextDemo extends Frame implements ActionListener {
    TextArea txt1;
    TextField txt2, txt3;

    public TextDemo() {
        txt1 = new TextArea(10, 50);
        txt2 = new TextField(20);
        txt3 = new TextField(20);
        
        Label lbl1 = new Label("Find what:");
        Label lbl2 = new Label("Replace with:");
        
        Button btn1 = new Button("find");
        Button btn2 = new Button("replace");
        Button btn3 = new Button("clear");
        Button btn4 = new Button("close");

        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(2, 2));
        p1.add(lbl1); p1.add(txt2);
        p1.add(lbl2); p1.add(txt3);

        Panel p2 = new Panel();
        p2.setLayout(new GridLayout(4, 1));  
        p2.add(btn1); p2.add(btn2);
        p2.add(btn3); p2.add(btn4);

        this.setLayout(new BorderLayout());
        this.add(txt1, BorderLayout.CENTER);
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.EAST);

        // Event Listeners
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);

        this.setTitle("Text Area Demo");
        this.setSize(600, 400);
        this.setVisible(true);
        
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) { System.exit(0); }
        });
    }

    public static void main(String arr[]) {
        new TextDemo();
    }

    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        if (s.equals("clear")) {
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
        } 
        else if (s.equals("close")) {
            System.exit(0);
        } 
        else if (s.equals("find")) {
            String fullText = txt1.getText();
            String findText = txt2.getText();
            
            int si = fullText.indexOf(findText);
            if (si != -1) {
                int li = si + findText.length();
                txt1.select(si, li);
                txt1.requestFocus();
            }
        } 
        else if (s.equals("replace")) {
            String fullText = txt1.getText();
            String findText = txt2.getText();
            String replaceText = txt3.getText();
            
            int start = fullText.indexOf(findText);
            if (start != -1) {
                int end = start + findText.length();
                txt1.replaceRange(replaceText, start, end);
            }
        }
    }
}