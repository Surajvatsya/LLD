package model;

import java.util.List;

public class Center {
    private Address address;
    private List<Slot>slots;
    private String name;
    private Boolean isOpen;


    public Center(Address address, List<Slot> slots, String name, Boolean isOpen) {
        this.address = address;
        this.slots = slots;
        this.name = name;
        this.isOpen = isOpen;
    }

    public List<Slot> getSlots() {
        return slots;
    }

//    public void Slots(List<Slot> slots) {
//        this.slots = slots;
//    }
}
