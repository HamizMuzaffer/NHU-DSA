import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int[] arr = { 22, 23, 25, 27, 28 };
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Value to search:");
            int searchNum = scanner.nextInt();

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == searchNum) {

                    System.out.println("Value Found!!");
                    break;
                } else {

                }
                if (arr[i] != searchNum) {
                    System.out.println("Value Not Found!!");
                }
                break;

            }
            
        scanner.close();

    }
}
