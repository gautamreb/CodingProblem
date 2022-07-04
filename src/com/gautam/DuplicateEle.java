package com.gautam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateEle {

    public static void main(String [] args){
        List<Integer> inputList = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,1,2,3,4,6));

        ArrayList<Integer> result = (ArrayList<Integer>) deDuplicate(inputList);

        System.out.println("result:"+result);

    }

    static List<Integer> deDuplicate(List<Integer> in){

        List<Integer> resultList = new ArrayList<>();
        for(Integer ele : in){
            if(!resultList.contains(ele)){
                resultList.add(ele);
            }
        }

        return resultList;
    }
}
