@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        <form action="/users" method="get">
            <input type="search" name="term" value="${page.getTerm()}" />
            <input type="submit" value="Search" />
        </form>
    @for(var user : page.getUsers())
        <div>
            <h2>${user.getFirstName()} ${user.getLastName()}</h2>
        </div>
    @endfor
    `
)