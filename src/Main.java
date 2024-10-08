//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.print("Enter degrees in celsius: ");
        int degrees=Scanner.nextInt();
        int fahrenheit = degrees * 9 / 5 + 32;
        do {System.out.println("The temperature in fahrenheit is : " + fahrenheit);
            if (degrees >0 && degrees <100) {break;}
        }while( degrees >0 && degrees <100);

        do {System.out.println("The freezing point in fahrenheit is : " + fahrenheit);
            if (degrees < 0 || degrees > -200) {break;}
        }while(degrees < 0 || degrees > -200);

        do {System.out.println("The boiling point in fahrenheit is : " + fahrenheit);
            if (degrees >= 100 || degrees < 200) {break;}
        }while( degrees >= 100 || degrees < 200);

        do {System.out.println("The temperature is invalid");
            if (degrees <= -200 || degrees >= 200) {break;}
        }while( degrees <= -200 || degrees >= 200);
    }
}