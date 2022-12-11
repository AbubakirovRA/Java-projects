
*****************************************

## Выполнение Java файлов в консоли без IDE

*****************************************
Для выполнения Java-файлов на компьютере должна быть установлена среда выполнения Java - JRE (Java Runtime Environment).

Для исполнения файла в консоли java файл нужно скомпилировать:

  _**javac name_file.java**_

По итогу выполнения получаем файл вида: name_file.class - это двоичный файл,
который можно запустить командой:

_**java name_file**_

- причем расширение не нужно указывать, иначе будет ошибка:
Error: Could not find or load main class task5.class
Caused by: java.lang.ClassNotFoundException: task5.class

**********************************************

## Создание исполняемого файла из java-файла

**********************************************
Необходимо из файла типа name_file.class создать файл с расширением jar.
Это создается командой

_**jar cf имя_файла.jar имя_файла.class**_

где буквы cf означают create file.

Вообще компиляцией и сборкой занимаются специализированные фреймворки
такие как:

- Maven
- Ant
- Gradle

С помощью данных фреймворков сборка осуществляется прямо из IDE - [Сборка jar-файла](https://javarush.ru/groups/posts/3910-kofe-breyk-148-kak-prevratitjh-ljubuju-java-programmu-v-avtonomnihy-exe-fayl) 

[Сборка в консоли](https://habr.com/ru/post/125210/)

[Компиляция](https://javarush.ru/groups/posts/2318-kompiljacija-v-java)

[Компиляция 2](https://translated.turbopages.org/proxy_u/en-ru.ru.200a5945-6379e63f-ab938c15-74722d776562/https/www.baeldung.com/java-create-jar)

*********************************************

## Создание исполняемого -exe файла для Windows

*********************************************

После создания jar файла можно создать исполняемый файл Windows.

Для Windows это делается при помощи утилитки **Launch4j**. В результате ее работы
мы получаем исполняемый в среде Windows exe - файл. Для этого
существует два пути, можно создать файл, который будет искать установленную
в системе JRE, либо создать полностью автономный файл, который в своем составе
имеет копию JRE.

Это делается путем простой упаковки полученного exe-файла и, при необходимости,
папки, с копией JRE в один архив при помощи архиватора 7z. Далее при помощи
программы 7-ZIP SFX Maker, создаем из полученного архива исполняемы файл, с
расширением exe.

[Launch4J](https://launch4j.sourceforge.net/)

[ссылка на видео](https://www.youtube.com/watch?v=Mr_TdPuF-4g)

[ссылка на статью про инсталляторы](https://habr.com/ru/post/255807/)

[InnoSetup](http://www.jrsoftware.org/isdl.php)

[NSIS инсталлятор](https://nsis.sourceforge.io/Main_Page)

[ClicOnce](https://www.devowl.net/2017/01/1-clickonce-visual-studio.html)

[WiX](http://wixtoolset.org/)

[InstallShield](http://www.installshield.com/)
**********************************************

## Просмотреть содержимое файла в консоли Windows

**********************************************
можно командой more:

_**more name_file.java**_

или

_**type name_file.java**_

редактировать файл можно запустив ассоциированный с расширением файла редактор:

_**name_file.java > con**_

Если консоль выводяи крякозябры:

_**REM change CHCP to UTF-8**_

_**CHCP 65001**_

_**CLS**_