package Tests;

import static org.junit.Assert.*;
import org.junit.Test;

public class CheckUtilTest {
    @Test
    public void check_query_input() {
        assertEquals(0, CheckUtil.searchQuery("#search-input"));

    }

    @Test
    public void check_submit_button() {
        assertEquals(0, CheckUtil.submitButton("#search-button"));

    }

}