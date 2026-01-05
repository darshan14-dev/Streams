//You are maintaining a blog post website.
// For SEO, you have been tasked
// to generate a list of all unique words used in the title of blog posts,
// converted to lowercase for better search.

package org.example;
import java.util.*;
import java.util.stream.*;


class BlogPost {
    String title;

    BlogPost(String title) {
        this.title = title;
    }
}

public class SetC_2 {
    public static void main(String[] args) {

        List<BlogPost> blogPosts = Arrays.asList(
                new BlogPost("Java Streams Made Easy"),
                new BlogPost("Understanding Java Collections"),
                new BlogPost("Streams and Collections in Java")
        );

        List<String> uniqueWord = blogPosts.stream()
                .flatMap(s -> Arrays.stream(s.title.split(" ")))
                .map( s -> s.toLowerCase())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueWord);


    }
}

