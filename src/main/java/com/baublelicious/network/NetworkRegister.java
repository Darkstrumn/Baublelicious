package com.baublelicious.network;

import com.baublelicious.handler.MessageToggleGrowthAmulet;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

public class NetworkRegister {
  public static final SimpleNetworkWrapper wrapper = NetworkRegistry.INSTANCE.newSimpleChannel("SimplyJetpacks");

  public static void registerMessages() {
    wrapper.registerMessage(MessageToggleGrowthAmulet.class, MessageToggleGrowthAmulet.class, 0, Side.SERVER);
  }
}