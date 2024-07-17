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


