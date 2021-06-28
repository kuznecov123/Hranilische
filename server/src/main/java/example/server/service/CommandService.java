package example.server.service;

import example.domain.Command;

public interface CommandService {

    String processCommand(Command command);

    String getCommand();

}
