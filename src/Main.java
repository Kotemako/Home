public class Main {

    public static void main(String[] args) {

        int price = 12000; // цена билета
        int bonus = 20; // количество рублей за 1 милю

        int mile = price / bonus;

        System.out.println("Количество миль за билет: " + mile);
    }
}
