package calculator;
    import java.util.*;
    public class Calculator implements Calculator_Interface{
    
        @Override
        public void calculation() {
                Scanner sc = new Scanner(System.in);
                System.out.println("+ --> Addition");
                System.out.println("- --> Subtraction");
                System.out.println("* --> Multiplication");
                System.out.println("/ --> Division");
                System.out.println("Enter an Operator To Perform Operation: ");
                String operator = sc.next();
                System.out.println("Enter The First Number: ");
                double First_Number = sc.nextDouble();
                System.out.println("Enter The Second Number: ");
                double Second_Number = sc.nextDouble();
                double result;
                switch (operator) {
                    case "+":
                         result = First_Number + Second_Number;
                        System.out.println("Addition: " +result);
                        break;
                    case "-" :
                         result = First_Number - Second_Number;
                        System.out.println("Subtraction: " +result);
                        break;
                    case "*" :
                         result = First_Number * Second_Number;
                        System.out.println("Multiplication: " +result);
                        break;
                    case "/" :
                         result = First_Number / Second_Number;
                        System.out.println("Division: " +result);
                        break;
                    default:
                        System.out.println("Invalid Operation");
                        break;
                }
            }
            public static void main(String[] args) {
                Calculator operation =new Calculator();
                System.out.println("WELCOME!!!");
                operation.calculation();
    
            }
}
