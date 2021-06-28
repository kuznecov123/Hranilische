package example.server;

import example.server.factory.Factory;

public class Main {

    public static void main(String[] args) {
        Factory.getServerService().startServer();
    }

}
