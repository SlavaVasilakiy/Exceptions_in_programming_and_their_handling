class TempData {
    private String lastName;
    private String firstName;
    private String middleName;
    private String dateOfBirth;
    private long phoneNumber;
    private char gender;

    public TempData(String lastName, String firstName, String middleName, String dateOfBirth, long phoneNumber, char gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String toString() {
        return lastName + " " + firstName + " " + middleName + " " + dateOfBirth + " " + phoneNumber + " " + gender;
    }
}