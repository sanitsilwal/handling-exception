2import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter first Digit:");
            int a =scanner.nextInt();
            System.out.println("Enter Second Digit");
            int b = scanner.nextInt();
        if (b==0)
    //Throwing an arithmetic Exception if the divisor is zero
    throw new ArithmeticException("Cannot divide by Zero.");
        
        //Attempting to divide numbers 
        int result=a/b;
        System.out.println(result);
}
catch (ArithmeticException e){
    //Handling arithmetic exceptionb
    System.err.println("Error:" +e.getMessage());
} 
finally {
    //This block always executes, whether an exception is occured oor not
    System.out.println("Finally block executed.");
    scanner.close();
}
}
}