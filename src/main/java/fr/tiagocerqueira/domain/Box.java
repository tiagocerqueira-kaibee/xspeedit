package fr.tiagocerqueira.domain;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * Class represents an collection of multiple articles
 */
public class Box extends ArrayList<Article> {

    private final Integer MAX_SIZE = 10;

    /**
     * Check if the article can fit in this box.
     * 
     * @param article
     * @return a boolean indicating if the article can fit in this box.
     */
    public boolean articleFit(Article article) {
        return getCurrentSize() + article.getSize() <= MAX_SIZE;
    }

    /**
     * Return the current size of the box.
     * 
     * @return the current size of the box.
     */
    public Integer getCurrentSize() {
        return this.stream().collect(Collectors.summingInt(Article::getSize));
    }

    /**
     * Add an article to the box, checking if this article fits within the box.
     */
    @Override
    public boolean add(Article article) {
        if (!articleFit(article)) {
            throw new IllegalStateException("Box oversized");
        }
        return super.add(article);
    }

}
