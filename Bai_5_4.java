import java.util.Scanner;

public class Bai_5_4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month: ");
        String month = sc.nextLine();

        System.out.print("Enter year (in number): ");
        String year = sc.nextLine();

        int yearNumber = Integer.parseInt(year);
        boolean checkLeapYear = (yearNumber % 4 == 0 && !(yearNumber % 100 == 0 && yearNumber % 400 != 0));

        String[] Month = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        String[] Abbreviation = {"Jan.", "Feb.", "Mar.", "Apr.", "May", "June",
                "July", "Aug.", "Sept.", "Oct.", "Nov.", "Dec."};
        String[] In3letters = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        String[] InNumber = {"1", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "11", "12"};

        int[] DaysOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // For common year

        for (int i = 0; i < 12; i++) {
            if (month.equals(Month[i])) {
                if (i + 1 == 2 && checkLeapYear) {
                    System.out.println(29);
                } else System.out.println(DaysOfMonth[i]);
                break;
            }
            if (month.equals(Abbreviation[i])) {
                if (i + 1 == 2 && checkLeapYear)
                    System.out.println(29);
                else System.out.println(DaysOfMonth[i]);
                break;
            }
            if (month.equals(In3letters[i])) {
                if (i + 1 == 2 && checkLeapYear)
                    System.out.println(29);
                else System.out.println(DaysOfMonth[i]);
                break;
            }
            if (month.equals(InNumber[i])) {
                if (i + 1 == 2 && checkLeapYear)
                    System.out.println(29);
                else System.out.println(DaysOfMonth[i]);
                break;
            }
        }

        sc.close();
    }
}
