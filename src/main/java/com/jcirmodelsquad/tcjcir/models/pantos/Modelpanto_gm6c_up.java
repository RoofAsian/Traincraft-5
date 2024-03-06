//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: panto_gm6c_up
// Model Creator: 
// Created on: 05.03.2024 - 21:54:58
// Last changed on: 05.03.2024 - 21:54:58

package com.jcirmodelsquad.tcjcir.models.pantos; //Path where the model is located

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;

public class Modelpanto_gm6c_up extends ModelConverter //Same as Filename
{
	int textureX = 128;
	int textureY = 64;

	public Modelpanto_gm6c_up() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[40];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 118
		bodyModel[1] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 119
		bodyModel[2] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 120
		bodyModel[3] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 121
		bodyModel[4] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 122
		bodyModel[5] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 123
		bodyModel[6] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 124
		bodyModel[7] = new ModelRendererTurbo(this, 48, 26, textureX, textureY); // Box 125
		bodyModel[8] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[9] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[10] = new ModelRendererTurbo(this, 37, 36, textureX, textureY); // Lift motors
		bodyModel[11] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Lift motors
		bodyModel[12] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 8, 33, textureX, textureY); // Box 20
		bodyModel[14] = new ModelRendererTurbo(this, 37, 36, textureX, textureY); // Lift motors
		bodyModel[15] = new ModelRendererTurbo(this, 38, 33, textureX, textureY); // Lift motors
		bodyModel[16] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 14, 33, textureX, textureY); // Box 18
		bodyModel[20] = new ModelRendererTurbo(this, 13, 28, textureX, textureY); // Box 2
		bodyModel[21] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 3
		bodyModel[22] = new ModelRendererTurbo(this, 38, 26, textureX, textureY, "cull"); // Cull arm rotaty
		bodyModel[23] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Head collector
		bodyModel[24] = new ModelRendererTurbo(this, 13, 5, textureX, textureY); // Head collector
		bodyModel[25] = new ModelRendererTurbo(this, 1, 14, textureX, textureY, "cull"); // Cull top arm
		bodyModel[26] = new ModelRendererTurbo(this, 42, 4, textureX, textureY, "cull"); // Head collector cull
		bodyModel[27] = new ModelRendererTurbo(this, 1, 3, textureX, textureY, "cull"); // Head collector cull
		bodyModel[28] = new ModelRendererTurbo(this, 13, 28, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 12, 26, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 38, 26, textureX, textureY, "cull"); // Cull arm rotaty
		bodyModel[31] = new ModelRendererTurbo(this, 35, 5, textureX, textureY); // Head collector
		bodyModel[32] = new ModelRendererTurbo(this, 13, 5, textureX, textureY); // Head collector
		bodyModel[33] = new ModelRendererTurbo(this, 1, 14, textureX, textureY, "cull"); // Cull top arm
		bodyModel[34] = new ModelRendererTurbo(this, 42, 4, textureX, textureY, "cull"); // Head collector cull
		bodyModel[35] = new ModelRendererTurbo(this, 1, 3, textureX, textureY, "cull"); // Head collector cull
		bodyModel[36] = new ModelRendererTurbo(this, 18, 5, textureX, textureY, "cull"); // Box 105 cull
		bodyModel[37] = new ModelRendererTurbo(this, 18, 5, textureX, textureY, "cull"); // Box 107 cull
		bodyModel[38] = new ModelRendererTurbo(this, 18, 9, textureX, textureY, "cull"); // Box 110 cull
		bodyModel[39] = new ModelRendererTurbo(this, 18, 9, textureX, textureY, "cull"); // Box 111 cull

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 118
		bodyModel[0].setRotationPoint(-23F, -20.5F, 1.75F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 119
		bodyModel[1].setRotationPoint(-23F, -20.5F, -2.75F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 120
		bodyModel[2].setRotationPoint(-15F, -20.5F, 1.75F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 121
		bodyModel[3].setRotationPoint(-15F, -20.5F, -2.75F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 122
		bodyModel[4].setRotationPoint(-26F, -20.5F, -2.75F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 123
		bodyModel[5].setRotationPoint(-26F, -20.5F, 1.75F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 124
		bodyModel[6].setRotationPoint(-34F, -20.5F, 1.75F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 125
		bodyModel[7].setRotationPoint(-34F, -20.5F, -2.75F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[8].setRotationPoint(-30.5F, -21.5F, -1.5F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[9].setRotationPoint(-27F, -21.5F, -1.5F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Lift motors
		bodyModel[10].setRotationPoint(-27.5F, -20.75F, -1F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Lift motors
		bodyModel[11].setRotationPoint(-29.5F, -20.25F, -0.5F);

		bodyModel[12].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[12].setRotationPoint(-18.5F, -21.5F, -1.5F);

		bodyModel[13].addBox(0F, 0F, 0F, 1, 1, 3, 0F); // Box 20
		bodyModel[13].setRotationPoint(-22F, -21.5F, -1.5F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Lift motors
		bodyModel[14].setRotationPoint(-23.5F, -20.75F, -1F);

		bodyModel[15].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Lift motors
		bodyModel[15].setRotationPoint(-21.5F, -20.25F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[16].setRotationPoint(-34.25F, -21.5F, 1.75F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[17].setRotationPoint(-34.25F, -21.5F, -2.75F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[18].setRotationPoint(-23.75F, -21.5F, -2.75F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F, 0.125F, 0.25F, 0.25F); // Box 18
		bodyModel[19].setRotationPoint(-23.75F, -21.5F, 1.75F);

		bodyModel[20].addShapeBox(-10F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 2
		bodyModel[20].setRotationPoint(-29.4F, -20.5F, 0F);
		bodyModel[20].rotateAngleZ = -0.61086524F;

		bodyModel[21].addShapeBox(-13F, 0F, -0.5F, 13, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[21].setRotationPoint(-26.6F, -21.5F, 0F);
		bodyModel[21].rotateAngleZ = -0.59341195F;

		bodyModel[22].addShapeBox(-0.5F, -3F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Cull arm rotaty
		bodyModel[22].setRotationPoint(-37F, -25.5F, 0F);
		bodyModel[22].rotateAngleZ = -0.05235988F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head collector
		bodyModel[23].setRotationPoint(-26.49F, -39F, -5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head collector
		bodyModel[24].setRotationPoint(-26.49F, -39F, 4F);

		bodyModel[25].addShapeBox(0F, -0.5F, -5F, 15, 1, 10, 0F,0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F, 0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F); // Cull top arm
		bodyModel[25].setRotationPoint(-37F, -27.5F, 0F);
		bodyModel[25].rotateAngleZ = 0.75049158F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F); // Head collector cull
		bodyModel[26].setRotationPoint(-26.5F, -39.01F, -5F);

		bodyModel[27].addShapeBox(5F, -1.5F, 0F, 1, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.5F); // Head collector cull
		bodyModel[27].setRotationPoint(-37F, -27.5F, -3F);
		bodyModel[27].rotateAngleZ = 0.75049158F;

		bodyModel[28].addShapeBox(-10F, -0.5F, -0.5F, 11, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F); // Box 2
		bodyModel[28].setRotationPoint(-18.6F, -20.5F, 0F);
		bodyModel[28].rotateAngleZ = -2.53072742F;

		bodyModel[29].addShapeBox(-13F, 0F, -0.5F, 13, 0, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 3
		bodyModel[29].setRotationPoint(-21.4F, -21.5F, 0F);
		bodyModel[29].rotateAngleZ = -2.54818071F;

		bodyModel[30].addShapeBox(-0.5F, -3F, -1.5F, 1, 3, 3, 0F,0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F); // Cull arm rotaty
		bodyModel[30].setRotationPoint(-11F, -25.5F, 0F);
		bodyModel[30].rotateAngleZ = 0.05235988F;

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head collector
		bodyModel[31].setRotationPoint(-22.51F, -39F, 4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Head collector
		bodyModel[32].setRotationPoint(-22.51F, -39F, -5F);

		bodyModel[33].addShapeBox(0F, -0.5F, -5F, 15, 1, 10, 0F,0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F, 0F, 0F, -3.775F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.775F); // Cull top arm
		bodyModel[33].setRotationPoint(-11F, -27.5F, 0F);
		bodyModel[33].rotateAngleZ = 2.39110108F;

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F, 0F, -1F, 4F); // Head collector cull
		bodyModel[34].setRotationPoint(-22.5F, -39.01F, -5F);

		bodyModel[35].addShapeBox(-6F, -1.5F, 0F, 1, 1, 6, 0F,0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F); // Head collector cull
		bodyModel[35].setRotationPoint(-11F, -27.5F, -3F);
		bodyModel[35].rotateAngleZ = -0.75049158F;

		bodyModel[36].addShapeBox(0F, -0.5F, 0F, 5, 1, 2, 0F,0F, 0F, 0.4F, 0.5F, -0.75F, -0.1F, 0.5F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0.5F, 0.75F, -0.1F, 0.5F, 0.75F, -0.5F, 0F, 0F, 0F); // Box 105 cull
		bodyModel[36].setRotationPoint(-11F, -27.5F, -0.8F);
		bodyModel[36].rotateAngleZ = 2.39110108F;

		bodyModel[37].addShapeBox(0F, -0.5F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0.75F, -0.5F, 0.5F, 0.75F, -0.1F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0.5F, -0.75F, -0.5F, 0.5F, -0.75F, -0.1F, 0F, 0F, 0.4F); // Box 107 cull
		bodyModel[37].setRotationPoint(-37F, -27.5F, -1.2F);
		bodyModel[37].rotateAngleZ = 0.75049158F;

		bodyModel[38].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, -0.75F, 1.375F, 0F, 0F, 4.75F, 0F, 0F, 2.375F, 0F, -0.75F, -1F, 0F, 0.75F, 1.375F, 0F, 0F, 4.75F, 0F, 0F, 2.375F, 0F, 0.75F, -1F); // Box 110 cull
		bodyModel[38].setRotationPoint(-11F, -27.5F, 0.7F);
		bodyModel[38].rotateAngleZ = 2.39110108F;

		bodyModel[39].addShapeBox(5.5F, -0.5F, 0F, 6, 1, 1, 0F,0F, 0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, 3.75F, 0F, 0.75F, 0.375F, 0F, -0.75F, 0F, 0F, 0F, 3.375F, 0F, 0F, 3.75F, 0F, -0.75F, 0.375F); // Box 111 cull
		bodyModel[39].setRotationPoint(-37F, -27.5F, -0.7F);
		bodyModel[39].rotateAngleZ = 0.75049158F;
	}
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {

		for(ModelRendererTurbo m :bodyModel) {
			if(m.boxName.equals("lamp")){
				Minecraft.getMinecraft().entityRenderer.disableLightmap(1D);
				m.render(f5);
				Minecraft.getMinecraft().entityRenderer.enableLightmap(1D);
			}else if(m.boxName.equals("cull")){
				GL11.glDisable(GL11.GL_CULL_FACE);
				m.render(f5);
				GL11.glEnable(GL11.GL_CULL_FACE);
			}else{
				m.render(f5);
			}
		}
	}
}