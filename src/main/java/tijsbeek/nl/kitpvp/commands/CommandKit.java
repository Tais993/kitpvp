package tijsbeek.nl.kitpvp.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import tijsbeek.nl.kitpvp.Kit;

public class CommandKit implements CommandExecutor {
    static Kit kit = new Kit();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {

            if (true) {
                kit.addItem(((Player) sender).getInventory().getItemInMainHand(), 1);
            }

            sender.sendMessage("Here you go senpai.");

            kit.givePlayerItems(((Player) sender));
        }
        return true;
    }
}