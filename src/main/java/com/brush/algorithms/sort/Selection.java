package com.brush.algorithms.sort;

public class Selection extends BaseSort {

    public void sort(Comparable[] a) {

        int length=a.length-1;
        for(int i=0;i<length;i++)
        {
            int min=i;
            for (int j=i+1;j<length;j++)
            {
                if(less(a[j],a[min])) min=j;
            }
            exch(a,i,min);
        }
    }
}
