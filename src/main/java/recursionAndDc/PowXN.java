package recursionAndDc;


/**
 * leetcode 50 mid
 * https://leetcode-cn.com/problems/powx-n/
 * 这题递归或者循环都需要考虑性能，不然leetcode测试会stack overflow或者timeout
 */
public class PowXN {
    public double myPow(double x, int n) {
        if (n == 0) return 1;

        if (n < 0) {
            return 1 / myPow(x, -n);
        }

        if ((n & 1) == 0) {
            return myPow(x * x, n >> 1);
        }

        return x * myPow(x * x, n >> 1);
    }

    public double myPow2(double x, int n) {
        long m = n;
        if (n < 0) {
            x = 1 / x;
            m = -m;
        }
        double pow = 1;

        while (m > 0) {
            if ((m & 1) != 0) {
                pow *= x;
            }
            x *= x;
            m = (m >> 1);
        }
        return pow;
    }

    public static void main(String[] args) {
//        new PowXN().myPow(0.00001, 2147483647);
//        new PowXN().myPow(1.00000, 2147483647);
//        System.out.println(new PowXN().myPow2(2.10000, 3));;
        System.out.println(new PowXN().myPow2(2.00000, -2147483648));;
    }
}
