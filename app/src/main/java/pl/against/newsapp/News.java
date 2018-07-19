package pl.against.newsapp;

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {


    /**
     * Title of the news
     */
    private String mWebTitle;

    /**
     * Date of publication
     */
    private String mWebPublicationDate;

    /**
     * Name of the news section
     */
    private String mSectionName;

    /**
     * Website URL of the news
     */
    private String mWebUrl;

    /**
     * Author of the news
     */
    private String mAuthorName;


    /**
     * Constructs a new {@link News} object.
     */
    public News(String webTitle, String webPublicationDate, String sectionName, String webUrl, String authorName) {
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mSectionName = sectionName;
        mWebUrl = webUrl;
        mAuthorName = authorName;

    }

    /**
     * Returns the title of the news.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the publication date.
     */
    public String getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the name of the news section.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getWebUrl() {
        return mWebUrl;
    }

    /**
     * Returns the title of the news.
     */
    public String getAuthorName() {
        return mAuthorName;
    }
}