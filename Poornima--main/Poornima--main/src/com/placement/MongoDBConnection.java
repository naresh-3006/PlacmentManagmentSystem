package com.placement;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoDBConnection {

    private static MongoClient client;
    private static MongoDatabase database;

    public static MongoDatabase getDatabase() {

        if (database == null) {

        	String uri = "mongodb+srv://nareshbanna2610_db_user:ilfRx94V13wpVfcv@cluster0.fqpkttj.mongodb.net/?appName=Cluster0";

            client = MongoClients.create(uri);

            database = client.getDatabase("Poornima");
        }

        return database;
    }

    public static void closeConnection() {

        if (client != null) {
            client.close();
        }
    }
}