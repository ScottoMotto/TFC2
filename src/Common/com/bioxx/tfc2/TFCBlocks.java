package com.bioxx.tfc2;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.bioxx.tfc2.Blocks.Terrain.BlockDirt;
import com.bioxx.tfc2.Blocks.Terrain.BlockGrass;
import com.bioxx.tfc2.Blocks.Terrain.BlockGravel;
import com.bioxx.tfc2.Blocks.Terrain.BlockRubble;
import com.bioxx.tfc2.Blocks.Terrain.BlockSand;
import com.bioxx.tfc2.Blocks.Terrain.BlockStone;
import com.bioxx.tfc2.Items.ItemBlocks.ItemSoil;
import com.bioxx.tfc2.Items.ItemBlocks.ItemStone;

public class TFCBlocks
{
	public static Block Dirt;
	public static Block Grass;
	public static Block Stone;
	public static Block Rubble;
	public static Block Sand;
	public static Block Gravel;

	public static void LoadBlocks()
	{
		System.out.println(new StringBuilder().append("[TFC2] Loading Blocks").toString());

		Dirt = new BlockDirt().setHardness(2F).setStepSound(Block.soundTypeGravel).setUnlocalizedName("dirt");
		Grass = new BlockGrass().setHardness(2F).setStepSound(Block.soundTypeGrass).setUnlocalizedName("grass");
		Stone = new BlockStone().setHardness(20F).setStepSound(Block.soundTypeStone).setUnlocalizedName("stone");
		Rubble = new BlockRubble().setHardness(10F).setStepSound(Block.soundTypeStone).setUnlocalizedName("rubble");
		Sand = new BlockSand().setHardness(1F).setStepSound(Block.soundTypeSand).setUnlocalizedName("sand");
		Gravel = new BlockGravel().setHardness(1F).setStepSound(Block.soundTypeGravel).setUnlocalizedName("gravel");
	}

	public static void RegisterBlocks()
	{
		System.out.println(new StringBuilder().append("[TFC2] Registering Blocks").toString());

		GameRegistry.registerBlock(Dirt, ItemSoil.class, "Dirt");
		GameRegistry.registerBlock(Grass, ItemSoil.class, "Grass");
		GameRegistry.registerBlock(Stone, ItemStone.class, "Stone");
		GameRegistry.registerBlock(Rubble, ItemStone.class, "Rubble");
		GameRegistry.registerBlock(Sand, ItemStone.class, "Sand");
		GameRegistry.registerBlock(Gravel, ItemStone.class, "Gravel");
	}
}
