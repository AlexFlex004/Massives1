import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //CASE1//
        System.out.println("CASE 1");
        ////////////////////////////
        int[] massOne = new int[3];
        massOne[0] = 1;
        massOne[1] = 2;
        massOne[2] = 3;
        ////////////////////////////
        float[] massTwo = {1.57F, 7.654F, 9.986F};
        ////////////////////////////
        byte[] massThree = {4, 86, 116};
        ////////////////////////////
        System.out.println();

        //CASE2//
        System.out.println("CASE 2");
        for (int i = 0; i < massOne.length; i++) {
            System.out.print(massOne[i] + ", ");
        }
        System.out.println();
            /////////////////////////////
        for (int i = 0; i < massTwo.length; i++) {
            System.out.print(massTwo[i] + ", ");
        }
        System.out.println();
            /////////////////////////////
        for (int i = 0; i < massThree.length; i++) {
            System.out.print(massThree[i] + ", ");
        }
            /////////////////////////////
            System.out.println();
            System.out.println();

            //CASE3//
            System.out.println("CASE 3");
        for (int i = massOne.length - 1; i >= 0; i--) {
            System.out.print(massOne[i] + ", ");
        }
        System.out.println();
            /////////////////////////////
        for (int i = massTwo.length - 1; i >= 0; i--) {
            System.out.print(massTwo[i] + ", ");
        }
        System.out.println();
            /////////////////////////////
        for (int i = massThree.length - 1; i >= 0; i--) {
            System.out.print(massThree[i] + ", ");
        }
            /////////////////////////////
            System.out.println();
            System.out.println();

            //CASE4//
            System.out.println("CASE 4");
            for (int i = 0; i < massOne.length; i++) {
                if (massOne[i] % 2 != 0) ;
                massOne[i] = massOne[i] + 1;
            }
            System.out.println(Arrays.toString(massOne));
        }
    }