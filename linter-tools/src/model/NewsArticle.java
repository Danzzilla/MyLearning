package model;

import java.time.LocalDate;

/**
 * This represents an article that can be in print
 * or found online
 *
 * @author Daniel Svirida
 * @version 1.0
 */
public class NewsArticle
{
    private String title;
    private String body;
    private boolean online;
    private LocalDate postedOn;
    private int views;

    /**
     * Creates a new article
     *
     * @param title the article title
     * @param body the article body
     * @param online is the article online
     * @param postedOn what date was the article posted on?
     * @param views how many people have viewed the article?
     */
    public NewsArticle(String title, String body, boolean online,
                       LocalDate postedOn, int views)
    {
        this.title = title;
        this.body = body;
        this.online = online;
        this.postedOn = postedOn;
        this.views = views;
    }

    /**
     * Gets the article title
     * @return the title of the article
     */
    public String getTitle()
    {
        return title;
    }

    public String body()
    {
        return body;
    }

    public boolean online()
    {
        return online;
    }

    public LocalDate postedOn()
    {
        return postedOn;
    }

    public int views(){
        return views;
    }

    @Override
    public String toString() {
        return "Title = " + title +
                ", Body = " + body;
    }
}