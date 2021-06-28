package example.client.factory;

import example.client.service.NetworkService;
import example.client.service.impl.IONetworkService;

public class Factory {

    public static NetworkService getNetworkService() {
        return IONetworkService.getInstance();
    }

}
