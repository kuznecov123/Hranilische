package example.server.service.impl.handler;

import example.domain.Command;
import example.server.factory.Factory;
import example.server.service.CommandDictionaryService;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class CommandInboundHandler extends SimpleChannelInboundHandler<Command> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Command command) {
        CommandDictionaryService dictionaryService = Factory.getCommandDirectoryService();
        System.out.println(command);
        String commandResult = dictionaryService.processCommand(command);

        ctx.writeAndFlush(commandResult);
    }

}
