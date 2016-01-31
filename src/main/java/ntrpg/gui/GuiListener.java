package ntrpg.gui;

import cz.neumimto.NtRpgPlugin;
import cz.neumimto.core.ioc.Inject;
import cz.neumimto.core.ioc.Singleton;
import cz.neumimto.events.PlayerGuiModInitEvent;
import io.github.minecraftgui.models.components.UserGui;
import io.github.minecraftgui.models.factories.GuiFactory;
import io.github.minecraftgui.models.listeners.OnGuiListener;
import org.spongepowered.api.Game;

import java.io.File;
import java.util.UUID;

/**
 * Created by Nt on 25.01.2016.
 */
@Singleton
public class GuiListener implements OnGuiListener{

    private GuiFactory.GuiModel guiModel = GuiFactory.createGuiModel(new File(NtRpgPlugin.workingDir,"index.xml"));

    @Inject
    private Game game;

    public void onGuiPreInit(UserGui userGui) {
        guiModel.preInitGui(MinecraftModGuiService.minecraftGuiService.getPluginInterface(), userGui);
    }

    public void onGuiInit(UserGui userGui) {

        guiModel.initGui(MinecraftModGuiService.minecraftGuiService.getPluginInterface(), userGui, this);

        UUID playerUUID = userGui.getPlayerUUID();
        PlayerGuiModInitEvent event = new PlayerGuiModInitEvent(playerUUID);
        game.getEventManager().post(event);
    }

}
