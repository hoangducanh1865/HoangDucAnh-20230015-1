import java.util.Scanner;

public class Bai_1_1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap vao so thu nhat: ");
        double num1 = sc.nextDouble();

        System.out.print("Nhap vao so thu hai: ");
        double num2 = sc.nextDouble();

        System.out.printf("Tong cua hai so vua nhap bang: %.4f%n", (num1 + num2));
        System.out.printf("Hieu cua hai so vua nhap bang: %.4f%n", (num1 - num2));
        System.out.printf("Tich cua hai so vua nhap bang: %.4f%n", (num1 * num2));
        System.out.print("Thuong cua hai so vua nhap bang: ");
        if(num2 == 0) {
            System.out.println("INFINITE NUMBER");
        } else {
            System.out.printf("%.4f%n", num1 / num2);
        }

        sc.close();
    }
}
