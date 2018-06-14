package de.dodoswelt.minidodo;

import org.bukkit.configuration.file.FileConfiguration;

import java.io.File;
import java.sql.*;
import java.util.HashMap;

public class MySQL {
/*    private static HashMap<String, String> Daten = new HashMap<String, String>();
    private static String host, user, password,database;
    private static int port;
    //String = DB_NAME
    public static Connection openConnection(){

    }
    public MySQL(){
        config.createcfg(new File("configs/","database.cfg"), "SQL");
        try {
            cfg = config.getCfg("SQL");
        } catch (UnknownFileException e) {
            System.err.println("FILE NOT FOUND EXCEPTION - AT MySQL.CLASS");
        }
        String db = "MySQL.";
        cfg.addDefault(db + "host", "localhost");
        cfg.addDefault(db + "port", 3306);
        cfg.addDefault(db + "user", "user");
        cfg.addDefault(db + "password", "password");
        cfg.addDefault(db + "database", "database");
        cfg.options().copyDefaults(true);

        config.saveConfig();
        config.clean();
        this.host = cfg.getString(db +"host");
        this.port = cfg.getInt(db +"port");
        this.user = cfg.getString(db +"user");
        this.password = cfg.getString(db +"password");
        this.database = cfg.getString(db +"database");
        this.conn = this.openConnection();
    }*/
    //    private String host, user, password, database;
//    private int port;
//    private Connection conn;
//    private config config = new config();
//    private FileConfiguration cfg;
//
//
//    /**
//     *
//     * Connection Data is saved in the config, only access able by Minidodo ;P
//     *
//     * **/
//    public MySQL(){
//        cfg = config.getConfig(new File("configs/","database.cfg"));
//        String db = "MySQL.";
//        cfg.addDefault(db + "host", "localhost");
//        cfg.addDefault(db + "port", 3306);
//        cfg.addDefault(db + "user", "user");
//        cfg.addDefault(db + "password", "password");
//        cfg.addDefault(db + "database", "database");
//        cfg.options().copyDefaults(true);
//
//        config.saveConfig();
//        config.clean();
//        this.host = cfg.getString(db +"host");
//        this.port = cfg.getInt(db +"port");
//        this.user = cfg.getString(db +"user");
//        this.password = cfg.getString(db +"password");
//        this.database = cfg.getString(db +"database");
//        this.conn = this.openConnection();
//    }
//
//    public Connection openConnection() {
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.user, this.password);
//
//            this.conn = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.port + "/" + this.database, this.user, this.password);
//
//        }catch(Exception e){
//            new sysout(e.getMessage());
//        }
//        return conn;
//    }
//    public Connection getConnection(){
//        return this.conn;
//    }
//    @SuppressWarnings("all")
//    public boolean hasConnection(){
//        try {
//            return this.conn != null || this.conn.isValid(28800);
//
//        } catch (SQLException e) {
//            return false;
//        }
//    }
//    public void queryUpdate(String query){
//        openConnection();
//        Connection conn = this.conn;
//        PreparedStatement ps = null;
//        try {
//            ps = conn.prepareStatement(query);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            new syserr("[ERROR] SQLExeption:queryupdate");
//        }finally{
//            try {
//                this.closeResources(null, ps);
//            }catch (Exception e){
//                new sysout(e.getMessage());
//            }
//        }
//    }
//    public void closeResources(ResultSet rs, PreparedStatement ps) throws SQLException{
//        if(rs != null){
//            rs.close();
//        }
//        if(ps !=null){
//            ps.close();
//
//        }
//    }
//    public void closeConnection(){
//        try {
//            this.conn.close();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally{
//            this.conn = null;
//        }
//    }

}
