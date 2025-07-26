package com.Deadlock2;

public class Message {

    private String message;
    private boolean messageSent;

    public synchronized void sendMessage(String message,String name){
        while (messageSent){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("Message Sent :- "+ message + " by " + name);
        this.message=message;
        messageSent=true;
        notifyAll();

        timeWait();
    }

    public synchronized void readMessage(String name){

        while (!messageSent){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Message Read :- "+ message+" by "+name);
        messageSent=false;
        notifyAll();
        timeWait();
    }

    public void timeWait(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


