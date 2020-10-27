package com.elytraforce.elytracore.commands;

import org.bukkit.entity.Player;

import com.elytraforce.elytracore.Main;
import com.elytraforce.elytracore.player.ElytraPlayer;
import com.elytraforce.elytracore.player.PlayerController;
import com.elytraforce.elytracore.utils.MessageController;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandCompletion;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Optional;
import co.aikar.commands.annotation.Syntax;

@CommandAlias("bal|balance")
public class BalanceCommand extends BaseCommand{
	
	public static final String WILDCARD = "*";

    private final Main main;

    public BalanceCommand(Main main) {
        this.main = main;
    }

    public Main getInstance() { return main; }
    
    @Default
    @CommandCompletion("@players @players")
    @Description("Lists your balance")
    public static void onBalance(Player player, @Optional Player player2) {
    	ElytraPlayer p;
    	
    	if (player2 == null) {
    		p = PlayerController.get().getLevelPlayer(player);
    	} else {
    		p = PlayerController.get().getLevelPlayer(player2);
    	}
    	
    	MessageController.balanceMessage(p);
    }
}