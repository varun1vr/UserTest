import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLOutput;

 class App{

    private final String url = "jdbc:postgresql://ec2-23-23-253-106.compute-1.amazonaws.com/dbl7v345qbtn88";
    private final String user = "xmozoqksrukbyt";
    private final String password = "8dfb8cd6217dc0639b5d07e58354956d35f9382238fda29de2e9db240611f1c3";

    /**
     * Connect to the PostgreSQL database
     *
     * @return a Connection object
     */
    public Connection connect() {
        Connection conn = null;

        try {
            Class.forName("com.example.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException c)
        {
            System.out.println(c);
        }

        return conn;
    }

    /**
     * @param args the command line arguments
     */

}