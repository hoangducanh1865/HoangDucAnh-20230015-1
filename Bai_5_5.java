import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Bai_5_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        System.out.print("Nhap vao so luong phan tu: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.print("Nhap vao cac phan cua cua day: ");
        for (int i = 0; i < n; i++) {
            arrayList.add(sc.nextInt());
            sum += arrayList.get(i);
        }

        // Sap xep day theo thu tu tang dan
        Collections.sort(arrayList);

        System.out.print("Day sau khi duoc sap xep tang dan: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Sap xep day theo thu tu giam dan
        Collections.sort(arrayList, Collections.reverseOrder());

        System.out.print("Day sau khi duoc sap xep giam dan: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        double average = 1.0 * sum / n;
        System.out.println("Tong cac phan tu cua day: " + sum);
        System.out.printf("Trung binh cac phan tu cua day: %.4f", average);

        sc.close();
    }
}
