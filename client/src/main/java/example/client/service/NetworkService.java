package example.client.service;


import example.domain.Command;

public interface NetworkService {

    void sendCommand(Command command);

    String readCommandResult();

    void closeConnection();

}
