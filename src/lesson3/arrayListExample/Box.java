package lesson3.arrayListExample;

/**
 * Объект Box -
 */
public class Box {
    private final int weight; // вес в граммах
    private final int length; // длина в сантиметрах
    private final int width; // ширина в сантиметрах
    private final int height; // глубина в сантиметрах

    /**
     *
     * @param weight - вес (в граммах)
     * @param length - длинна (в сантиметрах)
     * @param width - ширина (в сантиметрах)
     * @param height - высота (в сантиметрах)
     */
    public Box(int weight, int length, int width, int height) {
        this.weight = weight;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
