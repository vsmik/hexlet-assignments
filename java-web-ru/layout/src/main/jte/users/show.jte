@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
    header =@`<a href="/">Main</a>
              <a href="/users">Users</a>`,
content =@`<h2>About user ${page.getUser().getFirstName()}</h2>
      <table>
        <thead>
          <tr>
            <th>User ID</th>
            <th>Firstname</th>
            <th>Lastname</th>
            <th>Email</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>${page.getUser().getId()}</td>
            <td>${page.getUser().getFirstName()}</td>
            <td>${page.getUser().getLastName()}</td>
            <td>${page.getUser().getEmail()}</td>
          </tr>
        </tbody>
      </table>` ,
footer=@`<p>Thanks for visiting, come again soon!</p>`)