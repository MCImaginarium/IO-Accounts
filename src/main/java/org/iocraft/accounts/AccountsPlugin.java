package org.iocraft.accounts;

import java.util.logging.Level;
import org.bukkit.plugin.java.JavaPlugin;

public class AccountsPlugin extends JavaPlugin {
    
  static final String pluginShortName = "IO-Accounts";
  
  @Override
  public void onEnable() {
    //getLogger().log(Level.INFO, "{0}.onEnable()", this.getClass().getName());

    this.getCommand("accounts").setExecutor(new CommandAccounts());
    this.getCommand("rabbatoir").setExecutor(new CommandRabbatoir());
  }

  @Override
  public void onDisable() {
    //getLogger().log(Level.INFO, "{0}.onDisable()", this.getClass().getName());

    this.getCommand("accounts").setExecutor(null); // not sure what the right
    this.getCommand("rabbatoir").setExecutor(null);  // action here is.
  }
}
