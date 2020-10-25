package com.jo.golfcraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class GolfCraft implements ModInitializer {

	public static final ItemGroup GOLFCRAFT = FabricItemGroupBuilder.build(
            new Identifier("golfcraft", "golf"),
            () -> new ItemStack(GolfCraft.GOLF_CLUB));

	public  static  final  Item GOLF_CLUB= new GolfClub(new Item.Settings().group(GolfCraft.GOLFCRAFT).maxCount(1));
	public static final  Item GOLF_BALL =new GolfBall(new Item.Settings().group(GolfCraft.GOLFCRAFT).maxCount(1));

	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("golfcraft", "golf_club"), GOLF_CLUB);
		Registry.register(Registry.ITEM, new Identifier("golfcraft", "golf_ball"),GOLF_BALL);
	}
}
