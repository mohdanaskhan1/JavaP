package com.Encapsulation;

public class Launch1 {
    public static void main(String[] args){

        int id=19;
        int age = 6;
        float height = 163.2f;
        char c ='M';
        int weight = 66;

        Data data = new Data();
        data.setId(id);
        data.setAge(age);
        data.setHeight(height);
        data.setC(c);
        data.setWeight(weight);

        Destination d = new Destination();
        d.xyz(data);

//Setter(Mutator) Getter(Accessor)

    }
}
