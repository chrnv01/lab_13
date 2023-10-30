package ex5;

import java.util.List;
import java.util.Scanner;

public class Phone {
    private String code, city, triplet, quadruple;

    public Phone(String phone) {
        if (phone.length() < 11 || phone.length() > 14) {
            System.out.println("Неправильно набран номер.");
            return;
        }

        if (phone.startsWith("+7")) {
            code = "+7";
        } else if (phone.startsWith("8")) {
            code = "+7";
        } else {
            code = phone.substring(0, 4);
        }

        city = phone.substring(phone.length() - 10, phone.length() - 7);
        triplet = phone.substring(phone.length() - 7, phone.length() - 4);
        quadruple = phone.substring(phone.length() - 4);
    }

    @Override
    public String toString() {
        return code + "(" + city + ")" + triplet + "-" + quadruple;
    }

    public static void main(String[] args) {
        int numPhone;
        System.out.println("Введите количество телефонов, которые хотите ввести:");
        Scanner scanner = new Scanner(System.in);
        numPhone = scanner.nextInt();

        for(int i = 0; i < numPhone; i++){
            System.out.println("Введите номер телефона:");
            System.out.println(new Phone(scanner.next()));
        }
    }
}