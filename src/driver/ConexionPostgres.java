/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alejandro
 */
public class ConexionPostgres {

    static String  driverPATH = "org.postgresql.Driver";
      static String driver = "jdbc:postgresql://";
      
    static String ipDatabase = "localhost";
    static String port = "5432";
    static String bd = "alejandro";

    static String login = "alejandro";
    static String password = "alejandro";
  

    String url = driver + ipDatabase + ":" + port + "/" + bd;

    Connection conn = null;

    /**
     * Constructor de DbConnection
     */
    public ConexionPostgres() {
        try {
            //obtenemos el driver de para mysql
            Class.forName(driverPATH);
            //obtenemos la conexi�n
            conn = DriverManager.getConnection(url, login, password);

            if (conn != null) {
                System.out.println("Conecci�n a base de datos " + bd + " OK");
            }
        } catch (SQLException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Permite retornar la conexi�n
     */
    public Connection getConnection() {
        return conn;
    }

    public void desconectar() {
        conn = null;
    }

}
