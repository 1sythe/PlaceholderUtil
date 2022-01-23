package synthetic.placeholderutil.color;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import synthetic.placeholderutil.utils.CounterUtil;
import synthetic.placeholderutil.utils.RGBUtil;

import java.awt.*;

public class ColorCustomCyleExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "phucc";
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
            String speed = parts[0];
            String color1 = parts[1];
            String color2 = parts[2];

            Color Jcolor1 = Color.decode(color1);
            Color Jcolor2 = Color.decode(color2);

            if(speed.equals("fast")) {
                return ChatColor.of(RGBUtil.interColor(CounterUtil.fast,Jcolor1,Jcolor2)) +"";
            }

            if(speed.equals("slow")) {
                return ChatColor.of(RGBUtil.interColor(CounterUtil.slow,Jcolor1,Jcolor2)) +"";
            }

            if(speed.equals("rapid")) {
                return ChatColor.of(RGBUtil.interColor(CounterUtil.rapid,Jcolor1,Jcolor2)) +"";
            }

            if(speed.equals("debug")) {
                return RGBUtil.interColor(CounterUtil.rapid,Jcolor1,Jcolor2).toString();
            }
        }
        return "";
    }
}
