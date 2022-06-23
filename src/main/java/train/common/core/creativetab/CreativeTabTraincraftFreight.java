package train.common.core.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.ItemIDs;

public class CreativeTabTraincraftFreight extends CreativeTabs
{
	public CreativeTabTraincraftFreight(int par1, String par2Str)
	{
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack()
	{
		return new ItemStack(ItemIDs.minecartthrall63centerbeam.item);
	}

	@Override
	public String getTranslatedTabLabel()
	{
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem()
	{
		return ItemIDs.minecartthrall63centerbeam.item;
	}
}
