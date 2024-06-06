public class User {
    private String firstName;
    private String secondName;
    private String lastName;
    private Gender gender;

    public User(String firstName, String secondName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "User [firstName=" + firstName + ", secondName=" + secondName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

}
