package Section13_1;

public class Practice5 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int x = -1, y = 0, cnt = 0;

        boolean flag = true;
        int direction = 1;

        for (int length = 9; length > 0; length -= 2) {
            for (int i = 0; i < length; i++) {
                if (i < length / 2 + 1) {
                    x += direction;
                } else {
                    y += direction;
                }
                array[y][x] = ++cnt;
            }
            direction = -direction;
        }





//        for (int length = 9; length >0 ; length -=2) {
//            if (flag) {
//                for (int i = 0; i < length; i++) {
//                    if (i < length / 2 + 1) {
//                        x++;
//                    } else {
//                        y++;
//                    }
//                    array[y][x] = ++cnt;
//                    flag = !flag;
//                }
//            } else {
//                for (int i = 0; i < length; i++) {
//                    if (i < length / 2 + 1) {
//                        x--;
//                    } else {
//                        y--;
//                    }
//                    array[y][x] = ++cnt;
//                }
//                flag = !flag;
//            }
//        }

        for (int ints[] : array) {
            for (int data : ints) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}
