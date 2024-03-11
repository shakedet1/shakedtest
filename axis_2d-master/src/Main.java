import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AxisSystem axisSystem = new AxisSystem(); //this line displays the initial axis
     //   one(axisSystem );
       // two(axisSystem );
        //three(axisSystem);
        //four(axisSystem);
       six (axisSystem);
      // seven (axisSystem);

    }

    public static void one(AxisSystem axisSystem ) {
        axisSystem .addSinglePoint(100, 150, "black");
    }

    public static void two(AxisSystem axisSystem ) {
        axisSystem .addSinglePoint(200, -200, "green");
    }

    public static void three(AxisSystem axisSystem ) {
        axisSystem .addSinglePoint(200, -200, "blue");
    }

    public static void four(AxisSystem axisSystem ) {
        axisSystem .addMultiplePoints(new int[]{50, 50, 60, 60, 70, 70}, "black");
    }

    public static void five(AxisSystem axisSystem ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many point do you want?");
        int num = scanner.nextInt();
        System.out.println("Enter a color");
        String color = scanner.nextLine();
        for (int i = 0; i <= num; i++) {
            Random random = new Random();
            int x = random.nextInt(-250,250);
            int y = random.nextInt(-250,250);
            axisSystem .addSinglePoint(x, y, color);
        }
    }

    public static void six(AxisSystem axisSystem ) {
        int x=-50;
        int y= 2 * x + 100;
        for (int i = 0; i <100; i++) {
            axisSystem .addSinglePoint(x, y, "black");
            x=x+1;
            y=2*x+100;
        }
    }

    public static void seven(AxisSystem axiSystem) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter y=mx+n");
        String line = scanner.nextLine();
        String m = line.substring(line.indexOf('='), line.indexOf('x'));
        String n = line.substring(line.indexOf('+'), line.indexOf(line.length() - 1));
        int m1 = Integer.parseInt(m);
        int n1 = Integer.parseInt(n);
        int x = 0;
        if (m1 != 0) {
            x = ((-n1) / (m1));
        } else {
            x = -n1;
        }
        for (int i = 0; i < 250; i++) {
            axiSystem.addSinglePoint(x, m1 * i + n1, "black");
        }
    }


}

