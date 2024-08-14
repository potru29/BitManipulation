import java.util.*;

public class ToggleBitPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int oper = sc.nextInt();
        int bitMask = 1 << pos;
        if (oper == 1) {
            int newnumber = bitMask | num;
            System.err.println(newnumber);
        } else {
            int newBitMask = ~(bitMask);
            int newnumber = newBitMask & num;
            System.out.println(newnumber);
        }
    }

}
