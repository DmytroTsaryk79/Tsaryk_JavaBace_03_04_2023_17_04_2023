package ua.hillel.tsaryk.lessons.lesson12;

public class Person {
    public static void main(String[] args) {

        personInfo("Will Smith", "New York", "2936729462846");
        personInfo("Jackie Chan", "Shanghai", "12312412412");
        personInfo("Sherlock Holmes", "London", "37742123513");

                }
        static String personInfo(String name, String city, String phone){
        String infoPerson = ("Your can call " + name + " from the sity " + city + " at phone " + phone);
            return infoPerson;
        }

    }

