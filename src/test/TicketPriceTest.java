package src.test;

import org.junit.jupiter.api.Test;
import src.main.MovieTicket;

import static org.junit.jupiter.api.Assertions.*;

public class TicketPriceTest {
    MovieTicket movieTicket = new MovieTicket();

    @Test
    void testPath1_1(){
        assertEquals(30000, movieTicket.CaculateTicketPrice(2, "weekend", true));
    }

    @Test
    void testPath1_2(){
        assertEquals(30000, movieTicket.CaculateTicketPrice(10, "weekend", true));
    }

    @Test
    void testPath2_1(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(13, "weekday", false));
    }

    @Test
    void testPath2_2(){
        assertEquals(60000, movieTicket.CaculateTicketPrice(22, "weekday", false));
    }

    @Test
    void testPath3_1(){
        assertEquals(100000, movieTicket.CaculateTicketPrice(35, "weekday", false));
    }

    @Test
    void testPath3_2(){
        assertEquals(100000, movieTicket.CaculateTicketPrice(24, "weekday", false));
    }

    @Test
    void testPath4_1(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-2, "weekday", false));
    }

    @Test
    void testPath4_2(){
        assertEquals(-1, movieTicket.CaculateTicketPrice(-10, "weekday", false));
    }


}
