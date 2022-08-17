class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double result=0;
        int count=0;
        for(int i=1;i<(salary.length)-1;i++)
        {
            result+=salary[i];
            count++;
        }
        return (result)/count;
    }
}
