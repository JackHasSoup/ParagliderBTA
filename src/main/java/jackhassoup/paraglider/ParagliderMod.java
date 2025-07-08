package jackhassoup.paraglider;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class ParagliderMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = "paraglider";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static ParagliderItem paraglider;


	@Override
	public void onInitialize() {
		LOGGER.info("Paraglider Mod initialized.");

		ItemBuilder genericItemBuilder = new ItemBuilder(MOD_ID);
		paraglider = genericItemBuilder.setStackSize(1).build(new ParagliderItem("paraglider:item/paraglider","paraglider",19999));
		CreativeHelper.setPriority(paraglider, 1000);
	}


	@Override
	public void beforeGameStart() {

	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		ParagliderModRecipes.InitRecipes();
	}

	@Override
	public void initNamespaces() {
		ParagliderModRecipes.InitNameSpaces();
	}
}
