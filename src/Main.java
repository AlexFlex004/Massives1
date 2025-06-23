import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //CASE1//
        System.out.println("CASE 1");
        ////////////////////////////
        int [] massOne = new int [3];
        massOne[0] = 1;
        massOne[1] = 2;
        massOne[2] = 3;
        ////////////////////////////
        float [] massTwo = {1.57F, 7.654F, 9.986F};
        ////////////////////////////
        byte [] massThree = {4, 86, 116};
        ////////////////////////////
        System.out.println();

//Задание 2, 3 можно сделать через Arrays, но в задании показан пример без квадратных скобок.

        //CASE2//
        System.out.println("CASE 2");
        System.out.print(massOne[0] + ", " );
        System.out.print(massOne[1] + ", " );
        System.out.print(massOne[2]);
        /////////////////////////////
        System.out.println();
        System.out.print(massTwo[0] + ", " );
        System.out.print(massTwo[1] + ", " );
        System.out.print(massTwo[2]);
        /////////////////////////////
        System.out.println();
        System.out.print(massThree[0] + ", " );
        System.out.print(massThree[1] + ", " );
        System.out.print(massThree[2]);
        /////////////////////////////
        System.out.println();
        System.out.println();

        //CASE3//
        System.out.println("CASE 3");
        System.out.print(massOne[2] + ", " );
        System.out.print(massOne[1] + ", " );
        System.out.print(massOne[0]);
        /////////////////////////////
        System.out.println();
        System.out.print(massTwo[2] + ", " );
        System.out.print(massTwo[1] + ", " );
        System.out.print(massTwo[0]);
        /////////////////////////////
        System.out.println();
        System.out.print(massThree[2] + ", " );
        System.out.print(massThree[1] + ", " );
        System.out.print(massThree[0]);
        /////////////////////////////
        System.out.println();
        System.out.println();

        //CASE4//
        System.out.println("CASE 4");
        for (int i = 0; i < massOne.length; i++) {
            if (massOne[i] % 2 != 0);
            massOne[i] = massOne[i] + 1;
        }
        System.out.println(Arrays.toString(massOne));
    }
}