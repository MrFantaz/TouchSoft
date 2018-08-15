package run;


import filereader.ConvertToUser;
import util.UtilFromUser;

public class Main implements UtilFromUser{
    Main(){
        System.out.println(getUserWorkTogither(ConvertToUser.getUserArrayList()));
    }
    public static void main(String[] args) {
        ConvertToUser  convertToUser = new ConvertToUser("input.txt");
        ConvertToUser.getUserArrayList().stream().forEach(System.out::println);
        new Main();
    }
}
