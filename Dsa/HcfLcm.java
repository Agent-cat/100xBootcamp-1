public class HcfLcm {

    public static int hcf(int a, int b) {
        int temp = b;
        b = a % b;
        a = temp;
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / hcf(a, b);
    }

    public static void main(String[] args) {
        int a = 4, b = 10;
        System.out.println("Hcf : " + hcf(a, b));
        System.out.println("LCM : " + lcm(a, b));
    }
}
