package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import java.util.List;
import java.util.ArrayList;
import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.model.Post;
import exercise.repository.PostRepository;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

    // BEGIN
    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        var post = PostRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Page not found"));
        var page = new PostPage(post);
        ctx.render("posts/show.jte", model("page", page));
    }

    public static void index(Context ctx) {
        var posts = PostRepository.getEntities();
        var page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
        var page2 = new PostsPage(posts.subList((page - 1) * 5, page * 5), page);
        ctx.render("posts/index.jte", model("page", page2));
    }
    // END
}
