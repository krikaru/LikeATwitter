<#import "parts/common.ftlh" as c>

<@c.page>
    List of user

    <table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Role</th>
    </tr>
    </thead>
    <tbody>
    <#list users as user>
        <td>${user.username}</td>
        <td><#list user.roles as role>${role}<#sep>, </#list><td>
        <td><a href="/user/${user.id}">edit</a></td>
        </tbody>
        </table>
    </#list>
</@c.page>