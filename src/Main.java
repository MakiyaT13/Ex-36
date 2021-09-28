
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int [50];
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 49; i++){
            System.out.print("Enter a number: ");
            numbers[i] =  input.nextInt();
            sum += numbers[i];
            count++;
        }
        int average = sum/count;

        System.out.print("Numbers: ");
        for (int i = 0; i < count; i++){
            System.out.print(numbers[i]);
            System.out.print(" ");
        }

        for (int i = 0; i < count; i++){
            int minimum = numbers[0];
            if (numbers[i]< minimum){
                minimum = numbers[i];
            }
            int maximum = numbers[0];
            if (numbers[i] > maximum){
                maximum = numbers[i];
            }
        }


        System.out.printf("The average is %d", average);
        System.out.printf("The minimum is %d", minimum);
        System.out.printf("The maximum is %d", maximum);
        System.out.printf("The standard deviation is %d", average);
    }
}