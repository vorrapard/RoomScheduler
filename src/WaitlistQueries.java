/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class WaitlistQueries 
{
    private static Connection connection;
    private static ArrayList<String> waitlistByDate = new ArrayList<String>();
    private static ArrayList<String> waitlistByFaculty = new ArrayList<String>();
    private static PreparedStatement addWaitlistEntry;
    private static PreparedStatement getWaitlistByDate;
    private static PreparedStatement getWaitlistByFaculty;
    private static PreparedStatement deleteWaitlist;
    private static PreparedStatement reserveFromWaitlist;
    private static ResultSet resultSet;
    
    
    public static void addWaitlistEntry(WaitlistEntry waitlistEntry)
    {
        connection = DBConnection.getConnection();
        try
        {
            addWaitlistEntry = connection.prepareStatement("insert into waitlist (faculty, date, seats, timestamp) values(?,?,?,?)");
            addWaitlistEntry.setString(1, waitlistEntry.getFacultyName());
            addWaitlistEntry.setDate(2, waitlistEntry.getDate());
            addWaitlistEntry.setInt(3, waitlistEntry.getSeats());
            addWaitlistEntry.setTimestamp(4, waitlistEntry.getTimestamp());
            addWaitlistEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }        
    }
    
    public static ArrayList<String> getWaitlistByDate()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> waitlistByDate = new ArrayList<String>();
        try
        {
            getWaitlistByDate = connection.prepareStatement("select name,date,seats from waitlist order by date");
            resultSet = getWaitlistByDate.executeQuery();
            
            while(resultSet.next())
            {
                waitlistByDate.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlistByDate;        
    }
    
    public static ArrayList<String> getWaitlistByFaculty()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> waitlistByFaculty = new ArrayList<String>();
        try
        {
            getWaitlistByFaculty = connection.prepareStatement("select name,date,seats from waitlist order by faculty");
            resultSet = getWaitlistByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                waitlistByFaculty.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return waitlistByFaculty;        
    }
    
    public static void deleteWaitlist(String facultyName, Date date)
    {
        connection = DBConnection.getConnection();

        try
        {
            deleteWaitlist = connection.prepareStatement("DELETE from waitlist where (faculty, date) = (?,?)");
            deleteWaitlist.setString(1, facultyName);
            deleteWaitlist.setDate(2, date);
            deleteWaitlist.executeUpdate();  
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        } 
    }
    
    public static void reserveFromWaitlist()
    {
        connection = DBConnection.getConnection();
        try
        {
            getWaitlistByFaculty = connection.prepareStatement("select name,date,seats from waitlist order by time");
            resultSet = getWaitlistByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                waitlistByFaculty.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
    
}
