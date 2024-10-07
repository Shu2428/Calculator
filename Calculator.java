import java.util.Scanner;

class Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter Second Number");
        int n2 = sc.nextInt();
        System.out.println("Enter Symbol(+,-,*,/)");
        String sum = sc.next();
        int res;
        switch(sum)
        {
            case "+":
                res = n1+n2;
                System.out.println("Addition is: "+res);
                break;

            case "-":
                res = n1-n2;
                System.out.println("Subtraction is: "+res);
                break;

            case "*":
                res = n1*n2;
                System.out.println("Multiplication is: "+res);
                break;

            case "/":
                res = n1/n2;
                System.out.println("Division is: "+res);
                break;

            default:
                System.out.println("Invalid Symbol");
                break;
        }
    }
}