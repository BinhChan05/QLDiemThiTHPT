package Models;

import DBConnection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MarksSheet {
    Connection con = dbConnection.getConnection();
    PreparedStatement ps, ps2;
    
    public void getMarksSheet(JTable table, String cid) {
        String s1 = "",s2 = "", s3 = "";
        try {
            ps = con.prepareStatement("select * from subcomb where cid = ?");
            ps.setString(1, cid);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                s1 = String.valueOf(rs.getString(2));
                s2 = String.valueOf(rs.getString(3));
                s3 = String.valueOf(rs.getString(4));
            }
            
            ps2 = con.prepareStatement("select * from score where " +
"  CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE ?" +
"  and CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE ?" +
"  and CONCAT(sub1, sub2, sub3, sub4, sub5, sub6) LIKE ?" +
"ORDER BY student_id DESC;");
            
            
            ps2.setString(1, "%" + s1 + "%");
            ps2.setString(2, "%" + s2 + "%");
            ps2.setString(3, "%" + s3 + "%");
            ResultSet rs2 = ps2.executeQuery();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            Object[] row;
            while (rs2.next()) {
                row = new Object[9];
                row[0] = rs2.getInt(1);
                row[1] = rs2.getString(2);
                row[2] = s1;
                row[3] = rs2.getDouble(rs.getInt(5));
                row[4] = s2;
                row[5] = rs2.getDouble(rs.getInt(6));
                row[6] = s3;
                row[7] = rs2.getDouble(rs.getInt(7));
                row[8] = rs2.getDouble(rs.getInt(5)) + rs2.getDouble(rs.getInt(6)) + rs2.getDouble(rs.getInt(7));             
                model.addRow(row);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MarksSheet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
