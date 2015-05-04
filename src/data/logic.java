package data;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Kristian on 04/05/2015.
 */
public class logic {

    public String currentTime() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        dateFormat.setTimeZone(TimeZone.getDefault());

        return dateFormat.format(date);
    }

    public int setWidthLocation() {
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        int location = width - 200;

        return location;
    }
}
