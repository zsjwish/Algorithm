package interview;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 * created by zsj in 18:59 2018/9/7
 * description:
 **/
public class Ali1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String point_str1 = scanner.nextLine();
        String[] point = point_str1.split(",");
        int[] p = {Integer.valueOf(point[0]),Integer.valueOf(point[1])};
        String point_str2 = scanner.nextLine();
        String[] points = point_str2.split(",");
        int pointNum = points.length / 2;
        int[] px = new int[pointNum];
        int[] py = new int[pointNum];
        int n = 0;
        for (int i = 0; i < points.length;n++) {
            px[n] = Integer.valueOf(points[i++]);
            py[n] = Integer.valueOf(points[i++]);
        }
        System.out.println(Arrays.toString(p));
        System.out.println(Arrays.toString(px));
        System.out.println(Arrays.toString(py));
        Polygon pg = new Polygon(px, py, pointNum);
        if (pg.contains(p[0],p[1]+1)&&pg.contains(p[0],p[1]-1) && pg.contains(p[0]+1,p[1]) && pg.contains(p[0]-1,p[1])) {
            System.out.println("yes,0");
        }
        else {
            System.out.println("no,1");
        }
        getMin(px,py,p);
    }

    public static void getMin(int[] px, int[] py, int[] p) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < px.length; i++) {
            min = Math.min(min, getMinLength(px[i], py[i], p));
        }
        System.out.println("no,"+ min);
    }

    public static int getMinLength(int x, int y, int[] p) {
        return (int)(Math.sqrt((x-p[0])*(x-p[0]) + (y-p[1])*(y-p[1])));
    }
}
