public class Array {
    public static void main(String[] args){
        int[] arr = new int[5];
        int[] nums = {1,2,3,4,5,6,7};

        for(int i=0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*10);
        }
        System.out.println("The array Values are: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
