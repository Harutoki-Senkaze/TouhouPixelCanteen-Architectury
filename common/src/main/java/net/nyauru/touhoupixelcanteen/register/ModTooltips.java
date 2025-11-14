package net.nyauru.touhoupixelcanteen.register;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.client.ClientTooltipEvent;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.nyauru.touhoupixelcanteen.Touhoupixelcanteen;

import java.util.List;

public class ModTooltips {
    //初始化代码
    public static void init() {
        ClientTooltipEvent.ITEM.register((stack, components, tooltipX, tooltipY) -> {
            addTooltips(stack, components);
        });
    }

    private static void addTooltips(ItemStack stack, List<Component> components) {
        //模组物品
        //纯大写的那个常量就是你在物品注册的地方搞得，和1.20.1版本一致
        //翻译键名也自己修改
        //可考虑使用颜色常量
        if (stack.getItem() == ModItems.CHILI_PEPPER.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.chili_pepper")
                    .withStyle(ChatFormatting.WHITE)); //可以修改tooltip的颜色了，可用mc预定义颜色
        }
        if (stack.getItem() == ModItems.CHILI_PEPPER_SEED.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.chili_pepper_seed")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.roasted_lamprey")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.RAW_TUNA.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.raw_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.ROASTED_LAMPREY_FILLET.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.roasted_lamprey_fillet")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == net.nyauru.l2.register.Items.SEARED_TUNA.get()) {
            components.add(Component.translatable("tooltip.touhoupixelcanteen.seared_tuna")
                    .withStyle(ChatFormatting.WHITE));
        }


        //原版物品
        if (stack.getItem() == Items.CARROT) {
            components.add(Component.translatable("tooltip.minecraft.carrot")
                    .withStyle(ChatFormatting.WHITE));
        }
        if (stack.getItem() == Items.DRIED_KELP) {
            components.add(Component.translatable("tooltip.minecraft.kelp"));
        }
        if (stack.getItem() == Items.POTATO) {
            components.add(Component.translatable("tooltip.minecraft.potato"));
        }
        if (stack.getItem() == Items.PUMPKIN) {
            components.add(Component.translatable("tooltip.minecraft.pumpkin"));
        }
        if (stack.getItem() == Items.BAMBOO) {
            components.add(Component.translatable("tooltip.minecraft.bamboo"));
        }
        if (stack.getItem() == Items.EGG) {
            components.add(Component.translatable("tooltip.minecraft.egg"));
        }
        if (stack.getItem() == Items.PORKCHOP) {
            components.add(Component.translatable("tooltip.minecraft.porkchop"));
        }
        if (stack.getItem() == Items.BEEF) {
            components.add(Component.translatable("tooltip.minecraft.beef"));
        }
        if (stack.getItem() == Items.PUFFERFISH) {
            components.add(Component.translatable("tooltip.minecraft.pufferfish").withStyle(ChatFormatting.YELLOW));
        }
        if (stack.getItem() == Items.HONEY_BOTTLE) {
            components.add(Component.translatable("tooltip.minecraft.honey_bottle"));
        }
        if (stack.getItem() == Items.SALMON) {
            components.add(Component.translatable("tooltip.minecraft.salmon"));
        }
        if (stack.getItem() == Items.BROWN_MUSHROOM) {
            components.add(Component.translatable("tooltip.minecraft.mushroom"));
        }
        if (stack.getItem() == Items.RED_MUSHROOM) {
            components.add(Component.translatable("tooltip.minecraft.mushroom"));
        }
    }
}