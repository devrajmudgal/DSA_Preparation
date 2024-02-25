public class Multidimentional_Array {
    public static void main(String[] args){
        int[][] nums = new int[5][5];
        int[][] Arr = {
                {1,2,3,4,5},
                {2,3,4,5,6},
                {3,4,5,6,7}
        };
        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int) (Math.random()*10);
            }
        }
        System.out.println("*********************************************");
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        //enhanced for loop
        System.out.println("**********************************************");
        for(int n[]:nums){ //n[] because here nums element are of type array
            for(int m:n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}
