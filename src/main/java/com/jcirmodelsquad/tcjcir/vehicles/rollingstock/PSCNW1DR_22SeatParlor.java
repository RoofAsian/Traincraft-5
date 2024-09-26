package com.jcirmodelsquad.tcjcir.vehicles.rollingstock;

import net.minecraft.world.World;
import train.common.api.AbstractPassengerCar;

public class PSCNW1DR_22SeatParlor extends AbstractPassengerCar
{

	public PSCNW1DR_22SeatParlor(World world)
	{
		super(world);
	}

	public PSCNW1DR_22SeatParlor(World world, double posX, double posY, double posZ)
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
		return 3.85F;
	}
}