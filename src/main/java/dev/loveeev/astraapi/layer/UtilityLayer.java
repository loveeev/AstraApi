package dev.loveeev.astraapi.layer;


import com.samjakob.spigui.SpiGUI;
import dev.loveeev.astraapi.Main;
import dev.loveeev.astraapi.util.ChatUtility;
import dev.loveeev.astraapi.util.semenatic.Layer;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

/**
 * @author Zimoxy DEV: loveeev
 */
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UtilityLayer extends Layer {

    ChatUtility chatUtility;
    SpiGUI spiGUI;
    public UtilityLayer(Main plugin) {
        super(plugin);
    }

    @Override
    public void enable() {
        super.enable();
        chatUtility = new ChatUtility("i huilan");
        prepareGUI();
        registerCommands();
    }


    private void prepareGUI() {
        spiGUI = new SpiGUI(plugin);
        spiGUI.setEnableAutomaticPagination(false);
    }

    private void registerCommands() {
    }
}
