/*
 * This file is part of  DungeonBlocks.
 * Copyright (c) 2023 Mark Gottschling (gottsch)
 *
 * All rights reserved.
 *
 * DungeonBlocks is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * DungeonBlocks is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with DungeonBlocks.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */
package mod.gottsch.fabric.dungeonblocks.core;

import mod.gottsch.fabric.dungeonblocks.core.setup.Registration;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 */
public class DungeonBlocks implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("dungeonblocks");

	public static final String MOD_ID = "dungeonblocks";

	@Override
	public void onInitialize() {
		Registration.register();
	}
}
