package app;

import org.apache.commons.lang3.StringUtils;
import util.Input;

import java.util.Scanner;

public class justinQnn {

    public static void main(String[] args) {
        do {
            Input userInfo = new Input();
            System.out.println("Need more Input!!!");
            String info = userInfo.getString();

            System.out.println(info);
            System.out.println("Is this string numeric?" + StringUtils.isNumeric(info));
            System.out.println("Your string reversed: " + StringUtils.reverse(info));
            System.out.println("Your string flipped: " + StringUtils.swapCase(info));
        } while (true);
    }

}
