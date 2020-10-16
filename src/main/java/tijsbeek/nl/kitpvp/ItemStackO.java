package tijsbeek.nl.kitpvp;

import org.bukkit.inventory.ItemStack;

public class ItemStackO {
    ItemStack itemStack;
    int index;

    public ItemStackO(ItemStack itemStack, int index) {
        this.itemStack = itemStack;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public ItemStack getItemStack() {
        return itemStack;
    }
}
