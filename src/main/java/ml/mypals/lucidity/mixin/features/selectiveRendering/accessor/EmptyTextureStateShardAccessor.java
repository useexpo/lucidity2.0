package ml.mypals.lucidity.mixin.features.selectiveRendering.accessor;

//? if <26.1 {
/*import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.resources.Identifier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Optional;

@Mixin(RenderStateShard.TextureStateShard.class)
public interface EmptyTextureStateShardAccessor {
    @Accessor("texture")
    Optional<Identifier> getTexture();
}
*///?} else {
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecraft.class)
public interface EmptyTextureStateShardAccessor {
}
//?}

