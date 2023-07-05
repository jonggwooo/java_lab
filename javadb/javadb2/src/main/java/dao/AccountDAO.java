package dao;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// DB 접근 미들웨어
// SRP (Single Responsibility Principle) 단일책임의 원칙
// Data Access Object
public class AccountDAO {
    public void update(int accountBalance, int accountNumber
    ){Connection conn = DBConnection.getInstance();

        // 2. 버퍼로 SQL 쓰기
        try {
            String sql = "Update account_tb set account_balance = ? where account_number = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,accountBalance);
            statement.setInt(2,accountNumber);

            int result = statement.executeUpdate(); // flush (변경된 row 카운트를 응답)
            System.out.println("결과 : "+result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void delete(int accountNumber){
        Connection conn = DBConnection.getInstance();

        // 2. 버퍼로 SQL 쓰기
        try {
            String sql = "Delete from account_tb where account_number = ?"; //쿼리
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, accountNumber); // 자바

            int result = statement.executeUpdate(); // flush (변경된 row 카운트를 응답)
            System.out.println("결과 : " + result);
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void selectOne(){}

    public void selectAll(){}
    public void insert(int accountNumber,String accountPassword, int balance){



        // 1. DB 연결
        Connection conn = DBConnection.getInstance();

        // 2. 버퍼로 SQL 쓰기
        try {
            String sql = "insert into account_tb(account_number, account_password, account_balance, account_created_at) values(?,?,?,now())";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,accountNumber);
            statement.setString(2,accountPassword);
            statement.setInt(3,balance);

            int result = statement.executeUpdate(); // flush (변경된 row 카운트를 응답)
            System.out.println("결과 : "+result);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
