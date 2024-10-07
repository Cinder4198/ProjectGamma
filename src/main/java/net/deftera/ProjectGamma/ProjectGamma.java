package net.deftera.ProjectGamma;

import net.deftera.ProjectGamma.Content.Items.GammaItems;
import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProjectGamma implements ModInitializer {


	public static final String MOD_ID = "ProjectGamma";
	public static final Logger LOGGER = LogManager.getLogger();
	@Override
	public void onInitialize() {

		LOGGER.info("Loading ProjectGamma...");
		GammaItems.registerModItems();


	}
}
