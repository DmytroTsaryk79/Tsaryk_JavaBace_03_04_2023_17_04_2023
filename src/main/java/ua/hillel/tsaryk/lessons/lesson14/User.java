package ua.hillel.tsaryk.lessons.lesson14;

public class User {

    private final String nameUser;
    private final int dateBirthday;
    private final String monthBirthday;
    private final int yearBirthday;
    private final String email;
    private final int phone;
    private String lastname;
    private double weight;
    private String bloodPressure;
    private int stepsTaken;
    private int age;


    public User(String nameUser,
                int dateBirthday,
                String monthBirthday,
                int yearBirthday,
                String email,
                int phone,
                String lastname,
                double weight,
                String bloodPressure,
                int stepsTaken) {
        this.nameUser = nameUser;
        this.dateBirthday = dateBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.email = email;
        this.phone = phone;
        this.lastname = lastname;
        this.weight = weight;
        this.bloodPressure = bloodPressure;
        this.stepsTaken = stepsTaken;
        this.age = (2020 - yearBirthday);
    }
    public int getAge() {
        return age;
    }
    public void printAccountInfo() {
        System.out.println("User name: " + nameUser + ". User birthday: " + dateBirthday + " " + monthBirthday +
                " " + yearBirthday + "." + " User e-mail: " + email + ". User phone: " +
                phone + ". User age: " + age + ". User lastname: " + lastname + ". User weight: " + weight +
                ". User blood pressure: " + bloodPressure + ". User walking steps per day: " + stepsTaken);
    }
    public void setWeight(double weight) {
        this.weight = weight;
        }
    public void setStepsTaken(int stepsTaken) {
        this.stepsTaken = stepsTaken;
    }
}






