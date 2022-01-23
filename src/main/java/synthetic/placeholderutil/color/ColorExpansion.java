package synthetic.placeholderutil.color;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import synthetic.placeholderutil.utils.RGBUtil;

import java.awt.*;

public class ColorExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "phuc";
    }

    @Override
    public @NotNull String getAuthor() {
        return "onXans#1772";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {

        String[] parts = identifier.split("_");
        if(parts.length == 3) {
            int r = Integer.parseInt(parts[0]);
            int g = Integer.parseInt(parts[1]);
            int b = Integer.parseInt(parts[2]);

            return ChatColor.of(new Color(r, g, b)) + "";
        }
        return "";
    }
}
