package com.simplefactory;

import com.simplefactory.JiShuA;
import com.simplefactory.JiaFa;

/**
 * @author XJ
 */
public class Entity {
    public static JiShuA getJS(YunShuFu2 type) {
        JiShuA jiShuA = null;
        if(YunShuFu2.ADD == type) {
            jiShuA = new JiaFa();
        }
        return jiShuA;
    }
}
