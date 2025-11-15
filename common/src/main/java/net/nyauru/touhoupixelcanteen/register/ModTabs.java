/*
MIT License
Copyright (c) 2025 aurora4123,Yukina,
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.nyauru.touhoupixelcanteen.register;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.nyauru.l2.register.Items;
import net.nyauru.touhoupixelcanteen.Touhoupixelcanteen;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(Touhoupixelcanteen.MOD_ID, Registries.CREATIVE_MODE_TAB);

    //创造模式 主物品栏
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB_MAIN = TABS.register(
            "main_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("tab.touhoupixelcanteen.main"))
                    .icon(() -> new ItemStack(ModItems.CHILI_PEPPER.get()))
                    .displayItems((parameters, output) -> {
                        //在这填充物品
                        output.accept(ModItems.CHILI_PEPPER.get()); //辣椒
                        output.accept(ModItems.CHILI_PEPPER_SEED.get()); //辣椒种子
                    })
                    .build()
    );
    //归家主栏
    public static final RegistrySupplier<CreativeModeTab> CREATIVE_TAB_YH = TABS.register(
            "yh_tab",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
                    .title(Component.translatable("tab.touhoupixelcanteen.youkaishomecoming"))
                    .icon(() -> new ItemStack(Items.RAW_LAMPREY.get()))
                    .displayItems((parameters, output) -> {
                        //在这填充物品
                        output.accept(Items.RAW_LAMPREY.get());
                        output.accept(Items.RAW_TUNA_SLICE.get());
                        output.accept(Items.SEARED_TUNA_SLICE.get());
                        output.accept(Items.OTORO.get());
                        output.accept(Items.CRAB.get());
                        output.accept(Items.STEAMED_CRAB.get());
                        output.accept(Items.CRAB_MEAT.get());
                        output.accept(Items.CRAB_ROE.get());
                        output.accept(Items.RAW_VENISON.get());
                        output.accept(Items.GRILLED_VENISON.get());
                        output.accept(Items.RAW_VENISON_SLICE.get());
                    })
                    .build()
    );
}

