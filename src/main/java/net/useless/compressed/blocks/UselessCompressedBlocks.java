package net.useless.compressed.blocks;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UselessCompressedBlocks implements ModInitializer {

	public static String MODID = "uselesscompressedblocks";

	@Override
	public void onInitialize() {
		ItemInit.init();
	}
}
