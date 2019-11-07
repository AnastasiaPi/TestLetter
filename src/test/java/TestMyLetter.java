import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMyLetter {
    @Test
   public void testIncorrect(){
        assertEquals(new Letter().main("llllllssssh"),"Incorrect input");
        assertEquals(new Letter().main(" "),"Incorrect input");
    }

    @Test
    public void test(){
        assertEquals(new Letter().main("a"),"You win");

    }
}
