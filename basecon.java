import java.util.Scanner;
import java.util.Stack;

public class basecon {
    public static void main(String[] args) {

        Stack<Integer> divisionStack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        
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