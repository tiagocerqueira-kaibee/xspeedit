package fr.tiagocerqueira.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.tiagocerqueira.domain.Article;

public class StringToArticlesTest {

    private static StringToArticles service = new StringToArticles();

    @Test
    @DisplayName("Testing transforming a string article to a list of articles")
    public void testStringToArticles() throws Exception {
        String listArticles = "163841689525773";
        List<Article> articles = service.stringToArticles(listArticles);
        assertEquals(15, articles.size());
    }

    @Test
    @DisplayName("Testing transforming an empty string article to a list of articles")
    public void testStringToArticlesEmpty() throws Exception {
        String listArticles = "";
        assertThrows(IllegalArgumentException.class, () -> service.stringToArticles(listArticles));
    }

    @Test
    @DisplayName("Testing transforming an bad string article to a list of articles")
    public void testStringToArticlesBadFormat() throws Exception {
        String listArticlesBadFormat = "13424E3";
        assertThrows(IllegalArgumentException.class, () -> service.stringToArticles(listArticlesBadFormat));
    }

}
