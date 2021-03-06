package ReadMe.domain;

import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @author madjanne
 */
public class ArticleTest {
    private Article article;

    public ArticleTest() {
    }

    @Before
    public void setUp() {
        this.article = new Article(1, "author", "title", "www", "desc", "penguin", 2018, false, new Date(5));
    }

    @Test
    public void toStringTest() {
        assertEquals("\nTitle: " + "title" + "\n Author: " + "author" +
                "\n Link: " + "www" + "\n Description: " + "desc" + "\n Publisher: " + "penguin" +
                "\n Year: " + 2018 + "\n Checked: " + false + "\n Date checked: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date(5)) + "\n", article.toString());
    }

    @Test
    public void toStringTestWithNullDate() {
        Article nullDate = new Article(1, "author", "title", "www", "desc", "penguin", 2018, false, null);
        assertEquals("\nTitle: " + "title" + "\n Author: " + "author" +
                "\n Link: " + "www" + "\n Description: " + "desc" + "\n Publisher: " + "penguin" +
                "\n Year: " + 2018 + "\n Checked: " + false + "\n", nullDate.toString());
    }

    @Test
    public void equalsTrueTest() {
        Article comp = new Article(1, "author", "title", "www", "desc", "penguin", 2018, false, new Date(5));
        assertTrue(article.equals(comp));
    }

    @Test
    public void equalsFalseTest() {
        Article not = new Article(3, "author1", "title2", "www4", "descr", "otava", 2015, true, new Date());
        assertFalse(article.equals(not));
    }
}
