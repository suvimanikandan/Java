package Reservation;

public class Ticket {
    private String name;
    private int age;
    private String gender;
    private String Berthpreference;
    private String confirmationStatus;
    
    public Ticket(String name, int age, String gender, String berthpreference) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
        setBerthpreference(berthpreference);
    }

    public String getConfirmationStatus() {
        return confirmationStatus;
    }

    public void setConfirmationStatus(String confirmationStatus) {
        this.confirmationStatus = confirmationStatus;
    }

    public String getBerthpreference() {
        return Berthpreference;
    }

    public void setBerthpreference(String berthpreference) {
        this.Berthpreference = berthpreference;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
