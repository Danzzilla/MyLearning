package driver;

import model.NewsArticle;

import java.time.LocalDate;

public class TestArticles
{
    private static final int NUM_VIEWS = 127;

    /**
     * Entry point of the application
     * @param args for command-line arguments
     */
    public static void main(String[] args)
    {
        NewsArticle myArticle = new NewsArticle("The Sky Is Falling",
                "More rain found in Seattle", true, LocalDate.now(), NUM_VIEWS);

        System.out.println("Created article: " + myArticle.getTitle());
    }
}
