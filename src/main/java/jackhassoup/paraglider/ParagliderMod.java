package jackhassoup.paraglider;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModel;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.util.collection.NamespaceID;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.helper.CreativeHelper;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.ModelEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class ParagliderMod implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint, ModelEntrypoint {
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
	public void initBlockModels(BlockModelDispatcher blockModelDispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher)
	{
		ModelHelper.setItemModel(paraglider, () -> {
			ItemModelStandard model = new ItemModelStandard(paraglider, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getTemp(MOD_ID, "item/paraglider"));
			return model;
		});
	}

	@Override
	public void initEntityModels(EntityRenderDispatcher entityRenderDispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher tileEntityRenderDispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher blockColorDispatcher) {

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
