import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CapitecTest {

    private static Capitec bank;

    @Before
    public void init() throws Exception {

        bank = new Capitec(500000, 100);
    }

    @Test(timeout = 2000)
    public void totalCashTest() throws InterruptedException {
        assertThat(10.0, is(bank.getTotalCash()));
    }

    @Test(timeout = 1000)
    public void totalAccountsTest() throws InterruptedException {

        assertThat(100, is(bank.getTotalAccounts()));
    }

}