package ua.hillel.tsaryk.lessons.lesson16;

public class IPhones implements Smartphones, IOS {
@Override
public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " on an iPhone.");
        }

@Override
public void sms(String phoneNumber, String message) {
        System.out.println("Sending SMS to " + phoneNumber + " from an iPhone: " + message);
        }

@Override
public void internet() {
        System.out.println("Browsing the internet on an iPhone.");
        }

@Override
public void runApp(String appName) {
        System.out.println("Running iOS app on an iPhone: " + appName);
        }
        }
