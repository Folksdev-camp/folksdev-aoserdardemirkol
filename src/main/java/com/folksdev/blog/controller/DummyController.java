package com.folksdev.blog.controller;

import com.folksdev.blog.dto.MovieDto;
import com.folksdev.blog.dto.request.CreateMovieRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class DummyController {
    @GetMapping
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok("Hi Folksdev");
    }

    @GetMapping("/{movieName}")
    public ResponseEntity<String> getMovieByName(@PathVariable String movieName) {
        return ResponseEntity.ok("Request -> GET: " + movieName);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateMovieById(@PathVariable String id, @RequestBody String data) {
        return ResponseEntity.ok("Request -> PUT: Movie id: " + id + "\n" + data + " Updated");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteMovieById(@PathVariable String id) {
        return ResponseEntity.ok("Request -> DELETE: The movie with id " + id + " has been deleted");
    }

    @PostMapping
    public ResponseEntity<MovieDto> createMovie(@Valid @RequestBody CreateMovieRequest request) {
        MovieDto dto = new MovieDto(request.getName());
        return ResponseEntity.ok(dto);
    }
}
