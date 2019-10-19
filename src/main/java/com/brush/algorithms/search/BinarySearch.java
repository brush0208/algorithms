package com.brush.algorithms.search;

public class BinarySearch {

    static public int whileSearch(int[] a,int key)
    {
        if(a.length<0)
        {
            return -1;
        }
        int low=0;
        int hi=a.length-1;
        while (low<=hi)
        {
            int mid=low+(hi-low)/2;
            if(key<a[mid]){hi=mid-1;}
            else if(key>a[mid]){low=mid+1;}
            else return mid;
        }
        return -1;
    }

    static public int recursion(int[] a,int key,int lo,int hi)
    {
        if(lo>hi)return -1;
        int mid=lo+(hi-lo)/2;
        if(key<a[mid]) return recursion(a,key,lo,mid-1);
        else if(key>a[mid]) return recursion(a,key,mid+1,hi);
        else return mid;
    }
}
