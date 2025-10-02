package com.Strings;

import com.Controller.MyController;
import com.DTO.EmployeeDTO;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Launch {

    public static void main() {

//        Basics basics = new Basics();
//        basics.Basic();

        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.P1("HelLeh"));


//
//        Scanner scanner = new Scanner(System.in);
//        MyController myController = new MyController();
//        while (true) {
//            System.out.println("P1->Insert\nP2->Read\nP3->Update\nP4->Delete\nP5->Exit");
//            System.out.println("Choice : ");
//            int choice = scanner.nextInt();
//            if (choice == 5) {
//                System.out.println("Thanks for Using");
//                break;
//            }
//            switch (choice) {
//                case 1:
//                    System.out.println("Enter EId ");
//                    int Eid = scanner.nextInt();
//
//                    System.out.println("Enter EName ");
//                    String EName = scanner.next();
//
//                    System.out.println("Enter EAddress ");
//                    String EAddress = scanner.next();
//
//                    System.out.println("Enter ESalary ");
//                    int Esalary = scanner.nextInt();
//
//                    EmployeeDTO data = new EmployeeDTO(Eid,EName,Esalary,EAddress);
//                    String result = myController.getData(data);
//                    System.out.println(result);
//
//                    break;
//                case 2:
//                    EmployeeDTO[] arr = myController.readData();
//                    for (EmployeeDTO emp : arr){
//                        if (emp!=null) {
//                            System.out.println("EId : "+emp.getEId());
//                            System.out.println("EName : "+emp.getEname());
//                            System.out.println("EAddress : "+emp.getEAddress());
//                            System.out.println("ESalary : "+emp.getESalary());
//                        }
//                    }
//
//
//
//                    break;
//                case 3:
//                    break;
//                case 4:
//                    break;
//                default:
//                    break;
//            }//switch end
//        }//while end
    }//main end
}//class end
