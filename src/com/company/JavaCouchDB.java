import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ektorp.CouchDbConnector;
import org.ektorp.CouchDbInstance;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.ektorp.support.DesignDocument;
public class JavaCouchDB {
    public static void main(String[] args) throws MalformedURLException {
//--------------- Creating Connection--------------------------//
        HttpClient httpClient = new StdHttpClient.Builder()
                .url("http://localhost:5984")
                .username("admin")
                .password("admin")
                .build();
        CouchDbInstance dbInstance = new StdCouchDbInstance(httpClient);
//--------------- Creating database----------------------------//
        CouchDbConnector db = new StdCouchDbConnector("couchdb_demo", dbInstance);
        db.createDatabaseIfNotExists();
    }
}