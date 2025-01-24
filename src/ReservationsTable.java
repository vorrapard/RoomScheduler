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

public class ReservationsTable 
{
    private static Connection connection;
    private static ResultSet resultSet;
    private static PreparedStatement displayReservationsTable;
    private static String tableData = "";    
    
    public static String displayReservationsTable()
    {
        connection = DBConnection.getConnection();

        try
        {
            displayReservationsTable = connection.prepareStatement("select faculty,room,date,seats from reservations order by date");
            resultSet = displayReservationsTable.executeQuery();
            
            //get resultSet metadata
            ResultSetMetaData metaData = resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();
            
            //Add the table header
            tableData = "Faculty\tRoom\tDate\tSeats Rquested\n\n";
            
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
