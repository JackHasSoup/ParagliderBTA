package jackhassoup.paraglider;

import net.minecraft.client.render.EntityRenderDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import net.minecraft.client.render.texture.stitcher.TextureRegistry;
import net.minecraft.core.util.collection.NamespaceID;
import turniplabs.halplibe.helper.ModelHelper;
import turniplabs.halplibe.util.ModelEntrypoint;

import static jackhassoup.paraglider.ParagliderMod.MOD_ID;
import static jackhassoup.paraglider.ParagliderMod.LOGGER;

public class ParagliderModels implements ModelEntrypoint{
	@Override
	public void initBlockModels(BlockModelDispatcher blockModelDispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher itemModelDispatcher) {
		LOGGER.debug("LOADING MODEL");
		ModelHelper.setItemModel(ParagliderMod.paraglider, () -> {
			ItemModelStandard model = new ItemModelStandard(ParagliderMod.paraglider, MOD_ID);
			model.icon = TextureRegistry.getTexture(NamespaceID.getPermanent(MOD_ID, "item/paraglider"));
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
}
