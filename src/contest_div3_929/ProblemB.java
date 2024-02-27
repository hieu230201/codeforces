package contest_div3_929;

import java.util.Scanner;

/**
 * Description:
 *
 * @author: hieu
 * @since: 27/02/2024
 * Project_name: contest_div3_929
 */
public class ProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int tong = 0;
            int checkOne = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                tong += a;
                if (a % 3 == 1) {
                    checkOne = 1;
                }
            }
            if (tong % 3 == 0) {
                System.out.println(0);
            } else if (tong % 3 == 2) {
                System.out.println(1);
            } else {
                if (checkOne == 1) {
                    System.out.println(1);
                } else {
                    System.out.println(2);
                }
            }

        }
    }
}
