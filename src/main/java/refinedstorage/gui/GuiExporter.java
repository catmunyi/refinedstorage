package refinedstorage.gui;

import refinedstorage.api.util.IComparer;
import refinedstorage.container.ContainerExporter;
import refinedstorage.gui.sidebutton.SideButtonCompare;
import refinedstorage.gui.sidebutton.SideButtonRedstoneMode;
import refinedstorage.gui.sidebutton.SideButtonType;
import refinedstorage.tile.TileExporter;

public class GuiExporter extends GuiBase {
    public GuiExporter(ContainerExporter container) {
        super(container, 211, 137);
    }

    @Override
    public void init(int x, int y) {
        addSideButton(new SideButtonRedstoneMode(this, TileExporter.REDSTONE_MODE));

        addSideButton(new SideButtonType(this, TileExporter.TYPE));

        addSideButton(new SideButtonCompare(this, TileExporter.COMPARE, IComparer.COMPARE_DAMAGE));
        addSideButton(new SideButtonCompare(this, TileExporter.COMPARE, IComparer.COMPARE_NBT));
    }

    @Override
    public void update(int x, int y) {
    }

    @Override
    public void drawBackground(int x, int y, int mouseX, int mouseY) {
        bindTexture("gui/exporter.png");

        drawTexture(x, y, 0, 0, width, height);
    }

    @Override
    public void drawForeground(int mouseX, int mouseY) {
        drawString(7, 7, t("gui.refinedstorage:exporter"));
        drawString(7, 43, t("container.inventory"));
    }
}
