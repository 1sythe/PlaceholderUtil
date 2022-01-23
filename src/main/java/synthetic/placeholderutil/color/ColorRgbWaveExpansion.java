package synthetic.placeholderutil.color;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import synthetic.placeholderutil.utils.CounterUtil;
import synthetic.placeholderutil.utils.RGBUtil;


public class ColorRgbWaveExpansion extends PlaceholderExpansion {
    @Override
    public @NotNull String getIdentifier() {
        return "phurgbcw";
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

        String[] parts = identifier.replace('-',' ').split("_");
        if(parts.length == 3) {
            String color = parts[0];
            String format = parts[1];
            String text = parts[2];

            StringBuilder outputBuilder = new StringBuilder();

            int offset = 0;
            for(Character c : text.toCharArray()) {

                if(color.equals("fast")) {
                    outputBuilder.append(ChatColor.of(RGBUtil.getRGBColorWave(CounterUtil.fast, offset,5,1,1))+"");
                }

                if(color.equals("slow")) {
                    outputBuilder.append(ChatColor.of(RGBUtil.getRGBColorWave(CounterUtil.slow, offset, 20,1,1))+"");
                }

                if(color.equals("rapid")) {
                    outputBuilder.append(ChatColor.of(RGBUtil.getRGBColorWave(CounterUtil.rapid, offset,2,1,1))+"");
                }

                if(format.contains("l")) outputBuilder.append("§l");
                if(format.contains("n")) outputBuilder.append("§n");
                if(format.contains("m")) outputBuilder.append("§m");
                if(format.contains("o")) outputBuilder.append("§o");

                outputBuilder.append(c);
                offset++;
            }
            outputBuilder.append("§r");
            return outputBuilder.toString();
        }
        return "";
    }
}
