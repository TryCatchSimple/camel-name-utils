camel-name-utils
===================

It's a simple library. Helps people to get underscore style name from camel style name or get camel style name from underscore style name..

----------


How to use
-------------

```java
@Test
public void testCamel2underscore() {
		String underscoreName = CamelNameUtils.camel2underscore("AaaBbb");
		assertThat(underscoreName, is("aaa_bbb"));
}

@Test
public void testUnderscore2camel() {
		String camelName = CamelNameUtils.underscore2camel("user_name");
		assertThat(camelName,is("userName"));
}

@Test
public void testCapitalize() {
		String capitalName = CamelNameUtils.capitalize("student");
		assertThat(capitalName,is("Student"));
}
```