package utils;

public class Address {
    private String name;
    private String addressLine;
    private String city;
    private String country;
    private int pincode;
    private long phoneNo;

    public Address(String name, String addressLine, String city, String country, int pincode, long phoneNo) {
        this.name = name;
        this.addressLine = addressLine;
        this.city = city;
        this.country = country;
        this.pincode = pincode;
        this.phoneNo = phoneNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddressLine() {
        return addressLine;
    }

    public void setAddressLine(String addressLine) {
        this.addressLine = addressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }
}
