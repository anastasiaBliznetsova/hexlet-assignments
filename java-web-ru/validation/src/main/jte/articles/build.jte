@import exercise.dto.articles.BuildArticlePage
@import exercise.repository.ArticleRepository
@param BuildArticlePage page

@if(page.getErrors() != null)
    <ul>
        @for(var validator : page.getErrors().values())
            @for(var error : validator)
                <li>${error.getMessage()}</li>
            @endfor
        @endfor
    </ul>
@endif
<form action="/articles" method="post">
    <div>
        <label>
            Title
            <input type="text" name="title" value="${page.getTitle()}" />
        </label>
    </div>
    <div>
        <label>
            Content
            <textarea name="content" autocomplete="on">${page.getContent()}</textarea>
        </label>
    </div>
    <input type="submit" value="Add article" />
</form>