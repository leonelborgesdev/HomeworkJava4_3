// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        PartyGuestList partyGuestList=new PartyGuestList();

        partyGuestList.addGuest("Juan");
        partyGuestList.addGuest("Maria");
        partyGuestList.addGuest("Pedro");

        System.out.println("¿Esta Juan en la lista de invitados?:"+partyGuestList.isGuestList("Juan"));
        System.out.println("¿Esta Ana en la lista de invitados:?"+partyGuestList.isGuestList("Ana"));

        partyGuestList.removeGuest("Maria");
        System.out.println("Numero total de invitados:"+partyGuestList.getTotalGuest());
        System.out.println("¿La lista de invitados esta vacia?:"+partyGuestList.isGuestListEmpty());
    }
}