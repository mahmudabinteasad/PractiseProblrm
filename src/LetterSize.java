import java.util.*;
public class LetterSize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int i = sc.nextInt();
        double square = (i * i);
        double cube = (i * i * i);
        double fourth = (Math.pow(i, 4));
        System.out.printf("Square: %8.2f \n", square);
        System.out.printf("Cube: %8.2f \n", cube);
        System.out.printf("Fourth: %8.2f \n", fourth);
    }
}
