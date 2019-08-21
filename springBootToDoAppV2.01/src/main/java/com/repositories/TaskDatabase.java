//package com.repositories;
//
//import com.domain.Status;
//import com.domain.Task;
//
//import java.sql.*;
//import java.util.ArrayList;
//
//public class TaskDatabase {
//    private static String url = "jdbc:sqlite:testdb.db";
//    private static Connection conn;
//
//    {
//        conn = null;
//        try {
//            conn = DriverManager.getConnection(url);
//            System.out.println("Connection to SQLite has been established.");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    private static void executeSql(String sql) {
//        try (Statement stmt = conn.createStatement()) {
//            stmt.execute(sql);
//        }
//        catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//
//    public static void createNewTableIfNoExists() {
//        String sql = "CREATE TABLE IF NOT EXISTS ToDoList(\n"
//                + "	subject text NOT NULL, \n"
//                + "	status text NOT NULL\n"
//                + ");";
//        executeSql(sql);
//        System.out.println("Table has been created.");
//
//    }
//    public static void dropTable() {
//        String sql = "Drop table ToDoList";
//        executeSql(sql);
//    }
//    public void insert (String taskSubject, Status taskStatus){
//        String sql = "INSERT INTO ToDoList (subject,status) VALUES (?,?)";
//
//        try (PreparedStatement pstmt = conn.prepareStatement(sql)){
//            pstmt.setString(1,taskSubject);
//            pstmt.setObject(2,taskStatus);
//            pstmt.executeUpdate();
//        }catch (SQLException e){
//            System.out.println(e.getMessage());
//        }
//    }
//    public void insertTask(Task task) {
//        this.insert(task.getSubject(),task.getStatus());
//    }
//    public ArrayList<Task> readAllFromDb(){
//        ArrayList<Task> result = new ArrayList<Task>();
//        String sql = "SELECT subject, status FROM ToDoList";
//        try (Statement stmt  = conn.createStatement();
//             ResultSet rs    = stmt.executeQuery(sql)) {
//
//            while (rs.next()) {
//                Task task = new Task(rs.getString("subject"),Status.valueOf(rs.getString("status")));
//                result.add(task);
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//        return result;
//    }
//
//}