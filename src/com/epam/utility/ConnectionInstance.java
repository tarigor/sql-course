package com.epam.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionInstance {
    private String url;
    private Properties propertiesFile;
    Connection connection;

    public Connection ConnectionCreator(String url, Properties propertiesFile) {
        this.url = url;
        this.propertiesFile = propertiesFile;
        try {
            this.connection = DriverManager.getConnection(url,propertiesFile);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
