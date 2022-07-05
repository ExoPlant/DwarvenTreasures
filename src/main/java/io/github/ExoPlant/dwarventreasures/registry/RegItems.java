package io.github.ExoPlant.dwarventreasures.registry;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RegItems
{
	public static Item MITHRIL_INGOT = new Item(new QuiltItemSettings().group(ItemGroup.MATERIALS));
	public static void regItem(String id, Item item) {
		Registry.register(Registry.ITEM, id, item);
	}
}
