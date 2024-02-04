package homework_03;

public class Task2 {
    public static void main(String[] args) {
        double priceA = 1000.0;
        double priceB = 500.0;
        double discount = 0.1;

        double totalPrice = priceA + priceB;
        double discountedPrice = totalPrice - (totalPrice * discount);

        System.out.println("Стоимость суммы товаров A + B со скидкой: " + discountedPrice + " евро");
        System.out.println("Скидка от этой покупки: " + (totalPrice - discountedPrice) + " евро");
    }
}
