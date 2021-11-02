package fr.tiagocerqueira.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.tiagocerqueira.domain.Article;
import fr.tiagocerqueira.domain.Box;

/**
 * Internal class for transforming an list of articles into a list of boxes.
 */
final class ListArticlesToBox {

    public List<Box> toBoxes(List<Article> articles) {
        List<Box> boxes = new ArrayList<Box>();
        articles.stream().forEach((a) -> {
            Optional<Box> box = boxes.stream().filter(b -> b.articleFit(a)).findFirst();
            boolean isNeedToCreateBox = !box.isPresent();

            if (isNeedToCreateBox) {
                Box newBox = new Box();
                newBox.add(a);
                boxes.add(newBox);
            } else {
                box.get().add(a);
            }
        });

        return boxes;
    }

}
