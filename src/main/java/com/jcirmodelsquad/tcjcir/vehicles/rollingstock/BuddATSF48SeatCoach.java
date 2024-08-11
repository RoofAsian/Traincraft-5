package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class BuddATSF48SeatCoach extends AbstractPassengerCar
{

	public BuddATSF48SeatCoach(World world)
	{
		super(world);
	}

	public BuddATSF48SeatCoach(World world, double posX, double posY, double posZ)
	{
		super(world, posX, posY, posZ);
	}

	@Override
	public double getAdditionalYOffset()
	{
		return -0.1F;
	}

	@Override
	public float getOptimalLinkingDistance()
	{
		return 3.73F;
	}
}