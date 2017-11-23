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

    public Glass getGlass(String name) throws Exception {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from glass where glass_name = " + name;
        Glass glass = null;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int glass_id = rs.getInt("glass_id");
                String glass_name = rs.getString("glass_name");
                int glass_price = rs.getInt("glass_price");
                String glass_desp = rs.getString("glass_desp");
                glass = new Glass(glass_id, glass_name, glass_price, glass_desp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }

        return glass;

    }

    public Frame getFrame(String name) throws Exception {
        Statement stmt = conn.getConnection().createStatement();
        String sql = "select * from frame where frame_name = " + name;
        Frame frame = null;
        try {
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                int frame_id = rs.getInt("frame_id");
                String frame_name = rs.getString("frame_name");
                int frame_price = rs.getInt("frame_price");
                String frame_desp = rs.getString("frame_desp");
                frame = new Frame(frame_id, frame_name, frame_price, frame_desp);

            }
        } catch (SQLException ex) {
            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
        }

        return frame;

    }

//    ArrayList<Glass> getAllGlass() throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from glass";
//        ArrayList<Glass> glasses = new ArrayList<Glass>();
//        Glass glass = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                int glass_id = rs.getInt("glass_id");
//                String glass_name = rs.getString("glass_name");
//                int glass_price = rs.getInt("glass_price");
//                String glass_desp = rs.getString("glass_desp");
//                glass = new Glass(glass_id, glass_name, glass_price, glass_desp);
//                glasses.add(glass);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return glasses;
//    }
//
//    ArrayList<Frame> getAllFrame() throws Exception {
//        Statement stmt = conn.getConnection().createStatement();
//        String sql = "select * from frame";
//        ArrayList<Frame> frames = new ArrayList<Frame>();
//        Frame frame = null;
//        try {
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) {
//                int frame_id = rs.getInt("frame_id");
//                String frame_name = rs.getString("frame_name");
//                int frame_price = rs.getInt("frame_price");
//                String frame_desp = rs.getString("frame_desp");
//                frame = new Frame(frame_id, frame_name, frame_price, frame_desp);
//                frames.add(frame);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DataAccessObject.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return frames;
//    }
}
