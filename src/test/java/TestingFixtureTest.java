import org.junit.Test;

import static org.junit.Assert.*;

public class TestingFixtureTest {

    @Test
    public void equality() {

        TestingFixture t = new TestingFixture();

        int results = t.equality(3,5);
        int x = results;
        assertEquals(x,results);
    }

    @Test
    public void identity() {

        TestingFixture a = new TestingFixture();
        TestingFixture b = new TestingFixture();
        TestingFixture c = a;

        assertEquals(c,a);


    }
}