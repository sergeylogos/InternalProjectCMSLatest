<#include "templates/header.ftl">

<table class="table table-hover">
    <thead>
    <tr class="bg-primary">
        <td>Группа</td>
        <td>Курс</td>
        <td>комната</td>
        <td>Дата старта</td>
        <td>Клиенты</td>
    </tr>
    </thead>

<#list groups as group>

    <tr>
        <td>${group.groupIdentifier}</td>
        <td>${group.course}</td>
        <td>
            <#if group.room??> ${group.room}<#else>room undefined</#if>
        </td>
        <td>${group.startDate?datetime?string("yyyy-MM-dd HH:mm")}</td>

        <td>
            <ol>
                <#list group.clients as client>
                    <li>${client.name} ${client.surname} ${client.phoneNumber}</li>
                </#list>
            </ol>
        </td>


    </tr>

</#list>


</table>


</body>
</html>