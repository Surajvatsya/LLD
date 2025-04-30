package model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class User extends Base{
//     private final String id;
     private String name;
     private String mob;
     private List<Booking> bookingList;

    public User(String id, String name, String mob) {
        super(id);
        this.name = name;
        this.mob = mob;
        this.bookingList = new ArrayList<>(); //rem this
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mob='" + mob + '\'' +
                ", bookingList=" + bookingList +
                '}';
    }

    public void addBooking(Booking booking){
        bookingList.add(booking);
    }


//    public List<Booking> getBooking(){
//       return  bookingList;
//    }

}
