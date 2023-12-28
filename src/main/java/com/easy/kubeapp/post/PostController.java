package com.easy.kubeapp.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.IntStream;

@RestController
public class PostController {

    private final TextPopulator populator = new TextPopulator();

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/posts")
    public List<Post> listPosts() {
        return IntStream.rangeClosed(1, 20)
                .mapToObj(this::createPost).toList();
    }

    private Post createPost(int i) {
        return new Post(i, populator.randomTitle(), populator.randomContent()  +" "+ populator.randomContent());
    }

}
