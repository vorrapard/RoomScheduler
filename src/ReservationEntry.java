/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */


import java.sql.Date;
import java.sql.Timestamp;

public class ReservationEntry 
{
    private String facultyName;
    private String room;
    private Date date;
    private Integer seats;
    private Timestamp timestamp;   
    
    public ReservationEntry(String facultyName, String room, Date date, Integer seats, Timestamp timestamp)
    {
        this.facultyName = facultyName;
        this.room = room;
        this.date = date;
        this.seats = seats;
        this.timestamp = timestamp;
    }
    
    public String getFacultyName()
    {
        return this.facultyName;
    }
    
    public String getRoom()
    {
        return this.room;
    }
    
    public Date getDate()
    {
        return this.date;
    }
    
    public Integer getSeats()
    {
        return this.seats;
    }
    
    public Timestamp getTimestamp()
    {
        return this.timestamp;
    }   
    
}
