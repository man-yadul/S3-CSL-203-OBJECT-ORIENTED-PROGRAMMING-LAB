import java.sql.*;

public class Database {
    public static void main(String args[]) {
        try {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Inspiron/Documents/StudentDatabase.accdb");
            Statement statement = connection.createStatement();
            
            statement.executeUpdate("CREATE TABLE Student (Name CHAR(20), RollNo INT, Mark1 FLOAT, Mark2 FLOAT, Mark3 FLOAT);");
            statement.executeUpdate("INSERT INTO Student VALUES (\"Mike\", 1, 47.43, 82.34, 78.43);");
            statement.executeUpdate("INSERT INTO Student VALUES (\"Trevor\", 2, 78.54, 95.23, 56.78);");
            statement.executeUpdate("INSERT INTO Student VALUES (\"Steve\", 3, 98.23, 45.87, 71.45);");
            statement.executeUpdate("INSERT INTO Student VALUES (\"Charlie\", 4, 56.90, 44.65, 81.72);");
            statement.executeUpdate("INSERT INTO Student VALUES (\"Adam\", 5, 33.87, 96.70, 69.32);");
            
            ResultSet rs = statement.executeQuery("Select * FROM Student");
            
            System.out.println("Student Table:\nName\t\tRoll No.\tMark - 1\tMark - 2\tMark - 3");
            while (rs.next())
                System.out.println(rs.getString(1) + "\t\t" + rs.getInt(2) + "\t\t" + rs.getFloat(3) + "\t\t" + rs.getFloat(4) + "\t\t" + rs.getFloat(5));
            
            statement.executeUpdate("CREATE TABLE RankList (Name CHAR(20), RollNo INT);");
            statement.executeUpdate("INSERT INTO RankList SELECT Name, RollNo FROM Student ORDERBY (Mark1 + Mark2 + Mark3) DESC;");
            
            rs = statement.executeQuery("Select * FROM RankList");
            System.out.println("\nRanklist Table:\nName\t\tRoll No.");
            while (rs.next())
                System.out.println(rs.getString(1) + "\t\t" + rs.getInt(2));
            
            statement.close();
            connection.close();
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
    }
}
