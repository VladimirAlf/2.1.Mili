public class Main {
    public static void main(String[] args) {
        int ticketPrice = 2500;//в рублях
        int oneMile = 20;//с каждых 20 рублей начисляется 1 миля

        int bonusMile = (ticketPrice / oneMile);
        System.out.println(bonusMile);

    }
}

