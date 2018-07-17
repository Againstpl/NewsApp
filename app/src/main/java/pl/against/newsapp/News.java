package pl.against.newsapp;

/**
 * An {@link News} object contains information related to a single earthquake.
 */
public class News {

    private double m;

    /** Location of the earthquake */
    private String mWebTitle;

    /** Time of the earthquake */
    private long mWebPublicationDate;

    /** Website URL of the earthquake */
    private String mSectionName;

    /** Website URL of the earthquake */
    private String mWebUrl;


    /**
     * Constructs a new {@link News} object.
     */
    public News(String webTitle, long webPublicationDate, String sectionName, String webUrl) {
        mWebTitle = webTitle;
        mWebPublicationDate = webPublicationDate;
        mSectionName = sectionName;
        mWebUrl = webUrl;

    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public String getWebTitle() {
        return mWebTitle;
    }

    /**
     * Returns the location of the earthquake.
     */
    public long getWebPublicationDate() {
        return mWebPublicationDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public String getSectionName() {
        return mSectionName;
    }

    /**
     * Returns the website URL to find more information about the earthquake.
     */
    public String getWebUrl() {
        return mWebUrl;
    }
}