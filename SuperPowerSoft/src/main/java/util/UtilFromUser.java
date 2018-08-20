package util;

import model.User;

import java.util.ArrayList;
import java.util.Date;

public interface UtilFromUser {
    default int getUserWorkTogether(ArrayList<User> userArrayList) {
        int i = 0;
        int maxTogether = 0;
        for (User startUser : userArrayList) {
            Date start = startUser.getDateStart();
            for (User finishUser : userArrayList) {
                Date finish = finishUser.getDateFinish();
                i=0;
                for (User user : userArrayList) {
                if(start.getTime()>=user.getDateStart().getTime() &&  finish.getTime()<=user.getDateFinish().getTime()){
                    if(finish.getTime()<=user.getDateFinish().getTime()){
                        finish=user.getDateFinish();
                    }
                    i++;
                    if(i>maxTogether){
                        maxTogether=i;
                    }
                }
                }
            }

        }
        return maxTogether;
    }
}
