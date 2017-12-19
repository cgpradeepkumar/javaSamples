package sample.mongodb;

import java.net.UnknownHostException;
import java.util.Date;

import com.mongodb.*;

/**
 * Created by pkumar on 7/11/17.
 */
public class SampleMongoDbClient {

    public static void main(String arg[]) {
        try {
            MongoClient mongoClient = new MongoClient("localhost", 27017);
            DB db = mongoClient.getDB("nodewebappdb");
            DBCollection table = db.getCollection("blobs");

            // create new record
            BasicDBObject document = new BasicDBObject();
            document.put("name", "Java");
            document.put("badge", 20);
            document.put("date", new Date());
//            System.out.println(document);
//            table.insert(document);

            // find and display
            BasicDBObject search = new BasicDBObject();
            search.put("name", "Pradeep");

            DBCursor cursor = table.find(search);
            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }

            System.out.println("-------------------------------------");

            // udpate record
            // step 1
            BasicDBObject query = new BasicDBObject();
            query.put("name", "Pradeep");

            // step 2
            BasicDBObject newObj = new BasicDBObject();
            newObj.put("name", "Pradeepkumar");

            // step 3
            BasicDBObject updateObj = new BasicDBObject();
            updateObj.put("$set", newObj);

            // step 4
            table.update(query, updateObj);

            DBCursor all = table.find();
            while (all.hasNext()) {
                System.out.println(all.next());
            }

            System.out.println("done!");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
