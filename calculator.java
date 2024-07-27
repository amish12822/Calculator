/**
 * calculator
 */
public class calculator {
    public static void main(String[] args) {
        int a = 410;
        int b = 0;
        int operator = 6;

        /*
        
        1  ->  +
        2  ->  -
        3  ->  *
        4  ->  /
        5  ->  %

        */

        switch (operator) {
            case 1: System.out.println( a + " + " + b + " = " + (a+b) );
                break;

            case 2: System.out.println(  a + " - " + b + " = " +  (a-b) );
                break;

            case 3: System.out.println(  a + " * " + b + " = " + (a*b) );
                break;

            case 4: 
                if ( b == 0) {
                    System.out.println("Invalid number");
                } else{
                    System.out.println(  a + " / " + b + " = " + (a/b) );
                }
                break;
                
            case 5: 
                if ( b == 0) {
                    System.out.println("Invalid number");
                } else{
                    System.out.println(  a + " % " + b + " = " + (a%b) );
                }
                break;
                
        
            default: System.err.println("Invalid Operator");
        }
    }

}