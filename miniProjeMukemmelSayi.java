public class miniProjeMukemmelSayi {

    public static void main(String[] args) {
        //6=1,2,3 toplandığında 6
        //28=1,2,4,7,14 toplandığında 28

        int number = 28;
        int total = 0;

        for (int i = 1; i < number; i++) {

            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("Mükemmel Sayıdır");
        } else {
            System.out.println("Mükemmel sayı değildir");

        }
    }
}
