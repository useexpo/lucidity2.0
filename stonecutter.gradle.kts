plugins {
    id("dev.kikugie.stonecutter")
    id("fabric-loom") version "1.18.3" apply false
    id("me.modmuss50.mod-publish-plugin") version "1.0.+" apply false
}

stonecutter active "26.3"

// 多版本一起发时，让新版本最后发布
stonecutter tasks {
    order("publishModrinth")
}

// See https://stonecutter.kikugie.dev/wiki/config/params
stonecutter parameters {
    swaps["mod_version"] = "\"" + property("mod.version") + "\";"
    swaps["minecraft"] = "\"" + node.metadata.version + "\";"
    constants["release"] = property("mod.id") != "template"
    dependencies["fapi"] = node.project.property("deps.fabric_api") as String
    replacements.string {
        direction = eval(current.version, ">=1.21.5")
        replace("fi.dy.masa.malilib.util.Color4f", "fi.dy.masa.malilib.util.data.Color4f")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.resources.ResourceLocation", "net.minecraft.resources.Identifier")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("ResourceLocation", "Identifier")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.renderer.RenderType", "net.minecraft.client.renderer.rendertype.RenderType")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.renderer.state.CameraRenderState", "net.minecraft.client.renderer.state.level.CameraRenderState")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net/minecraft/client/renderer/state/CameraRenderState", "net/minecraft/client/renderer/state/level/CameraRenderState")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.renderer.block.model.BlockStateModel", "net.minecraft.client.renderer.block.dispatch.BlockStateModel")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.renderer.block.model.BlockModelPart", "net.minecraft.client.renderer.block.dispatch.BlockStateModelPart")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter", "net.fabricmc.fabric.api.client.renderer.v1.mesh.QuadEmitter")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.fabricmc.fabric.impl.renderer.VanillaBlockModelPartEncoder", "net.fabricmc.fabric.impl.client.renderer.VanillaBlockModelPartEncoder")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.world.level.BlockAndTintGetter", "net.minecraft.client.renderer.block.BlockAndTintGetter")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.model.CreeperModel", "net.minecraft.client.model.monster.creeper.CreeperModel")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.world.entity.vehicle.MinecartTNT", "net.minecraft.world.entity.vehicle.minecart.MinecartTNT")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.gui.GuiGraphics;", "net.minecraft.client.gui.GuiGraphicsExtractor;")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("GuiGraphics drawContext", "GuiGraphicsExtractor drawContext")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("GuiGraphics guiGraphics", "GuiGraphicsExtractor guiGraphics")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("GuiGraphics context", "GuiGraphicsExtractor context")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("GuiGraphics instance", "GuiGraphicsExtractor instance")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("GuiGraphics.class", "GuiGraphicsExtractor.class")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.Util;", "net.minecraft.util.Util;")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("fi.dy.masa.malilib.util.JsonUtils", "fi.dy.masa.malilib.util.data.json.JsonUtils")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace(".levelRenderer.allChanged()", ".levelExtractor.allChanged()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.world.entity.boss.EnderDragonPart", "net.minecraft.world.entity.boss.enderdragon.EnderDragonPart")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.renderer.block.model.BakedQuad", "net.minecraft.client.resources.model.geometry.BakedQuad")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("net.minecraft.client.resources.model.Material;", "net.minecraft.client.resources.model.sprite.Material;")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("Minecraft.getInstance().screen", "Minecraft.getInstance().gui.screen()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("com.mojang.blaze3d.vertex.VertexFormat", "com.mojang.renderpearl.api.vertex.VertexFormat")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("model_vertexes", "modelVertexes")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("LightTexture.FULL_BRIGHT", "net.minecraft.util.LightCoordsUtil.FULL_BRIGHT")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("client.options.hideGui", "client.gui.hud.isHidden()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace(".getMainCamera()", ".mainCamera()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("poseStack.mulPose(Minecraft.getInstance().gameRenderer.mainCamera().rotation());", "poseStack.rotate(Minecraft.getInstance().gameRenderer.mainCamera().rotation());")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("BlockEntityType.SCULK_SENSOR", "net.minecraft.world.level.block.entity.BlockEntityTypes.SCULK_SENSOR")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("BlockEntityType.SCULK_SHRIEKER", "net.minecraft.world.level.block.entity.BlockEntityTypes.SCULK_SHRIEKER")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("BlockEntityType.CALIBRATED_SCULK_SENSOR", "net.minecraft.world.level.block.entity.BlockEntityTypes.CALIBRATED_SCULK_SENSOR")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("EntityType.BREEZE_WIND_CHARGE", "net.minecraft.world.entity.EntityTypes.BREEZE_WIND_CHARGE")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("EntityType.WIND_CHARGE", "net.minecraft.world.entity.EntityTypes.WIND_CHARGE")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("clientboundLevelParticlesPacket.getParticle()", "clientboundLevelParticlesPacket.particle()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("player.swing(player.getUsedItemHand());", "player.swing(player.getUsedItemHand(), net.minecraft.world.item.component.SwingAnimation.DEFAULT, false);")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("player.swing(hand);", "player.swing(hand, net.minecraft.world.item.component.SwingAnimation.DEFAULT, false);")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("new ChunkPos(trace.initial)", "net.minecraft.world.level.ChunkPos.containing(trace.initial)")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace(".mainCamera().getPosition()", ".mainCamera().position()")
    }
    replacements.string {
        direction = eval(current.version, ">=26.1")
        replace("mc.isSingleplayer()", "mc.hasSingleplayerServer()")
    }
}

