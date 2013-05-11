/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi.msacess;

import java.sql.*;
/**
 *
 * @author phantom
 */
public class KoneksiMsAcess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        
        Connection conn = null;
        
            String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
            String url = "jdbc:odbc:fff";
            String user = "aad";
            String pass = "adad";
 
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e) {
            System.out.println("SQLException: "+e.getMessage());
            System.out.println("SQLState: "+e.getSQLState());
            System.out.println("VendorError: "+e.getErrorCode());
        }
    }
}
