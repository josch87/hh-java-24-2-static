public class WebsiteVisitors {
    private static long totalCount = 0;
    private long instanceCount = 0;

    public long getInstanceCount() {
        return instanceCount;
    }

    public static void setTotalCount(long totalCount) {
        WebsiteVisitors.totalCount = totalCount;
    }

    public static void incrementTotalCount() {
        totalCount++;
    }

    public void incrementInstanceCount() {
        instanceCount++;
    }

    @Override
    public String toString() {
        return "WebsiteVisitors{" +
                "totalCount=" + totalCount + ", " +
                "instanceCount=" + instanceCount +
                '}';
    }
}
