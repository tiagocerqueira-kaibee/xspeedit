package fr.tiagocerqueira.services;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fr.tiagocerqueira.domain.Article;
import fr.tiagocerqueira.domain.Box;

public class ListArticlesToBoxTest {

    @Test
    @DisplayName("Testing the evolution of boxes")
    public void testListArticlesToBox() throws Exception {
        ListArticlesToBox service = new ListArticlesToBox();
        List<Article> articles = new ArrayList<Article>();
        articles.add(new Article(2));
        List<Box> boxes = service.toBoxes(articles);
        assertEquals(1, boxes.size());

        articles.add(new Article(9));
        boxes = service.toBoxes(articles);
        assertEquals(2, boxes.size());

        articles.add(new Article(1));
        boxes = service.toBoxes(articles);
        assertEquals(2, boxes.size());

        articles.add(new Article(1));
        boxes = service.toBoxes(articles);
        assertEquals(2, boxes.size());

        articles.add(new Article(9));
        boxes = service.toBoxes(articles);
        assertEquals(3, boxes.size());
    }

}
