package io.github.burritospigot;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;

public class ExampleMod implements ModInitializer {
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		System.out.println("Hello Fabric world!");
		Item.REGISTRY.add(433, new Identifier("burrito", "chorus_fruit"), new ChorusFruitItem(4, 2.4F, false).setTranslationKey("chorus_fruit").setItemGroup(ItemGroup.FOOD));
	}
}
