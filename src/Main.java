
public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {

        //Task 1

        int [] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];

        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        //Task 2

        int maxPay = -1;
        int minPay = 200_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxPay) {
                maxPay = arr[i];
            }
            if (arr[i] < minPay){
                minPay = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPay +  " рублей." + " Максимальная сумма трат за день составила " + maxPay + " рублей");


        //Task 3

        double middle = 0;
        int allTotal = total/30;
        allTotal = total;
        middle =  (allTotal /30);

            System.out.println(middle);



        //Task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0; i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}