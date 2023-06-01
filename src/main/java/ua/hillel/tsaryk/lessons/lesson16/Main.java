package ua.hillel.tsaryk.lessons.lesson16;

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        IPhones IPhone = new IPhones();

        androidPhone.call("123456789");
        androidPhone.sms("987654321", "Hello from Android!");
        androidPhone.internet();
        androidPhone.runCommand("ls -l");

        IPhone.call("123456789");
        IPhone.sms("987654321", "Hello from iPhone!");
        IPhone.runApp("Calculator");
    }
}





