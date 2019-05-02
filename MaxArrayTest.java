package bubbleSort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxArrayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findMaxProduct() {
        int tArray[] = {0, 1, 2, 10, 9, 4, 3, 21};
        MaxArray max = new MaxArray();
        assertEquals(max.findMaxProduct(tArray), 210);
        int tArrayTwo[] = {200};
        assertEquals(max.findMaxProduct(tArrayTwo),0);
        int tArrayThree[] = {-1,-20,3};
        assertEquals(max.findMaxProduct(tArrayThree),20);
        int tarrayFour[] = {-9822,111,23423,4444,3,-678900,-1};
        assertEquals(max.findMaxProduct(tArrayFour),678900);
        int tArrayFive[] = {};
        assertEquals(max.findMaxProduct(tArrayFive),0);
        int tArraySix[] = {2,4};
        assertEquals(max.findMaxProduct(tArraySix),8);
        
    }
}
