// Fishack mod module: LiquidInteract
package com.fishack.modules;

// ...existing code...

import meteordevelopment.meteorclient.systems.modules.Categories;
import meteordevelopment.meteorclient.systems.modules.Module;

public class LiquidInteract extends Module {
    public LiquidInteract() {
        super(Categories.Player, "liquid-interact", "Allows you to interact with liquids.");
    }
}
