import java.util.Scanner;

public class Direction {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double degre=input.nextDouble();
        String[] name={"N","NE","E","ES","S","SW","W","WN","N"};
        int position=(int)Math.round(degre/45.0);
        System.out.println(position);
        System.out.println(name[position]);
    }
}
