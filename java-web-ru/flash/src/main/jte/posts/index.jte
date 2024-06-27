@import exercise.dto.posts.PostsPage
@import exercise.util.NamedRoutes
@param PostsPage page

@template.layout.page(
page = page,
content = @`
    <div>
        @if(page.getFlash() != null)
            <p>${page.getFlash()}</p>
        @endif
    </div>
    <div>
        <table class="table table-striped">
            @for(var post : page.getPosts())
                <tr>
                    <td>
                        ${post.getName()}
                    </td>
                    <td>
                        ${post.getBody()}
                    </td>
                </tr>
            @endfor
        </table>
    </div>
`
)

