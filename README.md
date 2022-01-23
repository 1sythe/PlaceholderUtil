# PlaceholderUtil

## Color Placeholder

### Color Expansion

You can use this placeholder instead of a ColorCode.

Usage:

    %phuc_r_g_b%
    r = Red Channel
    g = Green Channel
    b = Blue Channel

Example:

This placeholder produces the color Aquamarine.

    %phuc_127_255_212%

### Color Rgb Expansion

You can use this placeholder instead of a ColorCode.
Cycles through all colours smoothly.

Usage:

    %phurgb_speed%
    speed = Cycle Speed [ slow, fast, rapid]

Example:

This placeholder cycles through all colors slowly.

    %phurgb_slow%

### Color Rgb Wave Expansion

Displays a RGB wave on text.

Usage:

    %phurgbw_speed_format_text%
    speed = Cycle Speed [ slow, fast, rapid]
    format = [                                  # You can add multiple Format Codes
                l = Bold
                n = Underlined
                m = Strikethrough
                o = Italic
                                    ]
    text = Text the wave is displayed on        # "-" will be replaced with spaces

Example:

This placeholder displaces a Rainbow-Wave on Bold "Your Text".

    %phurgbw_fast_l_Your-Text%

### Color Custom Cycle Expansion

You can use this placeholder instead of a ColorCode.
Cycles through two colors smoothly.

Usage:

    %phucc_speed_color1_color2%
    speed = Cycle Speed [ slow, fast, rapid]
    color1 = First Color                        # Uses Hex Codes like #7FFFD4
    color2 = Second Color                       # Uses Hex Codes like #7FFFD4

Example:

This placeholder produces fast a Color Cycle from Blue To Aquamarine.

    %phucc_fast_#2631ff_#7FFFD4%

### Color Custom Wave Expansion

Displays a wave color cycle on text.

Usage:

    %phucw_color1_color2_format_text%
    color1 = First Color                        # Uses Hex Codes like #7FFFD4
    color2 = Second Color                       # Uses Hex Codes like #7FFFD4
    format = [                                  # You can add multiple Format Codes
                l = Bold
                n = Underlined
                m = Strikethrough
                o = Italic
                                    ]
    text = Text the wave is displayed on        # "-" will be replaced with spaces
                                                # if the Text Equals #name# Text will be replaced by Playername

Example:

This placeholder produces a Color-Wave with blue and aquamarine on the Underlined Playername.

    %phucw_#2631ff_#7FFFD4_n_#name#%
