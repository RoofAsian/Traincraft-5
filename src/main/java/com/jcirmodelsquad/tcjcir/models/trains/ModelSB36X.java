//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2024 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SB36X
// Model Creator: bidahochi
// Created on: 10.11.2023 - 10:25:16
// Last changed on: 10.11.2023 - 10:25:16

package com.jcirmodelsquad.tcjcir.models.trains; //Path where the model is located

import com.jcirmodelsquad.tcjcir.models.trucks.ModelBlombergBnew;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelFB2_new;
import com.jcirmodelsquad.tcjcir.models.trucks.ModelTypeBnew;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import tmt.ModelConverter;
import tmt.ModelRendererTurbo;
import tmt.Tessellator;
import train.client.renderhelper.ModelRenderHelper;
import train.common.api.AbstractTrains;
import train.common.enums.BoxName;
import train.common.library.Info;

public class ModelSB36X extends ModelConverter //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSB36X() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[317];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 99, 114, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 101, 156, textureX, textureY); // Box 8
		bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 61
		bodyModel[4] = new ModelRendererTurbo(this, 155, 133, textureX, textureY); // Box 63
		bodyModel[5] = new ModelRendererTurbo(this, 269, 82, textureX, textureY); // Box 156
		bodyModel[6] = new ModelRendererTurbo(this, 146, 132, textureX, textureY); // Box 195
		bodyModel[7] = new ModelRendererTurbo(this, 85, 132, textureX, textureY); // Box 196
		bodyModel[8] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 197
		bodyModel[9] = new ModelRendererTurbo(this, 152, 132, textureX, textureY); // Box 198
		bodyModel[10] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 199
		bodyModel[11] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 200
		bodyModel[12] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 203
		bodyModel[13] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 204
		bodyModel[14] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 205
		bodyModel[15] = new ModelRendererTurbo(this, 101, 105, textureX, textureY); // box65
		bodyModel[16] = new ModelRendererTurbo(this, 96, 134, textureX, textureY); // Box 61
		bodyModel[17] = new ModelRendererTurbo(this, 140, 134, textureX, textureY); // Box 63
		bodyModel[18] = new ModelRendererTurbo(this, 103, 109, textureX, textureY); // Box 80
		bodyModel[19] = new ModelRendererTurbo(this, 74, 133, textureX, textureY); // Box 2603
		bodyModel[20] = new ModelRendererTurbo(this, 87, 132, textureX, textureY); // Box 261
		bodyModel[21] = new ModelRendererTurbo(this, 108, 145, textureX, textureY); // Box 193
		bodyModel[22] = new ModelRendererTurbo(this, 17, 3, textureX, textureY); // Box 2
		bodyModel[23] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 321
		bodyModel[24] = new ModelRendererTurbo(this, 136, 124, textureX, textureY); // Box 298
		bodyModel[25] = new ModelRendererTurbo(this, 100, 124, textureX, textureY); // Box 299
		bodyModel[26] = new ModelRendererTurbo(this, 130, 91, textureX, textureY); // Box 411
		bodyModel[27] = new ModelRendererTurbo(this, 407, 99, textureX, textureY); // Box 412
		bodyModel[28] = new ModelRendererTurbo(this, 111, 99, textureX, textureY, "cull"); // Box 339 cull crossover
		bodyModel[29] = new ModelRendererTurbo(this, 121, 113, textureX, textureY); // Box 300
		bodyModel[30] = new ModelRendererTurbo(this, 115, 113, textureX, textureY); // Box 301
		bodyModel[31] = new ModelRendererTurbo(this, 119, 117, textureX, textureY); // Box 302
		bodyModel[32] = new ModelRendererTurbo(this, 107, 117, textureX, textureY); // Box 303
		bodyModel[33] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 201
		bodyModel[34] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 202
		bodyModel[35] = new ModelRendererTurbo(this, 407, 94, textureX, textureY); // Box 293
		bodyModel[36] = new ModelRendererTurbo(this, 130, 86, textureX, textureY); // Box 294
		bodyModel[37] = new ModelRendererTurbo(this, 224, 156, textureX, textureY); // Box 63
		bodyModel[38] = new ModelRendererTurbo(this, 207, 114, textureX, textureY); // Box 318
		bodyModel[39] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 322
		bodyModel[40] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 757
		bodyModel[41] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 758
		bodyModel[42] = new ModelRendererTurbo(this, 239, 114, textureX, textureY); // Box 440
		bodyModel[43] = new ModelRendererTurbo(this, 176, 116, textureX, textureY); // Box 631
		bodyModel[44] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 882
		bodyModel[45] = new ModelRendererTurbo(this, 240, 120, textureX, textureY); // Box 883
		bodyModel[46] = new ModelRendererTurbo(this, 217, 173, textureX, textureY); // Box 630
		bodyModel[47] = new ModelRendererTurbo(this, 438, 165, textureX, textureY); // Box 215
		bodyModel[48] = new ModelRendererTurbo(this, 433, 128, textureX, textureY); // Box 218
		bodyModel[49] = new ModelRendererTurbo(this, 500, 128, textureX, textureY); // Box 220
		bodyModel[50] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 230
		bodyModel[51] = new ModelRendererTurbo(this, 449, 141, textureX, textureY); // Box 231
		bodyModel[52] = new ModelRendererTurbo(this, 447, 128, textureX, textureY); // Box 256
		bodyModel[53] = new ModelRendererTurbo(this, 487, 139, textureX, textureY); // Box 259
		bodyModel[54] = new ModelRendererTurbo(this, 451, 123, textureX, textureY); // Box 267
		bodyModel[55] = new ModelRendererTurbo(this, 445, 139, textureX, textureY); // Box 269
		bodyModel[56] = new ModelRendererTurbo(this, 491, 127, textureX, textureY); // Box 263
		bodyModel[57] = new ModelRendererTurbo(this, 493, 114, textureX, textureY); // Box 264
		bodyModel[58] = new ModelRendererTurbo(this, 469, 164, textureX, textureY); // Box 273
		bodyModel[59] = new ModelRendererTurbo(this, 17, 11, textureX, textureY); // Box 267
		bodyModel[60] = new ModelRendererTurbo(this, 434, 127, textureX, textureY); // Box 270434
		bodyModel[61] = new ModelRendererTurbo(this, 433, 114, textureX, textureY); // Box 271
		bodyModel[62] = new ModelRendererTurbo(this, 445, 135, textureX, textureY); // Box 320
		bodyModel[63] = new ModelRendererTurbo(this, 448, 138, textureX, textureY); // Box 300
		bodyModel[64] = new ModelRendererTurbo(this, 484, 138, textureX, textureY); // Box 301
		bodyModel[65] = new ModelRendererTurbo(this, 414, 99, textureX, textureY); // Box 413
		bodyModel[66] = new ModelRendererTurbo(this, 137, 91, textureX, textureY); // Box 414
		bodyModel[67] = new ModelRendererTurbo(this, 141, 94, textureX, textureY); // Box 448
		bodyModel[68] = new ModelRendererTurbo(this, 142, 88, textureX, textureY); // Box 450
		bodyModel[69] = new ModelRendererTurbo(this, 143, 86, textureX, textureY); // Box 451
		bodyModel[70] = new ModelRendererTurbo(this, 420, 102, textureX, textureY); // Box 452
		bodyModel[71] = new ModelRendererTurbo(this, 421, 96, textureX, textureY); // Box 454
		bodyModel[72] = new ModelRendererTurbo(this, 422, 94, textureX, textureY); // Box 455
		bodyModel[73] = new ModelRendererTurbo(this, 455, 111, textureX, textureY); // Box 324
		bodyModel[74] = new ModelRendererTurbo(this, 457, 107, textureX, textureY); // Box 325
		bodyModel[75] = new ModelRendererTurbo(this, 475, 107, textureX, textureY); // Box 326
		bodyModel[76] = new ModelRendererTurbo(this, 467, 111, textureX, textureY); // Box 327
		bodyModel[77] = new ModelRendererTurbo(this, 459, 98, textureX, textureY, "cull"); // Box 328 cull crossover
		bodyModel[78] = new ModelRendererTurbo(this, 142, 91, textureX, textureY); // Box 449
		bodyModel[79] = new ModelRendererTurbo(this, 421, 99, textureX, textureY); // Box 453
		bodyModel[80] = new ModelRendererTurbo(this, 414, 94, textureX, textureY); // Box 292
		bodyModel[81] = new ModelRendererTurbo(this, 137, 86, textureX, textureY); // Box 295
		bodyModel[82] = new ModelRendererTurbo(this, 255, 64, textureX, textureY); // Box 251
		bodyModel[83] = new ModelRendererTurbo(this, 260, 118, textureX, textureY); // Box 2
		bodyModel[84] = new ModelRendererTurbo(this, 254, 89, textureX, textureY); // Box 10
		bodyModel[85] = new ModelRendererTurbo(this, 273, 148, textureX, textureY); // Box 157
		bodyModel[86] = new ModelRendererTurbo(this, 273, 139, textureX, textureY); // Box 158
		bodyModel[87] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 382
		bodyModel[88] = new ModelRendererTurbo(this, 334, 117, textureX, textureY); // Box 383
		bodyModel[89] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[90] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[91] = new ModelRendererTurbo(this, 359, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[92] = new ModelRendererTurbo(this, 350, 113, textureX, textureY); // Box 19
		bodyModel[93] = new ModelRendererTurbo(this, 371, 124, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[94] = new ModelRendererTurbo(this, 362, 116, textureX, textureY, "cull"); // Box 305 pipe cull
		bodyModel[95] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 310 cull fueltank support
		bodyModel[96] = new ModelRendererTurbo(this, 314, 117, textureX, textureY, "cull"); // Box 311 cull fueltank support
		bodyModel[97] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[98] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[99] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 19
		bodyModel[100] = new ModelRendererTurbo(this, 329, 117, textureX, textureY); // Box 548
		bodyModel[101] = new ModelRendererTurbo(this, 315, 117, textureX, textureY); // Box 527 why dont you filter some grass instead
		bodyModel[102] = new ModelRendererTurbo(this, 141, 9, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 141, 6, textureX, textureY); // Box 74
		bodyModel[104] = new ModelRendererTurbo(this, 141, 12, textureX, textureY); // Box 78
		bodyModel[105] = new ModelRendererTurbo(this, 6, 156, textureX, textureY); // Box 282
		bodyModel[106] = new ModelRendererTurbo(this, 52, 156, textureX, textureY); // Box 283
		bodyModel[107] = new ModelRendererTurbo(this, 32, 154, textureX, textureY); // Box 448
		bodyModel[108] = new ModelRendererTurbo(this, 65, 154, textureX, textureY); // Box 322
		bodyModel[109] = new ModelRendererTurbo(this, 78, 154, textureX, textureY); // Box 323
		bodyModel[110] = new ModelRendererTurbo(this, 43, 152, textureX, textureY); // Box 280
		bodyModel[111] = new ModelRendererTurbo(this, 89, 152, textureX, textureY); // Box 285
		bodyModel[112] = new ModelRendererTurbo(this, 70, 183, textureX, textureY); // Box 24
		bodyModel[113] = new ModelRendererTurbo(this, 83, 181, textureX, textureY); // Box 25
		bodyModel[114] = new ModelRendererTurbo(this, 19, 154, textureX, textureY); // Box 4
		bodyModel[115] = new ModelRendererTurbo(this, 19, 171, textureX, textureY); // Box 727
		bodyModel[116] = new ModelRendererTurbo(this, 65, 168, textureX, textureY); // Box 728
		bodyModel[117] = new ModelRendererTurbo(this, 52, 170, textureX, textureY); // Box 729
		bodyModel[118] = new ModelRendererTurbo(this, 6, 173, textureX, textureY); // Box 730
		bodyModel[119] = new ModelRendererTurbo(this, 32, 171, textureX, textureY); // Box 731
		bodyModel[120] = new ModelRendererTurbo(this, 43, 169, textureX, textureY); // Box 732
		bodyModel[121] = new ModelRendererTurbo(this, 78, 168, textureX, textureY); // Box 733
		bodyModel[122] = new ModelRendererTurbo(this, 89, 170, textureX, textureY); // Box 734
		bodyModel[123] = new ModelRendererTurbo(this, 96, 183, textureX, textureY); // Box 405
		bodyModel[124] = new ModelRendererTurbo(this, 109, 181, textureX, textureY); // Box 406
		bodyModel[125] = new ModelRendererTurbo(this, 127, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[126] = new ModelRendererTurbo(this, 105, 118, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[127] = new ModelRendererTurbo(this, 413, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[128] = new ModelRendererTurbo(this, 424, 134, textureX, textureY); // Box 398 not a ditchlight will not glow
		bodyModel[129] = new ModelRendererTurbo(this, 1, 123, textureX, textureY); // Box 25
		bodyModel[130] = new ModelRendererTurbo(this, 75, 125, textureX, textureY); // Box 32
		bodyModel[131] = new ModelRendererTurbo(this, 160, 101, textureX, textureY); // Box 36 electrical locker
		bodyModel[132] = new ModelRendererTurbo(this, 117, 55, textureX, textureY); // Box 279
		bodyModel[133] = new ModelRendererTurbo(this, 140, 56, textureX, textureY, "cull"); // Box 329 support cull
		bodyModel[134] = new ModelRendererTurbo(this, 129, 56, textureX, textureY); // Box 330
		bodyModel[135] = new ModelRendererTurbo(this, 114, 55, textureX, textureY); // Box 337
		bodyModel[136] = new ModelRendererTurbo(this, 74, 123, textureX, textureY); // Box 688
		bodyModel[137] = new ModelRendererTurbo(this, 206, 99, textureX, textureY); // Box 37
		bodyModel[138] = new ModelRendererTurbo(this, 240, 99, textureX, textureY); // Box 38
		bodyModel[139] = new ModelRendererTurbo(this, 215, 99, textureX, textureY); // Box 557
		bodyModel[140] = new ModelRendererTurbo(this, 249, 99, textureX, textureY); // Box 558
		bodyModel[141] = new ModelRendererTurbo(this, 72, 30, textureX, textureY); // Box 123
		bodyModel[142] = new ModelRendererTurbo(this, 24, 59, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[143] = new ModelRendererTurbo(this, 26, 54, textureX, textureY); // Box 5
		bodyModel[144] = new ModelRendererTurbo(this, 72, 27, textureX, textureY); // Box 311
		bodyModel[145] = new ModelRendererTurbo(this, 191, 9, textureX, textureY); // Box 114
		bodyModel[146] = new ModelRendererTurbo(this, 191, 6, textureX, textureY); // Box 74
		bodyModel[147] = new ModelRendererTurbo(this, 191, 12, textureX, textureY); // Box 78
		bodyModel[148] = new ModelRendererTurbo(this, 191, 3, textureX, textureY); // Box 245
		bodyModel[149] = new ModelRendererTurbo(this, 114, 53, textureX, textureY); // Box 785
		bodyModel[150] = new ModelRendererTurbo(this, 151, 14, textureX, textureY); // Box 184 o2 generator
		bodyModel[151] = new ModelRendererTurbo(this, 129, 53, textureX, textureY); // Box 409 commander base
		bodyModel[152] = new ModelRendererTurbo(this, 134, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[153] = new ModelRendererTurbo(this, 144, 53, textureX, textureY); // Box 409 commander base
		bodyModel[154] = new ModelRendererTurbo(this, 139, 52, textureX, textureY, BoxName.commander); // Box 410 commander beacon
		bodyModel[155] = new ModelRendererTurbo(this, 152, 38, textureX, textureY); // Box 522
		bodyModel[156] = new ModelRendererTurbo(this, 161, 35, textureX, textureY); // Box 523
		bodyModel[157] = new ModelRendererTurbo(this, 152, 35, textureX, textureY); // Box 524
		bodyModel[158] = new ModelRendererTurbo(this, 152, 32, textureX, textureY); // Box 525
		bodyModel[159] = new ModelRendererTurbo(this, 72, 195, textureX, textureY); // Box 530 fridge.
		bodyModel[160] = new ModelRendererTurbo(this, 28, 197, textureX, textureY); // Box 412 cs
		bodyModel[161] = new ModelRendererTurbo(this, 42, 197, textureX, textureY); // Box 413 cs
		bodyModel[162] = new ModelRendererTurbo(this, 28, 189, textureX, textureY); // Box 86 cs
		bodyModel[163] = new ModelRendererTurbo(this, 23, 210, textureX, textureY); // Box 531 cs
		bodyModel[164] = new ModelRendererTurbo(this, 36, 31, textureX, textureY); // Box 52 door swing right
		bodyModel[165] = new ModelRendererTurbo(this, 76, 18, textureX, textureY); // Box 70
		bodyModel[166] = new ModelRendererTurbo(this, 124, 34, textureX, textureY); // Box 72
		bodyModel[167] = new ModelRendererTurbo(this, 47, 34, textureX, textureY); // Box 190
		bodyModel[168] = new ModelRendererTurbo(this, 1, 19, textureX, textureY); // Box 313
		bodyModel[169] = new ModelRendererTurbo(this, 113, 31, textureX, textureY); // Box 314 door swing right
		bodyModel[170] = new ModelRendererTurbo(this, 30, 66, textureX, textureY); // Box 68
		bodyModel[171] = new ModelRendererTurbo(this, 46, 52, textureX, textureY); // Box 69
		bodyModel[172] = new ModelRendererTurbo(this, 112, 74, textureX, textureY); // Box 74
		bodyModel[173] = new ModelRendererTurbo(this, 123, 71, textureX, textureY); // Box 75
		bodyModel[174] = new ModelRendererTurbo(this, 97, 71, textureX, textureY); // Box 76
		bodyModel[175] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[176] = new ModelRendererTurbo(this, 133, 68, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[177] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 186 Headlight Front
		bodyModel[178] = new ModelRendererTurbo(this, 114, 69, textureX, textureY, "lamp"); // Box 187 Headlight Front
		bodyModel[179] = new ModelRendererTurbo(this, 54, 4, textureX, textureY); // Box 332
		bodyModel[180] = new ModelRendererTurbo(this, 20, 9, textureX, textureY); // Box 333
		bodyModel[181] = new ModelRendererTurbo(this, 46, 86, textureX, textureY); // Box 67
		bodyModel[182] = new ModelRendererTurbo(this, 47, 93, textureX, textureY); // Box 335
		bodyModel[183] = new ModelRendererTurbo(this, 172, 5, textureX, textureY); // Box 438
		bodyModel[184] = new ModelRendererTurbo(this, 148, 5, textureX, textureY); // Box 439
		bodyModel[185] = new ModelRendererTurbo(this, 163, 8, textureX, textureY); // Box 440
		bodyModel[186] = new ModelRendererTurbo(this, 171, 14, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[187] = new ModelRendererTurbo(this, 171, 14, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[188] = new ModelRendererTurbo(this, 165, 189, textureX, textureY); // Box 53
		bodyModel[189] = new ModelRendererTurbo(this, 178, 192, textureX, textureY); // Box 54
		bodyModel[190] = new ModelRendererTurbo(this, 163, 162, textureX, textureY); // Box 55
		bodyModel[191] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "cull"); // Box 71 markerlight cull
		bodyModel[192] = new ModelRendererTurbo(this, 185, 189, textureX, textureY); // Box 235
		bodyModel[193] = new ModelRendererTurbo(this, 201, 167, textureX, textureY, "cull"); // Box 124 markerlight cull
		bodyModel[194] = new ModelRendererTurbo(this, 163, 148, textureX, textureY); // Box 125
		bodyModel[195] = new ModelRendererTurbo(this, 198, 197, textureX, textureY); // Box 338
		bodyModel[196] = new ModelRendererTurbo(this, 211, 197, textureX, textureY); // Box 340
		bodyModel[197] = new ModelRendererTurbo(this, 198, 195, textureX, textureY); // Box 344
		bodyModel[198] = new ModelRendererTurbo(this, 201, 184, textureX, textureY, "lamp"); // Box 573 Headlight Front Nose
		bodyModel[199] = new ModelRendererTurbo(this, 201, 172, textureX, textureY); // Box 574 nose light mount
		bodyModel[200] = new ModelRendererTurbo(this, 201, 179, textureX, textureY, "lamp"); // Box 575 Headlight Front Nose
		bodyModel[201] = new ModelRendererTurbo(this, 149, 149, textureX, textureY); // Box 292
		bodyModel[202] = new ModelRendererTurbo(this, 157, 157, textureX, textureY); // Box 293
		bodyModel[203] = new ModelRendererTurbo(this, 152, 160, textureX, textureY); // Box 294
		bodyModel[204] = new ModelRendererTurbo(this, 142, 160, textureX, textureY); // Box 406
		bodyModel[205] = new ModelRendererTurbo(this, 139, 157, textureX, textureY); // Box 407
		bodyModel[206] = new ModelRendererTurbo(this, 139, 149, textureX, textureY); // Box 410
		bodyModel[207] = new ModelRendererTurbo(this, 111, 62, textureX, textureY); // Box 336 top gyra bloc
		bodyModel[208] = new ModelRendererTurbo(this, 108, 61, textureX, textureY, "lamp"); // Box 337 Front Gyralight L
		bodyModel[209] = new ModelRendererTurbo(this, 120, 61, textureX, textureY, "lamp"); // Box 338 Front Gyralight R
		bodyModel[210] = new ModelRendererTurbo(this, 77, 59, textureX, textureY, "cull"); // Box 3 cull aww
		bodyModel[211] = new ModelRendererTurbo(this, 79, 54, textureX, textureY); // Box 5
		bodyModel[212] = new ModelRendererTurbo(this, 155, 101, textureX, textureY); // Box 399
		bodyModel[213] = new ModelRendererTurbo(this, 155, 110, textureX, textureY); // Box 400
		bodyModel[214] = new ModelRendererTurbo(this, 10, 134, textureX, textureY); // Box 33
		bodyModel[215] = new ModelRendererTurbo(this, 189, 168, textureX, textureY); // Box 143
		bodyModel[216] = new ModelRendererTurbo(this, 17, 194, textureX, textureY, "lamp"); // Box 71 glow speedometer
		bodyModel[217] = new ModelRendererTurbo(this, 17, 189, textureX, textureY); // Box 307 spedo
		bodyModel[218] = new ModelRendererTurbo(this, 55, 188, textureX, textureY, "lamp"); // Box 275 cs speedo glow
		bodyModel[219] = new ModelRendererTurbo(this, 47, 59, textureX, textureY); // Box 334
		bodyModel[220] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 339 glowey marker
		bodyModel[221] = new ModelRendererTurbo(this, 359, 91, textureX, textureY, "lamp"); // Box 340 glowey marker
		bodyModel[222] = new ModelRendererTurbo(this, 207, 123, textureX, textureY); // Box 253
		bodyModel[223] = new ModelRendererTurbo(this, 210, 126, textureX, textureY); // Box 280
		bodyModel[224] = new ModelRendererTurbo(this, 422, 23, textureX, textureY); // Box 283
		bodyModel[225] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 284
		bodyModel[226] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 293
		bodyModel[227] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 293
		bodyModel[228] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 293
		bodyModel[229] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 293 late air
		bodyModel[230] = new ModelRendererTurbo(this, 473, 10, textureX, textureY); // Box 534
		bodyModel[231] = new ModelRendererTurbo(this, 462, 1, textureX, textureY); // Box 535
		bodyModel[232] = new ModelRendererTurbo(this, 462, 10, textureX, textureY); // Box 536
		bodyModel[233] = new ModelRendererTurbo(this, 488, 18, textureX, textureY); // Box 538
		bodyModel[234] = new ModelRendererTurbo(this, 373, 81, textureX, textureY); // Box 430
		bodyModel[235] = new ModelRendererTurbo(this, 347, 101, textureX, textureY); // Box 74
		bodyModel[236] = new ModelRendererTurbo(this, 358, 98, textureX, textureY); // Box 75
		bodyModel[237] = new ModelRendererTurbo(this, 332, 98, textureX, textureY); // Box 76
		bodyModel[238] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 117 Numberboard
		bodyModel[239] = new ModelRendererTurbo(this, 346, 88, textureX, textureY, "lamp"); // Box 118 Numberboard
		bodyModel[240] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 186 Headlight Rear
		bodyModel[241] = new ModelRendererTurbo(this, 349, 96, textureX, textureY, "lamp"); // Box 187 Headlight Rear
		bodyModel[242] = new ModelRendererTurbo(this, 105, 56, textureX, textureY); // Box 277
		bodyModel[243] = new ModelRendererTurbo(this, 102, 50, textureX, textureY); // Box 355 brakewheel
		bodyModel[244] = new ModelRendererTurbo(this, 274, 2, textureX, textureY); // Box 6
		bodyModel[245] = new ModelRendererTurbo(this, 193, 16, textureX, textureY); // Box 292
		bodyModel[246] = new ModelRendererTurbo(this, 205, 2, textureX, textureY); // Box 293
		bodyModel[247] = new ModelRendererTurbo(this, 203, 8, textureX, textureY); // Box 294
		bodyModel[248] = new ModelRendererTurbo(this, 239, 26, textureX, textureY); // Box 341
		bodyModel[249] = new ModelRendererTurbo(this, 239, 26, textureX, textureY); // Box 342
		bodyModel[250] = new ModelRendererTurbo(this, 247, 49, textureX, textureY); // Box 18
		bodyModel[251] = new ModelRendererTurbo(this, 196, 43, textureX, textureY); // Box 21
		bodyModel[252] = new ModelRendererTurbo(this, 247, 37, textureX, textureY); // Box 344
		bodyModel[253] = new ModelRendererTurbo(this, 332, 90, textureX, textureY); // Box 288 rear gyralight mount
		bodyModel[254] = new ModelRendererTurbo(this, 329, 89, textureX, textureY, "lamp"); // Box 289 gyralight rear l
		bodyModel[255] = new ModelRendererTurbo(this, 339, 89, textureX, textureY, "lamp"); // Box 290 gyralight rear r
		bodyModel[256] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 252
		bodyModel[257] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 101
		bodyModel[258] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 190 ditchlight f1
		bodyModel[259] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 275 ditchlight f2
		bodyModel[260] = new ModelRendererTurbo(this, 193, 66, textureX, textureY); // Box 444
		bodyModel[261] = new ModelRendererTurbo(this, 193, 61, textureX, textureY, BoxName.ditch); // Box 445 ditchlight f2
		bodyModel[262] = new ModelRendererTurbo(this, 201, 60, textureX, textureY, BoxName.ditch); // Box 446 ditchlight f1
		bodyModel[263] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 447
		bodyModel[264] = new ModelRendererTurbo(this, 68, 195, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[265] = new ModelRendererTurbo(this, 404, 148, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[266] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 281
		bodyModel[267] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 101
		bodyModel[268] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, "lamp"); // Box 276 ditchlight r1
		bodyModel[269] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, "lamp"); // Box 278 ditchlight r2
		bodyModel[270] = new ModelRendererTurbo(this, 222, 66, textureX, textureY); // Box 440
		bodyModel[271] = new ModelRendererTurbo(this, 222, 60, textureX, textureY, BoxName.ditch); // Box 441 ditchlight r2
		bodyModel[272] = new ModelRendererTurbo(this, 213, 65, textureX, textureY); // Box 442
		bodyModel[273] = new ModelRendererTurbo(this, 213, 60, textureX, textureY, BoxName.ditch); // Box 443 ditchlight r1
		bodyModel[274] = new ModelRendererTurbo(this, 423, 144, textureX, textureY, "cull"); // Box 314 cull anticlimber
		bodyModel[275] = new ModelRendererTurbo(this, 91, 199, textureX, textureY, "cull"); // Box 315 cull anticlimber
		bodyModel[276] = new ModelRendererTurbo(this, 442, 110, textureX, textureY); // Box 296
		bodyModel[277] = new ModelRendererTurbo(this, 444, 125, textureX, textureY); // Box 280
		bodyModel[278] = new ModelRendererTurbo(this, 488, 130, textureX, textureY); // Box 281
		bodyModel[279] = new ModelRendererTurbo(this, 488, 115, textureX, textureY); // Box 282
		bodyModel[280] = new ModelRendererTurbo(this, 156, 79, textureX, textureY); // Box 285
		bodyModel[281] = new ModelRendererTurbo(this, 179, 81, textureX, textureY); // Box 288
		bodyModel[282] = new ModelRendererTurbo(this, 156, 90, textureX, textureY); // Box 300
		bodyModel[283] = new ModelRendererTurbo(this, 179, 90, textureX, textureY); // Box 303
		bodyModel[284] = new ModelRendererTurbo(this, 179, 99, textureX, textureY); // Box 296
		bodyModel[285] = new ModelRendererTurbo(this, 179, 79, textureX, textureY); // Box 297
		bodyModel[286] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 389
		bodyModel[287] = new ModelRendererTurbo(this, 489, 140, textureX, textureY); // Box 390
		bodyModel[288] = new ModelRendererTurbo(this, 152, 120, textureX, textureY); // Box 132
		bodyModel[289] = new ModelRendererTurbo(this, 139, 116, textureX, textureY); // Box 133
		bodyModel[290] = new ModelRendererTurbo(this, 463, 111, textureX, textureY); // Box 277
		bodyModel[291] = new ModelRendererTurbo(this, 348, 84, textureX, textureY); // Box 291
		bodyModel[292] = new ModelRendererTurbo(this, 344, 198, textureX, textureY); // Box 144
		bodyModel[293] = new ModelRendererTurbo(this, 360, 226, textureX, textureY); // Box 292
		bodyModel[294] = new ModelRendererTurbo(this, 360, 221, textureX, textureY); // Box 347
		bodyModel[295] = new ModelRendererTurbo(this, 439, 244, textureX, textureY); // Box 371
		bodyModel[296] = new ModelRendererTurbo(this, 442, 231, textureX, textureY); // Box 361
		bodyModel[297] = new ModelRendererTurbo(this, 384, 243, textureX, textureY); // Box 365
		bodyModel[298] = new ModelRendererTurbo(this, 436, 234, textureX, textureY); // Box 368
		bodyModel[299] = new ModelRendererTurbo(this, 378, 233, textureX, textureY); // Box 369
		bodyModel[300] = new ModelRendererTurbo(this, 415, 213, textureX, textureY); // Box 370
		bodyModel[301] = new ModelRendererTurbo(this, 415, 189, textureX, textureY); // Box 371
		bodyModel[302] = new ModelRendererTurbo(this, 421, 204, textureX, textureY); // Box 455
		bodyModel[303] = new ModelRendererTurbo(this, 432, 234, textureX, textureY); // Box 356
		bodyModel[304] = new ModelRendererTurbo(this, 432, 231, textureX, textureY); // Box 357
		bodyModel[305] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime1); // Box 6 PRIME4-1
		bodyModel[306] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime3); // Box 7 PRIME4-3
		bodyModel[307] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime2); // Box 8 PRIME4-2
		bodyModel[308] = new ModelRendererTurbo(this, 174, 55, textureX, textureY, BoxName.prime4); // Box 9 PRIME4-4
		bodyModel[309] = new ModelRendererTurbo(this, 174, 59, textureX, textureY); // Box 428
		bodyModel[310] = new ModelRendererTurbo(this, 23, 104, textureX, textureY); // Box 365
		bodyModel[311] = new ModelRendererTurbo(this, -2, 110, textureX, textureY); // Box 366
		bodyModel[312] = new ModelRendererTurbo(this, 394, 121, textureX, textureY); // Box 204
		bodyModel[313] = new ModelRendererTurbo(this, 395, 128, textureX, textureY); // Box 205
		bodyModel[314] = new ModelRendererTurbo(this, 395, 117, textureX, textureY); // Box 206
		bodyModel[315] = new ModelRendererTurbo(this, 393, 139, textureX, textureY, "cull"); // Box 207 cull trashcan holder
		bodyModel[316] = new ModelRendererTurbo(this, 395, 132, textureX, textureY, "lamp"); // Box 208 sp trashcan light rear

		bodyModel[0].addBox(0F, 0F, 0F, 76, 2, 22, 0F); // Box 0
		bodyModel[0].setRotationPoint(-38F, -1F, -11F);

		bodyModel[1].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 3
		bodyModel[1].setRotationPoint(-42.01F, -1F, -10F);

		bodyModel[2].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 8
		bodyModel[2].setRotationPoint(-42F, -1F, -7F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 61
		bodyModel[3].setRotationPoint(-46F, 3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[4].setRotationPoint(-38F, 2F, -11F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 29, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -0.5F, 1F); // Box 156
		bodyModel[5].setRotationPoint(-38F, 1.5F, -11F);

		bodyModel[6].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 195
		bodyModel[6].setRotationPoint(-39F, -1F, -10F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[7].setRotationPoint(-39F, 7F, 10F);

		bodyModel[8].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 197
		bodyModel[8].setRotationPoint(-42F, 8F, 8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[9].setRotationPoint(-39F, 7F, -11F);

		bodyModel[10].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 199
		bodyModel[10].setRotationPoint(-42F, -1F, 7F);

		bodyModel[11].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 200
		bodyModel[11].setRotationPoint(-42F, 2F, 7F);

		bodyModel[12].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 203
		bodyModel[12].setRotationPoint(-42F, -1F, -8F);

		bodyModel[13].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 204
		bodyModel[13].setRotationPoint(-42F, 2F, -9F);

		bodyModel[14].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 205
		bodyModel[14].setRotationPoint(-42F, 8F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // box65
		bodyModel[15].setRotationPoint(-42F, 8F, -9F);

		bodyModel[16].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 61
		bodyModel[16].setRotationPoint(-42F, -1F, 10F);

		bodyModel[17].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 63
		bodyModel[17].setRotationPoint(-42F, -1F, -11F);

		bodyModel[18].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 80
		bodyModel[18].setRotationPoint(-42F, -9F, -8F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 2603
		bodyModel[19].setRotationPoint(-38F, 1F, 7F);

		bodyModel[20].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 261
		bodyModel[20].setRotationPoint(-39F, -1F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[21].setRotationPoint(-42F, 1F, -3F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[22].setRotationPoint(-43F, 2.5F, -2F);

		bodyModel[23].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 321
		bodyModel[23].setRotationPoint(-42.01F, 7F, -11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 298
		bodyModel[24].setRotationPoint(-42.01F, -9F, -10F);
		bodyModel[24].rotateAngleY = -3.14159265F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 299
		bodyModel[25].setRotationPoint(-42.01F, -9F, 11F);
		bodyModel[25].rotateAngleY = -3.14159265F;

		bodyModel[26].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 411
		bodyModel[26].setRotationPoint(-42F, 6F, -8F);

		bodyModel[27].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 412
		bodyModel[27].setRotationPoint(-42F, 6F, 8F);

		bodyModel[28].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 339 cull crossover
		bodyModel[28].setRotationPoint(-42F, -1F, -2F);
		bodyModel[28].rotateAngleZ = -1.48352986F;

		bodyModel[29].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 300
		bodyModel[29].setRotationPoint(-43F, -9F, -2F);

		bodyModel[30].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 301
		bodyModel[30].setRotationPoint(-43F, -9F, 2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[31].setRotationPoint(-43F, -1F, -7F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 303
		bodyModel[32].setRotationPoint(-43F, -1F, 2F);

		bodyModel[33].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 201
		bodyModel[33].setRotationPoint(-42F, 5F, 8F);

		bodyModel[34].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 202
		bodyModel[34].setRotationPoint(-42F, 5F, -10F);

		bodyModel[35].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 293
		bodyModel[35].setRotationPoint(-42F, 4F, 8F);

		bodyModel[36].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 294
		bodyModel[36].setRotationPoint(-42F, 4F, -8F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 76, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 63
		bodyModel[37].setRotationPoint(-38F, 2.75F, -7.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 318
		bodyModel[38].setRotationPoint(22.5F, 1F, -11F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 322
		bodyModel[39].setRotationPoint(23.5F, 2F, -11F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 757
		bodyModel[40].setRotationPoint(23.5F, 2F, 6F);

		bodyModel[41].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 758
		bodyModel[41].setRotationPoint(22.5F, 2.5F, -2F);

		bodyModel[42].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Box 440
		bodyModel[42].setRotationPoint(-26.5F, 2.5F, -2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 22, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 631
		bodyModel[43].setRotationPoint(-26.5F, 1F, -11F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 882
		bodyModel[44].setRotationPoint(-25.5F, 2F, -11F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 883
		bodyModel[45].setRotationPoint(-25.5F, 2F, 6F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 76, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 630
		bodyModel[46].setRotationPoint(-38F, 1F, -11F);

		bodyModel[47].addBox(0F, 0F, 0F, 4, 4, 14, 0F); // Box 215
		bodyModel[47].setRotationPoint(38F, -1F, -7F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[48].setRotationPoint(38F, 7F, 10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[49].setRotationPoint(38F, 7F, -11F);

		bodyModel[50].addBox(0F, 0F, 0F, 4, 2, 3, 0F); // Box 230
		bodyModel[50].setRotationPoint(42F, 3F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 0, 1, 18, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		bodyModel[51].setRotationPoint(42F, 8F, -9F);

		bodyModel[52].addBox(0F, 0F, 0F, 0, 8, 20, 0F); // Box 256
		bodyModel[52].setRotationPoint(42.01F, -1F, -10F);

		bodyModel[53].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 259
		bodyModel[53].setRotationPoint(42.01F, -1F, 10F);

		bodyModel[54].addBox(0F, 0F, 0F, 0, 8, 16, 0F); // Box 267
		bodyModel[54].setRotationPoint(42.01F, -9F, -8F);

		bodyModel[55].addBox(0F, 0F, 0F, 0, 7, 1, 0F); // Box 269
		bodyModel[55].setRotationPoint(42.01F, -1F, -11F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 263
		bodyModel[56].setRotationPoint(36F, 1F, -11F);

		bodyModel[57].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 264
		bodyModel[57].setRotationPoint(38F, -1F, -10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F); // Box 273
		bodyModel[58].setRotationPoint(37F, 1F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 267
		bodyModel[59].setRotationPoint(42F, 2.5F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 7, 4, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 270434
		bodyModel[60].setRotationPoint(36F, 1F, 7F);

		bodyModel[61].addBox(0F, 0F, 0F, 1, 9, 3, 0F); // Box 271
		bodyModel[61].setRotationPoint(38F, -1F, 7F);

		bodyModel[62].addBox(0F, 0F, 0F, 0, 1, 22, 0F); // Box 320
		bodyModel[62].setRotationPoint(42.01F, 7F, -11F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[63].setRotationPoint(42.01F, -9F, -10F);
		bodyModel[63].rotateAngleY = -3.14159265F;

		bodyModel[64].addShapeBox(0F, 0F, 0F, 0, 8, 1, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, -2.5F, 2F, 0F, -2.5F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 301
		bodyModel[64].setRotationPoint(42.01F, -9F, 11F);
		bodyModel[64].rotateAngleY = -3.14159265F;

		bodyModel[65].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 413
		bodyModel[65].setRotationPoint(39F, 6F, 8F);

		bodyModel[66].addBox(0F, 0F, 0F, 3, 2, 0, 0F); // Box 414
		bodyModel[66].setRotationPoint(39F, 6F, -8F);

		bodyModel[67].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 448
		bodyModel[67].setRotationPoint(39F, 8F, -11F);

		bodyModel[68].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 450
		bodyModel[68].setRotationPoint(39F, 2F, -9F);

		bodyModel[69].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 451
		bodyModel[69].setRotationPoint(39F, -1F, -8F);

		bodyModel[70].addBox(0F, 0F, 0F, 3, 0, 3, 0F); // Box 452
		bodyModel[70].setRotationPoint(39F, 8F, 8F);

		bodyModel[71].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 454
		bodyModel[71].setRotationPoint(39F, 2F, 7F);

		bodyModel[72].addBox(0F, 0F, 0F, 3, 0, 1, 0F); // Box 455
		bodyModel[72].setRotationPoint(39F, -1F, 7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[73].setRotationPoint(42F, -1F, -7F);

		bodyModel[74].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 325
		bodyModel[74].setRotationPoint(42F, -9F, -2F);

		bodyModel[75].addBox(0F, 0F, 0F, 1, 9, 0, 0F); // Box 326
		bodyModel[75].setRotationPoint(42F, -9F, 2F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 0, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 327
		bodyModel[76].setRotationPoint(42F, -1F, 2F);

		bodyModel[77].addBox(-4F, 0F, 0F, 4, 1, 4, 0F); // Box 328 cull crossover
		bodyModel[77].setRotationPoint(42F, -1F, 2F);
		bodyModel[77].rotateAngleY = -3.14159265F;
		bodyModel[77].rotateAngleZ = -1.48352986F;

		bodyModel[78].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 449
		bodyModel[78].setRotationPoint(39F, 5F, -10F);

		bodyModel[79].addBox(0F, 0F, 0F, 3, 0, 2, 0F); // Box 453
		bodyModel[79].setRotationPoint(39F, 5F, 8F);

		bodyModel[80].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 292
		bodyModel[80].setRotationPoint(39F, 4F, 8F);

		bodyModel[81].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 295
		bodyModel[81].setRotationPoint(39F, 4F, -8F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 76, 2, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 251
		bodyModel[82].setRotationPoint(-38F, 1F, -7F);

		bodyModel[83].addBox(0F, 0F, 0F, 18, 4, 16, 0F); // Box 2
		bodyModel[83].setRotationPoint(-12F, 5F, -8F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 18, 3, 22, 0F,0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[84].setRotationPoint(-12F, 2F, -11F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[85].setRotationPoint(-12F, 5F, -11F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 18, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 158
		bodyModel[86].setRotationPoint(-12F, 5F, 8F);

		bodyModel[87].addBox(0F, 0F, -1F, 1, 3, 1, 0F); // Box 382
		bodyModel[87].setRotationPoint(-4F, 1.5F, -11.25F);
		bodyModel[87].rotateAngleX = 1.57079633F;

		bodyModel[88].addBox(0F, 0F, 0F, 1, 3, 1, 0F); // Box 383
		bodyModel[88].setRotationPoint(-4F, 1.5F, 11.25F);
		bodyModel[88].rotateAngleX = -1.57079633F;

		bodyModel[89].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[89].setRotationPoint(10F, 4F, -9F);

		bodyModel[90].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[90].setRotationPoint(10.5F, 6F, -9.5F);
		bodyModel[90].rotateAngleZ = -0.10471976F;

		bodyModel[91].addBox(0F, 0F, 0F, 3, 5, 1, 0F); // Box 305 pipe cull
		bodyModel[91].setRotationPoint(9F, 1F, 8.5F);

		bodyModel[92].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 19
		bodyModel[92].setRotationPoint(7F, 4F, -9F);

		bodyModel[93].addShapeBox(-0.5F, -2F, 0F, 1, 2, 4, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305 pipe cull
		bodyModel[93].setRotationPoint(7.5F, 6F, -9.5F);
		bodyModel[93].rotateAngleZ = 0.10471976F;

		bodyModel[94].addBox(-0.5F, -6F, -1F, 1, 6, 1, 0F); // Box 305 pipe cull
		bodyModel[94].setRotationPoint(7.5F, 5.5F, 10.01F);
		bodyModel[94].rotateAngleZ = 0.2268928F;

		bodyModel[95].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 310 cull fueltank support
		bodyModel[95].setRotationPoint(9F, 3F, -6F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 311 cull fueltank support
		bodyModel[96].setRotationPoint(6F, 3F, -6F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[97].setRotationPoint(6F, 5F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[98].setRotationPoint(8F, 5F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[99].setRotationPoint(9F, 5F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 548
		bodyModel[100].setRotationPoint(11F, 5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Box 527 why dont you filter some grass instead
		bodyModel[101].setRotationPoint(9.25F, 0.75F, 8.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[102].setRotationPoint(8.5F, 2.5F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[103].setRotationPoint(8.5F, 1.5F, -10F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[104].setRotationPoint(8.75F, 3F, -9.75F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F); // Box 282
		bodyModel[105].setRotationPoint(-46F, 7F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,-3.5F, 0F, 0F, 3F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[106].setRotationPoint(-46F, 7F, -10F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 448
		bodyModel[107].setRotationPoint(-45F, 5F, 2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[108].setRotationPoint(-45F, 6F, -10F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 323
		bodyModel[109].setRotationPoint(-45F, 5F, -10F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, -1.5F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 280
		bodyModel[110].setRotationPoint(-45F, 4F, 2F);

		bodyModel[111].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,-1.5F, 1F, 0F, 1F, 1F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 285
		bodyModel[111].setRotationPoint(-45F, 4F, -8F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 1F, 0F, -2.5F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 24
		bodyModel[112].setRotationPoint(-45F, 6F, 0F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[113].setRotationPoint(-45F, 6F, -10F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F); // Box 4
		bodyModel[114].setRotationPoint(-45F, 6F, 0F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 727
		bodyModel[115].setRotationPoint(44F, 6F, 0F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 728
		bodyModel[116].setRotationPoint(44F, 6F, -10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,3F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 2F, 0F, -1F, -2.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 729
		bodyModel[117].setRotationPoint(45F, 7F, -10F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 2, 10, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -1F, 2F, 0F, -1F); // Box 730
		bodyModel[118].setRotationPoint(45F, 7F, 0F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 731
		bodyModel[119].setRotationPoint(44F, 5F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,-1F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 732
		bodyModel[120].setRotationPoint(44F, 4F, 2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 733
		bodyModel[121].setRotationPoint(44F, 5F, -10F);

		bodyModel[122].addShapeBox(0F, 0F, -2F, 1, 1, 8, 0F,1F, 1F, 0F, -1.5F, 1F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 734
		bodyModel[122].setRotationPoint(44F, 4F, -8F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, -2.5F, 1F, 0F, 2F, 1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 2F, 0F, 0F); // Box 405
		bodyModel[123].setRotationPoint(44F, 6F, 0F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,2F, 1F, 0F, -2.5F, 1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 406
		bodyModel[124].setRotationPoint(44F, 6F, -10F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[125].setRotationPoint(-42.75F, -1F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[126].setRotationPoint(-42.75F, -1F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[127].setRotationPoint(41.75F, -1F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 398 not a ditchlight will not glow
		bodyModel[128].setRotationPoint(41.75F, -1F, 3F);

		bodyModel[129].addBox(0F, 0F, 0F, 25, 4, 22, 0F); // Box 25
		bodyModel[129].setRotationPoint(-35F, -5F, -11F);

		bodyModel[130].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 32
		bodyModel[130].setRotationPoint(-36F, -3F, -10F);

		bodyModel[131].addBox(0F, 0F, 0F, 7, 4, 4, 0F); // Box 36 electrical locker
		bodyModel[131].setRotationPoint(-18F, -9F, -11F);

		bodyModel[132].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 279
		bodyModel[132].setRotationPoint(-32F, -25F, 0F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 329 support cull
		bodyModel[133].setRotationPoint(-20.5F, -24F, -1F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 330
		bodyModel[134].setRotationPoint(-30.5F, -24F, -1F);

		bodyModel[135].addBox(0F, 0F, 0F, 1, 2, 0, 0F); // Box 337
		bodyModel[135].setRotationPoint(-23F, -25F, -0.5F);

		bodyModel[136].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 688
		bodyModel[136].setRotationPoint(-36F, -5F, -11F);

		bodyModel[137].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 37
		bodyModel[137].setRotationPoint(-10F, -3F, -10F);

		bodyModel[138].addBox(0F, 0F, 0F, 1, 2, 3, 0F); // Box 38
		bodyModel[138].setRotationPoint(-10F, -3F, 7F);

		bodyModel[139].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 557
		bodyModel[139].setRotationPoint(-10F, -5F, -11F);

		bodyModel[140].addBox(0F, 0F, 0F, 1, 4, 1, 0F); // Box 558
		bodyModel[140].setRotationPoint(-10F, -5F, 10F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[141].setRotationPoint(-32F, -19F, -11F);
		bodyModel[141].rotateAngleX = -0.61086524F;

		bodyModel[142].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[142].setRotationPoint(-30F, -18F, 10F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 5
		bodyModel[143].setRotationPoint(-30F, -19F, 10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 9, 2, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 311
		bodyModel[144].setRotationPoint(-32F, -19F, 11F);
		bodyModel[144].rotateAngleX = 0.61086524F;

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 114
		bodyModel[145].setRotationPoint(-16F, -22F, -0.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[146].setRotationPoint(-16F, -23F, -0.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 78
		bodyModel[147].setRotationPoint(-15.75F, -21.5F, -0.25F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F); // Box 245
		bodyModel[148].setRotationPoint(-18F, -24F, -0.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 2, 1, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 785
		bodyModel[149].setRotationPoint(-22F, -24F, 1F);

		bodyModel[150].addBox(0F, 0F, 0F, 5, 4, 8, 0F); // Box 184 o2 generator
		bodyModel[150].setRotationPoint(-28F, -24.75F, -4F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[151].setRotationPoint(-30F, -25F, -0.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[152].setRotationPoint(-30F, -26F, -0.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, -0.5F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 409 commander base
		bodyModel[153].setRotationPoint(-20F, -25F, -0.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 410 commander beacon
		bodyModel[154].setRotationPoint(-20F, -26F, -0.5F);

		bodyModel[155].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 522
		bodyModel[155].setRotationPoint(-30.75F, -25F, -6F);

		bodyModel[156].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 523
		bodyModel[156].setRotationPoint(-29.5F, -24F, -7F);

		bodyModel[157].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 524
		bodyModel[157].setRotationPoint(-29.5F, -25F, -7F);

		bodyModel[158].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 525
		bodyModel[158].setRotationPoint(-31.25F, -25F, -8F);

		bodyModel[159].addBox(0F, 0F, 0F, 2, 8, 3, 0F); // Box 530 fridge.
		bodyModel[159].setRotationPoint(-22F, -13F, -10F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 10, 2, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412 cs
		bodyModel[160].setRotationPoint(-24.8F, -15F, 1F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 6, 4, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 413 cs
		bodyModel[161].setRotationPoint(-31.5F, -13F, 3F);
		bodyModel[161].rotateAngleY = -0.45378561F;

		bodyModel[162].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,0F, 0F, -0.5F, -5F, 0F, -0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -5F, -2F, -0.5F, -5F, -2F, 0F, 0F, -2F, 0F); // Box 86 cs
		bodyModel[162].setRotationPoint(-31.5F, -15F, 3F);
		bodyModel[162].rotateAngleY = -0.45378561F;

		bodyModel[163].addShapeBox(0F, 0F, 0F, 6, 4, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 531 cs
		bodyModel[163].setRotationPoint(-31.5F, -9F, 3F);
		bodyModel[163].rotateAngleY = -0.45378561F;

		bodyModel[164].addBox(-0.5F, 0F, -0.5F, 1, 14, 4, 0F); // Box 52 door swing right
		bodyModel[164].setRotationPoint(-31.5F, -19F, -9.5F);

		bodyModel[165].addBox(0F, 0F, 0F, 1, 14, 17, 0F); // Box 70
		bodyModel[165].setRotationPoint(-20F, -19F, -10F);

		bodyModel[166].addBox(0F, 0F, 0F, 12, 14, 1, 0F); // Box 72
		bodyModel[166].setRotationPoint(-32F, -19F, 10F);

		bodyModel[167].addBox(0F, 0F, 0F, 13, 14, 1, 0F); // Box 190
		bodyModel[167].setRotationPoint(-32F, -19F, -11F);

		bodyModel[168].addBox(0F, 0F, 0F, 1, 14, 16, 0F); // Box 313
		bodyModel[168].setRotationPoint(-32F, -19F, -6F);

		bodyModel[169].addBox(-0.5F, 0F, -3.5F, 1, 14, 4, 0F); // Box 314 door swing right
		bodyModel[169].setRotationPoint(-19.5F, -19F, 10.5F);

		bodyModel[170].addBox(0F, 0F, 0F, 13, 1, 18, 0F); // Box 68
		bodyModel[170].setRotationPoint(-32F, -23F, -9F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[171].setRotationPoint(-32F, -23F, 9F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 74
		bodyModel[172].setRotationPoint(-35F, -23F, -1F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[173].setRotationPoint(-34F, -23F, -6F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 76
		bodyModel[174].setRotationPoint(-34F, -23F, 1F);

		bodyModel[175].addBox(0F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[175].setRotationPoint(-32.05F, -22F, -6F);
		bodyModel[175].rotateAngleY = 0.38397244F;

		bodyModel[176].addBox(0F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[176].setRotationPoint(-32.05F, -22F, 6F);
		bodyModel[176].rotateAngleY = -0.38397244F;

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Front
		bodyModel[177].setRotationPoint(-34.75F, -23F, -1F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Front
		bodyModel[178].setRotationPoint(-34.75F, -21F, -1F);

		bodyModel[179].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 332
		bodyModel[179].setRotationPoint(-32F, -22F, -9F);

		bodyModel[180].addBox(0F, 0F, 0F, 1, 3, 18, 0F); // Box 333
		bodyModel[180].setRotationPoint(-20F, -22F, -9F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 13, 4, 2, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[181].setRotationPoint(-32F, -23F, -11F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 335
		bodyModel[182].setRotationPoint(-31F, -22F, -9F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 438
		bodyModel[183].setRotationPoint(-19F, -23F, 1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 3, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 439
		bodyModel[184].setRotationPoint(-19F, -23F, -6F);

		bodyModel[185].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 440
		bodyModel[185].setRotationPoint(-19F, -23F, -1F);

		bodyModel[186].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[186].setRotationPoint(-18.95F, -22.5F, -6F);
		bodyModel[186].rotateAngleY = -0.38397244F;

		bodyModel[187].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[187].setRotationPoint(-18.95F, -22.5F, 6F);
		bodyModel[187].rotateAngleY = 0.38397244F;

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 53
		bodyModel[188].setRotationPoint(-39F, -14F, 1F);

		bodyModel[189].addBox(0F, 0F, 0F, 1, 14, 2, 0F); // Box 54
		bodyModel[189].setRotationPoint(-39F, -14F, -1F);

		bodyModel[190].addBox(0F, 0F, 0F, 6, 14, 12, 0F); // Box 55
		bodyModel[190].setRotationPoint(-38F, -14F, -6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F); // Box 71 markerlight cull
		bodyModel[191].setRotationPoint(-38.25F, -13F, -5.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 14, 5, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 235
		bodyModel[192].setRotationPoint(-39F, -14F, -6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.3F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 124 markerlight cull
		bodyModel[193].setRotationPoint(-38.25F, -13F, 3.5F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[194].setRotationPoint(-38F, -15F, -6F);

		bodyModel[195].addBox(0F, 0F, 0F, 6, 11, 0, 0F); // Box 338
		bodyModel[195].setRotationPoint(-38.5F, -15F, -5.5F);

		bodyModel[196].addBox(0F, 0F, 0F, 2, 11, 0, 0F); // Box 340
		bodyModel[196].setRotationPoint(-38.5F, -15F, 5.5F);

		bodyModel[197].addBox(0F, 0F, 0F, 3, 1, 0, 0F); // Box 344
		bodyModel[197].setRotationPoint(-35.5F, -15F, 5.5F);
		bodyModel[197].rotateAngleY = -0.78539816F;

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 573 Headlight Front Nose
		bodyModel[198].setRotationPoint(-39.35F, -11F, -1F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 4, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 574 nose light mount
		bodyModel[199].setRotationPoint(-39.6F, -13F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 575 Headlight Front Nose
		bodyModel[200].setRotationPoint(-39.35F, -13F, -1F);

		bodyModel[201].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 292
		bodyModel[201].setRotationPoint(-37F, -13F, -11.01F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 293
		bodyModel[202].setRotationPoint(-39F, -5F, -11.5F);

		bodyModel[203].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 294
		bodyModel[203].setRotationPoint(-39F, -10F, -11F);

		bodyModel[204].addBox(0F, 0F, 0F, 0, 14, 2, 0F); // Box 406
		bodyModel[204].setRotationPoint(-39F, -10F, 9F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 0, 4, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 407
		bodyModel[205].setRotationPoint(-39F, -5F, 10.5F);

		bodyModel[206].addBox(0F, 0F, 0F, 5, 8, 0, 0F); // Box 410
		bodyModel[206].setRotationPoint(-37F, -13F, 10.99F);

		bodyModel[207].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Box 336 top gyra bloc
		bodyModel[207].setRotationPoint(-34.5F, -25F, -2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 337 Front Gyralight L
		bodyModel[208].setRotationPoint(-35.25F, -25F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F); // Box 338 Front Gyralight R
		bodyModel[209].setRotationPoint(-35.25F, -25F, -2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 3 cull aww
		bodyModel[210].setRotationPoint(-30F, -18F, -12.5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[211].setRotationPoint(-30F, -19F, -13F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, -2F, 0F, 3F, 2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, -2F); // Box 399
		bodyModel[212].setRotationPoint(-39F, -13F, 11F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 3, 1, 0, 0F,0F, -3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -3F, 2F, 0F, 3F, -2F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 3F, 2F); // Box 400
		bodyModel[213].setRotationPoint(-39F, -13F, -11F);

		bodyModel[214].addBox(0F, 0F, 0F, 1, 4, 5, 0F); // Box 33
		bodyModel[214].setRotationPoint(-36F, -5F, 6F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 143
		bodyModel[215].setRotationPoint(-38.5F, -14.5F, -1F);

		bodyModel[216].addShapeBox(-0.5F, 0F, -1F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 71 glow speedometer
		bodyModel[216].setRotationPoint(-29.5F, -17.25F, 4F);
		bodyModel[216].rotateAngleY = 0.78539816F;

		bodyModel[217].addShapeBox(-1.5F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0F, 0.25F, 0.25F); // Box 307 spedo
		bodyModel[217].setRotationPoint(-29.5F, -17.25F, 4F);
		bodyModel[217].rotateAngleY = 0.78539816F;

		bodyModel[218].addShapeBox(0F, 0F, -1F, 1, 4, 3, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F); // Box 275 cs speedo glow
		bodyModel[218].setRotationPoint(-31F, -18F, 6.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 11, 3, 3, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 334
		bodyModel[219].setRotationPoint(-31F, -22F, 6F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 339 glowey marker
		bodyModel[220].setRotationPoint(37.65F, -14F, -7F);

		bodyModel[221].addShapeBox(0F, 0F, -2F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 340 glowey marker
		bodyModel[221].setRotationPoint(37.65F, -14F, 7F);

		bodyModel[222].addBox(0F, 0F, 0F, 5, 1, 1, 0F); // Box 253
		bodyModel[222].setRotationPoint(33F, 1F, -9F);
		bodyModel[222].rotateAngleY = -3.14159265F;
		bodyModel[222].rotateAngleZ = -0.27925268F;

		bodyModel[223].addBox(0F, 0F, 0F, 3, 1, 1, 0F); // Box 280
		bodyModel[223].setRotationPoint(36F, 1F, -9F);
		bodyModel[223].rotateAngleY = -3.14159265F;

		bodyModel[224].addBox(0F, 0F, 0F, 21, 14, 1, 0F); // Box 283
		bodyModel[224].setRotationPoint(17F, -15F, -7.75F);

		bodyModel[225].addBox(0F, 0F, 0F, 21, 14, 1, 0F); // Box 284
		bodyModel[225].setRotationPoint(17F, -15F, 6.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -9F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[226].setRotationPoint(26.75F, -12F, 7.25F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 293
		bodyModel[227].setRotationPoint(24F, -12F, 7F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[228].setRotationPoint(21F, -12F, 7F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 293 late air
		bodyModel[229].setRotationPoint(17.5F, -8F, 7F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F); // Box 534
		bodyModel[230].setRotationPoint(24F, -12F, -8F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 20, 7, 1, 0F,0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -9F, 0F, 0F, 1F, 0F, 0F); // Box 535
		bodyModel[231].setRotationPoint(26.75F, -12F, -8.25F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F); // Box 536
		bodyModel[232].setRotationPoint(21F, -12F, -8F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 538
		bodyModel[233].setRotationPoint(17.5F, -8F, -8F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 17, 14, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 430
		bodyModel[234].setRotationPoint(38F, -18F, -7F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[235].setRotationPoint(38.5F, -18F, -1F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[236].setRotationPoint(38.5F, -18F, -6F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[237].setRotationPoint(38.5F, -18F, 1F);

		bodyModel[238].addBox(-1F, 0F, 0F, 1, 2, 5, 0F); // Box 117 Numberboard
		bodyModel[238].setRotationPoint(38.55F, -17F, -6F);
		bodyModel[238].rotateAngleY = -0.38397244F;

		bodyModel[239].addBox(-1F, 0F, -5F, 1, 2, 5, 0F); // Box 118 Numberboard
		bodyModel[239].setRotationPoint(38.55F, -17F, 6F);
		bodyModel[239].rotateAngleY = 0.38397244F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 186 Headlight Rear
		bodyModel[240].setRotationPoint(40.25F, -18F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 187 Headlight Rear
		bodyModel[241].setRotationPoint(40.25F, -16F, -1F);

		bodyModel[242].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 277
		bodyModel[242].setRotationPoint(39F, -9F, -5.5F);
		bodyModel[242].rotateAngleY = 1.57079633F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 5, 5, 0, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 355 brakewheel
		bodyModel[243].setRotationPoint(39F, -11F, -7.5F);
		bodyModel[243].rotateAngleY = 1.57079633F;

		bodyModel[244].addBox(0F, 0F, 0F, 57, 15, 14, 0F); // Box 6
		bodyModel[244].setRotationPoint(-19F, -16F, -7F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[245].setRotationPoint(-19F, -17F, -7F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[246].setRotationPoint(-19F, -17F, 3F);

		bodyModel[247].addBox(0F, 0F, 0F, 36, 1, 6, 0F); // Box 294
		bodyModel[247].setRotationPoint(-19F, -17F, -3F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[248].setRotationPoint(-17F, -15.5F, -7.15F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 16, 5, 1, 0F,0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F); // Box 342
		bodyModel[249].setRotationPoint(-17F, -15.5F, 6.15F);

		bodyModel[250].addBox(0F, 0F, 0F, 3, 1, 6, 0F); // Box 18
		bodyModel[250].setRotationPoint(11.5F, -18.5F, -3F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 21, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 21
		bodyModel[251].setRotationPoint(-5F, -19F, -3.5F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 3, 5, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[252].setRotationPoint(11.5F, -23.5F, -3F);

		bodyModel[253].addBox(0F, 0F, 0F, 1, 2, 4, 0F); // Box 288 rear gyralight mount
		bodyModel[253].setRotationPoint(40F, -20F, -2F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 289 gyralight rear l
		bodyModel[254].setRotationPoint(40.75F, -19.95F, -2F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 290 gyralight rear r
		bodyModel[255].setRotationPoint(40.75F, -19.95F, 0F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 252
		bodyModel[256].setRotationPoint(-42F, -4F, -6.75F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[257].setRotationPoint(-42.5F, -1F, -6.75F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 190 ditchlight f1
		bodyModel[258].setRotationPoint(-42.25F, -4F, -6.75F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 275 ditchlight f2
		bodyModel[259].setRotationPoint(-42.75F, -1F, -6.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 444
		bodyModel[260].setRotationPoint(-42.5F, -1F, 4.75F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 445 ditchlight f2
		bodyModel[261].setRotationPoint(-42.75F, -1F, 4.75F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 446 ditchlight f1
		bodyModel[262].setRotationPoint(-42.25F, -4F, 4.75F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[263].setRotationPoint(-42F, -4F, 4.75F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[264].setRotationPoint(-43F, -1F, -9F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 315 cull anticlimber
		bodyModel[265].setRotationPoint(-44.5F, -1F, -8F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 281
		bodyModel[266].setRotationPoint(41F, -4F, -6.75F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[267].setRotationPoint(42F, -1F, -6.75F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 276 ditchlight r1
		bodyModel[268].setRotationPoint(41.75F, -4F, -6.75F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 278 ditchlight r2
		bodyModel[269].setRotationPoint(42.25F, -1F, -6.75F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 440
		bodyModel[270].setRotationPoint(42F, -1F, 4.75F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 441 ditchlight r2
		bodyModel[271].setRotationPoint(42.25F, -1F, 4.75F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 442
		bodyModel[272].setRotationPoint(41F, -4F, 4.75F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 443 ditchlight r1
		bodyModel[273].setRotationPoint(41.75F, -4F, 4.75F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 314 cull anticlimber
		bodyModel[274].setRotationPoint(42F, -1F, -9F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 16, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 315 cull anticlimber
		bodyModel[275].setRotationPoint(43.5F, -1F, -8F);

		bodyModel[276].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 296
		bodyModel[276].setRotationPoint(39F, -9F, -11F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 280
		bodyModel[277].setRotationPoint(39F, -4F, -11.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 0, 3, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 281
		bodyModel[278].setRotationPoint(39F, -4F, 10.5F);

		bodyModel[279].addBox(0F, 0F, 0F, 0, 13, 2, 0F); // Box 282
		bodyModel[279].setRotationPoint(39F, -9F, 9F);

		bodyModel[280].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 285
		bodyModel[280].setRotationPoint(-19F, -13F, 11F);

		bodyModel[281].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 288
		bodyModel[281].setRotationPoint(-4F, -9F, 11F);

		bodyModel[282].addBox(0F, 0F, 0F, 11, 8, 0, 0F); // Box 300
		bodyModel[282].setRotationPoint(-19F, -13F, -11F);

		bodyModel[283].addBox(0F, 0F, 0F, 43, 8, 0, 0F); // Box 303
		bodyModel[283].setRotationPoint(-4F, -9F, -11F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 296
		bodyModel[284].setRotationPoint(-8F, -13F, -11.01F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 4, 1, 0, 0F,0F, 0F, 0F, 0.25F, -4F, 0F, 0.25F, -4F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0.25F, 0F, 0F); // Box 297
		bodyModel[285].setRotationPoint(-8F, -13F, 11.01F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 389
		bodyModel[286].setRotationPoint(42F, 6F, 0F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,0F, -3F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 390
		bodyModel[287].setRotationPoint(42F, 6F, -8F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[288].setRotationPoint(-44F, 6F, -8F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 2, 3, 8, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F); // Box 133
		bodyModel[289].setRotationPoint(-44F, 6F, 0F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[290].setRotationPoint(36F, -19F, -1F);

		bodyModel[291].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 291
		bodyModel[291].setRotationPoint(37F, -19.25F, 0F);

		bodyModel[292].addBox(0F, 0F, 0F, 21, 2, 20, 0F); // Box 144
		bodyModel[292].setRotationPoint(17F, -17F, -10F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 292
		bodyModel[293].setRotationPoint(17F, -15F, -10F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 21, 1, 3, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 347
		bodyModel[294].setRotationPoint(17F, -15F, 7F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 19, 2, 4, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[295].setRotationPoint(17F, -19F, -2F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[296].setRotationPoint(17F, -18F, 9F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 21, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[297].setRotationPoint(17F, -18F, -10F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 21, 2, 7, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[298].setRotationPoint(17F, -19F, 2F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 21, 2, 7, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[299].setRotationPoint(17F, -19F, -9F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -1.5F, -7F, -17F, -1.5F, -7F, -17F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, -7F, -17F, 1.5F, -7F, -17F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 370
		bodyModel[300].setRotationPoint(19F, -19.51F, -16F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 34, 0, 14, 0F,0F, -0.25F, 0F, -17F, -0.25F, 0F, -17F, -1.5F, -7F, 0F, -1.5F, -7F, 0F, 0.25F, 0F, -17F, 0.25F, 0F, -17F, 1.5F, -7F, 0F, 1.5F, -7F); // Box 371
		bodyModel[301].setRotationPoint(19F, -19.51F, 2F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 34, 0, 8, 0F,0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, -17F, 0F, 0F, -17F, 0F, -4F, 0F, 0F, -4F); // Box 455
		bodyModel[302].setRotationPoint(19F, -19.26F, -2F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 356
		bodyModel[303].setRotationPoint(36F, -19F, -2F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		bodyModel[304].setRotationPoint(36F, -19F, 1F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F); // Box 6 PRIME4-1
		bodyModel[305].setRotationPoint(-30.5F, -25.5F, -1F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F); // Box 7 PRIME4-3
		bodyModel[306].setRotationPoint(-30.5F, -25.5F, -1F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 8 PRIME4-2
		bodyModel[307].setRotationPoint(-30.5F, -25.5F, -1F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -1F, 0F, -1F, -1F, 0F, -1F); // Box 9 PRIME4-4
		bodyModel[308].setRotationPoint(-30.5F, -25.5F, -1F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 428
		bodyModel[309].setRotationPoint(-30.5F, -25F, -1F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 0, 6, 12, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[310].setRotationPoint(-38F, -20F, -6F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 6, 0, 12, 0F,0F, 0F, 0F, -1F, 3F, 0F, -1F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[311].setRotationPoint(-37F, -20F, -6F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 204
		bodyModel[312].setRotationPoint(38.5F, -22.75F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 205
		bodyModel[313].setRotationPoint(38.5F, -21.75F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 1F, 0.25F, 0F, 1F, 0.25F); // Box 206
		bodyModel[314].setRotationPoint(38.5F, -21.75F, -2F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 207 cull trashcan holder
		bodyModel[315].setRotationPoint(38.5F, -19F, -1F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 208 sp trashcan light rear
		bodyModel[316].setRotationPoint(40.6F, -22F, -1.25F);
	}
	ModelFB2_new theTrucks2 = new ModelFB2_new();
	ModelBlombergBnew theTrucks3 = new ModelBlombergBnew();
	ModelTypeBnew theTrucks4 = new ModelTypeBnew();

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		ModelRenderHelper.renderModelWithRollingStockLightControls(bodyModel, entity, f5);

		if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 13244||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3247) {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_black_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 656){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Silver.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 134 ||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 344
				||entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 7345){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/blombergB_2_Blac.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.01, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks3.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else if (entity instanceof AbstractTrains && ((AbstractTrains) entity).getColor() == 3246){
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/newBogies/fb2_new_silver_a.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, 0.0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks2.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		} else {
			Tessellator.bindTexture(new ResourceLocation(Info.resourceLocation, "textures/trains/TypeB_2_Black.png"));
			GL11.glPushMatrix();
			GL11.glTranslated(-1.54, -0.025, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);

			GL11.glTranslated(3.07, 0, 0);
			theTrucks4.render(entity, f, f1, f2, f3, f4, f5);
			GL11.glPopMatrix();
		}
	}
}