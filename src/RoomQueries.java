/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



public class RoomQueries 
{
    private static Connection connection;
    private static ArrayList<String> allPossibleRoom = new ArrayList<String>();
    private static ArrayList<String> rooms = new ArrayList<String>();
    private static PreparedStatement addRoom;
    private static PreparedStatement dropRoom;
    private static PreparedStatement getAllPossibleRoom;
    private static PreparedStatement getAllRooms;
    private static ResultSet resultSet;
    
    public static ArrayList<String> getAllPossibleRoom(Integer seats)
    {
        connection = DBConnection.getConnection();
        
        //get all the room into a list
        ArrayList<String> allPossibleRoom = new ArrayList<String>();
        ArrayList<String> reservedRooms = new ArrayList<String>();
        
        try
        {
            getAllPossibleRoom = connection.prepareStatement("select name from rooms where seats >= (?) order by seats");
            getAllPossibleRoom.setInt(1, seats);
            resultSet = getAllPossibleRoom.executeQuery();
            
            while(resultSet.next())
            {
                allPossibleRoom.add(resultSet.getString(1));
            }
                       

        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }       
                   
        return allPossibleRoom;   

    }   
    
    public static ArrayList<String> getAllRooms()
    {
        connection = DBConnection.getConnection();
        ArrayList<String> rooms = new ArrayList<String>();
        try
        {
            getAllRooms = connection.prepareStatement("select name from rooms order by name");
            resultSet = getAllRooms.executeQuery();
                                
            while(resultSet.next())
            {
                rooms.add(resultSet.getString(1));
            }

        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return rooms;
        
    }
    
    public static void addRoom(RoomEntry roomEntry)
    {
        connection = DBConnection.getConnection();
        try
        {
            addRoom = connection.prepareStatement("INSERT into rooms (name, seats) values (?, ?)");
            addRoom.setString(1, roomEntry.getName());
            addRoom.setInt(2, roomEntry.getSeats());
            addRoom.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }        
    }
    
    public static void dropRoom(String roomName)
    {
        connection = DBConnection.getConnection();
        try
        {
            dropRoom = connection.prepareStatement("DELETE from rooms where (name) = ?");
            dropRoom.setString(1, roomName);
            dropRoom.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        } 
    }  
    
    
}
