package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import exercise.dto.MainPage;
import exercise.dto.LoginPage;
import exercise.repository.UsersRepository;
import static exercise.util.Security.encrypt;

import exercise.util.NamedRoutes;
import io.javalin.http.Context;
import io.javalin.validation.ValidationException;

import java.util.Objects;

public class SessionsController {

    // BEGIN
    public static void index(Context ctx) {
        var mainPage = new MainPage(ctx.sessionAttribute("name"));
        ctx.render("index.jte", model("page", mainPage));
    }
    public static void build(Context ctx) {
        ctx.render("build.jte");
    }
    public static void create(Context ctx) {
        String name = ctx.formParam("name");
        String enteredPassword = encrypt(Objects.requireNonNull(ctx.formParam("password")));
        var user = UsersRepository.findByName(name);
        if (user != null && Objects.hashCode(user.getPassword()) == Objects.hashCode(enteredPassword)) {
            ctx.sessionAttribute("name", name);
            ctx.redirect(NamedRoutes.rootPath());
        } else {
            LoginPage page = new LoginPage(name, "Wrong username or password");
            ctx.render("build.jte", model("page", page));
        }
    }
    public static void destroy(Context ctx) {
        ctx.sessionAttribute("name", null);
        ctx.redirect("/");
    }
    // END
}
