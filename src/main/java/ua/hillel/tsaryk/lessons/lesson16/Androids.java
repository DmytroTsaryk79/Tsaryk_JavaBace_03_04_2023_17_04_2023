package ua.hillel.tsaryk.lessons.lesson16;

public class Androids implements Smartphones, LinuxOS {
    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " on an Android phone.");
    }

    @Override
    public void sms(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + " from an Android phone: " + message);
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone.");
    }

    @Override
    public void runCommand(String command) {
        System.out.println("Running Linux command on an Android phone: " + command);
    }
}