@import exercise.dto.users.UserPage
@param UserPage page

<html>
<head>
    <title>Пользователь</title>
</head>
<body>
<div class="mx-auto p-4 py-md-5">
    <h1>${page.getUser().getFirstName()}${page.getUser().getLastName()}</h1>
</div>
</body>
</html>
