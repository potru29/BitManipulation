import java.util.*;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int power = 0;
        while (num > 0) {
            int val = num % 10;
            sum += val * Math.pow(2, power);
            num = num / 10;
            power++;

        }
        System.out.println(sum);

    }
}
