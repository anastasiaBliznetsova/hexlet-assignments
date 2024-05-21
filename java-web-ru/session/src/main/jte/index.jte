@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
content = @`
    <div>
        @if(page.getName() == null)
            <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
        @else
            <form action="${NamedRoutes.logoutPath()}" method="post">
                ${page.getName().toString()}
                <input type="submit" value="Выйти" />
            </form>
        @endif
    </div>
`
)