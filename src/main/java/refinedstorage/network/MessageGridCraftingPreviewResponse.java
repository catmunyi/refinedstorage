package refinedstorage.network;

/*
import io.netty.buffer.ByteBuf;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;
import refinedstorage.apiimpl.autocrafting.preview.CraftingPreviewStack;
import refinedstorage.proxy.ClientProxy;

import java.util.Collection;
import java.util.LinkedList;

public class MessageGridCraftingPreviewResponse implements IMessage, IMessageHandler<MessageGridCraftingPreviewResponse, IMessage> {
    public Collection<CraftingPreviewStack> stacks;
    public int hash;
    public int quantity;

    public MessageGridCraftingPreviewResponse() {
    }

    public MessageGridCraftingPreviewResponse(Collection<CraftingPreviewStack> stacks, int hash, int quantity) {
        this.stacks = stacks;
        this.hash = hash;
        this.quantity = quantity;
    }

    @Override
    public void fromBytes(ByteBuf buf) {
        this.hash = buf.readInt();
        this.quantity = buf.readInt();

        this.stacks = new LinkedList<>();

        int size = buf.readInt();

        for (int i = 0; i < size; i++) {
            this.stacks.add(CraftingPreviewStack.fromByteBuf(buf));
        }
    }

    @Override
    public void toBytes(ByteBuf buf) {
        buf.writeInt(this.hash);
        buf.writeInt(this.quantity);

        buf.writeInt(stacks.size());

        for (CraftingPreviewStack stack : stacks) {
            stack.writeToByteBuf(buf);
        }
    }

    @Override
    public IMessage onMessage(MessageGridCraftingPreviewResponse message, MessageContext ctx) {
        ClientProxy.onReceiveCraftingPreviewResponse(message);
        
        return null;
    }
}
*/