package ntrpg.gui;

import com.google.inject.Singleton;
import cz.neumimto.effects.EffectStatusType;
import cz.neumimto.effects.IEffect;
import cz.neumimto.gui.Gui;
import cz.neumimto.gui.IPlayerMessage;
import cz.neumimto.players.CharacterBase;
import cz.neumimto.players.ExtendedNClass;
import cz.neumimto.players.IActiveCharacter;
import cz.neumimto.skills.SkillData;
import cz.neumimto.skills.SkillTree;
import io.github.minecraftgui.models.components.Paragraph;
import io.github.minecraftgui.models.components.ProgressBar;
import io.github.minecraftgui.models.components.UserGui;
import org.spongepowered.api.entity.living.player.Player;

import java.util.List;
import java.util.Map;

/**
 * Created by NeumimTo on 7.1.16.
 */
@Singleton
public class GuiModMessaging implements IPlayerMessage {

    public boolean isClientSideGui() {
        return true;
    }

    public void sendMessage(IActiveCharacter iActiveCharacter, String s) {
        iActiveCharacter.sendMessage(s);
    }

    public void openSkillTreeMenu(IActiveCharacter iActiveCharacter, SkillTree skillTree, Map<String, Integer> map) {
        Gui.vanilla.openSkillTreeMenu(iActiveCharacter,skillTree,map);
    }

    public void moveSkillTreeMenu(IActiveCharacter iActiveCharacter, SkillTree skillTree, Map<String, Integer> map, SkillData skillData) {
        Gui.vanilla.moveSkillTreeMenu(iActiveCharacter,skillTree,map,skillData);
    }

    public void sendEffectStatus(IActiveCharacter iActiveCharacter, EffectStatusType effectStatusType, IEffect iEffect) {
        Gui.vanilla.sendEffectStatus(iActiveCharacter,effectStatusType,iEffect);
    }

    public void invokeCharacterMenu(Player player, List<CharacterBase> list) {
        Gui.vanilla.invokeCharacterMenu(player,list);
    }

    public void sendCooldownMessage(IActiveCharacter iActiveCharacter, String s, double v) {
        Gui.vanilla.sendCooldownMessage(iActiveCharacter,s,v);
    }

    public void sendManaStatus(IActiveCharacter iActiveCharacter, double currentMana, double maxMana, double reserved) {
        UserGui userGui = MinecraftModGuiService.minecraftGuiService.getUserGui(iActiveCharacter.getPlayer().getUniqueId(), MinecraftModGuiService.PLUGIN_NAME);
        ProgressBar progressBar = (ProgressBar) userGui.getComponent("manaBar");
        Paragraph paragraph = (Paragraph) userGui.getComponent("manaPercentage");
        double percentage = currentMana/maxMana;

        progressBar.setPercentage(percentage);
        paragraph.setText(((int)(percentage*100))+"%");
    }

    public void sendPlayerInfo(IActiveCharacter iActiveCharacter, List<CharacterBase> list) {
        Gui.vanilla.sendPlayerInfo(iActiveCharacter,list);
    }

    public void sendPlayerInfo(IActiveCharacter iActiveCharacter, IActiveCharacter iActiveCharacter1) {
        Gui.vanilla.sendPlayerInfo(iActiveCharacter,iActiveCharacter1);
    }

    public void showExpChange(IActiveCharacter iActiveCharacter, String s, double v) {
        Gui.vanilla.showExpChange(iActiveCharacter,s,v);
    }

    public void showLevelChange(IActiveCharacter iActiveCharacter, ExtendedNClass extendedNClass, int i) {
        Gui.vanilla.showLevelChange(iActiveCharacter,extendedNClass,i);
    }

    public void sendStatus(IActiveCharacter iActiveCharacter) {
        Gui.vanilla.sendStatus(iActiveCharacter);
    }

    public void showAvalaibleClasses(IActiveCharacter iActiveCharacter) {
        Gui.vanilla.showAvalaibleClasses(iActiveCharacter);
    }
}
