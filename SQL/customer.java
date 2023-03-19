package SQL;

import java.sql.*;

public class customer {
    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
            PreparedStatement stmt = conn.prepareStatement("select CustomerID, CompanyName, ContactName, ContactTitle, Address * from customers");
            PreparedStatement pstmt = conn.prepareStatement("insert into customers values (?,?,?,?,?,?,?,?,?,?,?)");
            PreparedStatement sqlUpdate = conn.prepareStatement("update customers set ContactName = ? where CustomerID = ?");
            PreparedStatement sqlDelete = conn.prepareStatement("delete from customers where CustomerID = ?");
        ){
            conn.setAutoCommit(false);
            pstmt.setString(1, "ANOS");
            pstmt.setString(2, "Magnus");
            pstmt.setString(3, "Do Quang Dai");
            pstmt.setString(4, "Dev");
            pstmt.setString(5, "Yen Phong");
            pstmt.setString(6, "Bac Ninh");
            pstmt.setString(7, null);
            pstmt.setString(8, "9009");
            pstmt.setString(9, "Viet Nam");
            pstmt.setString(10, "037-7817172");
            pstmt.setString(11, "098-7654321");
            int row = pstmt.executeUpdate();
            System.out.println(row + " dòng đã được thêm vào");

            pstmt.setString(1, "MNAG");
            pstmt.setString(2,"");
            row = pstmt.executeUpdate();
            System.out.println(row + " dòng đã được sửa");

            //sửa
            sqlUpdate.setString(1, "Magnuss");
            sqlUpdate.setString(2, "ANUS");
            int roww = sqlUpdate.executeUpdate();
            System.out.println(roww + " dòng đã được cập nhật");
//
//            //xóa
            sqlDelete.setString(1,"ANUS");
            int rowww = sqlDelete.executeUpdate();
            System.out.println(rowww + " dòng đã được xóa");

//            in ra
            ResultSet rset = stmt.executeQuery();
            while (rset.next()){
                System.out.println(rset.getString("CustomerID") + ", "
                        + rset.getString("CompanyName") + ", "
                        + rset.getString("ContactName") + ", "
                        + rset.getString("ContactTitle") + ", "
                        + rset.getString("Address"));
//                        + rset.getString("City") + ", "
//                        + rset.getString("Region") + ", "
//                        + rset.getString("PostalCode") + ", "
//                        + rset.getString("Country") + ", "
//                        + rset.getString("Phone") + ", "
//                        + rset.getString("Fax"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
