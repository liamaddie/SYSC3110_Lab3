import java.util.ArrayList;
import java.util.List;

public class AddressBook
{
    private List<BuddyInfo> addressBook;

    public AddressBook() {
        addressBook = new ArrayList<>();
    }

    public boolean addBuddy(BuddyInfo aBuddy) {
        return addressBook.add(aBuddy);
    }

    public boolean removeBuddy(BuddyInfo aBuddy) {
        return addressBook.remove(aBuddy);
    }

    public static void main(String[] args) {
        System.out.println("Address book");
    }
}
