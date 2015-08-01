package com.rasmus.bacteriamod.block;

import com.rasmus.bacteriamod.BacteriaMod;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class BlockTestBlock extends Block implements ITileEntityProvider
{
    public BlockTestBlock() {
        super(Material.cloth);
        setUnlocalizedName("test_block");
        setCreativeTab(BacteriaMod.tabBacteria);
    }

    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityBaseBlock();
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
        ItemStack stack = playerIn.getCurrentEquippedItem();
        if(stack != null)
        {
            if(stack.getItem() instanceof ItemCoordinateCache)
            {
                if(stack.getItem().hasEffect(stack))
                {
                    TileEntityBaseBlock tect = (TileEntityBaseBlock) worldIn.getTileEntity(pos);
                    tect.addEntry("poop", stack);
                    stack.stackSize--;
                    playerIn.addChatMessage(new ChatComponentText("Added coords to teleporter"));
                }
            }
        }
        return true;
    }
}
