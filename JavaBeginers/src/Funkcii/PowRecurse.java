package Funkcii;

public class PowRecurse {
    public static void main(String[] args) {

        System.out.println(Pow(2,8));
    }

    public static int Pow(int n, int k) {
        if (k==0)
            return 1;
        return n*Pow(n,k-1);

    }
}
