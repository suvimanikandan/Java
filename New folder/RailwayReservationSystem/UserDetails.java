package RailwayReservationSystem;

public class UserDetails {
    private String name;
    private int age;
    private String gender;
     private String berthpreference;

    public UserDetails(String name, int age, String gender, String berthpreference) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.berthpreference = berthpreference;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getBerthpreference() {
        return berthpreference;
    }
    public void setBerthpreference(String berthpreference) {
        this.berthpreference = berthpreference;
    }

    
}
