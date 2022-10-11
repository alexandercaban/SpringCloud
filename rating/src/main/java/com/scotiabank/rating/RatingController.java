package com.scotiabank.rating;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @GetMapping
    public List<Rating> findRatingsByBookId(@RequestParam(required = false, defaultValue = "0") Long bookId) {
        List<Rating> rating = new ArrayList();

        rating.add(new Rating(1l,1l, 1));
        rating.add(new Rating(2l,2l, 2));
        rating.add(new Rating(3l,3l, 3));

        return rating;
    }

    @PostMapping
    public Rating createRating(@RequestBody Rating rating) {
        return rating;
    }

    @DeleteMapping("/{ratingId}")
    public Long deleteRating(@PathVariable Long ratingId) {
        return ratingId;
    }

    @PutMapping("/{ratingId}")
    public Rating updateRating(@RequestBody Rating rating, @PathVariable Long ratingId) {
        return rating;
    }

    @PatchMapping("/{ratingId}")
    public Rating updateRating(@RequestBody Map<String, String> updates, @PathVariable Long ratingId) {
        return new Rating(3l,3l, 3);
    }

}
