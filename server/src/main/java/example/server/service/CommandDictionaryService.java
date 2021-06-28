package example.server.service;

import example.domain.Command;

public interface CommandDictionaryService {

    String processCommand(Command command);

}
