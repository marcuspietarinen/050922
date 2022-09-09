package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(abs (-11));
        System.out.println(distance(-420, 422));
        int[] c = {1, 2, 3};
        int[] d = {4, 5, 6};
        int[] e = concatenate(c, d);
        for (int v : e)
            System.out.print(v + " ");

        System.out.println();
        
        int[] g = {5, -16, 2, 11, 1};
        swap (g,2, 4);
        for (int w : g)
            System.out.print(w + " ");

        System.out.println();

        reverse (g);
        for (int x : g)
            System.out.print(x + " ");

        System.out.println();

        System.out.println("HW 2");
        System.out.println(sumUpTo(20));

        System.out.println("HW 3");
        int [] zyzz = {1, 2, 3, 5, 7, 11, 13, 17, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 91};
        System.out.println(contains(zyzz, 4));

        System.out.println("HW 3B");
        int[] cid = {377};
        System.out.println(any(cid, zyzz));


    }

    static int abs (int x)
    {
        if (x >= 0)
            return x;
        else
            return (-x);
    }

    static int distance (int a, int b)
    {
        return abs (a - b);
    }

    static int[] concatenate (int[] c, int[] d)
    {
        int[] e = new int [c.length + d.length];
        int f = 0; // index into e
        for (int g : c)
        {
            e[f] = g;
            f++;
        }
        for (int g : d)
        {
            e[f] = g;
            f++;
        }
        return e;
    }
    static void swap (int[] array, int ind1, int ind2)
    {
        int tmp = array [ind2]; // take the contents from there
        array [ind2] = array [ind1];
        array [ind1] = tmp;
        return;
    }
    static void reverse (int[] array)
    {
        for (int i = 0; i <= (array.length - 1) / 2; i = i + 1)
            swap (array, i, array.length - 1 - i);
    }
    static int sumUpTo (int n)
    {
         n = (n * (n + 1)) / 2;
         return n;
    }
    static boolean contains (int[] arrau, int val)
    {
        boolean isItTrue = false;
        for (int m = 0; m < arrau.length; m++)
        {
            if (arrau[m] == val)
                isItTrue = true;
        }
        return isItTrue;
    }
    static boolean any (int[] kayser, int[] winston)
    {
        boolean abaidi = false;
        if (kayser.length < winston.length)
            winston = kayser;
        else
            kayser = winston;
        for (int sb = 0; sb < kayser.length; sb++);
        {
            for (int s = 0; s < winston.length; s++)
                if (kayser[s] == winston[s])
                    abaidi = true;
                else
                    abaidi = false;
        }
        return abaidi;
    }
}
