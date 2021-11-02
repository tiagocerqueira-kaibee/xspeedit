package fr.tiagocerqueira.services;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import fr.tiagocerqueira.domain.Article;

/**
 * Internal class for transforming a string into a list of articles.
 */
final class StringToArticles {

    /**
     * Transform a string into a list of articles.
     * 
     * @param articlesFormat
     * @return a list of articles.
     */
    public List<Article> stringToArticles(String articlesFormat) {
        return Arrays.stream(articlesFormat.split("")).map((valueAsString) -> {
            try {
                Integer value = Integer.parseInt(valueAsString);
                return new Article(value);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid value");
            }
        }).collect(Collectors.toList());
    }

}
