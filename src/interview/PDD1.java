package interview;

import java.util.Scanner;

/**
 * created by zsj in 19:03 2018/8/30
 * description:
 **/
public class PDD1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hp = scanner.nextInt();
        int normalAttack = scanner.nextInt();
        int buffedAttack = scanner.nextInt();
        if (hp <= normalAttack) {
            System.out.println(1);
        }
        if (normalAttack*2 >= buffedAttack) {
            System.out.println((int)Math.ceil((double)hp/normalAttack));
            int res = 0;
            while (hp > 0) {
                res++;
                hp -= normalAttack;
            }
            System.out.println(res);
        }
        else {
            int res = 0;
            while (hp > 0) {
                if (hp > normalAttack) {
                    res = res + 2;
                    hp -= buffedAttack;
                }
                else {
                    res ++;
                    hp -= normalAttack;
                }

            }
            System.out.println(res);
        }
    }
}
