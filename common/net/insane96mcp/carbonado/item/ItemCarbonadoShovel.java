package net.insane96mcp.carbonado.item;

import net.insane96mcp.carbonado.Carbonado;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemCarbonadoShovel extends ItemSpade{
	public ItemCarbonadoShovel(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		setRegistryName(name);
		setCreativeTab(tab);
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return "item." + Carbonado.RESOURCE_PREFIX + net.insane96mcp.carbonado.lib.Names.CARBONADO_SHOVEL;
	}
}