package Exc8;

import java.util.HashSet;
import java.util.Set;

public class Exc8
{
    public static void main(String[] args)
    {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Peter");

        System.out.println(minLength(set));
    }

    private static int minLength(Set<String> set)
    {
        if (set.isEmpty())
        {
            return 0;
        }
        int shortest = 100;
        for (String s:set)
        {
            if (s.length() < shortest)
            {
                shortest = s.length();
            }
        }
        return shortest;
    }
}
