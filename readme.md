This repository is a repository to use as a template for plugin development.  
There is nothing fancy, only the base files needed to build a plugin.

# How to start
Using the [HytaleDownloader](https://support.hytale.com/hc/en-us/articles/45326769420827-Hytale-Server-Manual#server-files), 
download the HytaleServer.jar and copy it into the `lib/` folder.
This should be the only necessity to be able to build the plugin with `mvn clean package` until the artifact is officially available on a repository.

You can change the metadata of your plugin in `src/main/resources/manifest.json`.

# How to debug
Put the result of your build into the `/mods` folder of your Hytale Server.