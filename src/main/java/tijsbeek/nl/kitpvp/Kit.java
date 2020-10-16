package tijsbeek.nl.kitpvp;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.ArrayList;

public class Kit {

    private final ArrayList<ItemStackO> itemsInKit = new ArrayList<>();

    public void addItem(ItemStack itemStack, int index) {
        System.out.println(index);
        System.out.println(itemStack);

        itemsInKit.add(new ItemStackO(itemStack, index));
    }

    public ArrayList<ItemStackO> getItemsInKit() {
        return itemsInKit;
    }

    public void givePlayerItems(Player player) {
        PlayerInventory inventory = player.getInventory();
        inventory.clear();

        itemsInKit.forEach((itemStackO -> inventory.setItem(itemStackO.getIndex(), itemStackO.getItemStack())));
    }
}
