public class OddTimex {
    public static void main(String[] args) {
        int[] arr = {7, 7, 2, 7, 5, 2, 5};
        int temp=0;
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
               if (arr[i]==arr[j])  {
                   temp=arr[i];
                   arr[i]=temp;
                   i++;
                   if (temp==7){
                       System.out.println(temp);

                   }

               }

            }

        }
    }
}
