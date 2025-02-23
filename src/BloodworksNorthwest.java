public class BloodworksNorthwest {
    private String name;
    private int age;
    private String gender;
    private String bloodGroup;
    private long phoneNumber;

    public BloodworksNorthwest(String name, int age, String gender, String bloodGroup, long phoneNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bloodGroup = bloodGroup;
        this.phoneNumber = phoneNumber;
    }

    //GETTERS
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    //SETTERS
    public void setName(String name){ this.name = name; }
    public void setAge(int age){ this.age = age; }
    public void setGender(String gender){ this.gender = gender; }
    public void setBloodGroup(String bloodGroup){ this.bloodGroup = bloodGroup; }
    public void setPhoneNumber(long phoneNumber){ this.phoneNumber = phoneNumber; }
}

