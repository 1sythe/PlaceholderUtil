package synthetic.placeholderutil.color;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import synthetic.placeholderutil.utils.CounterUtil;
import synthetic.placeholderutil.utils.RGBUtil;

public class ColorRgbExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "phurgb";
    }

    @Override
    public @NotNull String getAuthor() {
        return "onXans#1772";
    }

    @Override
    public @NotNull String getVersion() {
        return "1.2.0";
    }

    @Override
    public String onPlaceholderRequest(Player player, String identifier) {

        switch (identifier) {
            case "fast": {
                return ChatColor.of(RGBUtil.getRGBColor(CounterUtil.fast,1,1))+"";
            }
            case "slow": {
                return ChatColor.of(RGBUtil.getRGBColor(CounterUtil.slow,1,1))+"";
            }
            case "rapid": {
                return ChatColor.of(RGBUtil.getRGBColor(CounterUtil.rapid,1,1)) + "";
            }
        }
        return "";
    }
}
