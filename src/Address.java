//THis class contains the Address Information
public class Address {
    public String street,city, province, country;

    public Address(String street, String city, String province, String country) {
        this.street = street;
        this.city = city;
        this.province = province;
        this.country = country;
    }

    public String toString() {
        return "Address{" + "street=" + street  +
                ", city=" + city + ", province=" + province + ", country="
                + country + '}';
    }
    
}
