package lesson2;

/**
 * Формула площади взята из <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D0%B0%D0%B2%D0%B8%D0%BB%D1%8C%D0%BD%D1%8B%D0%B9_%D1%88%D0%B5%D1%81%D1%82%D0%B8%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">...</a>
 */
public class RegularHexagon implements Shape {
    private final int sideSize;
    private static final String name = "Правильный шестиугольник";
    private int areaSize = -1;
    /**
     * Определяем правильный шестиугольник через размер грани или радиус описанной окружности (они совпадают)
     * @param sideSize размер боковой стороны (радиус описанной окружности)
     */
    public RegularHexagon(int sideSize) {
        this.sideSize = sideSize;
    }

    @Override
    public int getPerimeterLength() {
        return sideSize*6;
    }

    /**
     * Вычисляется площадь правильного шестиугольника, результат округляется до целого числа
     * @return площадь правильного шестиугольника (в int)
     */
    @Override
    public int getAreaSize() {
        if (areaSize < 0) {
            double s = (3*Math.sqrt(3)/2)*sideSize;
            areaSize = (int) Math.round(s);
        }
        return areaSize;
    }

    @Override
    public String getType() {
        return name;
    }
}
