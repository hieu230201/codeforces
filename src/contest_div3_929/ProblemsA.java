package contest_div3_929;

import java.util.Scanner;

/**
 * Description:
 *
 * @author: hieu
 * @since: 27/02/2024
 * Project_name: contest_div3_929
 */
public class ProblemsA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int tong = 0;
            while (n-- > 0) {
                int a = sc.nextInt();
                if (a < 0) {
                    tong += (0 - (a));
                } else {
                    tong += a;
                }
            }
            System.out.println(tong);
        }
    }
}
