package SQL;

import java.sql.*;
import java.util.Scanner;

public class Update {
    public static void main(String[] args) {
        try(
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "");
                Statement stmt = conn.createStatement();
                PreparedStatement sqlUpdate = conn.prepareStatement("update customers set CompanyName = ? where CustomerID = ?");
                Scanner sc = new Scanner(System.in)
        ){
            conn.setAutoCommit(false);
            //Nhập
            System.out.printf("CompanyName muốn sửa thành : ");
            String a = sc.nextLine();
            System.out.printf("CustomerID cần chỉnh sửa : ");
            String b = sc.nextLine();
//
//            //Truyền vào
            sqlUpdate.setString(1, a);
            sqlUpdate.setString(2, b);
            int row = sqlUpdate.executeUpdate();
            System.out.println(row + " dòng đã được chỉnh sửa");

            ResultSet rset = stmt.executeQuery("select * from customers");
            ResultSetMetaData rsetMD = rset.getMetaData();
            int colums = rsetMD.getColumnCount();

            for (int i = 1; i <= colums; ++i){
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            System.out.println();
            for (int i = 1; i <= colums; ++i){
                System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
            }
            System.out.println();
            while (rset.next()){
                for (int i = 1; i <= colums; ++i){
                    System.out.printf("%-30s", rset.getString(i));
                }
                System.out.println();
            }

        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
