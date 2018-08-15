package filereader;

import model.User;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.stream.Collectors;

public class ConvertToUser {
    private String path;
    private static ArrayList<User> userArrayList = new ArrayList<User>();
    public  ConvertToUser(String path){
        this.path = path;
        inputFile(this.path);
    }
    private void inputFile(String path){
        File file = new File(path);
        Path pathFile = file.toPath();
        try {
           userArrayList= Files.lines(pathFile).map(s->convertStringToUser(s)).collect(Collectors.toCollection(() -> userArrayList));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private User convertStringToUser(String time){
        String[] array = time.split(" ");
        String startTime = array[0];
        String finishTime = array[1];
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        Date start = null;
        Date finish = null;
        try {
           start = format.parse(startTime);
           finish = format.parse(finishTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new User(start,finish);
    }

    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
    }
}
