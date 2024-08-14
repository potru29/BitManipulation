import java.util.*;

public class DecimalTobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int num = sc.nextInt();
        while (num > 0) {
            int rem = num % 2;
            sb.insert(0, rem);
            num = num / 2;

        }
        System.out.println(sb);

    }

}
