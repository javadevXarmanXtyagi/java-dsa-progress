package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {

       /* int x1 = 6;
        int x2 = 7;
        int x3 = 69;
        int x4 = 9;
        int x5 = 671;
        int x6 = 5;*/

        // arrays help this
        int [] arr={6,7,69,9,671,5};
        // updating elements
        arr    [3] = 59;
        // indexing
        System.out.println(arr[4]);
        System.out.println("-----------------------------------------------");
        System.out.println("Second Way to declare an array : ");
        int [] x = new int[5]; // 5 element only stored here [[arr =   [],[],[],[],[],[] ]]
        x[0] = 10;
        x[1] = 20;
        x[2] = 30;
        x[3] = 40;
        x[4] = 50;

        System.out.println(x[4]);




    }
}
