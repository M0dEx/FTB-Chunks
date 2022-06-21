package dev.ftb.mods.ftbchunks.fabric;

import net.minecraft.server.level.ServerLevel;

import java.util.UUID;

public class FTBChunksExpectedImpl {
    public static void addChunkToForceLoaded(ServerLevel level, String modId, UUID owner, int chunkX, int chunkY, boolean add) {
        level.setChunkForced(chunkX, chunkY, add);
    }
}
