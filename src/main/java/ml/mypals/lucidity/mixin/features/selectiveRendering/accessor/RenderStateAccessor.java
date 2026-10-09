package ml.mypals.lucidity.mixin.features.selectiveRendering.accessor;

//? if <26.1 {
/*import net.minecraft.client.renderer.rendertype.RenderType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(RenderType.CompositeRenderType.class)
public interface RenderStateAccessor {
    @Accessor("state")
    RenderType.CompositeState getState();
}
*///?} else {
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecraft.class)
public interface RenderStateAccessor {
}
//?}

