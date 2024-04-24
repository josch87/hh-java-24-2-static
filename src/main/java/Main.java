public class Main {
    public static void main(String[] args) {

        WebsiteVisitors websiteVisitor1 = new WebsiteVisitors();
        WebsiteVisitors websiteVisitor2 = new WebsiteVisitors();
        WebsiteVisitors websiteVisitor3 = new WebsiteVisitors();

        WebsiteVisitors.incrementTotalCount();

        websiteVisitor1.incrementInstanceCount();
        websiteVisitor2.incrementInstanceCount();
        websiteVisitor2.incrementInstanceCount();

        System.out.println(websiteVisitor1);
        System.out.println(websiteVisitor2);
        System.out.println(websiteVisitor3);
    }
}
