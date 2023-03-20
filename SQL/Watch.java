package SQL;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.sql.*;
import java.util.Scanner;

public class Watch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/watch","root","");
            do {
                System.out.println("1. Xem sản phẩm\n2. Thêm sản phẩm\n3. Sửa sản phẩm\n4. Xóa sản phẩm\n5. Tìm kiếm sản phẩm");
                System.out.printf("- Nhập lựa chọn: ");
                int a = sc.nextInt();
                sc.nextLine();
                switch (a){
                    case 1:
                        System.out.println("1. Sản phẩm của nam\n2. Sản phẩm của nữ");
                        System.out.printf("- Nhập lựa chọn: ");
                        int a1 = sc.nextInt();
                        sc.nextLine();
                        switch (a1){
                            case 1:
                                String sqlSelect1 = "select * from men_watch;";
                                PreparedStatement pst1 = cn.prepareStatement(sqlSelect1);
                                ResultSet rs1 = pst1.executeQuery();
                                ResultSetMetaData rsetMD = rs1.getMetaData();
                                int colums = rsetMD.getColumnCount();

                                for (int i = 1; i <= colums; ++i){
                                    System.out.printf("%-30s", rsetMD.getColumnName(i));
                                }
                                System.out.println();
                                for (int i = 1; i <= colums; ++i){
                                    System.out.printf("%-30s", "(" + rsetMD.getColumnClassName(i) + ")");
                                }
                                System.out.println();
                                while (rs1.next()){
                                    for (int i = 1; i <= colums; ++i){
                                        System.out.printf("%-30s", rs1.getString(i));
                                    }
                                    System.out.println();
                                }
                                break;
                            case 2:
                                String sqlSelect2 = "select * from women_watch;";
                                PreparedStatement pst2 = cn.prepareStatement(sqlSelect2);
                                ResultSet rs2 = pst2.executeQuery();
                                ResultSetMetaData rsetMD1 = rs2.getMetaData();
                                int colums1 = rsetMD1.getColumnCount();

                                for (int i = 1; i <= colums1; ++i){
                                    System.out.printf("%-30s", rsetMD1.getColumnName(i));
                                }
                                System.out.println();
                                for (int i = 1; i <= colums1; ++i){
                                    System.out.printf("%-30s", "(" + rsetMD1.getColumnClassName(i) + ")");
                                }
                                System.out.println();
                                while (rs2.next()){
                                    for (int i = 1; i <= colums1; ++i){
                                        System.out.printf("%-30s", rs2.getString(i));
                                    }
                                    System.out.println();
                                }
                                break;

                        }
                        break;
                    case 2:
                        System.out.println("1. Thêm sản phẩm nam\n2. Thêm sản phẩm nữ");
                        System.out.printf("- Nhập lựa chọn: ");
                        int b = sc.nextInt();
                        sc.nextLine();
                        switch (b){
                            case 1:
                                System.out.printf("- Nhập ID sản phẩm: ");
                                String id = sc.nextLine();
                                System.out.printf("- Nhập tên sản phẩm: ");
                                String name = sc.nextLine();
                                System.out.printf("- Nhập ID hãng: ");
                                String id1 = sc.nextLine();
                                System.out.printf("- Nhập giá tiền: ");
                                double price = sc.nextDouble();
                                sc.nextLine();
                                System.out.printf("- Nhập số lượng: ");
                                int qty = sc.nextInt();
                                sc.nextLine();
                                String sqlInsert = "insert into men_watch values (?,?,?,?,?)";
                                PreparedStatement pstInsert = cn.prepareStatement(sqlInsert);
                                pstInsert.setString(1,id);
                                pstInsert.setString(2,name);
                                pstInsert.setString(3,id1);
                                pstInsert.setDouble(4,price);
                                pstInsert.setInt(5,qty);
                                System.out.println(sqlInsert);
                                int check = pstInsert.executeUpdate();
                                if(check >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Thêm sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Thêm sản phẩm thất bại!");
                                }
                                break;
                            case 2:
                                System.out.printf("- Nhập ID sản phẩm: ");
                                String id4 = sc.nextLine();
                                System.out.printf("- Nhập tên sản phẩm: ");
                                String name2 = sc.nextLine();
                                System.out.printf("- Nhập ID hãng: ");
                                String id5 = sc.nextLine();
                                System.out.printf("- Nhập giá tiền: ");
                                double price2 = sc.nextDouble();
                                sc.nextLine();
                                System.out.printf("- Nhập số lượng: ");
                                int qty1 = sc.nextInt();
                                sc.nextLine();
                                String sqlInsert1 = "insert into women_watch values (?,?,?,?,?)";
                                PreparedStatement pstInsert1 = cn.prepareStatement(sqlInsert1);
                                pstInsert1.setString(1,id4);
                                pstInsert1.setString(2,name2);
                                pstInsert1.setString(3,id5);
                                pstInsert1.setDouble(4,price2);
                                pstInsert1.setInt(5,qty1);
                                System.out.println(sqlInsert1);
                                int check1 = pstInsert1.executeUpdate();
                                if(check1 >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Thêm sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Thêm sản phẩm thất bại!");
                                }
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("1. Sửa sản phẩm nam\n2. Sửa sản phẩm nữ");
                        System.out.printf("- Nhập lựa chọn: ");
                        int c = sc.nextInt();
                        sc.nextLine();
                        switch (c){
                            case 1:
                                System.out.printf("- Nhập ID sản phẩm cần sửa: ");
                                String id5 = sc.nextLine();
                                System.out.printf("- Nhập giá bán mới: ");
                                double price = sc.nextDouble();
                                sc.nextLine();
                                String sqlUpdate = "update men_watch set Price = ? where ProductID = ?";
                                PreparedStatement pstUpdate = cn.prepareStatement(sqlUpdate);
                                pstUpdate.setDouble(1,price);
                                pstUpdate.setString(2,id5);
                                int check = pstUpdate.executeUpdate();
                                if(check >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Chỉnh sửa sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Chỉnh sửa sản phẩm thất bại!");
                                }
                                break;
                            case 2:
                                System.out.printf("- Nhập ID sản phẩm cần sửa: ");
                                String id6 = sc.nextLine();
                                System.out.printf("- Nhập giá bán mới: ");
                                double price1 = sc.nextDouble();
                                sc.nextLine();
                                String sqlUpdate1 = "update women_watch set Price = ? where ProductID = ?";
                                PreparedStatement pstUpdate1 = cn.prepareStatement(sqlUpdate1);
                                pstUpdate1.setDouble(1,price1);
                                pstUpdate1.setString(2,id6);
                                int check1 = pstUpdate1.executeUpdate();
                                if(check1 >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Chỉnh sửa sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Chỉnh sửa sản phẩm thất bại!");
                                }

                                break;
                        }
                        break;
                    case 4:
                        System.out.println("1. Xóa sản phẩm nam\n2. Xóa sản phẩm nữ");
                        System.out.printf("- Nhập lựa chọn: ");
                        int d = sc.nextInt();
                        sc.nextLine();
                        switch (d){
                            case 1:
                                System.out.printf("- Nhập ID sản phẩm cần xóa: ");
                                String id = sc.nextLine();
                                String sqlDelete = "delete from men_watch where ProductID = ?";
                                PreparedStatement pstUpdate = cn.prepareStatement(sqlDelete);
                                pstUpdate.setString(1,id);
                                int check = pstUpdate.executeUpdate();
                                if(check >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Xóa sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check);
                                    System.out.println("=> Xóa sản phẩm thất bại!");
                                }
                                break;
                            case 2:
                                System.out.printf("- Nhập ID sản phẩm cần xóa: ");
                                String id1 = sc.nextLine();
                                String sqlDelete1 = "delete from women_watch where ProductID = ?";
                                PreparedStatement pstUpdate1 = cn.prepareStatement(sqlDelete1);
                                pstUpdate1.setString(1,id1);
                                int check1 = pstUpdate1.executeUpdate();
                                if(check1 >= 1){
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Xóa sản phẩm thành công!");
                                }else {
                                    System.out.println("- Số dòng bị ảnh hưởng là "+ check1);
                                    System.out.println("=> Xóa sản phẩm thất bại!");
                                }
                                break;
                        }
                        break;
                    case 5:
                        System.out.println("1. Tìm kiếm sản phẩm nam\n2. Tìm kiếm sản phẩm nữ");
                        System.out.printf("- Nhập lựa chọn: ");
                        int e = sc.nextInt();
                        sc.nextLine();
                        switch (e){
                            case 1:
                                System.out.printf("- Nhập ID sản phẩm cần tìm kiếm: ");
                                String id = sc.nextLine();
                                String sqlSearch = "select * from men_watch where ProductID = ?";
                                PreparedStatement pst1 = cn.prepareStatement(sqlSearch);
                                pst1.setString(1,id);
                                ResultSet rs = pst1.executeQuery();
                                int f = 0;
                                while (rs.next()){
                                    String ProductID = rs.getString("ProductID");
                                    String ProductName = rs.getString("ProductName");
                                    String CompanyID = rs.getString("CompanyID");
                                    double Price = rs.getDouble("Price");
                                    int qty = rs.getInt("qty");
                                    System.out.println(ProductID + ", "+ProductName+", "+CompanyID+", "+Price+", "+qty);
                                    ++f;
                                }
                                if(f ==0 ){
                                    System.out.println("=> Sản phẩm này không có trong danh sách!");
                                }

                                break;
                            case 2:
                                System.out.printf("- Nhập ID sản phẩm cần tìm kiếm: ");
                                String id1 = sc.nextLine();
                                String sqlSearch1 = "select * from women_watch where ProductID = ?";
                                PreparedStatement pst2 = cn.prepareStatement(sqlSearch1);
                                pst2.setString(1,id1);
                                ResultSet rs1 = pst2.executeQuery();
                                int f1 = 0;
                                while (rs1.next()){
                                    String ProductID = rs1.getString("ProductID");
                                    String ProductName = rs1.getString("ProductName");
                                    String CompanyID = rs1.getString("CompanyID");
                                    double Price = rs1.getDouble("Price");
                                    int qty = rs1.getInt("qty");
                                    System.out.println(ProductID + ", "+ProductName+", "+CompanyID+", "+Price+", "+qty);
                                    ++f1;
                                }
                                if(f1 ==0 ){
                                    System.out.println("=> Sản phẩm này không có trong danh sách!");
                                }

                                break;
                        }
                        break;

                }
            }while (true);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
