package org.example;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import javax.management.MXBean;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;


class PQTest {


    @Test
    void calculatePQ() {
        assertEquals(1, PQ.calculatePQ(8,16).length);
        assertEquals(1, PQ.calculatePQ(10,25).length);
        assertEquals(2, PQ.calculatePQ(6,-7).length);
        assertEquals(2, PQ.calculatePQ(4,-5).length);
        assertEquals(2, PQ.calculatePQ(-4,3).length);
        assertEquals(2, PQ.calculatePQ(6,5).length);

    }

    @Test
    public void testPositivePQ() {
        double[] expected = {-1.0, -4.0};
        double[] actual = PQ.calculatePQ(5.0, 4.0);
        assertArrayEquals(expected, actual, 0.0001);
    }


    @Test
    public void testNegativePQ() {
        double[] expected = {3.0, -2.0};
        double[] actual = PQ.calculatePQ(-1.0, -6.0);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testZeroPQ() {
        double[] expected = {0.0};
        double[] actual = PQ.calculatePQ(0.0, 0.0);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    public void testNoRealRoots() {
        double[] expected = {};
        double[] actual = PQ.calculatePQ(1.0, 2.0);
        assertArrayEquals(expected, actual, 0.0001);
    }

    @Test
    void testGivenPQ() {
        double[] solution1 = PQ.calculatePQ(6,-7);
        Arrays.sort(solution1);
        double[] solution2 = PQ.calculatePQ(4,-5);
        Arrays.sort(solution2);
        double[] solution3 = PQ.calculatePQ(-4,3);
        Arrays.sort(solution3);
        double[] solution4 = PQ.calculatePQ(6,5);
        Arrays.sort(solution4);
        assertAll (
                () -> assertEquals(-7,solution1[0],0),
                () -> assertEquals(1,solution1[1],0),
                () -> assertEquals(-5,solution2[0],0),
                () -> assertEquals(1,solution2[1],0),
                () -> assertEquals(1,solution3[0],0),
                () -> assertEquals(3,solution3[1],0),
                () -> assertEquals(-5,solution4[0],0),
                () -> assertEquals(-1,solution4[1],0)
                );

    }

    @Test
    void givenPQ_SingleTest() {
        assertEquals(-2,PQ.calculatePQ(4,4)[0],0);
        assertEquals(2,PQ.calculatePQ(-4,4)[0],0);
        assertEquals(-4,PQ.calculatePQ(8,16)[0],0);
        assertEquals(-5,PQ.calculatePQ(10,25)[0],0);

    }

    @ParameterizedTest
    @MethodSource("givenPQ_Single")
    void test_PQ (double p, double q, double value) {
        assertEquals(value,PQ.calculatePQ(p,q)[0],0);

    }

    static Stream<Arguments> givenPQ_Single () {
        return Stream.of(
                Arguments.of(4,4,-2),
                Arguments.of(-4,4,2),
                Arguments.of(8,16,-4),
                Arguments.of(10,25,-5)
                );
    }

    @ParameterizedTest
    @MethodSource("getStreamArguments")
    void givenPQ_lengthOk(double p,double q,double[] values) {
        assertEquals(values.length,PQ.calculatePQ(p,q).length);
    }

    @ParameterizedTest
    @MethodSource("getStreamArguments")
    void givenPQ_solutionOk(double p,double q,double[] values) {
        double[] solution = PQ.calculatePQ(p,q);
        Arrays.sort(solution);
        Arrays.sort(values);
        assertArrayEquals(values,solution,0);

    }

//    private static Stream<Arguments> getStreamArguments() {
//        return Stream.of(
//                Arguments.of(1,1, new double[] {}),
//                Arguments.of(4,16, new double[] {}),
//                Arguments.of(-3,5, new double[] {}),
//                Arguments.of(-4,7, new double[] {}),
//                Arguments.of(4,4, new double[] {-2}),
//                Arguments.of(8,16, new double[] {-4})
//                );
//    }

    private static Supplier<Stream<Arguments>> streamSupplier;

    @BeforeAll
    public static void setUp() {
        streamSupplier = () -> Stream.of(
                Arguments.of(1,1, new double[] {}),
                Arguments.of(4,16, new double[] {}),
                Arguments.of(-3,5, new double[] {}),
                Arguments.of(-4,7, new double[] {}),
                Arguments.of(4,4, new double[] {-2}),
                Arguments.of(8,16, new double[] {-4})
        );
    }

    static Stream<Arguments> getStreamArguments() {
        return streamSupplier.get();
    }








}