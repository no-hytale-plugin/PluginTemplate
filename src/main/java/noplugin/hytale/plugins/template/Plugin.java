package noplugin.hytale.plugins.template;

import com.hypixel.hytale.server.core.command.system.CommandManager;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import noplugin.hytale.plugins.template.commands.HelloWorldCommand;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import java.util.logging.Level;

public class Plugin extends JavaPlugin {

    public Plugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        setupCommands();
        getLogger().at(Level.INFO).log("Plugin is setup.");
    }

    @Override
    protected void start() {
        getLogger().at(Level.INFO).log("Plugin is started.");
    }

    private void setupCommands() {
        CommandManager.get().register(new HelloWorldCommand());
    }
}
