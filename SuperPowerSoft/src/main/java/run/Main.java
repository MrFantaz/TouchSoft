package run;


import filereader.ConvertToUser;

public class Main {
    public static void main(String[] args) {
        ConvertToUser  convertToUser = new ConvertToUser("input.txt");
        ConvertToUser.getUserArrayList().stream().forEach(System.out::println);
    }
}
