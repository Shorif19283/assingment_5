import java.util.Scanner;

public class Grade_Calculation {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String grade=input.nextLine();
       // char result=grade.charAt(0);
        double mark=0.0;
        switch (grade.charAt(0))
        {
            case 'A':
            {
                mark=4.0;
                break;
            }

            case 'B':
            {
                mark=3.0;
                break;

            }

            case 'C':
            {
                mark=2.0;
                break;
            }

            case 'D':
            {
                mark=1.0;
                break;
            }
            default:
                System.out.println("invalid input");
        }
        if(grade.length()>1)
        {

            if(grade.charAt(1)=='+')
            {
                mark=mark+0.3;
            }
           else if(grade.charAt(1)=='-')
            {
                mark=mark-0.3;
            }
           else System.out.println("invalid input1");
        }
        System.out.println("total cgpa mark="+mark);
    }
}
