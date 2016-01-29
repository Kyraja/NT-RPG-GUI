package ntrpg.gui;

import cz.neumimto.core.ioc.Singleton;
import io.github.minecraftgui.models.components.UserGui;
import io.github.minecraftgui.models.factories.GuiFactory;
import io.github.minecraftgui.models.listeners.OnGuiListener;

import java.io.File;

/**
 * Created by Nt on 25.01.2016.
 */

@Singleton
public class GuiListener implements OnGuiListener{

    //You should change the file location where you will put it.
    private GuiFactory.GuiModel guiModel = GuiFactory.createGuiModel(new File("index.xml"));

    public void onGuiPreInit(UserGui userGui) {
        guiModel.preInitGui(MinecraftModGuiService.minecraftGuiService.getPluginInterface(), userGui);
    }

    public void onGuiInit(UserGui userGui) {
        guiModel.initGui(MinecraftModGuiService.minecraftGuiService.getPluginInterface(), userGui, this);
    }

}
