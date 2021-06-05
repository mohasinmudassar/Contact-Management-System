//This class handles all the contact details
public class Contact {
    private String Name,
            phoneNumber,email,notes;
//    Instance of Address class that contains the address information
    private Address homeAddress;
//    Instance of myDate class that contains the birthday information
    private myDate birthday;

    public Contact(String Name, String phoneNumber,String email,String notes,
            myDate birthday,Address homeAddress){
        this.Name = Name;
        this.phoneNumber= phoneNumber;
        this.email = email;
        this.notes = notes;
        this.birthday = birthday;
        this.homeAddress = homeAddress;
    }
//Getters and Setters
    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public String getName() {
        return Name;
    }

    public String getHomePhone() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getNotes() {
        return notes;
    }

    public myDate getBirthday() {
        return birthday;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setHomePhone(String phoneNumber) {
        this.phoneNumber= phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public void setBirthday(myDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Contact{" + "Name=" + Name  + ", phoneNumber=" +
                phoneNumber+ ", email=" + email + ", notes=" + notes + 
                ", birthday=" + birthday + ", home address= " + homeAddress + '}';
    }
    
}
