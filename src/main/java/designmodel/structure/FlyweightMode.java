package designmodel.structure;

import java.util.ArrayList;
import java.util.List;

public class FlyweightMode {

    public class Connection{

    }

    public class ConnectionPool{
        List<Connection> connectionList = new ArrayList<>();

        public void addConnection(Connection connection){
            connectionList.add(connection);
        }

        public Connection getConnection(){
            return connectionList.get(connectionList.size()-1);
        }
    }
}
