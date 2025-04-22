package Tasks4_OOP.Phone;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123-123-1234", "IPhone 22", 345);
        Phone phone2 = new Phone("9-987-555-995", "Google pro XL");
        Phone phone3 = new Phone();

        phone1.receiveCall("Иосиф");
        phone2.receiveCall("Владимир", phone2.toString());

        System.out.println("Номер телефона " + phone1.getModel() + ": " + phone1.getNumber());

        String[] numbersToSendMessages = {"8-800-...", "0987654321"};
        phone1.sendMessage(numbersToSendMessages);

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
    }
}