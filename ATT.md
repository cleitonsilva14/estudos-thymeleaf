# Thymeleaf Standard Expressions

Five types of Thymeleaf standard expressions:

1. __${}__ : Variable expressions
2. __*{}__ : Selection expressions
3. __#{}__ : Message (i18n) expressions
4. __@{}__ : Link (URL) expressions
5. __~{}__ : Fragment expressions


## Variable Expressions

Variable expressions are the most commonly used ones in thymeleaf 
templates. These expressions help bind the data from the template context(model)
into the resulting html(view).

__Syntax:__
${VariableName}

## Fragment Expressions
__Syntax:__ ~{fragment name}

1. __th:insert__ : insert content inside the tag
2. __th:replace__ : replaces the current tag with the tag defining the fragment
3. __th:include__ : this is deprecated


### Link Expressions
```html
<p>
    <a th:href="@{/link-expression/{id}(id=${id})}">Link with parameter</a>
</p>
```

### Link expressions && iteractions
```html
 <tbody>
    <tr th:each="user, userStat : ${users}">
        <td th:text="${userStat.count}"></td>
        <td th:text="${userStat.index}"></td>
        <td th:text="${userStat.even}"></td>
        <td th:text="${userStat.odd}"></td>
        <td th:text="${userStat.first}"></td>
        <td th:text="${userStat.last}"></td>
        <td th:text="${user.id}"></td>
        <td th:text="${user.name}"></td>
        <td th:text="${user.email}"></td>
        <td th:text="${user.role}"></td>
        <td th:text="${user.gender}"></td>
        <td><a type="button" th:href="@{/update/{id}(id=${user.id})}">Update</a></td>
        <td><a type="button" th:href="@{/delete/{id}(id=${user.id})}">Delete</a></td>
        <td><a type="button" th:href="@{/save}">Save</a></td>
    </tr>
</tbody>
```
