import org.junit.Test;

import ru.netology.service.CashbackHackService;

import static org.junit.Assert.assertEquals;


public class CashbackHackServiceTest {

    @Test
    public void shouldBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotBuyMore() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void IfNegativeBalance(){
        CashbackHackService service=new CashbackHackService();
        int actual = service.remain(-100);
        int expected = 1100;
        assertEquals(expected, actual);
    }

}

