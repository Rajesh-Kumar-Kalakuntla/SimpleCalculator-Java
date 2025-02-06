package calculator;
    import java.util.*;
    public class Calculator implements Calculator_Interface{
                                Scanner sc = new Scanner(System.in);
                        @Override
                        public void calculation(double First_Number , double Second_Number) {
                                System.out.println("+ --> Addition");
                                System.out.println("- --> Subtraction");
                                System.out.println("* --> Multiplication");
                                System.out.println("/ --> Division");
                                System.out.println("Enter an Operator To Perform Operation: ");
                                String operator = sc.next();
                                if(First_Number == 0){
                                System.out.println("Enter The First Number: ");
                                First_Number = sc.nextDouble();
                                }
                                System.out.println("Enter The Second Number: ");
                                Second_Number = sc.nextDouble();
                                double result;
                                switch (operator) {
                                    case "+":
                                         result = First_Number + Second_Number;
                                        System.out.println("Addition: " +result);
                                        Continue_Calculation(result);
                                    case "-" :
                                         result = First_Number - Second_Number;
                                        System.out.println("Subtraction: " +result);
                                        Continue_Calculation(result);
                                    case "*" :
                                         result = First_Number * Second_Number;
                                        System.out.println("Multiplication: " +result);
                                        Continue_Calculation(result);
                                    case "/" :
                                         result = First_Number / Second_Number;
                                        System.out.println("Division: " +result);
                                        Continue_Calculation(result);
                                    default:
                                        System.out.println("Invalid Opration");
                                        Continue_Calculation(0);
                                        break;
                                }
                                
                            }
                            @Override
                            public void Continue_Calculation(double result) {
                                System.out.println("DO You Want To Continue Performing Opeartions(Yes or No): ");
                                String ans = sc.next();
                                if(ans.equals("Yes")){
                                    calculation(result,0);
                                }
                                    else{
                                        System.out.println("The Previous Data Is Cleared");
                                        System.out.println("Welcome!!!");
                                        calculation(0, 0);
                                    }
                }
            
            public static void main(String[] args) {
                Calculator_Interface operation =new Calculator();
                System.out.println("WELCOME!!!");
                double result = 0;
                operation.calculation(result,0);
            }
}
