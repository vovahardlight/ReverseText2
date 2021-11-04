import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        char[] arr = text.toCharArray();
        String st = "";
       for (int i = arr.length-1; i>=0; i--){
            st+=arr[i];}
        System.out.println(st);

    }
}
