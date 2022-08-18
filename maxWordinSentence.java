class Solution {
    public int mostWordsFound(String[] sentences) {
        int[] len=new int[sentences.length];
        for(int i=0;i<sentences.length;i++)
        {
            String[] temp=sentences[i].split(" ");
            len[i]=temp.length;
        }
        Arrays.sort(len);
        return len[(sentences.length)-1];
    }
}
