import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Kata2Test {
    @Test
    public void test1() {
        String a[] = new String[]{ "arp", "live", "strong" };
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, Kata2.inArray(a, b));
    }
    @Test
    public void test2() {
        String a[] = new String[]{ "live", "strong","arp"};
        String b[] = new String[] { "lively", "alive", "harp", "sharp", "armstrong" };
        String r[] = new String[] { "arp", "live", "strong" };
        assertArrayEquals(r, Kata2.inArray(a, b));
    }
    @Test
    public void test3() {
        String a[] = new String[]{ "live", "strong","arp"};
        String b[] = new String[] { "ly", "alive", "hrp", "sha", "armsong" };
        String r[] = new String[] {"live"};
        assertArrayEquals(r, Kata2.inArray(a, b));
    }

}