import java.sql.*;

class JDBC {
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/LIBRARYDB";
        String username = "root";
        String password = "pune@100";
        String query = "select * from SIULIBRARY";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");
 
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String name = rs.getString("lname");   // <- use pname
                System.out.println(name);
            }

            rs.close();
            st.close();
            con.close();

            System.out.println("Connection closed.......");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}