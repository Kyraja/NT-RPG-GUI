package ntrpg.gui;

import cz.neumimto.core.ioc.Inject;
import cz.neumimto.core.ioc.IoC;
import cz.neumimto.core.ioc.PostProcess;
import cz.neumimto.core.ioc.Singleton;
import cz.neumimto.gui.Gui;
import cz.neumimto.gui.GuiService;
import cz.neumimto.players.CharacterService;

import java.util.UUID;

@Singleton
public class MinecraftGuiService {

    @Inject
    private GuiService guiService;

    @Inject
    private GuiModMessaging guiModMessaging;

    @Inject
    private CharacterService characterService;

    public void setAsGuiModUser(UUID player) {
        characterService.getCharacter(player).setUsingGuiMod(true);
    }

    @PostProcess(priority = 10000)
    public void onload() {
        Gui.mod = IoC.get().build(GuiModMessaging.class);
    }

}
