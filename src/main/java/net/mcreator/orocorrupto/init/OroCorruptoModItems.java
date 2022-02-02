
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.orocorrupto.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.orocorrupto.item.Oro_CorruptoIngotItem;
import net.mcreator.orocorrupto.item.NucleoItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OroCorruptoModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item ORO_CORRUPTO_INGOT = register(new Oro_CorruptoIngotItem());
	public static final Item NUCLEO = register(new NucleoItem());
	public static final Item NUCLEO_ORE = register(OroCorruptoModBlocks.NUCLEO_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
