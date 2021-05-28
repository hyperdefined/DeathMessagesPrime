package email.com.gmail.cosmoconsole.bukkit.deathmsg;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.World;
import org.bukkit.entity.Player;

/**
 * A queued death message
 */
public class DeathMessage {
    /**
     * The message as a TextComponent, may be overwritten by DeathListener.dmc
     */
    public final TextComponent d;
    /**
     * The world in which the death occurred
     */
    public final World w;
    /**
     * The died player
     */
    public final Player v;
    /**
     * Whether the death was caused by another player (as a direct or indirect kill)
     */
    public final boolean pvp;
    /**
     * Whether the death was caused by another player (as a direct or indirect kill)
     */
    public final String vd;
    /**
     * Length of the formatted prefix in this message.
     */
    public final int prel;
    /**
     * Length of the formatted prefix in this message.
     */
    public final int sufl;

    public DeathMessage(
            final TextComponent D,
            final Player V,
            final World W,
            final boolean PVP,
            final String VD,
            final int prel,
            final int sufl) {
        this.d = D;
        this.w = W;
        this.v = V;
        this.pvp = PVP;
        this.vd = VD;
        this.prel = prel;
        this.sufl = sufl;
    }
}
