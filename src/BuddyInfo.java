public class BuddyInfo
{
    private String name;
    private String address;
    private String number;

    public BuddyInfo() {
        name = "None";
        address = "None";
        number = "None";
        // this("None", "None", "None");
    }

    public BuddyInfo(String name, String address, String number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() { return name; }

    public String getAddress() { return address; }

    public String getNumber() { return number; }

    public static void main(String[] args) {
        BuddyInfo bud = new BuddyInfo("Peter Griffin", "31 Spooner St.", "123-456-7890");
        System.out.println("Hello " + bud.getName());
    }
}
