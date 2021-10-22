package entities;

public class Travellers {

    private int rooms;
    private int adults;
    private int childs;

    public Travellers(int rooms, int adults, int childs) {
        this.rooms = rooms;
        this.adults = adults;
        this.childs = childs;
    }

    public int getRooms() {
        return rooms;
    }

    public int getAdults() {
        return adults;
    }

    public int getChilds() {
        return childs;
    }
}
