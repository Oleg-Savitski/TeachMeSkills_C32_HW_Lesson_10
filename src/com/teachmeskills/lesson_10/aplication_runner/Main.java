package com.teachmeskills.lesson_10.aplication_runner;

import com.teachmeskills.lesson_10.model.client.Client;

/** Есть клиент.
 * Клиент может иметь любое колличество карт.
 * Карта имеет три поля - cvv-код, номер карты и сумма на карте.
 * Вывести на экран сообщение о том, сколько одинаковых карты имеет клиент.
 * Поле со значением суммы на карте не должно участвовать в сравнении.
 * Т.е. две краты с одними и теми же cvv-кодами и номерами, но разными суммами считаются одинаковыми.
 * Предусмотреть различные варианты выходного сообщения - например, у клиента нет ни одной карты совсем,
 * у клиента нет одинаковых карт и другие возможные ситуации.
 */

public class Main {
    public static void main(String[] args) {
        Client client = new Client(6);
        Client client1 = new Client(1);


        client.addCard("454", "2234-4445-3333-2121", 12300, "Mark Twain");
        client.addCard("655", "2344-1145-2333-9999", 4300, "Mark Twain");
        client.addCard("154", "3334-4655-6673-5521", 9300, "Joseph Kobzon");
        client.addCard("551", "4211-3345-3113-1821", 73600, "Sylvester Stallone");
        client.addCard("969", "5556-2145-6363-4432", 332300, "Tom Hardy");
        client.addCard("969", "5556-2145-6363-4432", 33211, "Tom Hardy");
        client.addCard("339", "4566-3245-9393-9732", 1, "Boris Godunov");

        client1.countDuplicateCards();
        client.displayCards();
    }
}