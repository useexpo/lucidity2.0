package ml.mypals.lucidity.features.selectiveRendering;

//? if <1.21.9 {
/*public class SelectiveRenderingRenderTypeWrapper{

}
*///?} else if <26.1 {
/*import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.vertex.MeshData;
import com.mojang.renderpearl.api.vertex.VertexFormat;
import net.minecraft.client.renderer.rendertype.RenderType;

public class SelectiveRenderingRenderTypeWrapper extends RenderType {
    public RenderType base;
    public SelectiveRenderingRenderTypeWrapper(RenderType renderType) {
        super(renderType.getName(), renderType.bufferSize(), renderType.affectsCrumbling, renderType.affectsCrumbling(), renderType.setupState, renderType.clearState);
        base = renderType;
    }

    @Override
    public void draw(MeshData meshData) {
        base.draw(meshData);
    }

    @Override
    public VertexFormat format() {
        return base.format();
    }

    @Override
    public VertexFormat.Mode mode() {
        return base.mode();
    }

    @Override
    public RenderPipeline pipeline() {
        return base.pipeline();
    }
}
*///?} else {
import com.mojang.renderpearl.api.pipeline.PrimitiveTopology;
import com.mojang.renderpearl.api.pipeline.RenderPipeline;
import com.mojang.renderpearl.api.vertex.VertexFormat;
import net.minecraft.client.renderer.rendertype.PreparedRenderType;
import net.minecraft.client.renderer.rendertype.RenderType;

public class SelectiveRenderingRenderTypeWrapper extends RenderType {
    public RenderType base;

    public SelectiveRenderingRenderTypeWrapper(RenderType renderType) {
        super(renderType.name, renderType.state);
        this.base = renderType;
    }

    @Override
    public VertexFormat format() {
        return base.format();
    }

    @Override
    public PrimitiveTopology primitiveTopology() {
        return base.primitiveTopology();
    }

    @Override
    public RenderPipeline pipeline() {
        return base.pipeline();
    }

    @Override
    public PreparedRenderType prepare() {
        return base.prepare();
    }
}
//?}