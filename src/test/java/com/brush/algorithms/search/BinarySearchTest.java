package com.brush.algorithms.search;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    private int[] a;
    @Before
    public void init()
    {
        a=new int[]{1,2,3,4,5,6,7,8,9};
    }
    @Test
    public void whileSearchFindKey() {
        int i = BinarySearch.whileSearch(a, 5);
        Assert.assertEquals("findKey",4,i);
    }
    @Test
    public void whileSearchNotFind()
    {
        int i = BinarySearch.whileSearch(a, 0);
        Assert.assertEquals("findKey",-1,i);
    }

    @Test
    public void recursion() {
        int i = BinarySearch.recursion(a,5,0,a.length-1);
        Assert.assertEquals("recursion findKey",4,i);
    }
    @Test
    public void recursionNotFind()
    {
        int i = BinarySearch.recursion(a,0,0,a.length-1);
        Assert.assertEquals("recursion findKey",-1,i);
    }


}