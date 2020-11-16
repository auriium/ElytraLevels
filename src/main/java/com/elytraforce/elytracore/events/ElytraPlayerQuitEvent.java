package com.elytraforce.elytracore.events;

import com.elytraforce.elytracore.player.ElytraPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class ElytraPlayerQuitEvent extends Event {

    private ElytraPlayer player;

    public ElytraPlayer getElytraPlayer() { return this.player; }
    public Player getBukkitPlayer() { return this.player.asBukkitPlayer(); }

    public ElytraPlayerQuitEvent(ElytraPlayer player) {
        this.player = player;
    }

    private static final HandlerList HANDLERS = new HandlerList();

    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}