package ntrpg.gui;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import cz.neumimto.effects.EffectStatusType;
import cz.neumimto.effects.IEffect;
import cz.neumimto.gui.IPlayerMessage;
import cz.neumimto.gui.VanilaMessaging;
import cz.neumimto.players.CharacterBase;
import cz.neumimto.players.ExtendedNClass;
import cz.neumimto.players.IActiveCharacter;
import cz.neumimto.skills.SkillData;
import cz.neumimto.skills.SkillTree;
import org.spongepowered.api.entity.living.player.Player;

import java.util.List;
import java.util.Map;

/**
 * Created by fs on 7.1.16.
 */
@Singleton
public class GuiModMessaging implements IPlayerMessage {

    @Inject
    private MinecraftGuiService minecraftGuiService;

    public boolean isClientSideGui() {
        return true;
    }

    public void sendMessage(IActiveCharacter iActiveCharacter, String s) {

    }

    public void sendCooldownMessage(IActiveCharacter iActiveCharacter, String s, long l) {

    }

    public void openSkillTreeMenu(IActiveCharacter iActiveCharacter, SkillTree skillTree, Map<String, Integer> map) {

    }

    public void moveSkillTreeMenu(IActiveCharacter iActiveCharacter, SkillTree skillTree, Map<String, Integer> map, SkillData skillData) {

    }

    public void sendEffectStatus(IActiveCharacter iActiveCharacter, EffectStatusType effectStatusType, IEffect iEffect) {

    }

    public void invokeCharacterMenu(Player player, List<CharacterBase> list) {

    }

    public void sendManaStatus(IActiveCharacter iActiveCharacter, float v, float v1, float v2) {

    }

    public void sendPlayerInfo(IActiveCharacter iActiveCharacter, List<CharacterBase> list) {

    }

    public void sendPlayerInfo(IActiveCharacter iActiveCharacter, IActiveCharacter iActiveCharacter1) {

    }

    public void showExpChange(IActiveCharacter iActiveCharacter, String s, double v) {

    }

    public void showLevelChange(IActiveCharacter iActiveCharacter, ExtendedNClass extendedNClass, int i) {

    }

    public void sendStatus(IActiveCharacter iActiveCharacter) {

    }

    public void showAvalaibleClasses(IActiveCharacter iActiveCharacter) {

    }
}
