package de.dodoswelt.minidodo;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.util.HashMap;

public class config {
    public static HashMap<String, File> Files = new HashMap<String, File>();

  public static FileConfiguration getCfg(String name)throws UnknownFileException{
      if(Files.containsKey(name)){ return YamlConfiguration.loadConfiguration(Files.get(name));}else{
          throw new UnknownFileException();
      }
  }
  public static boolean createcfg(File f, String name){
      if(Files.containsKey(name)){
          return false;
      }else{
          Files.put(name, f);
          return true;
      }
  }

}
class UnknownFileException extends Exception{
    UnknownFileException(){
        super("Config not in configmap \n File not Found");
    }
}