import java.util.HashSet;
import java.util.Set;

public class PartyGuestList {
    private Set<String > guestList;

    public PartyGuestList(){
        guestList=new HashSet<>();
    }

    public void addGuest(String guest){
        guestList.add(guest);
    }
    public void removeGuest(String guest){
        guestList.remove(guest);
    }
    public boolean isGuestList(String guest){
        return guestList.contains(guest);
    }
    public int getTotalGuest(){
        return guestList.size();
    }
    public boolean isGuestListEmpty(){
        return guestList.isEmpty();
    }
}
