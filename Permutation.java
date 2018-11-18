package com.hortari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Permutation {

    public List getPermutations(String input) {

        List strList;
        strList = new ArrayList<>();
        permutations("", input, strList);
        return strList;
    }

    public void permutations(String consChars, String input, List list) {

        if(input.isEmpty()) {
            list.add(consChars + input);
            return;
        }

        for(int i = 0; i < input.length(); i++) {
            permutations(consChars + input.charAt(i),
                    input.substring(0, i)+input.substring(i+1), list);
        }
    }
    public void tointarray(List list){
        int a[]=new int[list.size()];

        for(int i=0;i<list.size();i++)
        {   a[i]=Integer.parseInt(String.valueOf(list.get(i)));
            //  System.out.println(list.get(i));
        }

        for (int i=0;i<a.length;i++){
            System.out.println(a[i]);

        }
        List str2List = new ArrayList<>();
        for (int i = 0; i <a.length; i++) {
            if(a[i]%8==0){
                str2List.add(a[i]);
            }

        }
        System.out.println("The elements divisible by 8  is:");
        str2List.stream().forEach(System.out::println);


    }

    public static void main(String a[]) {
        Permutation permutations = new Permutation();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers ");
        String s=sc.nextLine();
        List output = permutations.getPermutations(s);
        System.out.println("Result size: "+output.size());

        permutations.tointarray(output);
    }


}

