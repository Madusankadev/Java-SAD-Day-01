
package gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author Madusanka
 */
public class exp1 {
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setSize(400, 400);
        f.setVisible(true);
        
        f.setLayout(new FlowLayout());
        
        Label l1 = new Label();
        l1.setText("Enter Your Name Here ");
        
        TextField tf = new TextField("Type Here");
        
        Label l2 = new Label();
        l2.setText("Address");
        
        TextArea ta = new TextArea("...",3,4);
        
        Button bt1 = new Button("Submit");
        
        f.add(l1);
        f.add(tf);
        
        f.add(l2);
        f.add(ta);
        
        f.add(bt1);
    }
}
