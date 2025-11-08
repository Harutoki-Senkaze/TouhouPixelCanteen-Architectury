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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.nyauru.touhoupixelcanteen.Touhoupixelcanteen;
import net.nyauru.touhoupixelcanteen.blocks.ChiliPepperBlock;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(Touhoupixelcanteen.MOD_ID, Registries.BLOCK);
    //注册方块的方法
    private static RegistrySupplier<Block> registerBlock(String id, Supplier<Block> blockSupplier) {
        return BLOCKS.register(id, blockSupplier);
    }
    /*
    //在这里，我们不再可用.copy快速复制方块的基本属性，需要手动设置该方块的属性
    //类似这样注册方块并设置属性，这里使用了类似石头的属性
    public static final RegistrySupplier<Block> EXAMPLE_BLOCK = registerBlock("example_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)
                    .requiresCorrectToolForDrops()
                    .strength(1.5f, 6.0f)
                    .sound(SoundType.STONE)
            ));
     */
    public static final RegistrySupplier<Block> CHILI_PEPPER_BLOCK =
            BLOCKS.register("chili_pepper_block", () -> new ChiliPepperBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT) //在地图上显示的颜色，可选
                            .noCollission() //无碰撞
                            .randomTicks() //随机刻加持
                            .instabreak() //瞬间破坏
                            .sound(SoundType.CROP) //作物的b动静
            ));
}
