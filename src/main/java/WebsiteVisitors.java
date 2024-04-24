public class WebsiteVisitors {
    private static int totalCount = 0;
    private int instanceCount = 0;

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
