package train.client.render;

import com.jcirmodelsquad.tcjcir.models.trains.*;
import com.jcirmodelsquad.tcjcir.vehicles.locomotives.*;
import com.jcirmodelsquad.tcjcir.vehicles.rollingstock.*;
import tmt.ModelBase;
import train.client.render.models.*;
import train.client.render.models.ModelSD40;
import train.common.api.AbstractTrains;
import train.common.api.EntityRollingStock;
import train.common.entity.rollingStock.*;

import java.util.ArrayList;

public enum RenderEnum {

	/** Passengers */
	passengerCartBlue(EntityPassengerBlue.class, new ModelPassenger6(), "passenger", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerCartBlackSmall(EntityPassenger2.class, new ModelPassenger2(), "passenger3", false, new float[] { 0.0F, -0.32F, -0.1F }, null, null, "", 0, null, "", null, 0, false),
	passengerLongGreen(EntityPassenger5.class, new ModelPassenger5(), "passenger5_", true, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerShortGreen(EntityPassenger7.class, new ModelPassenger7(), "passenger7", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	passenger_1class_DB(EntityPassenger_1class_DB.class, new ModelPassenger_1class_DB(), "passenger_1class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passenger_2class_DB(EntityPassenger_2class_DB.class, new ModelPassenger_2class_DB(), "passenger_2class_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerHighSpeedZeroED(EntityPassengerHighSpeedCarZeroED.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerTramNY(EntityPassengerTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { 0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerAdler(EntityPassengerAdler.class, new ModelPassengerAdler(), "passengerAdler", false, new float[] { 0F, 1.04F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	passenger_DB_oriental(EntityPassengerDBOriental.class, new ModelPassenger_DB_oriental(), "passenger_DB_oriental_", true, new float[] { 0F, -0.42F, 0.0F }, new float[] { 180F, 0F, 0F }, new float[] { -1F, -1F, 1F }, "", 0, null, "", null, 0,false),
	passengerCE1Class1(EntityPassengerICE_1class.class, new ModelICE1Passenger(), "ICE1_1st_class", false,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Class2(EntityPassengerICE_2class.class, new ModelICE1Passenger(), "ICE1_2nd_class", false,
			new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null,
			"", null, 0, false),
	passengerCE1Restaurant(EntityPassengerICE_Restaurant.class, new ModelICE1Restaurant(), "ICE1_Restaurant", false, new float[] { 0.0F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4(EntityPassengerGS4.class, new ModelGS4Passenger(), "GS4_Passenger_", true, new float[] { 0.0F, 0.03F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Tail(EntityPassengerGS4_Tail.class, new ModelGS4Tail(), "GS4_Tail_", true, new float[] { -0.2F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerGS4_Observatory(EntityPassengerGS4_Observatory.class, new ModelGS4Tavern(), "GS4_Tavern_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	passengerRheingold(EntityPassengerRheingold.class, new ModelRheingoldPassenger(), "Rheingold_passenger_", true, new float[] { 1.55F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldDining1(EntityPassengerRheingoldDining1.class, new ModelRheingoldPassenger_Dining1(), "Rheingold_passenger_dining1_", true, new float[] { 1.7F, 0.15F, -0.6F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldDining2(EntityPassengerRheingoldDining2.class, new ModelRheingoldPassenger_Dining2(), "Rheingold_passenger_dining2_", true, new float[] { 0.05F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	passengerRheingoldPanorama(EntityPassengerRheingoldPanorama.class, new ModelRheingoldPassenger_Panorama(), "Rheingold_passenger_panorama_", true, new float[] { -0.1F, 0.15F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgPasenger(EntityPassengerDenverRioGrande.class, new ModelDRGPassenger(), "drg_passenger_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgPasengerCombo(EntityPassengerDenverRioGrandeCombo.class, new ModelDRGCombo(), "drg_combo_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	MILWPasenger(EntityPassengerMILW.class, new ModelMILWPassenger(), "milw_passenger", false, new float[] { 0.2F, 0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	MILWPasengerTail(EntityPassengerMILWTail.class, new ModelMILWTail(), "milw_passenger_tail", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	//MILWPasengerDiner(EntityPassengerMILWDiner.class, new ModelMILW1935Passenger(), "milw_passenger_diner", false, new float[] { 0.0F, -0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),

	PasengerBamboo(EntityPassengerBamboo.class, new ModelBambooTrainPassenger(), "passenger_bamboo_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Caboose */
	cabooseRed(EntityCaboose3.class, new ModelCaboose3(), "caboose3", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	cabooseBlack(EntityCaboose.class, new ModelCaboose(), "caboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLogging(EntityCabooseLogging.class, new ModelCabooseLogging(), "cabLogging_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	cabooseLoggingPRR(EntityCabooseLoggingPRR.class, new ModelPRRCaboose(), "PRRCaboose_", true, new float[] { 0.0F, -0.38F, 0.0F },new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	GWRBrakeVan(EntityGWRBrakeVan.class, new ModelGWRBrakeVan(), "GWRBrakeVan", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Specials **/
	stockCar(EntityStockCar.class, new ModelStockCar(), "stockcar_", true, new float[] { -.0F, -0.32F, 0.0F }, new float[]{0,0,0}, null, "", 0, null, "", null, 0, false),
	drwgStockCar(EntityStockCarDRWG.class, new ModelDRWGStockCar(), "drwgstockcar", false, new float[] { 1.0F, -0.4F, 0.0F }, new float[]{0,0,180}, null, "", 0, null, "", null, 0, false),
	workCart(EntityWorkCart.class, new ModelWorkCart(), "workcart", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCart(EntityFlatCart.class, new ModelFlatCar(), "flatcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	workCaboose(EntityCabooseWorkCart.class, new ModelWorkCaboose(), "workcaboose", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	jukeBoxCart(EntityJukeBoxCart.class, new ModelJukeBox(), "jukebox", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartSU(EntityFlatCartSU.class, new ModelFlatCarSU(), "flatcarsu", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartUS(EntityFlatCartUS.class, new ModelFlatCarUS(), "flatCartUS", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tracksBuilder(EntityTracksBuilder.class, new ModelBuilder(), "builder2", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { -1.3D, 2.1D, 0.0D });
		}
	}, "", null, 0, true),

	/** Freight */
	freightCartRed(EntityFreightCart2.class, new ModelFreightCart2(), "freightcart2_", true, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartYellow(EntityFreightCart.class, new ModelFreightCart2(), "freightcart", false, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWood(EntityFreightWood.class, new ModelWood(), "wood_Full", false, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightHopper(EntityFreightGrain.class, new ModelGrain(), "hopper_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightOpenWagon(EntityFreightOpenWagon.class, new ModelOpenWagon(), "openwagon_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	//passenger4(EntityPassenger4.class, new ModelPassenger4(), "passenger4",false,new float[] {0.0F, -0.32F, 0.0F},null,null,"",0,null,"",null,0),//apparently has been removed
	freightHopperUS(EntityFreightHopperUS.class, new ModelFreightHopper(), "freightHopperUS_", true,
			new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodUS(EntityFlatCartWoodUS.class, new ModelFlatCarWoodUS(), "flatCartWoodUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCartUS(EntityFreightCartUS.class, new ModelFreightCartUS(), "freightCartUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartUS(EntityBoxCartUS.class, new ModelBoxCartUS(), "boxCartUS_", true, new float[] { 0.0F, -0.45F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightBoxCartPRR(EntityBoxCartPRR.class, new ModelPRRX31Wagon(), "PRR_X31a", false, new float[] { 0.0F, -0.38F, 0.0F }, new float[]{0,180,180}, null, "", 0, null, "", null, 0, false),
	freightTGNG(EntityFreightGTNG.class, new ModelGTNG(), "GTNGOreWagon", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[]{0,0,180}, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightCartSmall(EntityFreightCartSmall.class, new ModelSmallFreightCart(), "freightCartSmall", false, new float[] { 0.0F, -0.20F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightMinetrain(EntityFreightMinetrain.class, new ModelMinetrain(), "minetrain", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCartWoodLogs(EntityFreightWood2.class, new ModelFreightWood(), "flatCartWood2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightClosedRedBrown(EntityFreightClosed.class, new ModelFreightClosed(), "freightClosed", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightOpenRedBrown(EntityFreightOpen2.class, new ModelFreightOpen2(), "freightOpen2", false, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	mailWagen_DB(EntityMailWagen_DB.class, new ModelMailWagen(), "mailWagen_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightWagen_DB(EntityFreightWagenDB.class, new ModelFreightWagenDB(), "freightWagen_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarRails_DB(EntityFlatCarRails_DB.class, new ModelFlatCarRails_DB(), "flatCarRails_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCar_DB(EntityFlatCar_DB.class, new ModelFlatCar_DB(), "flatCar_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	flatCarLogs_DB(EntityFlatCarLogs_DB.class, new ModelFlatCarLogs_DB(), "flatCarLogs_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightGondola_DB(EntityFreightGondola_DB.class, new ModelFreightGondola_DB(), "freightGondola_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Empty(EntityFreightCenterbeam_Empty.class, new ModelFreightCenterBeam_Empty(), "freight_centerbeam_empty_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood1(EntityFreightCenterbeam_Wood_1.class, new ModelFreightCenterBeam_Wood_1(), "freight_centerbeam_wood_1_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightCenterBeam_Wood2(EntityFreightCenterbeam_Wood_2.class, new ModelFreightCenterBeam_Wood_2(), "freight_centerbeam_wood_2_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	//freightWellcar(EntityFreightWellcar.class, new ModelFreightWellcar(), "freightWellcar_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightWellcar(EntityFreightWellcar.class, new ModelWellcar(), "wellcar_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightTrailer(EntityFreightTrailer.class, new ModelFreightTrailer(), "freightTrailer_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	freightGS4(EntityFreightGS4_Baggage.class, new ModelGS4Baggage(), "GS4_baggage_", true, new float[] { 0.0F, 0.025F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	freightSlateWagon(EntityFreightSlateWagon.class, new ModelSlateWagon(), "freightslatewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightIceeWagon(EntityFreightIceWagon.class, new ModelIceWagon(), "icewagon", false, new float[] { 0.0F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freight100TonHopper(EntityFreight100TonHopper.class, new Model100TonHopper(), "freight_100tonhopper_", true, new float[] { -0.1F, 0.0F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightBulkheadFlatCar(EntityBulkheadFlatCart.class, new ModelBulkheadFlat(), "BulkheadFlat_", true, new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	drgBaggage(EntityFreightDenverRioGrande.class, new ModelDRGBaggage(), "drg_baggage_", true, new float[] { 0.0F, 0.14F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	MILW1935Baggage(EntityFreightBaggageMILW.class, new ModelMILWBaggage(), "milw_baggage", false, new float[] { 0.1F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),
	HeavyweightMailcar(EntityFreightHeavyweight.class, new ModelHeavyweight(), "heavyweight_mailcar", false, new float[] { 0.1F, 0.18F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	BambooFreightcar(EntityFreightBamboo.class, new ModelBambooTrainCargo(), "bamboo_freight_", true, new float[] { 0.1F, 0F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightGermanPost(EntityFreightGermanPost.class, new ModelGermanPost(), "german_post_", true, new float[] { -1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	freightDepressedFlatbed(EntityFreightDepressedFlatbed.class, new ModelDepressedFlatbed(), "depressed_flatbed_", true, new float[] { -0.1F, 0.15F, -0.075F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightCartL(EntityFreightCartL.class, new ModelFreightCarL(), "freightCarL_", true, new float[] { 0F, 0.2F, 0.825F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightKclassrailBox(EntityFreightKClassRailBox.class, new ModelKClassRailBox(), "KClassRailBox_", true, new float[] { -1.5F, 0.1F, 0.125F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightShortCoveredHopper(EntityFreightShortCoveredHopper.class, new ModelShortCoveredHopper(), "ShortCoveredHopper_", true, new float[] { -2.2F, -0.25F, 0.7F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightLongCoveredHopper(EntityFreightLongCoveredHopper.class, new ModelLongCoveredHopper(), "LongCoveredHopper_", true, new float[] { -1F, -0.25F, 0.65F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightHeavyweightBoxcar(EntityFreightHeavyweightBaggage.class, new ModelHeavyweightBaggage(), "heavyweightBoxcar_", true, new float[] { 0F, 0.1F, -0.05F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	freightASTFAutorack(EntityFreightASTFAutorack.class, new ModelASTFAutorack(), "astf_autorack", false, new float[] { -1F, 0.2F, 0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Tanks **/
	tankWagon_DB(EntityTankWagon_DB.class, new ModelTankWagon_DB(), "tankWagon_DB_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonUS(EntityTankWagonUS.class, new ModelTankWagonUS(), "tankWagonUS_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonGrey(EntityTankWagon2.class, new ModelTankWagon2(), "tankwagon2_", true, new float[] { 0.0F, -0.32F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankCartLava(EntityTankLava.class, new ModelWatertransp(), "lavacar_", true, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonYellow(EntityTankWagon.class, new ModelTankWagon(), "tankwagon", false, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tankWagonThreeDome(EntityTankWagonThreeDome.class, new ModelTankWagonThreeDome(), "tanker_three_dome_", true, new float[] { 0.0F, 0.17F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/** Tenders */
	tenderSmall(EntityTenderSmall.class, new ModelTender(), "tender2_", true, new float[] { 0.0F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.75F, 0.75F, 0.75F }, "", 0, null, "", null, 0, false),
	tenderHeavy(EntityTenderHeavy.class, new ModelTenderHeavy(), "heavytender_", true, new float[] { 0.0F, -0.3F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tender4_4_0(EntityTender4_4_0.class, new ModelNormalSteamTender(), "4-4-0-loco_tender_", true, new float[] { 0.0F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderBR01(EntityTenderBR01_DB.class, new ModelTenderBR01_DB(), "tenderBR01_DB", false, new float[] { 0.0F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderEr_Ussr(EntityTenderEr_Ussr.class, new ModelTenderEr_Ussr(), "tenderEr_Ussr", false, new float[] { 0.06F, -0.44F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderC62Class(EntityTenderC62Class.class, new ModelC62Tender(), "c62_tender_", true,
			new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	tenderD51(EntityTenderD51.class, new ModelD51Tender(), "d51_tender", false,
			new float[] { -3.0F, 0.35F, 0.0F }, new float[]{0,180f,180f}, null, "", 0, null, "", null, 0, false),
	tenderAdler(EntityTenderAdler.class, new ModelTenderAdler(), "tender_adler", false, new float[] { 0.0F, 1.05F, 0.0F }, new float[] { 180F, -90F, 0F }, null, "", 0, null, "", null, 0, false),
	tenderGS4(EntityTenderGS4.class, new ModelGS4Tender(), "GS4_tender_", true, new float[] { 0.0F, 0.15F, -0.05F },
			new float[] { 0F, 180F, 180F }, new float[] { 0.8f, 1f, 0.8f }, "", 0, null, "", null, 0, false),
	Model4000GallonTender(EntityTender4000.class, new Model4000GallonTender(), "GWR_Tender_",  true, new float[] { -4.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ModelFowler4FTender(EntityTenderFowler4F.class, new ModelFowler4FTender(), "Fowler_4F_Tender",  false, new float[] { -5.25F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderCoranationClass(EntityTenderCoranationClass.class, new ModelCoranationClassTender(), "CoranationClassTender", false, new float[] { 0.0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderBerk1225(EntityTenderBerk1225.class, new Model1225Tender(), "Berkshire_tender_",  true, new float[] { 2.75F, -0.65F, 0.0625F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderC41(EntityTender_C41.class, new ModelTenderC41(), "C41Tender_", true, new float[] { 0.1F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderSouthern1102(EntityTender_Southern1102.class, new ModelSouthern1102Tender(), "Southern1102Tender", false, new float[] { -5.25F, -0.5F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	tenderMILW(EntityTenderMILW.class, new ModelMILWTender(), "milw_tender", false, new float[] {0.15F, 0.055F, 0.025F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "", 0, null, "", null, 0, false),

	/** Diesel */
	locoKOF(EntityLocoDieselKof_DB.class, new ModelKof(), "locoKof_DB_", true, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, 1.1D, 0.0D });
		}
	}, "", null, 0, true),
	locoGP40(EntityLocoDieselCD742.class, new ModelGP40(), "cd742_", true, new float[] { -0.8F, 0.75F, 0.0F }, new float[] { 180F, 180F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.25D, 1.15D, 0.0D });
		}
	}, "", null, 0, false),
	locoChME3(EntityLocoDieselChME3.class, new ModelChME3(), "chme3", false, new float[] { -0.5F, -0.47F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoGP7Red(EntityLocoDieselGP7Red.class, new train.client.render.models.ModelGP7(), "gp7_", true, new float[] { -0.8F, -0.55F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.3D, 0.0D });
			add(new double[] { 0.45D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),
	loco44tonner(EntityLocoDiesel44TonSwitcher.class, new ModelLoco44TonSwitcher(), "loco_44tonswitcher_", true, new float[] { -2.75F, -0.425F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.55D, 0.0D });
			add(new double[] { 2D, 1.55D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD40(EntityLocoDieselSD40.class, new ModelSD40(), "locoSD40_", true, new float[] { -1.2F, -0.47F, 0.0F }, new float[] { 180F, 90F, 0F }, new float[] { -1F, -1F, 1F }, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, 1.45D, 0.0D });
		}
	}, "", null, 0, false),
	locoSD70(EntityLocoDieselSD70.class, new ModelSD70(), "locoSD70_", true, new float[] { -1.2F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 0.4D, 1.3D, 0.0D });
		}
	}, "", null, 0, false),

	locoShunter(EntityLocoDieselShunter.class, new ModelShunter(), "shunter_", true, new float[] { -1.2F, -0.42F, 0.0F }, null, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.1D });
			add(new double[] { 2.4D, 1.5D, 0.1D });
		}
	}, "", null, 0, true),
	locoWLs40(EntityLocoDieselWLs40.class, new ModelWLs40(), "wls40", false, new float[] { 0F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "smoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.0D, 1.4D, 0.0D });
		}
	}, "", null, 0, true),
	locoV60_DB(EntityLocoDieselV60_DB.class, new ModelV60(), "locoV60_DB_", true, new float[] { -0.5F, -0.44F, 0.0F }, null, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 0.75D, 1.7D, 0.0D });
		}
	}, "", null, 0, false),
	locoMILW_H1044(EntityLocoDieselMILW_H1044.class, new ModelMILW_H1044(), "MILW_H1044_", true, new float[]{0,0.14f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.7D, 1.7D, 0D });
		}
	}, "", null, 0, false),
	locoEMDF7(EntityLocoDieselEMDF7.class, new ModelEMDF7(), "emdf7_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.5D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF3(EntityLocoDieselEMDF3.class, new ModelEMDF3(), "emdf3_", true, new float[]{-2.2f,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
					add(new double[] { -0.15D, 1.6D, 0.0D });
					add(new double[] { 0.55D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoEMDF7b(EntityBUnitEMDF7.class, new ModelEMDF7B(), "emdf7b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	locoEMDF3b(EntityBUnitEMDF3.class, new ModelEMDF3B(), "emdf3b_", true, new float[]{0,0.1f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 4, null, "", null, 0, false),
	DD35b(EntityBUnitDD35.class, new ModelDD35B(), "dd35b_", true, new float[]{0,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "", 0, null, "", null, 0, false),
	locoDieselDD35A(EntityLocoDieselDD35A.class, new ModelDD35A(), "dd35a_", true, new float[]{-5,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.9D, 1.6D, 0.0D });

			add(new double[] { -0.4D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),
	locoBamboo(EntityLocoDieselBamboo.class, new ModelBambooTrainEngine(), "loco_bamboo_", true, new float[] { -1.0F, 0F, 0.0F }, new float[]{180,180,0}, null, "smoke", 2, new ArrayList<double[]>() {
		{
			add(new double[] { -0.05D, -0.05D, 0.0D });
		}
	}, "", null, 0, true),
	/** Electric */
	locoE10DB(EntityLocoElectricE10_DB.class, new ModelE10DB(), "locoe10_db_", true, new float[] { -1.7F, 0.05F, 0.0F }, new float[] { 0F, 0F, 180F }, new float[]{0.9f,0.9f,0.9f}, "",0,null, "", null, 0, false),
	locoCD151(EntityLocoElectricCD151.class, new ModelLocoCD151(), "CD151_", true, new float[]{-2,0.18f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoE103(EntityLocoElectricE103.class, new ModelE103(), "E103_", true, new float[]{-2,0.05f,0}, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "",0,null, "", null, 0, false),
	locoVL10(EntityLocoElectricVL10.class, new ModelVL10(), "vl10", false, new float[] { -1.2F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR_E69(EntityLocoElectricBR_E69.class, new ModelBR_E69(), "locoBR_E69_", true, new float[] { 0.0F, -0.42F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoMineTrain(EntityLocoElectricMinetrain.class, new ModelLocoMinetrain(), "locoMinetrain", false, new float[] { -0.8F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoSpeedZeroED(EntityLocoElectricHighSpeedZeroED.class, new ModelLocoHighSpeedZeroED(), "locoHighSpeedZeroED_", true, new float[] { -1.7F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoICE1(EntityLocoElectricICE1.class, new ModelICE1(), "ICE1_Engine", false, new float[] { 0.0F, 0.18F, 0.1F }, new float[] { 0F, 180F, 180F }, new float[]{0.8f,1f,0.8f}, "", 0, null, "", null, 0, false),
	//locoSpeedGrey(EntityNewHighSpeedLoco.class, new ModelNewHighSpeedLoco(), "newhighspeedloco", false, new float[] { -0.05F, -0.5F, 0.0F }, new float[] { 0F, 90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "", 0, null, "", null, 0),
	locoTramYellow(EntityLocoElectricTramWood.class, new ModelTram(), "tram", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoTramNY(EntityLocoElectricTramNY.class, new ModelTramNY(), "locoTramNY", false, new float[] { -1.5F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),

	passengerC4FG(PassengerIC4_DSB_FG.class, new ModelLocoDieselIC4_DSB_FG(), "IC4_DSB_FG", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	passengerC4FH(PassengerIC4_DSB_FH.class, new ModelLocoDieselIC4_DSB_FH(), "IC4_DSB_FH", false, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoIC4MG(EntityLocoDieselIC4_DSB_MG.class, new ModelLocoDieselIC4_DSB_MG(), "IC4_DSB_MG_", true, new float[] { -0.8F, -0.44F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	locoBR185(EntityLocoElectricBR185.class, new BR185_EngineModel(), "BR185_Engine_", true, new float[] { -2.0F, 0.1F, 0.0F },  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoClass85(EntityLocoElectricClass85.class, new ModelClass85(), "Class85", false, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "", 0, null, "", null, 0, false),
	locoBP4(EntityLocoElectricBP4.class, new ModelBP4(), "bp4_", true, new float[] { -1.4F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	locoDeltic(EntityLocoDieselDeltic.class, new ModelDeltic(), "Deltic_", true, new float[] { -2.25F, 0.8F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 1, new ArrayList<double[]>() {
		{
			add(new double[]{2.3D, 1.6D, 0D});
		}
	}, "", null, 0, false),
	locoEWSClass66(EntityLocoDieselClass66.class, new ModelEWSClass66(), "Class66_", true, new float[] { -3.0F, 0.65F, 0.0F },  new float[] { 0F, 90F, 180F }, null, "largesmoke", 2, new ArrayList<double[]>() {
		{
			add(new double[]{0.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	locoFOL_M1(EntityLocoDieselFOLM1.class, new ModelFOL_M1(), "FOL_M1_", true, new float[] { -2.8F, 0.05F, 0.9F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	/** Steam */
	locoCherepanov(EntityLocoSteamCherepanov.class, new ModelLocoCherepanov(), "locoCherepanov", false, new float[] { -0.875F, -0.47F, 0.0F }, new float[] { 0, 180, 0 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, 2.1D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.875D, 0.2D, 0.2D });
		}
	}, 2, true),
	locoPannier(EntityLocoSteamPannier.class, new ModelLocoPannier(), "locoPannier", false, new float[] { 0.15F, 0.2F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, 1.8D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.575D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41(EntityLocoSteamC41.class, new ModelLocoC41(), "locoC41", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41_080(EntityLocoSteamC41_080.class, new ModelC41_080(), "locoC41_080", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoAlcoSC4(EntityLocoSteamAlcoSC4.class, new ModelAlcoSC4(), "AlcoSC4_", true, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoC41T(EntityLocoSteamC41T.class, new ModelLocoC41T(), "locoC41t", false, new float[] {  -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoSouthern1102(EntityLocoSteamSouthern1102.class, new ModelSouthern1102(), "Southern1102", false, new float[] { -3.5F, -0.5F, 0.0F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.55D, 1.65D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	locoUSATCUS(EntityLocoSteamUSATCUS.class, new ModelUSATCUS(), "USATCUS", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoUSATCUK(EntityLocoSteamUSATCUK.class, new ModelUSATCUK(), "USATCUK", false, new float[] { -2.0F, -0.25F, 0.8375F }, new float[] { 0, 180, 180 }, new float[]{1f,1f,1f}, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, 1.2D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.5D, -0.5D, 0.65D });
		}
	}, 2, true),
	locoCoranationClass(EntityLocoSteamCoranationClass.class, new ModelCoranationClass(), "CoranationClass", false, new float[] { -3.8F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
					add(new double[] { 5.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
					add(new double[] {4.8D, 0.15D, 0.5D });
		}
	}, 2, true),
	locoBR80(EntityLocoSteamBR80_DB.class, new ModelLocoBR80_DB(), "locoBR80_DB_", true, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 4, true),
	loco4_4_0(EntityLocoSteam4_4_0.class, new ModelLoco(), "4-4-0-loco_", true, new float[] { -0.66F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 2.05D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.56D, -0.2D, 0.8D });
		}
	}, 4, true),
	locoSteamSmall(EntityLocoSteamSmall.class, new ModelLoco3(), "loco3_", true, new float[] { -0.99F, -0.5F, 0.0F }, new float[] { 0F, -90F, 0F }, new float[] { 0.8F, 0.8F, 0.8F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.69D, 1.1D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamLSSP7(EntityLocoSteamLSSP7.class, new ModelLSSP7(), "LSSP7", false, new float[] { -1F, -0.2F, 0.8F }, new float[] { 0F, 180F, 180F }, new float[] { 1F, 1F, 1F }, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.1D, 1.15D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.7D, -0.4D, 0.5D });
			add(new double[] { 0.7D, -0.4D, -0.5D });
		}
	}, 2, true),
	locoHeavySteam(EntityLocoSteamHeavy.class, new ModelHeavySteamLoco(), "heavysteam", false, new float[] { 0F, -0.42F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamC62Class(EntityLocoSteamC62Class.class, new ModelC62Locomotive(), "c62_engine_", true,
			new float[] { 0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 5.0D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Short(EntityLocoSteamD51.class, new ModelD51ShortStreamlining(), "d51_short_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamD51Long(EntityLocoSteamD51Long.class, new ModelD51LongStreamlining(), "d51_long_", true,
			new float[] { 0F, -0.5F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 4.85D, 1.85D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.6D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamBR01_DB(EntityLocoSteamBR01_DB.class, new ModelLocoBR01_DB(), "locoBR01_DB", false, new float[] { -1.0F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.8D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamGS4(EntityLocoSteamGS4.class, new ModelGS4Loco(), "GS4_engine_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.95f,0.95f,0.95f}, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 5.8D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 5.2D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamEr_USSR(EntityLocoSteamEr_Ussr.class, new ModelLocoEr_Ussr(), "locoEr_Ussr", false, new float[] { -0.75F, -0.44F, 0.0F }, null, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.45D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.4D, -0.2D, 0.8D });
		}
	}, 2, false),
	locoSteamForney(EntityLocoSteamForneyRed.class, new ModelLocoForney(), "locoForney", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.4D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamMogul(EntityLocoSteamMogulBlue.class, new ModelLocoMogul(), "locoMogul", true, new float[] { -0.6F, -0.44F, 0.0F }, new float[] { 0F, 90F, 0F }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.45D, -0.2D, 0.8D });
		}
	}, 2, true),
	locoSteamShay(EntityLocoSteamShay.class, new ModelLocoSteamShay(), "locoShay", false, new float[] { -0.4F, -0.45F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, 1.7D, 0.2D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamVBShay(EntityLocoSteamVBShay.class, new ModelVBShay(), "vbshay", false, new float[] { 0F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.55D, 2.2D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamClimax(EntityLocoSteamClimax.class, new ModelLocoClimax(), "loco_climax", false, new float[] { 0F, 0.18F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.05D, 1.9D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAdler(EntityLocoSteamAdler.class, new ModelLocoSteamAdler(), "locoAdler", false, new float[] { -0.8F, 1.05F, 0F }, new float[] { 180F, -90F, 0F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.6D, 1.3D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.5D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamAlice(EntityLocoSteamAlice0_4_0.class, new ModelLocoAlice040(), "0-4-0-loco-alice", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam040VB(EntityLocoSteam040VB.class, new ModelVB040(), "loco040VB", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamGLYN(EntityLocoSteamGLYN042T.class, new Model042TGLYN(), "0-4-2-loco-glyn", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.75D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteam626T(EntityLocoSteam262T.class, new ModelT262(), "262t", false, new float[] { 0F, 0.15F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,1f,0.9f}, "smoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.65D, 1.7D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.8D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamA4Mallard(EntityLocoSteamMallardA4.class, new ModelA4Locomotive(), "locoA4_UK_", true, new float[] {-3.0F, 0.2F, 0F },new float[] { 0F, 180F, 180F }, new float[]{0.975f,0.975f,0.975f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.95D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.9D, -0.4D, 0.8D });
		}
	}, 2, true),
	LocoSteamHallClass(EntityLocoSteamHallClass.class, new ModelHallClass(), "Hall_Class_Locomotive_", true, new float[] {-0.65F, 0.15F, -0.25F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.25D, 1.55D, 0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamKingClass(EntityLocoSteamKingClass.class, new ModelKingClass(), "King_Class_Locomotive_", true, new float[] {-1.75F, 0.15F, 0.0F },/*position*/  new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.8D, 1.6D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 3.6D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk1225(EntityLocoSteamBerk1225.class, new Model1225(), "Berk1225_Locomotive_", true, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	LocoSteamBerk765(EntityLocoSteamBerk765.class, new Model765(), "Berk765_Locomotive", false, new float[] {-2.0F, -0.65F, 0.0625F },/*position*/  new float[] { 0F, 0F, 180F }, new float[]{1f,1f,1f},/*scale*/ "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.65D, 1.7D, 0.0D });//smoke
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });//steam
		}
	}, 2, true),
	locoSteamMILWClassA(EntityLocoSteamMILWClassA.class, new ModelMILWClassA(), "locoMILW_ClassA", false, new float[] {0.0F, 0.1F, 0F }, new float[] { 0F, 180F, 180F }, new float[]{0.9f,0.9f,0.9f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 4.4D, 1.35D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 4.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	locoSteamFowler(EntityLocoSteamFowler.class, new ModelFowler(), "loco_Fowler", false, new float[] { -3F, -0.51585F, 0.0F }, new float[] { 0F, 180F, 180F }, new float[]{1f,1f,1f}, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 3.2D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2D, -0.4D, 0D });
		}
	}, 2, true),
	locoSteamA4Tender(EntityTenderA4.class, new ModelTenderA4(), "tenderA4_UK_", true, new float[] { -0.2F, 0.2F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUS(EntityPropagandaUS.class, new ModelPropagandaCar(), "propaganda_US_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaJapan(EntityPropagandaJapan.class, new ModelPropagandaCar(), "propaganda_Japan_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaUSSR(EntityPropagandaUSSR.class, new ModelPropagandaCar(), "propaganda_USSR_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PropagandaBritain(EntityPropagandaBritain.class, new ModelPropagandaCar(), "propaganda_Britain_", true, new float[] { 1.1F, 0.2F, -0.1F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SnowPlow(EntityLocoSteamSnowPlow.class, new ModelSnowPlow(), "train_snowplow", false, new float[] { -2F, 0.12F, 0F }, new float[] { 0F, 180F, 180F }, null,  "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { 3.15D, 1.6D, 0.0D });
		}
	}, "", null, 0, false),

	/** JCIR-TC **/
	geometryCar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.ExperimentalGeometryCar.class,new ModelGeometryCar(), "geometrycar_", true, new float[] {0F, 0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HighrailTruck( com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailTruck.class,  new ModelHighrailTruck(), "highrail_", true,new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 1,  new ArrayList<double[]>() {
		{
			add(new double[]{-0.3D, -0.4D, 0.2D});
		}
	}, "", null, 0, false),
	FRED(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.FRED.class, new ModelFRED(),"fred", false, new float[]{0F, 0.05F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	/*CF7R( com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselCF7R.class,  new ModelCF7R(), "cf7r_", true,new float[] {-1.5F, -0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.4D, 0.0D});
			add(new double[]{1.1D, 1.4D, 0.0D});

		}
	}, "", null, 0, false),*/
	geGenesis(com.jcirmodelsquad.tcjcir.vehicles.locomotives.GeGenesis.class, new ModelGe_Genesis(), "genesis_", true, new float[] {-2.7F, -0.33F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke",  5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.8D, 1.3D, 0D});

		}
	}, "", null, 0, false),
	LogcarNP(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.LogcarNP.class, new ModelLogcarNP(), "logcarNP_", true,new float[]{0F,0,0F,}, new float[] {0F,0F,180F,}, null, "",0, null, "", null, 0, false),
	//HuskyStackWellcar(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.HuskyStackWellcar.class, new com.jcirmodelsquad.tcjcir.models.trainsModelHuskyStackWellcar(), "huskystack_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	testControlCar(TestControlCar.class, new ModelPassengerHighSpeedCarZeroED(), "passengerHighSpeedCarZeroED_", true, new float[] { 0.0F, -0.47F, 0.0F }, null, null, "", 0, null, "", null, 0, false),
	pch100(com.jcirmodelsquad.tcjcir.vehicles.locomotives.PCH100H.class, new ModelPCH100H(), "pch100h_", true, new float[]{-3.2F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch100coach(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.PCH100HCoach.class, new ModelPCH100HCoach(), "pch100hcoach_", true, new float[]{-2F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	LUengine(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricLUengine.class, new com.jcirmodelsquad.tcjcir.models.trains.ModelLUengine(), "lu_engine", false,new float[] {-1.0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	LUpassenger(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.LUpassenger.class, new com.jcirmodelsquad.tcjcir.models.trains.ModelLUpassenger(), "lu_passenger",false,new float[] {0F, 0.16F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	aipkitExplorer(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer.class, new ModelAipkitExplorer(), "aipkit_explorer", false, new float[]{0F, 0.03F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	aipkitExplorer2(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.AipkitExplorer2.class, new ModelExplorer2(), "aipkit_explorerii_", true, new float[]{0.6F, 0F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Class345(com.jcirmodelsquad.tcjcir.vehicles.locomotives.ElectricClass345.class, new ModelClass345(), "class345", false,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Class345Coach( com.jcirmodelsquad.tcjcir.vehicles.rollingstock.Class345Coach.class, new ModelClass345Coach(),"class345coach", false, new float[] {0F, 0F, 0F},  new float[] { 0F, 180F, 180F },null, "", 0, null, "", null, 0, false),
	BoulderWagon(com.jcirmodelsquad.tcjcir.vehicles.rollingstock.BoulderWagon.class, new ModelBoulderWagon(),"BoulderWagon_",true, new float[]{0F,0.2F,0F}, new float[] { 0F, 180F, 180F },null, "",0,null,  "",null, 0,false),
	Hustler(com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHustler.class, new ModelHustler(), "hustler_", true, new float[]{-1F, 0.2F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HighrailVan( com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHighrailVan.class,  new ModelHighrailVan(), "highrailvan_", true,new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 1,  new ArrayList<double[]>() {
		{
			add(new double[]{-0.3D, -0.4D, 0.2D});
		}
	}, "", null, 0, false),


	/**STEAM**/
	Climax2(SteamClimaxNew.class, new ModelClimaxNew(), "climax_Grey", false, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 180F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 1.55D, 1.6D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.0D, -0.0D, 0.8D });
		}
	}, 2, true),
	VBShay(SteamVBShay2.class, new ModelVBShay2(), "vbshay2_", true, new float[] { -0.4F, -1.15F, -0.0F }, new float[] { 0F, 0F, 0F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.9D, -0.1D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, -0.4D, 0.8D });
			add(new double[] { 0.3D, 2.3D, 0.0D });
		}
	}, 2, true),
	Skook(SteamSkook.class, new ModelSkookum(), "skookum", false, new float[] { -0.0F, -0.0F, -0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 2.4D, 1.5D, -0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.8D });
			add(new double[] { 2.5D, -0.4D, 0.8D });
			add(new double[] { -0.5D, 1.5D, 0.0D });
		}
	}, 2, true),
	SkookTender(TenderSkookTender.class, new ModelSkookumTender(), "skookumtender", false, new float[] {-0.00F, 0.0F, 0F},  new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	Shay3Truck(SteamShay3Truck.class,  new ModelShay3Truck(), "3truckShay_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[] { 2.15D, 1.3D, -0.17D });//1.1D
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 0.9D, -0.4D, 0.6D });
			//add(new double[] { 0.6D, 1.1D, 0.0D });
		}
	}, 2, true),
	Shay3TruckTender(TenderShay3Truck.class, new ModelShay3TruckTender(), "3truckShay_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	locoC11(SteamC11.class, new ModelC11(), "locoC11", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 3.05D, 1.25D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.00D, 0.75D });
		}
	}, 3, true),
	Onion(SteamOnion.class, new ModelOnion(), "Onion_", true, new float[] { -0.7F, 0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "largesmoke", 20, new ArrayList<double[]>() {
		{
			add(new double[] { 0.6D, 1.5D, 0.0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, -0.4D, 0.8D });
		}
	}, 2, true),
	OnionTender(TenderOnion.class, new ModelOnionTender(), "Onion_Tender_", true, new float[] { 0.0F, 0.1F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),
	PELoco(SteamPELoco.class, new ModelPE_Loco(), "PELoco", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 3, new ArrayList<double[]>() {
		{
			add(new double[] { 3.1D, 1.4D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.9D, 0.05D, 0.65D });
		}
	}, 2, true),
	PETender(TenderPETender.class, new ModelPE_Tender(), "PETender", false, new float[] { 0.1F, 0.15F, 0.0F }, new float[] { 0F, 0F, 180F }, null, "", 0, null, "", null, 0, false),

	F01(SteamF01.class, new ModelF01(), "F01_texture", false, new float[] {  -1.5F, 0.15F, 0.0F }, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 0D, 0D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 2.2D, -0.2D, 0.75D });//pistons
			//add(new double[] { -0.7D, 1.4D, 0.0D });//dynamo
		}
	}, 2, true),
	BKno2a(SteamBKno2a.class, new ModelBKno2a(), "BoothKelly_", true, new float[] {-1.5F, 0.15F, 0.0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			//add(new double[] { 0D, 0D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { 1.2D, -0.2D, 0.75D });//pistons
		}
	}, 2, true),
	BKno2b(SteamBKno2b.class, new ModelBKno2b(), "BoothKelly_", true, new float[] {-1.5F, 0.15F, 0.0F}, new float[] { 0, 180, 180 }, null, "largesmoke", 5, new ArrayList<double[]>() {
		{
			add(new double[] { 0D, 0D, 0D });
		}
	}, "explode", new ArrayList<double[]>() {
		{
			add(new double[] { -2.2D, -0.2D, 0.75D });//pistons
		}
	}, 2, true),

	/**EMD**/
	F3A( DieselF3A.class,  new ModelF3A(), "f3a_", true,new float[] {-1.375F, 0.1F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9375D, 1.4D, 0.0D});
			add(new double[]{0.25D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	F7A( DieselF7A.class,  new ModelF7A(), "F7A_", true,new float[] {-1.375F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.9375D, 1.3D, 0.0D});
			add(new double[]{0.25D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	F7B( DieselF7B.class,  new ModelF7B(), "F7B_", true,new float[] {-1.25F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.35D, 1.3D, 0.0D});
			add(new double[]{0.55D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	CF7angle( DieselCF7angle.class,  new ModelCF7angle2(), "CF7_Angle_", true,new float[] {-0F, -0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	CF7round( DieselCF7round.class,  new ModelCF7rouny2(), "CF7_Round_", true,new float[] {-0F, -0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			//add(new double[]{0.6D, 1.4D, 0.0D});
			//add(new double[]{1.1D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	CF7angle2( DieselCF7angle2.class,  new ModelCF7angle2(), "CF7_Angle_DBRR_", true,new float[] {-0F, -0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	F40PH( DieselF40PH.class,  new ModelF40PH(), "f40ph_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	EMDE7A( DieselE7A.class,  new ModelE7A(), "EMDE7A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	EMDE7B( DieselE7B.class,  new ModelE7B(), "EMDE7B_", true,new float[] {-1.75F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	E8A( DieselE8A.class,  new ModelE8A(), "EMDE8A_", true,new float[] {-1.85F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	E8B( DieselE8B.class,  new ModelE8B(), "EMDE8B_", true,new float[] {-1.75F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	E9A( DieselE9A.class,  new ModelE9A(), "e9a_", true,new float[] {-2F, 0.1F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9375D, 1.3215D, 0.0D});
			add(new double[]{1.125D, 1.3125D, 0.0D});
		}
	}, "", null, 0, false),
	E9B( DieselE9B.class,  new ModelE9B(), "e9b_", true,new float[] {-2F, 0.1F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{2.125D, 1.3215D, 0.0D});
			add(new double[]{1.3125D, 1.3125D, 0.0D});
		}
	}, "", null, 0, false),

	GP7( DieselGP7.class,  new ModelGP7newer(), "gp7new_", true,new float[] {-0F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP7b( DieselGP7b.class,  new ModelGP7b(), "bettergp7b_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7u( DieselGP7u.class,  new ModelGP7u(), "gp7u_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP7f( DieselGP7f.class,  new ModelGP7newer(), "gp7f_", true,new float[] {-0F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 2,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP9( DieselGP9.class,  new ModelGP7newer(), "gp9_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP7old( DieselGP7old.class,  new ModelGP7new(), "gp7old_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP9old( DieselGP9old.class,  new ModelGP9(), "gp9old_", true,new float[] {-1.5F, -0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.45D, 1.35D, 0.0D});
			add(new double[]{1.25D, 1.35D, 0.0D});
		}
	}, "", null, 0, false),
	GP13( DieselGP13.class, new ModelGP13(), "gp13_", true, new float[] { -0.8F, -0.55F, 0.0F }, new float[] { 0F, 180F, 0F }, null, "smoke", 4, new ArrayList<double[]>() {
		{
			add(new double[] { -0.2D, 1.2D, 0.0D });
			add(new double[] { 0.45D, 1.2D, 0.0D });
		}
	}, "", null, 0, false),
	GP15( DieselGP15.class,  new ModelGP15(), "gp15_", true,new float[] {-1.3F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP30( DieselGP30.class,  new ModelGP30(), "gp30_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			//add(new double[]{1.9D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash2( DieselGP38dash2.class,  new ModelGP38dash2(), "gp38dash2_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.4D, 0.0D});
			add(new double[]{1.55D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	GP38dash9W( DieselGP38dash9W.class, new ModelGP38dash9W(), "GP38-2W_Fixxed_MTS_2", false,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP38H3( DieselGP38H3.class,  new ModelGP38H3(), "gp38h3_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP38( DieselGP38.class,  new ModelGP38(), "gp38_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP39( DieselGP39.class,  new ModelGP40new(), "gp39_", true,new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP40( DieselGP40.class,  new ModelGP40new(), "gp40_", true,new float[] {-0F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP40TC( DieselGP40TC.class,  new ModelGP40TC(), "gp40tc_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	GP49( DieselGP49.class,  new ModelGP49(), "gp49_arr_2807", false,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	SD9(DieselSD9.class,  new ModelSD9(), "SD9_", true,new float[] {-1.6F,0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			//add(new double[]{0.8D, 1.4D, 0.0D});
			//add(new double[]{1.6D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),
	SD38(DieselSD38.class, new ModelSD38(), "sd38_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SD39(DieselSD39.class, new ModelSD39(), "sd39_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SDL39( DieselSDL39.class, new ModelSDL39(), "SDL39_", true,new float[] {-1.5F, -0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			//add(new double[]{1.5D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	SD40dash2(DieselSD40dash2.class, new ModelSD40dash2(), "sd40dash2_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SD40T2( DieselSD40T2.class,  new ModelSD40T(), "SD40T_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SD40dash2B(DieselSD40dash2B.class, new ModelSD40dash2B(), "sd40dash2b_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SDP40(DieselSDP40.class, new ModelSD40dash2(), "sdp40_", true,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SDP40F( DieselSDP40F.class,  new ModelSDP40F(), "sdp40f_", true,new float[] {-2F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.55D, 1.5D, 0.0D});
		}
	},"", null, 0, false),
	SD45dash2(DieselSD45dash2.class,  new ModelSD45dash2(), "sd45_", true,new float[] {-0F, -0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SD45dash2B( DieselSD45dash2B.class,  new ModelSD45dash2B(), "sd45dash2b_", true,new float[] {-1.9F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.5D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	FP45( DieselFP45.class,  new ModelFP45(), "fp45_", true,new float[] {-2F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.55D, 1.5D, 0.0D});
		}
	},"", null, 0, false),
	F45( DieselF45.class,  new ModelF45(), "f45_", true,new float[] {-1.75F, -0.14F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{
			add(new double[]{2.25D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	SD70Mac( DieselSD70Mac.class, new ModelSD70Mac(), "sd70mac_", true,new float[] {-2.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			//add(new double[]{2.35D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	SW1( DieselSW1.class,  new ModelSW1(), "sw1_new_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SW8( DieselSW8.class,  new ModelSW8(), "sw8_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{1.3D, 1.3D, 0.0D});
		}
	}, "", null, 0, false),
	SW1000( DieselSW1000.class,  new ModelSW1000(), "sw1000_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SW1200( DieselSW1200.class,  new ModelSW1200(), "sw1200_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SW1500(DieselSW1500.class,  new ModelSW1500(), "sw1500_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	MP15DCW9( DieselMP15DCW9.class,  new ModelMP15DCW9(), "mp15dcw-9_", true,new float[] {-1.2F, -0.01F, 0F},  new float[] { 180F, 180F, 0F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.05D, 1.5D, 0.0D});
			add(new double[]{0.25D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),

	Beep( DieselBeep.class,  new ModelBeep(), "atsfbeep", false,new float[] {-0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.45D, 1.25D, 0.0D});
			add(new double[]{1.65D, 1.25D, 0.0D});
			add(new double[]{1.05D, 1.25D, 0.0D});
			add(new double[]{1.25D, 1.25D, 0.0D});
		}
	}, "", null, 0, false),

	/**GE**/
	GE44Ton( DieselGE44Ton.class,  new ModelGE44Ton(), "44_ton_", true,new float[] {-1.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
			add(new double[]{1.4D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),
	Boxcab23Ton( DieselBoxcab23Ton.class,  new ModelBoxcab23Ton(), "boxcab_", true,new float[] {-0.75F, 0.2F, 0F},  new float[] { 0F, 0F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ //note: use {-0.5F, 0.2F, 0F} and -1 for main hitbox and bogie position if the "fliparound" error is fixed, knowing eternal, not likely. sorry about extra thicc hitboxes -bid
			add(new double[]{0.6D, 1.2D, 0.0D});
		}
	}, "", null, 0, false),
	GE25Ton( DieselGE25Ton.class,  new ModelGE25Ton(), "25ton_", true,new float[] {0.0F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.6D, 1.1D, 0.0D});
		}
	}, "", null, 0, false),

	U18B( DieselU18B.class,  new ModelU18B(), "U18B_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	U18BB( DieselU18BB.class,  new ModelU18BB(), "U18BB_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	U18BW( DieselU18BW.class,  new ModelU18BW(), "U18BW_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	U18Balt( DieselU18Balt.class,  new ModelU18B(), "U18B_MNFP_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 2,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	U23B( DieselU23B.class,  new ModelU23B(), "u23b_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	U30C( DieselU30C.class,  new ModelU30C(), "U30C_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SF30C( DieselSF30C.class,  new ModelSF30C(), "sf30c_", true,new float[] {-2.5F, -0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.75D, 1.5D, 0.0D});
		}
	}, "", null, 0, false),
	U36C( DieselU36C.class,  new ModelU36C(), "u36c_", true,new float[] {-2.3125F, -0.15F/* -0.13F*/, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{
			//add(new double[]{0.75D, 1.75D, 0.0D});
		}
	}, "", null, 0, false),

	B23( DieselB23.class,  new ModelB23(), "b23_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SB23R( DieselSB23R.class,  new ModelSB23R(), "sb23r_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	SB23E( DieselSB23E.class,  new ModelSB23E(), "sb23e_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 0F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	B30( DieselB30.class,  new ModelB30(), "b30_", true,new float[] {-1.7F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	Dash840B( DieselDash840B.class,  new ModelDash840B(), "dash8_40b_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	Dash840BB( DieselDash840BB.class,  new ModelDash840BB(), "dash8_40b_b_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	Dash840BW( DieselDash840BW.class,  new ModelDash840BW(), "dash8_40bw_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	Dash840C( DieselDash840C.class,  new ModelDash840C(), "dash8_40c_", true,new float[] {-0F, -0.0F, 0F},  null, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	Dash944CW( DieselDash944CW.class,  new ModelDash944CW(), "dash9_44cw_", true,new float[] {-2.2F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	ES44( DieselES44.class,  new ModelES44(), "es44_", true,new float[] {-2.2F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.0D, 1.4D, 0.0D});
		}
	}, "", null, 0, false),

	/**ALCO**/
	AlcoPA1( DieselPA1.class,  new ModelPA(), "AlcoPA1_", true,new float[] {-1.6F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),
	AlcoPB1( DieselPB1.class,  new ModelPB(), "AlcoPB1_", true,new float[] {-1.55F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  new float[] { 1F, 1.0F, 1F }, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	C415H( DieselC415H.class,  new ModelC415H(), "C415h_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	C415S( DieselC415S.class,  new ModelC415S(), "C415s_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	C415L( DieselC415L.class,  new ModelC415L(), "C415l_", true,new float[] {-1.2F, 0.105F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.85D, 1.55D, 0.0D});
		}
	}, "", null, 0, false),
	C424( DieselC424.class,  new ModelC424(), "c424_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	C425( DieselC425.class,  new ModelC425(), "c425_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "largesmoke", 2,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),
	DH643( DieselDH643.class,  new ModelDH643(), "alco_dh423_not_dumb", false,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	HH660( DieselHH660.class,  new ModelHH660(), "hh660_", true,new float[] {-1F, -0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),
	S2( DieselS2.class,  new ModelAlcoS2(), "alcos2_", true,new float[] {0f, 0f, 0f},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{0.7D, 1.3D, -0.18D});
		}
	}, "", null, 0, false),

	RSD15( DieselRSD15.class,  new ModelRSD15(), "rsd15_", true,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	/**BRUHWIN**/
	VO1000( DieselVO1000.class,  new ModelVO1000(), "vo1000_", true,new float[] {-1.1F, 0.05F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{0.40D, 1.3D, 0D});
		}
	}, "", null, 0, false),

	/**Fairbanks Morse**/
	H1044( DieselH1044.class,  new ModelH1044(), "FM_H10-44_", true,new float[] {-1.1F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{1.9D, 1.35D, -0.16D});
			add(new double[]{1.9D, 1.35D, 0.16D});
		}
	}, "", null, 0, false),

	FMH16_66( DieselH16_66.class,  new ModelH16_66(), "FM_H16-66_", true,new float[] {-1.7F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	FMH24_66( DieselH24_66.class,  new ModelH24_66(), "FM_H24-66_", true,new float[] {-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	FMH24_66L( DieselH24_66L.class,  new ModelH24_66L(), "FM_H24-66_L_", true,new float[] {-1.9F, 0.15F, 0F},  new float[] { 0F, 180F, 180F },  null, "smoke", 3,  new ArrayList<double[]>() {
		{}
	}, "", null, 0, false),

	/**OTHER DIESELS**/
	NRE3gs21b( DieselNRE3gs21b.class,  new ModelNRE3gs21b(), "3gs21b_", true,new float[] {-1.5F, 0.155F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 3,  new ArrayList<double[]>() {
		{
			add(new double[]{0.15D, 1.3D, 0.0D}); //farthest from cab
			add(new double[]{1.05D, 1.3D, 0.0D}); //middle
			add(new double[]{2.0D, 1.3D, 0.0D}); // closest to cab
		}
	}, "", null, 0, false),
	gtavthing( Dieselgtavthing.class,  new Modelgtavthing(), "gtavthing_", true,new float[] {-1.5F, 0.15F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 5,  new ArrayList<double[]>() {
		{
			add(new double[]{1.8D, 1.2D, 0.0D});
		}
	}, "", null, 0, false),
	FOLM1B(DieselFOLM1B.class, new ModelFOLM1B(), "FOL_M1b_", true, new float[] { -2.2F, 0.05F, 0.F },  new float[] { 0F, 180F, 180F }, null, "smoke", 3, new ArrayList<double[]>() {
		{
			add(new double[]{1.6D, 1.45D, 0.0D});
		}
	}, "", null, 0, false),
	Krautt(DieselKrautt.class,  new ModelKrautt(), "KM_ML4000_", true,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 6,  new ArrayList<double[]>() {
		{ }}, "", null, 0, false),
	ILMC( DieselILMC.class,  new ModelILMC(), "ILMC", false,new float[] {0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{ }
	}, "", null, 0, false),

	/**ELECTRICC**/
	EF1(ElectricEF1.class,  new ModelEF1(), "ef1_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EF1B(ElectricEF1B.class,  new ModelEF1B(), "ef1b_", true,new float[] {-1.15635F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EP1A(ElectricEP1A.class,  new ModelEP1A(), "ep1a_", true,new float[] {-1.60F, 0.1875F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	GM6C(ElectricGM6C.class,  new ModelGM6C(), "GM6C_demo", false,new float[] {-0.0F, 0.0F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ILMA(ElectricILMA.class, new ModelILMA(), "ILMA_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ILMB(ElectricILMB.class, new ModelILMB(), "ILMB_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	JT7(ElectricJT7.class, new ModelJT7(), "jt7_bigJ_", true, new float[] { 0.0F, 0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	AEM7(ElectricAEM7.class, new ModelAEM7(), "AEM-7_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**FREIGHT**/
	RoundHopper(RoundHopper.class, new ModelRoundHopper(), "roundedhopper_", true, new float[] { -0F,0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	RibbedHopper(RibbedHopper.class, new ModelRibbedHopper(), "ribbed_hopper_", true, new float[] { -0F,0.1F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper5201(Hopper5201.class, new ModelHopper5201(), "5201_", true, new float[] { -0F,0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hopper6260(Hopper6260.class, new ModelHopper6260(), "6260_", true, new float[] { -0F,0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC2375Hopper(FNCC2375Hopper.class, new ModelFNCC2375Hopper(), "FNCC2375_", true, new float[] { -0F,0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Freight60centerbeam(Freight60centerbeam.class, new Model60centerbeam(),"60ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight66centerbeam(Freight66centerbeam.class, new Model66centerbeam(),"66ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight73centerbeam(Freight73centerbeam.class, new Model73centerbeam(),"73ftcb_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSI60FootBulkhead(GSI60FootBulkhead.class, new ModelGSI60FootBulkheadFlat(),"gsi_60bulk_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	GSC60FootFlat(GSC60FootFlat.class, new ModelGSI60FootBulkheadFlat(),"gsc_60flat_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Thrall63centerbeam(Thrall63centerbeam.class, new Modelthrall63centerbeam(),"thrall63centerbeam_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC60FootBulk(FNCC60FootBulk.class, new ModelFNCC60FootBulk_fix(),"FNCC60FootBulk_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PS140(PS140.class, new ModelPS140(),"ps140_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS150(PS150.class, new ModelPS150(),"ps150_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS160(PS160.class, new ModelPS160(),"ps160_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OWO60Verticube(OWO60Verticube.class, new ModelFNCC60FootVerticube(),"verticube60_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MILW40boxcar(MILW40boxcar.class, new ModelMILW40boxcar(),"milw40_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Freight40highcube(Freight40highcube.class, new Model40highcube(),"40highcube_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Hicube60(Hicube60foot.class, new Modelhicube60foot(),"hicube60_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Reefer64(Reefer64Foot.class, new ModelReefer64Foot(),"reefer_64_", true, new float[]{0F, 0.155F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	FNCC50Foot(FNCC50Foot.class, new ModelFNCC50Foot(),"FNCC50Foot_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	VersaLongi(VersaLongi.class, new ModelVersaLongi(),"versa_longi_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	VersaTrans(VersaTrans.class, new ModelVersaTrans(),"versa_trans_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	MillGondola(MillGondola.class, new ModelMillGondola(),"MillGondola_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	WoodchipHopper(WoodchipHopper.class, new ModelWoodchipHopper(),"woodchiphopper_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	OreJenny(OreJenny.class, new ModelOreJenny(),"orejenny_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	DOT11111000(DOT11111000.class, new Model11000DOT111(),"dot11K_", true, new float[]{0F, 0.00F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11120600(DOT11120600.class, new Model20600DOT111(),"dot206K_", true, new float[]{0F, 0.00F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11129080(DOT11129080.class, new Model29080DOT111(),"dot290K_", true, new float[]{0F, 0.00F /*was 0.20F for height*/, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	DOT11117600(DOT11117600.class, new Model17600DOT111(),"17600galTank_", true, new float[]{0F, 0.00F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Skeleton(SkeletonLogCar.class, new ModelSkeletonLogCar(), "SkeletonLogCar_", true, new float[] { 0.0F, -0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	EarlyFlat(EarlyFlat.class, new ModelEarlyFlat(), "EarlyFlatCar", false, new float[] { 0.0F, -0.0F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	Gunderson89FootAutorack(Gunderson89ftAutorack.class, new ModelGunderson89FootAutorack(), "89ftAutorack_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Gunderson89FootFlat(Gunderson89ftFlat.class, new ModelGunderson89FootFlat(), "89ftFlat_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	StampedeRack(StampedeRack.class, new ModelStampedeRack(), "cswr_stampederack_", true, new float[] { 0.0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	IngotPig(IngotPig.class, new ModelIngotPig(),"MoltenIngotPig_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	SteelSlabFlat(SteelSlabFlat.class, new ModelSteelSlabFlat(),"steelslab15_", true, new float[]{0F, 0.0F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**PASSENGER**/
	pch120commute(PCH120Commute.class, new ModelPCH120Commute(), "pch120commute_", true,new float[] {-1.3F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	pch120coach(PCH120Coach.class, new ModelPCH120Car(), "pch120car_", true,new float[] {0F, 0.01F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSRPO(PSRPO.class, new ModelPSRPO(), "PSRPO_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS85Baggage(PS85Baggage.class, new ModelPS85Baggage(), "PS_lightweight_85_baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSCombine(PSCombine.class, new ModelPSCombine(), "PS_lightweight_baggage-coach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS52SeatCoach(PS52SeatCoach.class, new ModelPS52SeatCoach(), "PS_lightweight_52seat_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSDamnitAnotherDiner(PSDamnitAnotherDiner.class, new ModelPSscrewyoutoomanydiners(), "PS_lightweight_center_diner_2_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSSleeper565(PSSleeper565.class, new ModelPSSleeper565(), "PS_lightweight_5-6-5_sleeper_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSSleeper565DRGW(PSSleeper565DRGW.class, new ModelPSSleeper565DRGW(), "PS_DRGW_lightweight_5-6-5_sleeper", false, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPSLunchCounter_Lounge(PSLunchCounter_Lounge.class, new ModelPSLunchCounter_Lounge(), "PS_lightweight_LunchCounter_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	passengerPS30SeatParlor(PS30SeatParlor.class, new ModelPS30SeatParlor(), "PS_lightweight_30SeatParlor_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSRPOPM(PSRPOPM.class, new ModelPSRPOPM(), "PSRPOPM_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS73Baggage(PS73Baggage.class, new ModelPS73Baggage(), "PS_Baggage_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS54SeatCoach_Lounge(PS54SeatCoach_Lounge.class, new ModelPS54SeatCoach_Lounge(), "PS_lightweight_54SeatCoach_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PScenterDiner(PScenterDiner.class, new ModelPScenterDiner(), "PS_lightweight_center_diner_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PS58SeatCoach_Observation(PS58SeatCoach_Observation.class, new ModelPS58SeatCoach_Observation(), "PS_lightweight_58SeatCoach_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PSBMCombine(PSBMCombine.class, new ModelPSBMCombine(), "PS_lightweight_BMCombine_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSBM56SeatCoach(PSBM56SeatCoach.class, new ModelPSBM56SeatCoach(), "PS_lightweight_BM56SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PSBMDiner_Lounge(PSBMDiner_Lounge.class, new ModelPSBMDiner_Lounge(), "PS_lightweight_BMDiner_Lounge_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	ACFGNRPO_30(ACFGNRPO_30.class, new ModelACFGNRPO_30(), "AC&F_lightweight_GNRPO30_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGN60SeatCoach(ACFGN60SeatCoach.class, new ModelACFGN60SeatCoach(), "AC&F_lightweight_GN60SeatCoach_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	ACFGNDinerObservation(ACFGNDinerObservation.class, new ModelACFGNDinerObservation(), "AC&F_lightweight_GNDiner_Observation_", true, new float[] { 0F, 0.15F, 0.0F }, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	amfleet(Amfleet.class, new ModelAmfleet(),"amfleet_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	amfleet2(Amfleet2.class, new ModelAmfleet2(),"amfleet2_", true, new float[]{0F, -0.45F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	PEcoach(PEcoach.class, new ModelPEcoach(),"PECoach_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	PEobserve(PEobserve.class, new ModelPEobserve(),"PEObserve_", true, new float[]{0F,  0.105F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),

	/**OTHER ROLLING SHIZZLE**/
	WVcaboose(WVcaboose.class, new ModelWVcaboose(),"wvcaboose_", true, new float[]{0F, 0.1675F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HBC1C(HBC1Cboose.class, new ModelHBC1C(),"HBC1C_", true, null, null, null, "", 0, null, "", null, 0, false),
	DRGWCaboose(DRGWboose.class, new ModelDRGW01400Caboose(),"BAP_DRGW_01400_", true, null, null, null, "", 0, null, "", null, 0, false),

	BigMeme(BigMeme.class, new ModelBigMeme(),"bigmeme_", true, new float[]{-1F, 0.1875F, 0F}, new float[] { 180F, 180F, 0F }, null, "", 0, null, "", null, 0, false),
	BombCart(BombCart.class, new ModelBombCart(), "payload_", true, new float[]{0F, 0.15F, 0F}, new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	Thanos(Thanos.class, new ModelLocoMinetrain(), "thanos", false,new float[] {-0.8F, -0.47F, 0.0F},  new float[] { 0F, 0F, 0F }, null, "", 0, null, "", null, 0, false),
	TGVmobile( DieselTGVmobile.class,  new ModelTGVMobile(), "tgvmobile_Orange", false,new float[] {-1.5F, 0.2F, 0F},  new float[] { 0F, 180F, 180F }, null, "", 0, null, "", null, 0, false),
	HHgregg( com.jcirmodelsquad.tcjcir.vehicles.locomotives.DieselHHgregg.class,  new ModelHH660(), "hhgregg", false,new float[] {-1F, -0.1F, 0F},  new float[] { 0F, 180F, 180F }, null, "smoke", 4,  new ArrayList<double[]>() {
		{
			add(new double[]{2.0D, 1.35D, 0D});
		}
	}, "", null, 0, false),

	;

	private Class<? extends AbstractTrains> entityClass;
	private ModelBase model;
	private String texture;
	private boolean multiTexture;
	private float[] trans;
	private float[] rotate;
	private float[] scale;
	private String smokeType;
	private ArrayList<double[]> smokeFX;
	private String explosionType;
	private ArrayList<double[]> explosionFX;
	private int smokeIterations;
	private int explosionFXIterations;
	private boolean hasSmokeOnSlopes;

	/**
	 * Defines the render @param for a RollingStock
	 *
	 * @param model ModelBase
	 * @param texture String
	 * @param multiTexture boolean
	 * @param trans float[]
	 * @param rotate float[]
	 * @param scale float[]
	 * @param smokeType String
	 * @param smokeFX ArrayList
	 * @param explosionType String
	 * @param explosionFX ArrayList
	 * @see RenderRollingStock
	 */
	RenderEnum(Class<? extends EntityRollingStock> entityClass, ModelBase model, String texture, boolean multiTexture, float[] trans, float[] rotate, float[] scale, String smokeType, int smokeIterations, ArrayList<double[]> smokeFX, String explosionType, ArrayList<double[]> explosionFX, int explosionFXIterations, boolean hasSmokeOnSlopes) {
		this.entityClass = entityClass;
		this.model = model;
		this.texture = texture;
		this.multiTexture = multiTexture;
		this.trans = trans;
		this.rotate = rotate;
		this.scale = scale;
		this.smokeType = smokeType;
		this.smokeFX = smokeFX;
		this.explosionType = explosionType;
		this.explosionFX = explosionFX;
		this.smokeIterations = smokeIterations;
		this.explosionFXIterations = explosionFXIterations;
		this.hasSmokeOnSlopes = hasSmokeOnSlopes;
	}

	public Class<? extends AbstractTrains> getEntityClass() {
		return entityClass;
	}

	public ModelBase getModel() {
		return model;
	}

	public boolean getIsMultiTextured() {
		return multiTexture;
	}

	public boolean hasSmoke() {
		return smokeType.length() > 0;
	}

	public boolean hasSmokeOnSlopes() {
		return hasSmokeOnSlopes;
	}

	public String getSmokeType() {
		return smokeType;
	}

	public ArrayList<double[]> getSmokeFX() {
		return smokeFX;
	}

	public String getExplosionType() {
		return explosionType;
	}

	public boolean hasExplosion() {
		return explosionType.length() > 0;
	}

	public ArrayList<double[]> getExplosionFX() {
		return explosionFX;
	}

	public float[] getTrans() {
		return trans;
	}

	public float[] getRotate() {
		return rotate;
	}

	public float[] getScale() {
		return scale;
	}

	public String getTexture() {
		return texture;
	}

	public int getSmokeIterations() {
		return smokeIterations;
	}

	public int getExplosionFXIterations() {
		return explosionFXIterations;
	}
}
