package test1;

/**
 * @author: SiJi
 */
public class SanYuanTest {
    public static void main(String[] args) {
        int m = 5;
        int n = 6;
        n = 3;
        //int max = (m > n) ? m : n;
        //String max = (m > n) ? "m大" : ((m == n)?" m等于n ": "n大");
        int w = 8;
        int max1 = (m > n) ? m : n;
        int max2 = (max1 > w) ? max1 : w;
        System.out.println(max2);
    }
}
