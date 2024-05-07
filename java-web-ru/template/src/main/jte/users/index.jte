@import exercise.dto.users.UsersPage
@param UsersPage page

<html>
<head>
    <title>Пользователи</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    @for(var user : page.getUsers())
    <div>
        <h2><a href="/courses/${user.getId()}">${user.getFirstName()}${user.getLastName()}</a></h2>
    </div>
    @endfor
</div>
</body>
</html>
