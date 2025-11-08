/*
MIT License
Copyright (c) 2025 aurora4123,Yukina,
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.nyauru.touhoupixelcanteen.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Block;
import net.nyauru.touhoupixelcanteen.Touhoupixelcanteen;

import java.util.function.Supplier;

public class ModItems {
    //为什么是请我一个写c语言嵌入式的程序员来写这个?这对吗?java程序员四哪去了?
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(Touhoupixelcanteen.MOD_ID, Registries.ITEM);
    //注册普通物品
    //在1.20.1中，我们通过forge注册机来实现物品初始化，如需代码移植，在这里我们需要将 RegistryObject 改为 RegistrySupplier。作用类似，代码改动不大，需注意部分属性版本重命名
    private static RegistrySupplier<Item> registerItem(String id, Supplier<Item> itemSupplier) {
        return ITEMS.register(id, itemSupplier);
    }
    //注册方块物品
    private static RegistrySupplier<Item> registerBlockItem(String id, Supplier<Block> blockSupplier) {
        return ITEMS.register(id, () -> new BlockItem(blockSupplier.get(), new Item.Properties()));
    }
    /*
    //通过这样来创建你的普通物品，原理几乎和我们的1.20.1版本相同，纯大写的名称我们需要经常调用
    public static final RegistrySupplier<Item> EXAMPLE_ITEM = registerItem("example_item",
            () -> new Item(new Item.Properties().stacksTo(64)));
    //这里是食物类物品
    public static final RegistrySupplier<Item> EXAMPLE_FOOD = registerItem("example_food",
        () -> new Item(new Item.Properties().food(//食物属性，抄1.20.1版本即可)));
    //方块物品，但随后需要去ModBlocks内实现它，参考1.20.1版
    public static final RegistrySupplier<Item> EXAMPLE_BLOCK_ITEM = registerBlockItem("example_block", ModBlocks.EXAMPLE_BLOCK);
    */
    public static final RegistrySupplier<Item> CHILI_PEPPER =
        ITEMS.register("chili_pepper", () -> new Item(new Item.Properties()
                .food(new FoodProperties.Builder()
                    .nutrition(1)
                    .saturationModifier(0.1F) //注意：1.20.1版本后，营养价值从saturationMod被改为saturationModifier
                    .fast()
                    .build()
        ).stacksTo(64)));  //辣椒
    public static final RegistrySupplier<Item> CHILI_PEPPER_SEED =
            ITEMS.register("chili_pepper_seed",
                    () -> new ItemNameBlockItem(ModBlocks.CHILI_PEPPER_BLOCK.get(), basicItem()));

    public static Item.Properties basicItem() {
        return new Item.Properties();
    }
}
