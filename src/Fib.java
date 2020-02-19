public class Fib {
    public static void main(String[] args) {


         int n0 =1;
        int n1 = 2;
        int n2 = 3;
        System.out.println(n0+" "+n1 + " " + n2);
        for (int k = 1; k < 18; k++){
            int n3 = n0 + n1 + n2;
            n0 = n1;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        };
    }
}