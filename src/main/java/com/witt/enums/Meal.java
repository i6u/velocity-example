package com.witt.enums;

public enum Meal {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    Food[] values;

    public Food[] getValues() {
        return values;
    }

    Meal(Class<? extends Food> kind) {
        //通过class对象获取枚举实例
        values = kind.getEnumConstants();
    }

    /**
     * @Description:  枚举可以实现接口，为食物分类
     *
     * 接口管理枚举类
     *
     * @Date: 2018/6/3
     * Blog : http://blog.csdn.net/javazejian [原文地址,请尊重原创]
     */
    public interface Food {
        enum Appetizer implements Food {
            SALAD, SOUP, SPRING_ROLLS;
        }

        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO;
        }

        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL;
        }

        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA;
        }
    }
}
