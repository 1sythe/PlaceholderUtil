package synthetic.placeholderutil.utils;

import org.bukkit.Bukkit;
import synthetic.placeholderutil.PlaceholderUtil;

import java.awt.Color;
import java.util.*;

public class RGBUtil {

    public static Color getRGBColor(CounterUtil counter, float s, float b) {
        return Color.getHSBColor(counter.state*1f/counter.max,s,b);
    }

    public static Color getRGBColorWave(CounterUtil counter, int offset, int multipier, float s, float b) {
        return Color.getHSBColor(counter.getStateOffset(offset,multipier)*1f/counter.max,s,b);
    }

    public static Color interColor(CounterUtil counter, Color color1, Color color2) {
        float blending = counter.state*(1f/counter.max) * 2;

        if(blending < 1) {
            float inverseblending = 1 - blending;
            float r = color1.getRed() * blending + color2.getRed() * inverseblending;
            float g = color1.getGreen() * blending + color2.getGreen() * inverseblending;
            float b = color1.getBlue() * blending + color2.getBlue() * inverseblending;
            return new Color(r/255, g/255, b/255);
        } else {
            blending = blending -1;
            float inverseblending = 1 - blending;
            float r = color1.getRed() * inverseblending + color2.getRed() * blending;
            float g = color1.getGreen() * inverseblending + color2.getGreen() * blending;
            float b = color1.getBlue() * inverseblending + color2.getBlue() * blending;
            return new Color(r/255, g/255, b/255);
        }
    }

    public static Color interColorWave(CounterUtil counter, Color color1, Color color2, int offset, int multiplier) {
        float blending = counter.getStateOffset(offset, multiplier)*(1f/counter.max) * 2;

        if(blending < 1) {
            float inverseblending = 1 - blending;
            float r = color1.getRed() * blending + color2.getRed() * inverseblending;
            float g = color1.getGreen() * blending + color2.getGreen() * inverseblending;
            float b = color1.getBlue() * blending + color2.getBlue() * inverseblending;
            return new Color(r/255, g/255, b/255);
        } else {
            blending = blending -1;
            float inverseblending = 1 - blending;
            float r = color1.getRed() * inverseblending + color2.getRed() * blending;
            float g = color1.getGreen() * inverseblending + color2.getGreen() * blending;
            float b = color1.getBlue() * inverseblending + color2.getBlue() * blending;
            return new Color(r/255, g/255, b/255);
        }
    }
}
