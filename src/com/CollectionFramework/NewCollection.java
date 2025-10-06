package com.CollectionFramework;
import java.lang.*;
import java.util.ArrayList;

public class NewCollection<String> extends ArrayList<String> {
    @Override
    public void add(int index, String element) {
        if(element==null){
            throw new NotNullException("Data Cannot be Null");
        }
        super.add(index, element);
    }

    @Override
    public boolean add(String string) {
        if(string==null){
            throw new NotNullException("Data Cannot be Null");
        }
        return super.add(string);
    }
}
