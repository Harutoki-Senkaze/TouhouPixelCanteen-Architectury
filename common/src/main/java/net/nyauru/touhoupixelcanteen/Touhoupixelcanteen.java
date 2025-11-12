/*
MIT License
Copyright (c) 2025 aurora4123,Yukina,
Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package net.nyauru.touhoupixelcanteen;

import net.nyauru.touhoupixelcanteen.register.ModBlocks;
import net.nyauru.touhoupixelcanteen.register.ModItems;
import net.nyauru.touhoupixelcanteen.register.ModTabs;
import net.nyauru.touhoupixelcanteen.register.ModTooltips;

public final class Touhoupixelcanteen {
    public static final String MOD_ID = "touhoupixelcanteen";
    //需注意：common代码不可混入特定平台依赖，你可理解为上面的import不可出现neoforge或fabricapi的依赖！
    //若需编写平台特定代码，请去相应部分自行编写，根据文档使用注解
    public static void init() {
        //初始化物品与相应方块
        ModBlocks.BLOCKS.register();
        net.nyauru.l2.register.Blocks.BLOCKS.register();
        ModItems.ITEMS.register();
        net.nyauru.l2.register.Items.ITEMS.register();
        //导入创造物品栏
        ModTabs.TABS.register();
        //初始化tooltip
        ModTooltips.init();
    }
}
