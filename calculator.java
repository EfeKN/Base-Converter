import java.util.Random;

public class calculator {

    /* 
    
    http://www.cs.trincoll.edu/~ram/cpsc110/inclass/conversions.html#:~:text=Algorithm%20to%20Convert%20From%20Any,is%20decimal%20so%20b%20%3D%2010.

    */
    
    int convertDecimal(int value, int oBase) {
        int length = (int) (Math.log10(value) + 1);
        int converted = 0;
        String number = Integer.toString(value);
        while(!number.isEmpty())
        {
            converted += Character.getNumericValue(number.charAt(0))*Math.pow(oBase, length-1);
            number = number.substring(1);
            length += -1;
        }
        return converted;
    }

    int convertBase(int tBase) {
        return 0;
    }

    //from https://www.geeksforgeeks.org/find-first-last-digits-number/
    int firstDigit(int n) {
        // Remove last digit from number
        // till only one digit is left
        while (n >= 10) 
        n /= 10;
  
        // return the first digit
        return n;
    }

    /* This part needs improvement */

        /* This cannot solve the issue with zeros */

            /* As a temporary solution random cannot produce zeros */

            /* Generating numbers via string might be good solution for this problem */

    int randomBinaryNumber(int digit) {
        return randomBaseNumber(digit, 2);
    }

    int randBin(int digit) {
        Random rand = new Random();
        if(digit<1) 
        {
            return 0;
        }
        else if(digit==1)
        {
            return rand.nextInt(2);
        }
        String rBin = "1";
        for(int i=1; i<digit; i++) {
            rBin += rand.nextInt(2);
        }
        return Integer.valueOf(rBin); 
    }

    int randomBaseNumber(int digit, int base) {
        Random r = new Random();
        int gNumber = 0;
        for(int i=0; i<digit; i++)
        {
            int add = 0;
            while(add==0)
            {
                add = r.nextInt(base);
            }
            gNumber += add*Math.pow(10, i);
        }
        return gNumber; 
    }
}
