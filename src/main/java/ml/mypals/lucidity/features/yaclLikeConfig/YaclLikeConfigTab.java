package ml.mypals.lucidity.features.yaclLikeConfig;

import fi.dy.masa.malilib.gui.button.ButtonGeneric;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.components.WidgetSprites;
//? if >=1.21.6 {
import net.minecraft.client.renderer.RenderPipelines;
//?}
import net.minecraft.client.renderer.rendertype.RenderType;
import net.minecraft.resources.Identifier;

import java.awt.*;
import static ml.mypals.lucidity.config.LucidityConfigs.Other.YACL_STYLE;

public class YaclLikeConfigTab extends ButtonGeneric {
    public static final WidgetSprites SPRITES = new WidgetSprites(Identifier.withDefaultNamespace("widget/tab_selected"), Identifier.withDefaultNamespace("widget/tab"), Identifier.withDefaultNamespace("widget/tab_selected_highlighted"), Identifier.withDefaultNamespace("widget/tab_highlighted"));

    public YaclLikeConfigTab(int x, int y, int width, int height, String text, String... hoverStrings) {
        super(x, y, width, height, text, hoverStrings);
    }

    //? if >=26.1 {
    @Override
    public void render(fi.dy.masa.malilib.render.GuiContext drawContext, int mouseX, int mouseY, boolean selected) {
        if (this.visible) {
            boolean yaclStyle = YACL_STYLE.getBooleanValue();
            this.renderDefaultBackground = !yaclStyle;
            if(yaclStyle) {
                drawContext.blitSprite(RenderPipelines.GUI_TEXTURED,
                        SPRITES.get(!this.enabled, this.hovered), this.getX(),
                        this.getY() - 2, this.width, this.height);
                if (!this.enabled) {
                    this.renderFocusUnderline(drawContext, mc.font, Color.WHITE.getRGB());
                }
            }
            super.render(drawContext, mouseX, mouseY, selected);
        }
    }

    private void renderFocusUnderline(fi.dy.masa.malilib.render.GuiContext guiGraphics, Font font, int i) {
        int j = Math.min(font.width(this.displayString), this.getWidth() - 4);
        int k = this.getX() + (this.getWidth() - j) / 2;
        int l = this.getY() + this.getHeight() - 2;
        guiGraphics.fill(k, l, k + j, l + 1, i);
    }
    //?} else {
    /*@Override
    //? if >=1.21.6 {
    public void render(GuiGraphicsExtractor drawContext, int mouseX, int mouseY, boolean selected) {
    //?} else {
    /^public void render(int mouseX, int mouseY, boolean selected, GuiGraphicsExtractor drawContext) {
    ^///?}
        if (this.visible) {
            boolean yaclStyle = YACL_STYLE.getBooleanValue();
            this.renderDefaultBackground = !yaclStyle;
            if(yaclStyle) {
                drawContext.blitSprite(//? if >= 1.21.6 {RenderPipelines.GUI_TEXTURED,//?} else if >=1.21.3 {/^RenderType::guiTextured, ^///?}
                        SPRITES.get(!this.enabled, this.hovered), this.getX(),
                        this.getY() - 2, this.width, this.height);
                if (!this.enabled) {
                    this.renderFocusUnderline(drawContext, mc.font, Color.WHITE.getRGB());
                }
            }
            //? if >=1.21.6 {
            super.render(drawContext, mouseX, mouseY, selected);
            //?} else {
            /^super.render(mouseX, mouseY, selected, drawContext);
            ^///?}
        }
    }

    private void renderFocusUnderline(GuiGraphicsExtractor guiGraphics, Font font, int i) {
        int j = Math.min(font.width(this.displayString), this.getWidth() - 4);
        int k = this.getX() + (this.getWidth() - j) / 2;
        int l = this.getY() + this.getHeight() - 2;
        guiGraphics.fill(k, l, k + j, l + 1, i);
    }
    *///?}

}
