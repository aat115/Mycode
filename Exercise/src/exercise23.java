public class exercise23 {
    public static void main(String[] args) {
        System.out.print("nums = ");
        int [] nums=new int[]{1,2,3,1,1,3};
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]==nums[j]&&i<j) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
