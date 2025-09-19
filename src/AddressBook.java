import java.util.ArrayList;
import java.util.List;

public class AddressBook
{
    private List<BuddyInfo> myBuddies;

    public AddressBook() {
        myBuddies = new ArrayList<>();
    }

    public boolean addBuddy(BuddyInfo aBuddy) {
        return myBuddies.add(aBuddy);
    }

    public boolean removeBuddy(BuddyInfo aBuddy) {
        return myBuddies.remove(aBuddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Peter Griffin", "31 Spooner St.", "123-456-7890");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
