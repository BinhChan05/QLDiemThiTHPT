package Models;

import DBConnection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Subject {

    Connection con = dbConnection.getConnection();
    PreparedStatement ps;

    public void insert(int id, String sname, String test) {

        String sql = "insert into subject values(?,?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setString(2, sname);
            ps.setString(3, "Toán");
            ps.setString(4, "Văn");
            ps.setString(5, "Anh");

            if (test.equals("Tự nhiên")) {
                ps.setString(6, "Lý");
                ps.setString(7, "Hóa");
                ps.setString(8, "Sinh");
            } else {
                ps.setString(6, "Sử");
                ps.setString(7, "Địa");
                ps.setString(8, "GDCD");
            }

            if (ps.executeUpdate() > 0) {

            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public void update(int id, String sname, String test) {

        String sql = "update subject set name = ?, sub4 = ?, sub5 = ?,"
        + "sub6 =  ? where student_id = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, sname);

            if (test.equals("Tự nhiên")) {
                ps.setString(2, "Lý");
                ps.setString(3, "Hóa");
                ps.setString(4, "Sinh");
            } else {
                ps.setString(2, "Sử");
                ps.setString(3, "Địa");
                ps.setString(4, "GDCD");
            }
            ps.setInt(5, id);

            if (ps.executeUpdate() > 0) {

            }

        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
