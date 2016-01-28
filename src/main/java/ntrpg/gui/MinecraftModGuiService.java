package ntrpg.gui;

import cz.neumimto.core.ioc.Inject;
import cz.neumimto.core.ioc.IoC;
import cz.neumimto.core.ioc.PostProcess;
import cz.neumimto.core.ioc.Singleton;
import cz.neumimto.gui.Gui;
import cz.neumimto.players.CharacterService;
import io.github.minecraftgui.views.MinecraftGuiService;
import org.spongepowered.api.Sponge;

import java.util.UUID;

@Singleton
public class MinecraftModGuiService {

    private MinecraftGuiService minecraftGuiService;

    @Inject
    private GuiModMessaging guiModMessaging;

    @Inject
    private CharacterService characterService;

    @Inject
    private GuiListener guiListener;

    public void setAsGuiModUser(UUID player) {
        characterService.getCharacter(player).setUsingGuiMod(true);
    }

    public MinecraftModGuiService() {
         minecraftGuiService = Sponge.getServiceManager().provide(MinecraftGuiService.class).get();
    }

    @PostProcess(priority = 10000)
    public void postConstruct() {
        Gui.mod = IoC.get().build(GuiModMessaging.class);
        minecraftGuiService.addPlugin(guiListener,"NT-RPG");
    }

}
