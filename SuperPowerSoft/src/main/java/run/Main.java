package run;


import filereader.ConvertToUser;
import util.UtilFromUser;

import java.util.Scanner;

public class Main implements UtilFromUser{
    private  static Scanner sc = new Scanner(System.in);
    Main(){
        System.out.println(getUserWorkTogether(ConvertToUser.getUserArrayList())+" Users work together");
    }
    public static void main(String[] args) {
        System.out.println("Please,write path...");
        ConvertToUser  convertToUser = new ConvertToUser(sc.nextLine());
//        ConvertToUser.getUserArrayList().stream().forEach(System.out::println);
        new Main();
    }
}
