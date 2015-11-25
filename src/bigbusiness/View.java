package bigbusiness;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author gumberger
 */
public class View {

    public JFrame frame;
    public JPanel panel;
    public JTextField textfeldeing;
    public JTextField textfeldausg;
    
    public JButton addieren;
    
    public View() {
        createFrame();
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300,300));
        panel.setBackground(Color.CYAN);
        
        textfeldeing = new JTextField(25);
        textfeldeing.setHorizontalAlignment(JTextField.RIGHT);
        
        textfeldausg = new JTextField(25);
        textfeldausg.setHorizontalAlignment(JTextField.RIGHT);
        textfeldausg.setEditable(false);
        
        addieren = new JButton("Addieren");
        
        panel.add(textfeldeing);
        panel.add(textfeldausg);
        panel.add(addieren);
        
        frame.add(panel);
        frame.pack();
    }
    
    

    private void createFrame() {
        frame = new JFrame("BigBusiness");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
    }
    
    public static void main(String[] args) {
        View view1 = new View();
    }
    
    public void addListener(ActionListener listener) {
        addieren.addActionListener(listener);
    }
    
    public int getNumber() {
        String zahl = textfeldeing.getText();
        int i = Integer.parseInt(zahl);
        return i;
    }
    
    public void displayNumber(int i) {
        textfeldausg.setText(Integer.toString(i));
    }
    
    public void displayError() {
        textfeldausg.setText("Bitte nur Zahlen!");
    }
}
