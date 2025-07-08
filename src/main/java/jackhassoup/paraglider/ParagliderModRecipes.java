package jackhassoup.paraglider;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeRegistry;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryFurnace;
import net.minecraft.core.item.Items;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;

import static jackhassoup.paraglider.ParagliderMod.MOD_ID;
import static jackhassoup.paraglider.ParagliderMod.paraglider;

public class ParagliderModRecipes extends RecipeRegistry {
	public static final RecipeNamespace PARAGLIDER = new RecipeNamespace();


	public static void InitRecipes() {
		RecipeBuilder.Shaped(MOD_ID).setShape(
				" F ",
				"LCL",
				"SIS")
			.addInput('F', Items.FEATHER_CHICKEN)
			.addInput('S', Items.STRING)
			.addInput('L', Items.LEATHER)
			.addInput('C', Items.CLOTH)
			.addInput('I', Items.INGOT_IRON)
			.create("ParagliderRecipe", paraglider.getDefaultStack());
	}

	public static void InitNameSpaces() {
		final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Blocks.WORKBENCH)));
		PARAGLIDER.register("workbench", WORKBENCH);
		Registries.RECIPES.register("paraglider", PARAGLIDER);
	}

}
