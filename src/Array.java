
public class Array {
    public static void main(String[] args) {

        int[] arr = new int[100];
        int i;
        for(i=0;i<100;i++) {
            arr[i]=i;
            System.out.println(arr[i]);
        }
        //finding duplicate
        for (int j=0;j<100;j++){
            for(int k=j+1;k<100;k++){
                if (arr[j]==arr[k]) {
                    System.out.println("Duplicate Found");

                }
                else
                    System.out.println("No Duplicate found");

            }

        }
    }
}
