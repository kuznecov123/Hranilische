package example.server.factory;

import example.server.service.CommandDictionaryService;
import example.server.service.CommandService;
import example.server.service.ServerService;
import example.server.service.impl.CommandDictionaryServiceImpl;
import example.server.service.impl.NettyServerService;
import example.server.service.impl.command.ViewFilesInDirCommand;

import java.util.Arrays;
import java.util.List;

public class Factory {

    public static ServerService getServerService() {
        return new NettyServerService();
    }

    public static CommandDictionaryService getCommandDirectoryService() {
        return new CommandDictionaryServiceImpl();
    }

    public static List<CommandService> getCommandServices() {
        return Arrays.asList(new ViewFilesInDirCommand());
    }

}
