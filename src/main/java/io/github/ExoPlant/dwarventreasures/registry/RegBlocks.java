package io.github.ExoPlant.dwarventreasures.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class RegBlocks
{
	public static Block MITHRIL_BLOCK = new Block(QuiltBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F));

	public static void registerBlocks()
	{
		regBlock("mithril_block", MITHRIL_BLOCK, true, ItemGroup.BUILDING_BLOCKS);
	}
	public static void regBlock(String id, Block block, boolean blockItem, ItemGroup group) {
		Registry.register(Registry.BLOCK, id, block);
		if (blockItem) {
			Registry.register(Registry.ITEM, id, new Item(new QuiltItemSettings().group(group)));
		}
	}
}
