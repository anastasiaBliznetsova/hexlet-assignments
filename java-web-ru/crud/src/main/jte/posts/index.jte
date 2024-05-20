@import exercise.util.NamedRoutes
@import exercise.dto.posts.PostsPage
@param PostsPage page

@template.layout.page(
    content = @`
        <h1>List of posts</h1>
            @for(var post : page.getPosts())
                <div>
                    <h2><a href="${NamedRoutes.postPath(post.getId())}">${post.getName()}</a></h2>
                </div>
            @endfor
        <p><a href="/posts?page=${page.getPageNumber() - 1}">Назад</a></p>
        <p><a href="/posts?page=${page.getPageNumber() + 1}">Вперёд</a></p>
    `
)
