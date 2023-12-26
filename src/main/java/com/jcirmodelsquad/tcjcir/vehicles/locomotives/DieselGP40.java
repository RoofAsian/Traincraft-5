package com.jcirmodelsquad.tcjcir.vehicles.locomotives;

import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;
import train.common.Traincraft;
import train.common.api.DieselTrain;
import train.common.api.LiquidManager;
import train.common.library.EnumTrains;
import train.common.library.GuiIDs;

public class DieselGP40 extends DieselTrain {
    public DieselGP40(World world) {
        super(world, EnumTrains.GP40.getTankCapacity(), LiquidManager.dieselFilter());
        initLoco();
        textureDescriptionMap.put(0, "Wisconsin Central (FrankenForty)");
        textureDescriptionMap.put(1, "Wisconsin Central");
        textureDescriptionMap.put(2, "Seaboard System");
        textureDescriptionMap.put(3, "Blandsville & Blankerston");
        textureDescriptionMap.put(4, "Paradox Rail");
        textureDescriptionMap.put(5, "Western Pacific 1776");
        textureDescriptionMap.put(6, "Western Pacific");
        textureDescriptionMap.put(7, "Western Pacific");
        textureDescriptionMap.put(8, "are there any more Western Pacifics i should know about");
        textureDescriptionMap.put(9, "Western Pacific");
        textureDescriptionMap.put(10, "Burlington Northern");
        textureDescriptionMap.put(11, "Chicago, Burlington & Quincy");
        textureDescriptionMap.put(12, "Morristown Tenneva & Southern");
        textureDescriptionMap.put(13, "Avanste Northeastern");
        textureDescriptionMap.put(14, "Avanste Northeastern (Snow Service)");
        textureDescriptionMap.put(15, "Suffern Hoboken Interstate Transfer");
        textureDescriptionMap.put(16, "CSXT (YNsomething)");
        textureDescriptionMap.put(17, "Amtrak (PH III)");
        textureDescriptionMap.put(18, "Norfolk Southern");
        textureDescriptionMap.put(19, "Deadwood & La Mesa");
        textureDescriptionMap.put(20, "New York Central");
        textureDescriptionMap.put(21, "New York Central");
        textureDescriptionMap.put(22, "Athearn RTR GP40 (Avanste Northeastern)");
        textureDescriptionMap.put(23, "Great Lakes & Northern Territories");
        textureDescriptionMap.put(24, "DRGW (big logo)");
        textureDescriptionMap.put(25, "DRGW (small logo)");
        textureDescriptionMap.put(26, "Florida East Coast");
        textureDescriptionMap.put(27, "Westrn Maryland");
        textureDescriptionMap.put(28, "Milwaukee Road");
        textureDescriptionMap.put(29, "Milwaukee Road (Billboard)");
        textureDescriptionMap.put(30, "North Fox (Kit-80)");
    }
    public DieselGP40(World world, double d, double d1, double d2){
        this(world);
        setPosition(d, d1 + yOffset, d2);
        motionX = 0.0D;
        motionY = 0.0D;
        motionZ = 0.0D;
        prevPosX = d;
        prevPosY = d1;
        prevPosZ = d2;
    }

    public void initLoco() {
        fuelTrain = 0;
        locoInvent = new ItemStack[inventorySize];
    }

    @Override
    public void updateRiderPosition() {
        if (riddenByEntity == null) {return;}
        double pitchRads = this.anglePitchClient * Math.PI / 180.0D;
        double distance = 2.9;
        double yOffset = 0.15;
        float rotationCos1 = (float) Math.cos(Math.toRadians(this.renderYaw + 90));
        float rotationSin1 = (float) Math.sin(Math.toRadians((this.renderYaw + 90)));
        if(side.isServer()){
            rotationCos1 = (float) Math.cos(Math.toRadians(this.serverRealRotation + 90));
            rotationSin1 = (float) Math.sin(Math.toRadians((this.serverRealRotation + 90)));
            anglePitchClient = serverRealPitch*60;
        }
        float pitch = (float) (posY + ((Math.tan(pitchRads) * distance) + getMountedYOffset())
                + riddenByEntity.getYOffset() + yOffset);
        float pitch1 = (float) (posY + getMountedYOffset() + riddenByEntity.getYOffset() + yOffset);
        double bogieX1 = (this.posX + (rotationCos1 * distance));
        double bogieZ1 = (this.posZ + (rotationSin1* distance));
        if(anglePitchClient>20 && rotationCos1 == 1){
            bogieX1-=pitchRads*2;
            pitch-=pitchRads*1.2;
        }
        if(anglePitchClient>20 && rotationSin1 == 1){
            bogieZ1-=pitchRads*2 + 1;
            pitch-=pitchRads*1.2;
        }
        if (pitchRads == 0.0) {
            riddenByEntity.setPosition(bogieX1, pitch1, bogieZ1);
        }
        if (pitchRads > -1.01 && pitchRads < 1.01) {
            riddenByEntity.setPosition(bogieX1, pitch, bogieZ1);
        }
    }
    @Override
    public void setDead() {
        super.setDead();
        isDead = true;
    }

    @Override
    public void pressKey(int i) {
        if (i == 7 && riddenByEntity != null && riddenByEntity instanceof EntityPlayer) {
            ((EntityPlayer) riddenByEntity).openGui(Traincraft.instance, GuiIDs.LOCO, worldObj, (int) this.posX, (int) this.posY, (int) this.posZ);
        }
    }

    @Override
    public void onUpdate() {
        checkInvent(locoInvent[0]);
        super.onUpdate();
    }

    @Override
    protected void writeEntityToNBT(NBTTagCompound nbttagcompound) {
        super.writeEntityToNBT(nbttagcompound);

        nbttagcompound.setShort("fuelTrain", (short) fuelTrain);
        NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < locoInvent.length; i++) {
            if (locoInvent[i] != null) {
                NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte) i);
                locoInvent[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag(nbttagcompound1);
            }
        }
        nbttagcompound.setTag("Items", nbttaglist);
    }

    @Override
    protected void readEntityFromNBT(NBTTagCompound nbttagcompound) {
        super.readEntityFromNBT(nbttagcompound);

        fuelTrain = nbttagcompound.getShort("fuelTrain");
        NBTTagList nbttaglist = nbttagcompound.getTagList("Items", Constants.NBT.TAG_COMPOUND);
        locoInvent = new ItemStack[getSizeInventory()];
        for (int i = 0; i < nbttaglist.tagCount(); i++) {
            NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            int j = nbttagcompound1.getByte("Slot") & 0xff;
            if (j >= 0 && j < locoInvent.length) {
                locoInvent[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }

    @Override
    public float getOptimalDistance(EntityMinecart cart) { return 1.25F;
    }

    @Override
    public int getSizeInventory() {
        return inventorySize;
    }

    @Override
    public String getInventoryName() {
        return "EMD GP40";
    }

    @Override
    public boolean isItemValidForSlot(int p_94041_1_, ItemStack p_94041_2_) {
        return false;
    }

    @Override
    public boolean interactFirst(EntityPlayer entityplayer) {
        playerEntity = entityplayer;
        if ((super.interactFirst(entityplayer))) {
            return false;
        }
        if (!worldObj.isRemote) {
            if (riddenByEntity != null && (riddenByEntity instanceof EntityPlayer) && riddenByEntity != entityplayer) {
                return true;
            }
            entityplayer.mountEntity(this);
        }
        return true;
    }
    @Override
    public boolean canBeAdjusted(EntityMinecart cart) {
        return canBeAdjusted;
    }

}
