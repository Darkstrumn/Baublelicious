package com.baublelicious.helpers;

import baubles.api.IBauble;
import baubles.common.container.InventoryBaubles;
import baubles.common.lib.PlayerHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;

import java.util.List;
import java.util.UUID;

public class PlayerHelper {
  public static EntityPlayer getPlayerFromUUID(UUID uuid) {
    return getPlayerFromUUID(uuid.toString());
  }

  @SuppressWarnings("unchecked")
  public static EntityPlayer getPlayerFromUUID(String uuid) {
    if (FMLCommonHandler.instance().getEffectiveSide().isClient()) {
      return Minecraft.getMinecraft().thePlayer.getUniqueID().toString().equals(uuid) ? Minecraft.getMinecraft().thePlayer : null;
    } else {
      List<EntityPlayerMP> playerList = MinecraftServer.getServer().getConfigurationManager().playerEntityList;
      for (EntityPlayerMP player : playerList) {
        if (player.getUniqueID().toString().equals(uuid)) {
          return player;
        }
      }
    }

    return null;
  }

  public static boolean isWithinRangeOf(EntityPlayer player, int x, int y, int z, int range) {
    return player.posX >= x - range && player.posX <= x + range + 1 && player.posY >= y - range && player.posY <= y + range + 1 && player.posZ >= z - range && player.posZ <= z + range + 1;
  }

  public static boolean isWearingBauble(EntityPlayer player, IBauble bauble) {
    InventoryBaubles inventory = PlayerHandler.getPlayerBaubles(player);
    for (int slot = 0; slot < inventory.getSizeInventory(); slot++) {
      ItemStack stack = inventory.getStackInSlot(slot);
      if (stack != null && stack.getItem() == bauble) {
        return true;
      }
    }
    return false;
  }
}