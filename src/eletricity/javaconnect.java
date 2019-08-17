package eletricity;

import java.util.*;
import javax.swing.*;
import java.sql.*;

public class javaconnect {
Connection conn = null;
 public static Connection Conecrdb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn=DriverManager.getConnection("jdbc:sqlite:/Users/guneshs/Desktop/dbms/all/eletricity/Database/bill.sqlite");
          
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;

        }

    }

}
