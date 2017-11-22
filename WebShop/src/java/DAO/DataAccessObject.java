package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataAccessObject {
    private final DBConnector conn;

    public DataAccessObject() throws Exception {
        this.conn = new DBConnector();
    }
    
//    public Dept getDept(int id) throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from dept where deptno = " + id;
//        Dept dept = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                int deptno = rs.getInt("deptno");
//                String dname = rs.getString("dname");
//                String location = rs.getString("loc");
//                dept = new Dept(deptno, dname, location);
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return dept;
//
//    }
//    
//        public Emp getEmp(int id) throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from emp where empno = " + id;
//        Emp emp = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            if (rs.next()) {
//                int empno = rs.getInt("empno");
//                String ename = rs.getString("ename");
//                String deptno = rs.getString("deptno");
//                emp = new Emp(empno, ename, deptno);
//                
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return emp;
//
//    }
//
//    ArrayList<Dept> getAllDepts() throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from dept";
//        ArrayList<Dept> depts = new ArrayList<Dept>();
//        Dept dept = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                int deptno = rs.getInt("deptno");
//                String dname = rs.getString("dname");
//                String location = rs.getString("loc");
//                dept = new Dept(deptno, dname, location);
//                depts.add(dept);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return depts;
//    }
//        ArrayList<Emp> getAllEmp() throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from emp";
//        ArrayList<Emp> emps = new ArrayList<Emp>();
//        Emp emp = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                int empno = rs.getInt("empno");
//                String ename = rs.getString("ename");
//                String deptno = rs.getString("deptno");
//                emp = new Emp(empno, ename, deptno);
//                emps.add(emp);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return emps;
//    }
}
