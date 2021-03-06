package thaumcraftextras.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.world.World;
import thaumcraftextras.helpers.IconHelper;
import thaumcraftextras.register.CreativeTabRegister;

public class TCEBlockEarth extends Block{

	public TCEBlockEarth(int id) {
		super(id, Material.grass);
		setCreativeTab(CreativeTabRegister.tabMain);
		
	}
	
	@Override
    public void registerIcons(IconRegister par1IconRegister) 
	{
        blockIcon = IconHelper.forBlock(par1IconRegister, this);
	}
	
	@Override
	  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
	    {
	        if (!world.isRemote)
	        {
	        	world.setBlock(x -1, y +1, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y +1, z, Block.cactus.blockID);
	        	world.setBlock(x, y +1, z -1, Block.cactus.blockID);
	        	world.setBlock(x, y +1, z +1, Block.cactus.blockID);

	        	world.setBlock(x -1, y, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y , z, Block.cactus.blockID);
	        	world.setBlock(x, y , z -1, Block.cactus.blockID);
	        	world.setBlock(x, y, z +1, Block.cactus.blockID);
	        	
	        	world.setBlock(x -1, y +2, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y +2, z, Block.cactus.blockID);
	        	world.setBlock(x, y +2, z -1, Block.cactus.blockID);
	        	world.setBlock(x, y +2, z +1, Block.cactus.blockID);
	        }
	    }
	
	@Override
    public void onEntityWalking(World world, int x, int y, int z, Entity entity) 
	{
		  if (!world.isRemote)
	        {
	        	world.setBlock(x -1, y +1, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y +1, z, Block.cactus.blockID);
	        	world.setBlock(x, y +1, z -1, Block.cactus.blockID);
	        	world.setBlock(x, y +1, z +1, Block.cactus.blockID);

	        	world.setBlock(x -1, y, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y , z, Block.cactus.blockID);
	        	world.setBlock(x, y , z -1, Block.cactus.blockID);
	        	world.setBlock(x, y, z +1, Block.cactus.blockID);
	        	
	        	world.setBlock(x -1, y +2, z, Block.cactus.blockID);
	        	world.setBlock(x +1, y +2, z, Block.cactus.blockID);
	        	world.setBlock(x, y +2, z -1, Block.cactus.blockID);
	        	world.setBlock(x, y +2, z +1, Block.cactus.blockID);
	        }
	}
}