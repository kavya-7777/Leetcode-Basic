//832. Flipping an Image

class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] img = new int[image.length][image[0].length];
        for(int i=0;i<image.length;i++){
            int k = 0;
            for(int j=image[i].length-1;j>=0;j--){
                img[i][k++] = image[i][j];
            }
            for(int l=0;l<image[i].length;l++){
                if(img[i][l] == 0) img[i][l] = 1;
                else img[i][l] = 0;
            }
        }
        return img;
    }
}