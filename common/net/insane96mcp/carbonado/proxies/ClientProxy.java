package net.insane96mcp.carbonado.proxies;

import net.insane96mcp.carbonado.init.ModBlocks;
import net.insane96mcp.carbonado.init.ModItems;
import net.insane96mcp.carbonado.lib.Properties;
import net.minecraft.client.Minecraft;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void PreInit(FMLPreInitializationEvent event) {
		super.PreInit(event);
		Properties.Init();
	}

	@Override
	public void Init(FMLInitializationEvent event) {
		super.Init(event);
		ModItems.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
		ModBlocks.InitClient(Minecraft.getMinecraft().getRenderItem().getItemModelMesher());
	}

	@Override
	public void PostInit(FMLPostInitializationEvent event) {
		super.PostInit(event);
	}
	
}
