package com.jsoniter;

import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class TestBoolean extends TestCase {
    @org.junit.experimental.categories.Category(StreamingCategory.class)

    public void test_non_streaming() throws IOException {
        assertTrue(JsonIterator.parse("true").readBoolean());
        assertFalse(JsonIterator.parse("false").readBoolean());
        assertTrue(JsonIterator.parse("null").readNull());
        assertFalse(JsonIterator.parse("false").readNull());
    }
}
