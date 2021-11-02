package fr.tiagocerqueira.services;

import java.util.List;

import fr.tiagocerqueira.domain.Article;
import fr.tiagocerqueira.domain.Box;

/**
 * Public service for transforming an boxesString into boxes.
 */
public final class ServiceBox {

    private final StringToArticles serviceStringToListeArticles = new StringToArticles();
    private final ListArticlesToBox serviceListeArticlesToBox = new ListArticlesToBox();

    /**
     * Transform an string boxes into a list of boxes.
     * 
     * @param boxesString the boxes in string format.
     * @return the list of boxes.
     */
    public List<Box> toBoxes(String boxesString) {
        List<Article> articles = serviceStringToListeArticles.stringToArticles(boxesString);
        return serviceListeArticlesToBox.toBoxes(articles);
    }

}
