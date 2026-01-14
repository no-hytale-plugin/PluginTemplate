package noplugin.hytale.plugins.template;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import java.util.logging.Level;

public class Plugin extends JavaPlugin {

    public Plugin(@NonNullDecl JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        getLogger().at(Level.INFO).log("Setting up plugin...");
    }

    @Override
    protected void start() {
        getLogger().at(Level.INFO).log("Starting up plugin...");
    }
}
