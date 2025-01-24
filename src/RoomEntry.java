/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */


public class RoomEntry 
{
    private String name;
    private Integer seats;
    
    public RoomEntry (String name, Integer seats)
    {
        this.name = name;
        this.seats = seats;
    }
    
    public String getName()
    {
        return this.name;           
    }
    
    public Integer getSeats()
    {
        return this.seats;
    }
}
