import java.util.Arrays;

public class Main {

    private static final int countOfWebsiteVisitorsToCreate = 4;


    public static void main(String[] args) {

        WebsiteVisitors[] arrayOfWebsiteVisitors = new WebsiteVisitors[countOfWebsiteVisitorsToCreate];

        for (int i = 0; i < countOfWebsiteVisitorsToCreate; i++) {
            arrayOfWebsiteVisitors[i] = new WebsiteVisitors();
        }

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

        long sumOfWebsiteVisitors1And2 = Calculator.add(websiteVisitor1.getInstanceCount(), websiteVisitor2.getInstanceCount());
        System.out.println(sumOfWebsiteVisitors1And2);

        System.out.println(Arrays.toString(arrayOfWebsiteVisitors));
        arrayOfWebsiteVisitors[1].incrementInstanceCount();
        arrayOfWebsiteVisitors[1].incrementInstanceCount();
        arrayOfWebsiteVisitors[1].incrementInstanceCount();
        arrayOfWebsiteVisitors[2].incrementInstanceCount();
        System.out.println(Arrays.toString(arrayOfWebsiteVisitors));

        long sumOfAllWebsiteVisitors = 0;

        for (WebsiteVisitors websiteVisitor : arrayOfWebsiteVisitors) {
            sumOfAllWebsiteVisitors += websiteVisitor.getInstanceCount();
        }

        System.out.println(sumOfAllWebsiteVisitors);
        WebsiteVisitors.setTotalCount(sumOfAllWebsiteVisitors);

        System.out.println(Arrays.toString(arrayOfWebsiteVisitors));
    }
}
