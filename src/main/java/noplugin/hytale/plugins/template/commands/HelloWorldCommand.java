package noplugin.hytale.plugins.template.commands;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.AbstractCommand;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

import java.util.concurrent.CompletableFuture;

public class HelloWorldCommand extends AbstractCommand {

    public HelloWorldCommand() {
        super("hello-world", "Sends a hello world to the command sender");
    }

    @NullableDecl
    @Override
    protected CompletableFuture<Void> execute(@NonNullDecl CommandContext commandContext) {
        commandContext.sendMessage(Message.raw("Hello, world!"));
        return CompletableFuture.completedFuture(null);
    }
}
