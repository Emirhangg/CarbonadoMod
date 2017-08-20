package net.insane96mcp.carbonado.init;

import net.insane96mcp.carbonado.Carbonado;
import net.insane96mcp.carbonado.item.*;
import net.insane96mcp.carbonado.lib.MaterialHandler;
import net.insane96mcp.carbonado.lib.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {
	
	public static ItemCarbonado carbonadoItem;
	
	public static ItemCarbonadoPickaxe carbonadoPickaxeItem;
	public static ItemCarbonadoShovel carbonadoShovelItem;
	public static ItemCarbonadoAxe carbonadoAxeItem;
	public static ItemCarbonadoHoe carbonadoHoeItem;
	public static ItemCarbonadoSword carbonadoSwordItem;

	public static ItemCarbonadoArmor carbonadoHelmetItem;
	public static ItemCarbonadoArmor carbonadoChestplateItem;
	public static ItemCarbonadoArmor carbonadoLeggingsItem;
	public static ItemCarbonadoArmor carbonadoBootsItem;
	
	public static void Init() {
		carbonadoItem = new ItemCarbonado(Names.CARBONADO_ITEM, CreativeTabs.MATERIALS);
		GameRegistry.register(carbonadoItem);

		carbonadoPickaxeItem = new ItemCarbonadoPickaxe(Names.CARBONADO_PICKAXE, MaterialHandler.Carbonado, CreativeTabs.TOOLS);
		GameRegistry.register(carbonadoPickaxeItem);

		carbonadoShovelItem = new ItemCarbonadoShovel(Names.CARBONADO_SHOVEL, MaterialHandler.Carbonado, CreativeTabs.TOOLS);
		GameRegistry.register(carbonadoShovelItem);

		carbonadoAxeItem = new ItemCarbonadoAxe(Names.CARBONADO_AXE, MaterialHandler.Carbonado, CreativeTabs.TOOLS);
		GameRegistry.register(carbonadoAxeItem);
		
		carbonadoHoeItem = new ItemCarbonadoHoe(Names.CARBONADO_HOE, MaterialHandler.Carbonado, CreativeTabs.TOOLS);
		GameRegistry.register(carbonadoHoeItem);
		
		carbonadoSwordItem = new ItemCarbonadoSword(Names.CARBONADO_SWORD, MaterialHandler.Carbonado, CreativeTabs.COMBAT);
		GameRegistry.register(carbonadoSwordItem);

		carbonadoHelmetItem = new ItemCarbonadoArmor(Names.CARBONADO_HELMET, MaterialHandler.carbonadoArmorMaterial, 0, EntityEquipmentSlot.HEAD);
		GameRegistry.register(carbonadoHelmetItem);

		carbonadoChestplateItem = new ItemCarbonadoArmor(Names.CARBONADO_CHESTPLATE, MaterialHandler.carbonadoArmorMaterial, 0, EntityEquipmentSlot.CHEST);
		GameRegistry.register(carbonadoChestplateItem);

		carbonadoLeggingsItem = new ItemCarbonadoArmor(Names.CARBONADO_LEGGINGS, MaterialHandler.carbonadoArmorMaterial, 1, EntityEquipmentSlot.LEGS);
		GameRegistry.register(carbonadoLeggingsItem);

		carbonadoBootsItem = new ItemCarbonadoArmor(Names.CARBONADO_BOOTS, MaterialHandler.carbonadoArmorMaterial, 0, EntityEquipmentSlot.FEET);
		GameRegistry.register(carbonadoBootsItem);
	}
	
	public static void PostInit() {
		GameRegistry.addShapelessRecipe(new ItemStack(carbonadoItem, 9), ModBlocks.carbonadoBlock);
		GameRegistry.addSmelting(ModBlocks.carbonadoOre, new ItemStack(carbonadoItem), 3.0f);

		GameRegistry.addRecipe(new ItemStack(carbonadoPickaxeItem), "vvv", " s ", " s ", 'v', carbonadoItem, 's', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(carbonadoShovelItem), " v ", " s ", " s ", 'v', carbonadoItem, 's', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(carbonadoAxeItem), " vv", " sv", " s ", 'v', carbonadoItem, 's', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(carbonadoHoeItem), " vv", " s ", " s ", 'v', carbonadoItem, 's', Items.STICK);
		GameRegistry.addRecipe(new ItemStack(carbonadoSwordItem), " v ", " v ", " s ", 'v', carbonadoItem, 's', Items.STICK);

		GameRegistry.addRecipe(new ItemStack(carbonadoHelmetItem), "vvv", "v v", 'v', carbonadoItem);
		GameRegistry.addRecipe(new ItemStack(carbonadoChestplateItem), "v v", "vvv", "vvv", 'v', carbonadoItem);
		GameRegistry.addRecipe(new ItemStack(carbonadoLeggingsItem), "vvv", "v v", "v v", 'v', carbonadoItem);
		GameRegistry.addRecipe(new ItemStack(carbonadoBootsItem), "v v", "v v", 'v', carbonadoItem);
	}
	
	@SideOnly(Side.CLIENT)
	public static void InitClient(ItemModelMesher mesher) {
		ModelResourceLocation modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_ITEM);
		ModelLoader.registerItemVariants(carbonadoItem, modelResourceLocation);
		mesher.register(carbonadoItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_PICKAXE);
		ModelLoader.registerItemVariants(carbonadoPickaxeItem, modelResourceLocation);
		mesher.register(carbonadoPickaxeItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_SHOVEL);
		ModelLoader.registerItemVariants(carbonadoShovelItem, modelResourceLocation);
		mesher.register(carbonadoShovelItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_AXE);
		ModelLoader.registerItemVariants(carbonadoAxeItem, modelResourceLocation);
		mesher.register(carbonadoAxeItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_HOE);
		ModelLoader.registerItemVariants(carbonadoHoeItem, modelResourceLocation);
		mesher.register(carbonadoHoeItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_SWORD);
		ModelLoader.registerItemVariants(carbonadoSwordItem, modelResourceLocation);
		mesher.register(carbonadoSwordItem, 0, modelResourceLocation);

		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_HELMET);
		ModelLoader.registerItemVariants(carbonadoHelmetItem, modelResourceLocation);
		mesher.register(carbonadoHelmetItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_CHESTPLATE);
		ModelLoader.registerItemVariants(carbonadoChestplateItem, modelResourceLocation);
		mesher.register(carbonadoChestplateItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_LEGGINGS);
		ModelLoader.registerItemVariants(carbonadoLeggingsItem, modelResourceLocation);
		mesher.register(carbonadoLeggingsItem, 0, modelResourceLocation);
		
		modelResourceLocation = new ModelResourceLocation(Carbonado.RESOURCE_PREFIX + Names.CARBONADO_BOOTS);
		ModelLoader.registerItemVariants(carbonadoBootsItem, modelResourceLocation);
		mesher.register(carbonadoBootsItem, 0, modelResourceLocation);
	}
}