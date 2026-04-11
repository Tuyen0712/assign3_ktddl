package src.test;

import org.junit.jupiter.api.Test;
import src.main.MovieTicket;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class TicketPriceTest {
    MovieTicket movieTicket = new MovieTicket();

    @Test
    void testPath1(){
        assertEquals(0, movieTicket.CaculateTicketPrice(3, "weekday", false));
    }

    @Test
    void testPath2(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-1, "weekday", false));
    }

    @Test
    void testPath3(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(11, "weekday", false));
    }

    @Test
    void testPath4(){
        assertEquals(100000, movieTicket.CaculateTicketPrice(33, "weekday", false));
    }

    @Test
    void testPath5(){
        assertEquals(110000, movieTicket.CaculateTicketPrice(23, "weekend", false));
    }

    @Test
    void testPath6(){
        assertEquals(100000, movieTicket.CaculateTicketPrice(24, "weekday", false));
    }

    @Test
    void testPath7(){
        assertEquals(120000, movieTicket.CaculateTicketPrice(25, "weekday", true));
    }

    @Test
    void testPath8(){
        assertEquals(120000, movieTicket.CaculateTicketPrice(28, "weekday", true));
    }

    @Test
    void testPath9(){
        assertEquals(10000, movieTicket.CaculateTicketPrice(1, "weekend", false));
    }

    @Test
    void testPath10(){
        assertEquals(20000, movieTicket.CaculateTicketPrice(2, "weekday", true));
    }

    @Test
    void testPath11(){
        assertEquals(70000, movieTicket.CaculateTicketPrice(17, "weekend", false));
    }

    @Test
    void testPath12(){
        assertEquals(80000, movieTicket.CaculateTicketPrice(12, "weekday", true));
    }


}
