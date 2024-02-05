public class Main {
    public static void main(String[] args) {


        int ticket = 15555;
        int stepPlus = 20;
        int bonus = 1;

        System.out.println("Количество бонусных милей с покупки в " + ticket + " рублей:");
        System.out.println(ticket / stepPlus * bonus);

    }
}
