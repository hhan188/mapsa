package tamrin5;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        double wallArea = width * height;
        int nOFBucketForWall = (int)(Math.ceil(wallArea / areaPerBucket));
        return nOFBucketForWall - extraBuckets;
    }
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        double wallArea = width * height;
        int nOFBucketForWall = (int)(Math.ceil(wallArea / areaPerBucket));
        return nOFBucketForWall;
    }
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        int nOFBucketForWall = (int)(Math.ceil(area / areaPerBucket));
        return nOFBucketForWall;
    }
}
