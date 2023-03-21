public class FixWindowMaxSum {
    public static void main(String[] args) {
        int[] num = {3,-1,4,12,-8,5,6};
        int constraint =4, ans=0, curr=0;
        for (int i = 0; i < num.length; i++) {
            if (i>=constraint) {
                curr -= num[i-constraint];
            }
            curr += num[i];

            ans = Math.max(ans,curr);
        }

        System.out.println(ans);
    }
}
