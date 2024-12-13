package homework_nr_3;

public class HomeWorkNr3 {
    public static void main(String[] args) {

        int Month = 3;
        switch (Month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Oops! Invalid data!");
        }
        System.out.println("______________________");

        int j = 5;
        for (int i = 100; i >= 100; ) {
            int k = i % j;
            if (k == 0) {
                System.out.println(i);
            }
            if (i == 1001)
                break;
            i++;
        }
        System.out.println("______________________");


        float sum = (float) 0;

        for (int x = 1, y = 3; x <= 97; x += 2, y += 2) {
            sum += (float) x / y;
        }
        System.out.println("Сумма серии = " + sum);

    }
}