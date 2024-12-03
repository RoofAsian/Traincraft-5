package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.Freight;
import train.common.library.GuiIDs;

public class PS2_4750 extends Freight implements IInventory {
	public int freightInventorySize;
	public int numFreightSlots;
	EntityPlayer playerEntity;

	public PS2_4750(World world) {
		super(world);
		initFreightGrain();
		textureDescriptionMap.put(0, "Blandsville & Blankerston");
		textureDescriptionMap.put(1, "Generic Tan / Foxmann Industries");
		textureDescriptionMap.put(2, "KSFX 'Seed Co-Op'");
		textureDescriptionMap.put(3, "KSFX 'Seed Co-Op'");
		textureDescriptionMap.put(4, "FNCC (Carbo Service)");
		textureDescriptionMap.put(5, "SNEED'S");
		textureDescriptionMap.put(6, "UP");
		textureDescriptionMap.put(7, "UP (But Boring)");
		textureDescriptionMap.put(8, "CRIPple");
		textureDescriptionMap.put(9, "The COCK!!!1!");
		textureDescriptionMap.put(10, "MILW");
		textureDescriptionMap.put(11, "MILW but Intermountain fucked up apparently");
		textureDescriptionMap.put(12, "Far-Mar CO-OP");
		textureDescriptionMap.put(13, "DRGW");
		textureDescriptionMap.put(14, "FW&D");
		textureDescriptionMap.put(15, "BN");
		textureDescriptionMap.put(16, "CNW");
		textureDescriptionMap.put(17, "CNW again");
		textureDescriptionMap.put(18, "PC");
		textureDescriptionMap.put(19, "ATSF");
		textureDescriptionMap.put(20, "CSXT");
		textureDescriptionMap.put(21, "NS");
		textureDescriptionMap.put(22, "Soup");
		textureDescriptionMap.put(23, "MKT");
		textureDescriptionMap.put(24, "RI");
		textureDescriptionMap.put(25, "KCS");
		textureDescriptionMap.put(26, "Washington Grain Train");
		textureDescriptionMap.put(27, "Washington Grain Train (Stale)");
		textureDescriptionMap.put(28, "HRTX (THE GOCK!!!!1!!!1111111111111111111111111111111111111!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!?!11111111111111111!!!!!!!!!!!!!!!!/)");
		textureDescriptionMap.put(29, "GCM");
		textureDescriptionMap.put(30, "Cornhub");
		textureDescriptionMap.put(31, "ATSF again");
		textureDescriptionMap.put(32, "MNS");
		textureDescriptionMap.put(33, "GTW (1972)");
		textureDescriptionMap.put(34, "GTW (1979)");
		textureDescriptionMap.put(35, "MP (Early)");
		textureDescriptionMap.put(36, "MP (Late)");
		textureDescriptionMap.put(37, "ICG");
	}

	public void initFreightGrain() {
		numFreightSlots = 4;
		if(trainSpec!=null)freightInventorySize = trainSpec.getCargoCapacity();
		cargoItems = new ItemStack[freightInventorySize];
	}

	public PS2_4750(World world, double d, double d1, double d2) {
		this(world);
		setPosition(d, d1 + (double) yOffset, d2);
		motionX = 0.0D;
		motionY = 0.0D;
		motionZ = 0.0D;
		prevPosX = d;
		prevPosY = d1;
		prevPosZ = d2;
	}

	@Override
	public void setDead() {
		super.setDead();
		isDead = true;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
		super.writeEntityToNBT(nbttagcompound);

		NBTTagList nbttaglist = new NBTTagList();
		for (int i = 0; i < cargoItems.length; i++) {
			if (cargoItems[i] != null) {
				NBTTagCompound nbttagcompound1 = new NBTTagCompound();
				nbttagcompound1.setByte("Slot", (byte) i);
				cargoItems[i].writeToNBT(nbttagcompound1);
				nbttaglist.appendTag(nbttagcompound1);
			}
		}
		nbttagcompound.setTag("Items", nbttaglist);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
		super.readEntityFromNBT(nbttagcompound);

		NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
		cargoItems = new ItemStack[getSizeInventory()];
		for (int i = 0; i < nbttaglist.tagCount(); i++) {
			NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
			int j = nbttagcompound1.getByte("Slot") & 0xff;
			if (j >= 0 && j < cargoItems.length) {
				cargoItems[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
			}
		}
	}
	@Override
	public String getInventoryName() {
		return "PS2 4750 Cu Ft 3-Bay Hopper";
	}

	@Override
	public int getSizeInventory() {
		return freightInventorySize;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) {
		playerEntity = entityplayer;
		if ((super.interactFirst(entityplayer))) {
			return false;
		}
		if (!this.worldObj.isRemote) {
			entityplayer.openGui(Traincraft.instance, GuiIDs.FREIGHT, worldObj, this.getEntityId(), -1, (int) this.posZ);
		}
		return true;
	}
	@Override
	public float getOptimalDistance(EntityMinecart cart) {
		return 2.75F;
	}

	@Override
	public boolean isItemValidForSlot(int i, ItemStack itemstack) {
		return true;
	}
}