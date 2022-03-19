package githubversion;

import java.util.Scanner;

    public class Calculator {

        public static void main(String[] args) {

            Scanner input=new Scanner(System.in);
            int n1,n2,result1,result2,result3;
            System.out.println("Enter num1");
            n1=input.nextInt();
            System.out.println("Enter num2");
            n2=input.nextInt();

            addition a = new addition();
            Sub b = new Sub();
            mul c = new mul();
            result1=a.add(n1,n2);
            result2 = b.sub(n1,n2);
            result3 = c.mult(n1,n2);
            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
        }



    }
