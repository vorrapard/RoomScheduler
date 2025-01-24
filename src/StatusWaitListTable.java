/*
 * Vorrapard Kumthongdee
 * CMPSC221, Fall 2020 Penn State
 * Assignment 6: Room Scheduler
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StatusWaitListTable 
{
    private static Connection connection;
    private static ResultSet resultSet;
    private static PreparedStatement displayStatusWaitListTable;
    private static String tableData = "";    
    
    public static String displayStatusWaitListTable(String faculty)
    {
        connection = DBConnection.getConnection();

        try
        {
            displayStatusWaitListTable = connection.prepareStatement("select faculty,date,seats,timestamp from waitlist where (faculty) = (?) order by timestamp");
            displayStatusWaitListTable.setString(1, faculty);
            resultSet = displayStatusWaitListTable.executeQuery();
            
            //get resultSet metadata
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            //Add the table header
            tableData = "Wait List\nFaculty\tDate\tSeats Requested\tTimestamp\n\n";
            
            //Add query data
            while (resultSet.next())
            {
                for(int i = 1; i <= numberOfColumns; i++)
                {
                    Object temp = resultSet.getObject(i);
                    tableData = tableData + temp + ("\t");
                }
                tableData = tableData + "\n";
            }            

        }
        catch(SQLException sqlException)
        {
            sqlException.printStackTrace();
        }       
        
        return tableData;
    }   

}
