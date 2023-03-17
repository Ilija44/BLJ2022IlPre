

public class Main {
    public static void main(String[] args) {
        int[][] memoryArray = new int[4][4];


        int num = 1;
        for(int i = 0; i < memoryArray.length; i++) {
            for(int j = 0; j < memoryArray[i].length; j++) {
                memoryArray[i][j] = num;
                num++;
                if(num > 8) {
                    num = 1;
                }
            }
        }

        for(int i = 0; i < memoryArray.length; i++) {
            for(int j = 0; j < memoryArray[i].length; j++) {
                int randomIndex1 = (int)(Math.random() * memoryArray.length);
                int randomIndex2 = (int)(Math.random() * memoryArray[i].length);
                int temp = memoryArray[i][j];
                memoryArray[i][j] = memoryArray[randomIndex1][randomIndex2];
                memoryArray[randomIndex1][randomIndex2] = temp;
            }
        }


        for(int i = 0; i < memoryArray.length; i++) {
            for(int j = 0; j < memoryArray[i].length; j++) {
                System.out.print(memoryArray[i][j] + " ");
            }
            System.out.println();
        }

}

}