package com.Deadlock2;

public class User extends Thread{
    private Message message;
    public User(Message message) {
        this.message = message;
    }

    @Override
    public void run(){
        String name = getName();

        if (name.equalsIgnoreCase("Raju") || name.equalsIgnoreCase("Kaju")) {
            int i =0;
            while (i<100){
                message.sendMessage("Good Morning "+ i, name);
                i++;
            }
        }
        else {
            int i=0;
            while (i<100){
                message.readMessage(name);
                i++;
            }

        }
    }
}
