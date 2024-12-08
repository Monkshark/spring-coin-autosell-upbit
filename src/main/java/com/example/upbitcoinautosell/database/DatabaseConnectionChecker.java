package com.example.upbitcoinautosell.database;

import javax.sql.DataSource;
import java.sql.Connection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class DatabaseConnectionChecker implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(DatabaseConnectionChecker.class);

    private final DataSource dataSource;

    @Autowired
    public DatabaseConnectionChecker(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void run(String... args) {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                logger.info("Successfully connected to MySQL database.");
            } else {
                logger.error("Failed to connect to MySQL database.");
            }
        } catch (Exception e) {
            logger.error("Database connection test failed.", e);
        }
    } 
}
 