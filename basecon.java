import java.util.Scanner;
import java.util.Stack;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;

@SuppressWarnings("unusued")
public class basecon {
    public static void main(String[] args) {

        calculator cal = new calculator();
        Stack<Integer> divisionStack = new Stack<>();
        Scanner sc = new Scanner(System.in);

        //
        for(int i=100; i>0; i--) 
        {
            int rand = cal.randomBinaryNumber(2);
            System.out.println("Binary: " + rand);
            System.out.println("Decimal Value: " + cal.convertDecimal(rand, 2));
        }
        //

        //Setting up the window
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Base Converter");
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        //User interactive area
        JTextField tf = new JTextField("0                         ");
        JComboBox<Integer> cb = new JComboBox<>();
        cb.addItem(2);
        cb.addItem(3);
        cb.addItem(4);
        cb.addItem(5);
        cb.addItem(6);
        cb.addItem(7);
        cb.addItem(8);
        cb.addItem(9);
        cb.addItem(10);
        JLabel outp = new JLabel("0         ");
        //Add components to the frame
        panel.add(tf,c);
        panel.add(Box.createHorizontalStrut(20),c); // Space between components
        panel.add(cb,c);
        panel.add(Box.createHorizontalStrut(20),c); // Space between components
        panel.add(outp,c);
        frame.add(panel);
        

        frame.setVisible(true);
        
        
        
        
        
        
        
        System.out.print("Enter an integer to convert: ");
        int input = sc.nextInt();
        int inputC = input; //copy of the input
        
        // converter algorithm
        while(inputC!=0) {
            divisionStack.push(inputC%2);
            inputC /= 2; 
        }

        String output = "";
        while(!divisionStack.empty()) {
            output += Integer.toString(divisionStack.pop());
        }
        System.out.println("This integer equals to " + output + ".");

        sc.close();
    }

}