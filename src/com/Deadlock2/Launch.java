package com.Deadlock2;

public class Launch {
    public static void main(String[] args) {

        /* Inter-Thread Communication: Producer - Consumer Problem : Wait() notify() */
        /* notify wakes up wait on current objects */

        Message message = new Message();

        User u1 = new User(message);
        User u2 = new User(message);
        User u3 = new User(message);

        u1.setName("Raju");
        u2.setName("Kaju");
        u3.setName("Maju");

        u1.start();
        u2.start();
        u3.start();


    }
}
