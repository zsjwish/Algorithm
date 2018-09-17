package interview;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * created by zsj in 20:06 2018/9/17
 * description:
 **/
public class ShunFeng1 {
    public static final String GREAT = "GREAT";
    public static final String GOOD = "GOOD";
    public static final String ELIGIBLE = "ELIGIBLE";
    public static final String FAIL = "FAIL";

    private String number;
    private String grade100;
    private String grade800;
    private String jump;
    private String ball;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getGrade100() {
        return grade100;
    }

    public String getGrade800() {
        return grade800;
    }

    public String getJump() {
        return jump;
    }

    public String getBall() {
        return ball;
    }

    public void set100m(String s) {
        s = s.replace("s",".");
        float time = Float.valueOf(s);
        String grade100;
        if (time<=12) {
            grade100 = GREAT;
        }
        else if (time <= 12.4) {
            grade100 = GOOD;
        }
        else if (time <= 12.9) {
            grade100 = ELIGIBLE;
        }
        else {
            grade100 = FAIL;
        }
        this.grade100 = grade100;
    }
    public void setBall(String s) {
        s = s.replace("m","");
        float time = Float.valueOf(s);
        String ball;
        if (time>=10.4) {
            ball = GREAT;
        }
        else if (time >= 9.6) {
            ball = GOOD;
        }
        else if (time >= 8.7) {
            ball = ELIGIBLE;
        }
        else {
            ball = FAIL;
        }
        this.ball = ball;
    }
    public void set800m(String s) {
        s = s.replace("m",".");
        float time = Float.valueOf(s);
        String grade800;
        if (time<=2.15) {
            grade800 = GREAT;
        }
        else if (time <= 2.24) {
            grade800 = GOOD;
        }
        else if (time <= 2.31) {
            grade800 = ELIGIBLE;
        }
        else {
            grade800 = FAIL;
        }
        this.grade800 = grade800;
    }




    public void setJump(String s) {
        s = s.replace("cm","");
        int time = Integer.valueOf(s);
        String jump;
        if (time>=266) {
            jump = GREAT;
        }
        else if (time >= 256) {
            jump = GOOD;
        }
        else if (time >= 246) {
            jump = ELIGIBLE;
        }
        else {
            jump = FAIL;
        }
        this.jump = jump;
    }

    public ShunFeng1(String number, String grade100, String grade800, String jump, String ball) {
        this.number = number;
        this.grade100 = grade100;
        this.grade800 = grade800;
        this.jump = jump;
        this.ball = ball;
    }

    public ShunFeng1() {

    }

    @Override
    public String toString() {
        return  number + "\t"+ grade100 + "\t" + grade800 + "\t" + jump + "\t" + ball + "\t" ;
    }

    public ShunFeng1 (String s) {
        String[] strings = s.split(" ");
        for (String tmp : strings) {
            if (tmp == null || tmp.length() == 0) {
                continue;
            }
            if (tmp.endsWith("cm")) {
                setJump(tmp.replace("cm",""));
                continue;
            }
            else if (tmp.endsWith("m")) {
                setBall(tmp.replace("m",""));
                continue;
            }
            else if (tmp.contains("s")) {
                set100m(tmp.replace("s", "."));
                continue;
            }
            else if (tmp.contains("m")) {
                set800m(tmp.replace("m","."));
                continue;
            }
            else {
                setNumber(tmp);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ShunFeng1> list = new LinkedList<>();
        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("end")) {
                break;
            }
            ShunFeng1 s = new ShunFeng1(tmp);
            System.out.println(s.toString());

            list.add(s);
        }
        System.out.println(list);
        list.sort(new Comparator<ShunFeng1>() {
            @Override
            public int compare(ShunFeng1 o1, ShunFeng1 o2) {
                int index = 0;
                return 1;
            }

        });
    }
}
