## StaticFactoryBook
## Design patterns. Static Factory
You need to create a Book class, which represents a book with a title, author, and year of publication. To create an instance of the Book class, you should use a static factory called BookFactory, which will have the following methods:

1. createBookWithTitle(String title, String author) - creates a book with the given title and author, the year of publication will be set to the current year.
2. createBookWithTitleAndYear(String title, String author, int year) - creates a book with the given title, author, and year of publication.

Вам нужно создать класс Book, который представляет собой книгу с названием, автором и годом издания. Для создания экземпляра класса Book вы должны использовать статическую фабрику BookFactory, которая будет иметь следующие методы:

1. createBookWithTitle(String title, String author) - создает книгу с заданным названием и автором, год издания будет установлен на текущий год.
2. createBookWithTitleAndYear(String title, String author, int year) - создает книгу с заданным названием, автором и годом издания.
Ваша задача - создать класс Book и статическую фабрику BookFactory с указанными методами. После этого вы должны создать несколько экземпляров класса Book, используя различные методы статической фабрики.

## Разница между Static Factory и Factory Method 

Static Factory и Factory Method - это два различных шаблона проектирования (design pattern), которые используются для создания объектов в объектно-ориентированном программировании.

Static Factory (Статическая Фабрика) - это шаблон проектирования, при котором создание объектов происходит через статический метод в классе-фабрике. Этот метод обычно называется getInstance(), valueOf(), newInstance() и т.д. и возвращает объект запрошенного типа. Пример использования Static Factory - это классы java.lang.Boolean, java.lang.Integer, java.util.Collections и т.д.

Factory Method (Метод Фабрики) - это шаблон проектирования, при котором создание объектов делегируется подклассам. В отличие от Static Factory, где все создание объектов происходит внутри одного класса, в Factory Method различные подклассы могут предоставлять свою собственную реализацию фабричного метода, который создает объекты. Пример использования Factory Method - это интерфейс java.util.Iterator и его реализации в java.util.ArrayList, java.util.LinkedList и т.д.

Таким образом, основная разница между Static Factory и Factory Method заключается в том, что Static Factory используется для создания объектов в одном классе-фабрике, а Factory Method используется для создания объектов в разных подклассах.
