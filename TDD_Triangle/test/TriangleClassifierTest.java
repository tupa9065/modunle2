import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    private int a,b,c;
    TriangleClassifier tri = new TriangleClassifier();

    @Test
    void main() {
        a = 2;
        b = 2;
        c = 2;
        String expected = "đây là tam giác điều ";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void main2() {
        a = 2;
        b = 2;
        c = 3;
        String expected = "đây là tam giác cân ";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void main3() {
        a = 3;
        b = 4;
        c = 5;
        String expected = "đây là tam giác thường";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void main4() {
        a = 8;
        b = 2;
        c = 3;
        String expected = "không phải là hình tam giác ";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void main5() {
        a = -1;
        b = 2;
        c = 1;
        String expected = "không phải là hình tam giác ";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void main6() {
        a = 0;
        b = 1;
        c = 1;
        String expected = "không phải là hình tam giác ";
        String result = tri.triangle(a,b,c);
        assertEquals(expected,result);
    }
}