package practiceProblem_06;



public class Publisher {
    private int id;
    private String name;
    private String address;
    private int phoneNo;


    public Publisher(int id, String name, String address, int phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }


    public void addPub() {
        System.out.println("Publisher added: " + this.name);
    }

    public void modifyPub() {
        System.out.println("Publisher modified: " + this.name);
    }

    public void deletePub() {
        System.out.println("Publisher deleted: " + this.name);
    }

    public void displayStatus() {
        System.out.println("Publisher ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNo);
    }
}