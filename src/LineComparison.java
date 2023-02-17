
import java.util.Objects;
import java.util.Scanner;
public class LineComparison {

        public static void main(String[] args) {
            System.out.println("""
                Here we have to draw line by using cartesian method\s
                In cartesian method to draw line we need 2 reference points\s
                
                please Enter the co-ordinates of points\s
                 """);
            line();
        }

        public static double line(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter X co-ordinate of point 1 : ");
            int x1 = sc.nextInt();
            System.out.println("Enter Y co-ordinate of point 1 : ");
            int y1 = sc.nextInt();
            System.out.println("Enter X co-ordinate of point 2 : ");
            int x2 = sc.nextInt();
            System.out.println("Enter Y co-ordinate of point 2 : ");
            int y2 = sc.nextInt();
            double length = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );
            System.out.println("length of line : " +length);
            return length;

        }
    }

