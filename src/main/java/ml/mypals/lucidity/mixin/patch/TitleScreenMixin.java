package ml.mypals.lucidity.mixin.patch;

//? if <26.1 {
/*import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.PanoramaRenderer;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PanoramaRenderer.class)
public class TitleScreenMixin {
    //? if <=1.21.1 {
    /^@Mutable
    @Shadow @Final private Minecraft minecraft;

    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void preventNpeCrash(GuiGraphicsExtractor guiGraphics, int i, int j, float f, float g, CallbackInfo ci) {
        if (this.minecraft == null) {
            this.minecraft = Minecraft.getInstance();
            ci.cancel();//Idk why :(
        }
    }
    ^///?}
}
*///?} else {
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(Minecraft.class)
public class TitleScreenMixin {
}
//?}