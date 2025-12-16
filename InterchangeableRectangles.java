//2001. Number of Pairs of Interchangeable Rectangles

class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<String,Long> map = new HashMap<>();
        long result=0;

        for(int[] rect : rectangles){
            int w=rect[0];
            int h=rect[1];
            int g=gcd(w,h);
            w/=g;
            h/=g;

            String key=w+"/"+h;
            long count=map.getOrDefault(key,0L);
            result+=count;
            map.put(key,count+1);
        }
        return result;
    }
    private int gcd(int a, int b){
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}