<%@ page import="com.halfdozenshots.errorsinassociations.AuthorE2"%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
  <meta name="layout" content="main" />
  <g:set var="entityName" value="${message(code: 'author.label', default: 'Author')}" />
  <title><g:message code="default.create.label" args="[entityName]" /></title>
</head>
<body>
  <div class="nav">
    <span class="menuButton"><a class="home" href="${createLink(uri: '/')}">Home</a></span>
    <span class="menuButton"><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></span>
  </div>
  <div class="body">
    <h1><g:message code="default.create.label" args="[entityName]" /></h1>

    <g:if test="${flash.message}"><div class="message">${flash.message}</div></g:if>
    
    <g:hasErrors bean="${authorInstance}">
      <div class="errors"><g:renderErrors bean="${authorInstance}" as="list" /></div>
    </g:hasErrors>
    
    <g:form action="create" method="post">
      <div class="dialog">
        <table>
          <tbody>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="name"><g:message code="author.name.label" default="Author name" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'name', 'errors')}">
				<g:textField name="name" value="${authorInstance?.name}" />
			  </td>
            </tr>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="books[0].title"><g:message code="book.title.label" default="Book title 1" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'books[0].title', 'errors')}">
				<g:textField name="books[0].title" value="${authorInstance?.books ? authorInstance.books[0].title : ''}" />
			  </td>
            </tr>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="books[1].title"><g:message code="book.title.label" default="Book title 2" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'books[1].title', 'errors')}">
				<g:textField name="books[1].title" value="${authorInstance?.books ? authorInstance.books[1].title : ''}" />
			  </td>
            </tr>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="publications['p1'].name"><g:message code="book.title.label" default="Publication 1" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'publications[\'p1\'].name', 'errors')}">
                <g:textField name="publications['p1'].name" value="${authorInstance?.publications ? authorInstance.publications['p1'].name : ''}" />
              </td>
            </tr>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="tags[0].name"><g:message code="book.title.label" default="Tag 1" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'tags[0].name', 'errors')}">
                <g:textField name="tags[0].name" value="${authorInstance?.publications ? authorInstance.tags[0].name : ''}" />
              </td>
            </tr>
            <tr class="prop">
              <td valign="top" class="name">
                <label for="tags[1].name"><g:message code="book.title.label" default="Tag 2" /></label>
              </td>
              <td valign="top" class="value ${hasErrors(bean: authorInstance, field: 'tags[1].name', 'errors')}">
                <g:textField name="tags[1].name" value="${authorInstance?.publications ? authorInstance.tags[1].name : ''}" />
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div class="buttons">
        <span class="button">
          <g:submitButton name="create"	class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
        </span>
      </div>
    </g:form>
  </div>
</body>
</html>