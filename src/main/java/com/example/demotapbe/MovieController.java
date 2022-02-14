package com.example.demotapbe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieController {

  private static final List<Movie> MOVIES = List.of(
          new Movie("A New Hope", "George Lucas"),
          new Movie("The Empire Strikes Back", "Irvin Kershner"),
          new Movie("Return of the Jedi", "Richard Marquand"),
          new Movie("The Phantom Menace", "George Lucas"),
          new Movie("Attack of the Clones", "George Lucas"),
          new Movie("Revenge of the Sith", "George Lucas")
  );

  @GetMapping("/films")
  public List<Movie> films() {
    return MOVIES;
  }
}
