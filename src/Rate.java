import java.util.Scanner;

public class Rate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap So Tien USD : ");
        double usd = sc.nextDouble();
        double rate = usd * 23000;
        System.out.println("tien viet : " + rate + "VND");
    }
}
