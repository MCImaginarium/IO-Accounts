package org.iocraft.accounts;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Player;
import org.bukkit.permissions.ServerOperator;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Server;
import org.bukkit.World;

public class CommandAccounts implements CommandExecutor
{
  
  @Override
  public boolean onCommand(CommandSender sender, Command command, String label, String [] args)
  {
    CommandArguments cmdArgs = new CommandArguments(sender.getServer(), args);
    
    if ( sender instanceof Player ) {
      sender.sendMessage("test");
      return true;
    }

    if (sender instanceof ServerOperator) {
      
      if (cmdArgs.getPlayer() == null) {
		sender.sendMessage("test");
		return true;
      }

      sender.sendMessage("test");
      
      return true;
    }

    return false;
  }

}


