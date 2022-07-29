package lesson3.arrayListExample;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class ProcessorTest {
    Processor pr;
    private static final ArrayList<Box> testData = new ArrayList<>();
    private static int light=0, heavy=0;
    @BeforeAll
    static void beforeAll() {
        //—оздаем тестовый набор
//        testData.addAll(Arrays.asList(new Box(400, 20, 20, 20),
//                new Box(200, 10, 40, 12),
//                new Box(600, 20, 20, 40),
//                new Box(100, 30, 10, 20),
//                new Box(700, 70, 70, 20),
//                new Box(300, 70, 30, 20)));

        // “естовый набор на 50 000 коробок
        Random r = new Random();
        int low = 50;
        int high = 550;
        int weight;
        for (int i=0; i<50000; i++) {
            weight = r.nextInt(high - low) + low;
            testData.add(new Box(weight,weight+200, weight+100, weight+50));
            if (weight>300) {
                heavy++;
            } else {
                light++;
            }
        }
    }

    @BeforeEach
    void setUp() {
        System.out.println("Setup");
        pr = new Processor();
        for (Box box: testData) {
            pr.addBox(box);
        }
    }

    /**
     * ќчищаем выходные очереди после каждого теста
     */
    @AfterEach
    void tearDown() {
        pr.getHeavyBoxArray().clear();
        pr.getLightBoxArray().clear();
    }

    @Test
    void process() {
        long time = timer(() -> pr.process(), TimeUnit.NANOSECONDS);
        assertEquals(heavy,pr.getHeavyBoxArray().size());
        assertEquals(light,pr.getLightBoxArray().size());
        System.out.println("Timing: "+time+ " (Stream API)");
    }

    @Test
    void processForEach() {
        long time = timer(() -> pr.processForEach(), TimeUnit.NANOSECONDS);
        assertEquals(heavy,pr.getHeavyBoxArray().size());
        assertEquals(light,pr.getLightBoxArray().size());
        System.out.println("Timing: "+time + " (ForEach)");
    }

    @Test
    void processIterator() {
        long time = timer(() -> pr.processIterator(), TimeUnit.NANOSECONDS);
        assertEquals(heavy,pr.getHeavyBoxArray().size());
        assertEquals(light,pr.getLightBoxArray().size());
        System.out.println("Timing: "+time + " (Iterator)");
    }

    @Test
    void processSimple() {
        long time = timer(() -> pr.processSimple(), TimeUnit.NANOSECONDS);
        assertEquals(heavy,pr.getHeavyBoxArray().size());
        assertEquals(light,pr.getLightBoxArray().size());
        System.out.println("Timing: "+time + " (Simple)");
    }
    /**
            * »спользование
     * long time = timer(() -> {
     *         System.out.println("hello world");
     * }, TimeUnit.NANOSECONDS);
     * @param method метод дл€ замера
     * @param timeUnit единица измерени€
     * @return врем€ работы
     */
    private static long timer(Runnable method, TimeUnit timeUnit) {
        long time = System.nanoTime();
        method.run();
        time = System.nanoTime() - time;
        return TimeUnit.NANOSECONDS.convert(time, timeUnit);
    }
}