package tijsbeek.nl.kitpvp;

import org.bukkit.plugin.java.JavaPlugin;
import tijsbeek.nl.kitpvp.commands.CommandKit;

public final class Kitpvp extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getCommand("kit").setExecutor(new CommandKit());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
