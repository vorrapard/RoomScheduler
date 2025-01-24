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
import java.util.Date;


public class Dates extends Date
{
    private static Connection connection;
    private static ArrayList<Date> dates = new ArrayList<Date>();
    private static PreparedStatement addDate;
    private static PreparedStatement getAllDates;
    private static ResultSet resultSet;
    
    public static void addDate(java.sql.Date date)
    {
        connection = DBConnection.getConnection();
        try
        {
            addDate = connection.prepareStatement("insert into dates values (?)");
            addDate.setDate(1, date);
            addDate.executeUpdate();
        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        
    }
    
    public static ArrayList<Date> getAllDates()
    {
        connection = DBConnection.getConnection();
        ArrayList<Date> dates = new ArrayList<Date>();
        try
        {
            getAllDates = connection.prepareStatement("select date from dates order by date");
            resultSet = getAllDates.executeQuery();
                                
            while(resultSet.next())
            {
                dates.add(resultSet.getDate(1));
            }

        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
        return dates;
        
    }

}
