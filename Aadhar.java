package project1;

public class Aadhar {
    private String aadharNumber;
    private String name;
    private String fName;
    private String address;

    public Aadhar(String aadharNumber, String name, String fName, String address) {
        this.aadharNumber = aadharNumber;
        this.name = name;
        this.fName = fName;
        this.address = address;
    }

    public String getAadharNumber() {
        return aadharNumber;
    }

    public void setAadharNumber(String aadharNumber) {
        this.aadharNumber = aadharNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Aadhar{" +
                "aadharNumber='" + aadharNumber + '\'' +
                ", name='" + name + '\'' +
                ", fName='" + fName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
