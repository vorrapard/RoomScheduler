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

public class ReservationQueries 
{
    private static Connection connection;
    private static ArrayList<String> reservationsByDate = new ArrayList<String>();
    private static ArrayList<String> roomsReservedByDate = new ArrayList<String>();
    private static ArrayList<String> reservationsByFaculty = new ArrayList<String>();
    private static PreparedStatement addReservationsEntry;
    private static PreparedStatement getReservationsByDate;
    private static PreparedStatement getRoomsReservedByDate;
    private static PreparedStatement getReservationsByFaculty;
    private static PreparedStatement reservationsTableData;
    private static PreparedStatement deleteReservation;
    private static PreparedStatement checkReservationsFacultyDate;
    private static ResultSet resultSet;
    
    public static void addReservationsEntry(ReservationEntry reservationEntry)
    {
        connection = DBConnection.getConnection();
        try
        {
            addReservationsEntry = connection.prepareStatement("insert into reservations (faculty, room, date, seats, timestamp) values(?,?,?,?,?)");
            addReservationsEntry.setString(1, reservationEntry.getFacultyName());
            addReservationsEntry.setString(2, reservationEntry.getRoom());
            addReservationsEntry.setDate(3, reservationEntry.getDate());
            addReservationsEntry.setInt(4, reservationEntry.getSeats());
            addReservationsEntry.setTimestamp(5, reservationEntry.getTimestamp());
            addReservationsEntry.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }        
    }
    
    public static ArrayList<String> getReservationsByDate()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> reservationsByDate = new ArrayList<String>();
        try
        {
            getReservationsByDate = connection.prepareStatement("select faculty,room,date,seats from reservations order by date");
            resultSet = getReservationsByDate.executeQuery();
            
            while(resultSet.next())
            {
                reservationsByDate.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservationsByDate;
    }  
    
    public static ArrayList<String> getReservationsByFaculty()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> reservationsByFaculty = new ArrayList<String>();
        try
        {
            getReservationsByFaculty = connection.prepareStatement("select faculty,room,date,seats from reservations order by faculty");
            resultSet = getReservationsByFaculty.executeQuery();
            
            while(resultSet.next())
            {
                reservationsByFaculty.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return reservationsByFaculty;
    }
    
    public static ArrayList<String> getRoomsReservedByDate(Date date)
    {
        connection = DBConnection.getConnection();
        ArrayList<String> roomsReservedByDate = new ArrayList<String>();
        try
        {
            getRoomsReservedByDate = connection.prepareStatement("select room from reservations where date = (?) order by faculty");
            getRoomsReservedByDate.setDate(1, date);
            resultSet = getRoomsReservedByDate.executeQuery();
            
            while(resultSet.next())
            {
                roomsReservedByDate.add(resultSet.getString(1));
            }
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return roomsReservedByDate;
    }
    
    public static ResultSet reservationsTableData()
    {
        connection = DBConnection.getConnection();

        try
        {
            reservationsTableData = connection.prepareStatement("select faculty,room,date,seats from reservations order by date");
            resultSet = getRoomsReservedByDate.executeQuery();
            
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return resultSet;
        
    }
    
    public static void deleteReservation(String facultyName, Date date)
    {
        connection = DBConnection.getConnection();

        try
        {
            deleteReservation = connection.prepareStatement("delete from reservations where faculty = " + facultyName + " and date = " + date);
            deleteReservation.executeUpdate();  
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        } 
    }
    
    public static Boolean checkReservationsFacultyDate(String facultyName, Date date)
    {
        connection = DBConnection.getConnection();
        Boolean exist = false;

        try
        {
            checkReservationsFacultyDate = connection.prepareStatement("select faculty from reservations where faculty = ? and date = ?");
            checkReservationsFacultyDate.setString(1, facultyName);
            checkReservationsFacultyDate.setDate(2, date);
            resultSet = checkReservationsFacultyDate.executeQuery();
            
            while(resultSet.next())
            {
                exist = true;
            }
        }
        
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        } 
        
        return exist;

    }
   
}
