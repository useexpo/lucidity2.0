package ml.mypals.lucidity.mixin.features.selectiveRendering.accessor;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
//? if >=1.21.9 && <26.1 {
/*import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import net.minecraft.client.renderer.SubmitNodeStorage;
import net.minecraft.client.renderer.SubmitNodeCollection;

@Mixin(SubmitNodeCollection.class)
public interface SubmitNodeCollectionAccessor {
    @Accessor("submitNodeStorage")
    SubmitNodeStorage getSubmitNodeStorage();
}
*///?} else {
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecraft.class)
public interface SubmitNodeCollectionAccessor {
}
//?}
