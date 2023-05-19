package tests;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import pages.CheckUtil;

public class CheckUtilTest {
    @Test
    public void check_query_input() {
        Assert.assertEquals(0, CheckUtil.searchQuery("#search-input"));

    }

    @Test
    public void check_submit_button() {
        assertEquals(0, CheckUtil.submitButton("#search-button"));

    }

    @Test
    public void check_empty_query() {
        assertEquals(0, CheckUtil.queryId("","#error-empty-query"));
    }

    @Test
    public void check_isla_query() {
        assertEquals(0, CheckUtil.islaQuery("isla","li"));
    }

    @Test
    public void check_no_results_feedback() {
        assertEquals(0, CheckUtil.queryId("castle","#error-no-results"));
    }

    @Test
    public void check_results_match_query() {
        assertEquals(0, CheckUtil.portQuery("port","li"));
    }

}