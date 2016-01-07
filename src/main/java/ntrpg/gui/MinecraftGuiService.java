package ntrpg.gui;

import cz.neumimto.core.ioc.Inject;
import cz.neumimto.core.ioc.PostProcess;
import cz.neumimto.core.ioc.Singleton;
import cz.neumimto.gui.GuiService;
import cz.neumimto.players.IActiveCharacter;

import java.util.UUID;

@Singleton
public class MinecraftGuiService {

    @Inject
    private GuiService guiService;

    @Inject
    private GuiModMessaging guiModMessaging;

    public boolean isUsingModGUi(IActiveCharacter character) {
        UUID uniqueId = character.getPlayer().getUniqueId();

        //todo
        return false;
    }

    @PostProcess
    public void onload() {
        //todo guiService.setGuiModProvider(guiModMessaging)
    }

}
