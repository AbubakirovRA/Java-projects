# ООП
+ [ООП?](#ООП)
+ [Основные принципы ООП.](#Основные-принципы-ООП)
+ [Что такое _«инкапсуляция»_?](#Что-такое-инкапсуляция)
+ [Что такое _«наследование»_?](#Что-такое-наследование)
+ [Что такое _«полиморфизм»_?](#Что-такое-полиморфизм)
+ [Что такое _«абстракция»_?](#Что-такое-абстракция)
+ [Что представляет собой _«обмен сообщениями»_?](#Что-представляет-собой-обмен-сообщениями)
+ [Расскажите про основные понятия ООП: _«класс»_, _«объект»_, _«интерфейс»_.](#Расскажите-про-основные-понятия-ООП-класс-объект-интерфейс)
+ [В чем заключаются преимущества и недостатки объектно-ориентированного подхода в программировании?](#В-чем-заключаются-преимущества-и-недостатки-объектно-ориентированного-подхода-в-программировании)
+ [Что подразумевают в плане принципов ООП выражения _«является»_ и _«имеет»_?](#Что-подразумевают-в-плане-принципов-ООП-выражения-является-и-имеет)
+ [В чем разница между _композицией_ и _агрегацией_?](#В-чем-разница-между-композицией-и-агрегацией)
+ [Что такое _статическое_ и _динамическое связывание_?](#Что-такое-статическое-и-динамическое-связывание)

## ООП?
__Объектно-ориентированное программирование (ООП)__ — методология программирования, основанная на представлении программы в виде совокупности объектов, каждый из которых является экземпляром определенного класса, а классы образуют иерархию наследования. 

+ объектно-ориентированное программирование использует в качестве основных логических конструктивных элементов объекты, а не алгоритмы;
+ каждый объект является экземпляром определенного класса 
+ классы образуют иерархии. 

Программа считается объектно-ориентированной, только если выполнены все три указанных требования. В частности, программирование, не использующее наследование, называется не объектно-ориентированным, а программированием с помощью абстрактных типов данных.

Согласно парадигме ООП программа состоит из объектов, обменивающихся сообщениями. Объекты могут обладать состоянием, единственный способ изменить состояние объекта - послать ему сообщение, в ответ на которое, объект может изменить собственное состояние. 



## Основные принципы ООП.
+ _Инкапсуляция_ - сокрытие реализации.
+ _Наследование_ - создание новой сущности на базе уже существующей.
+ _Полиморфизм_ - возможность иметь разные формы для одной и той же сущности.
+ _Абстракция_ - набор общих характеристик.
+ _Посылка сообщений_ - форма связи, взаимодействия между сущностями.
+ _Переиспользование_- все что перечислено выше работает на повторное использование кода.

Это единственно верный порядок парадигм ООП, так как каждая последующая использует предыдущие.



## Что такое _«инкапсуляция»_?
__Инкапсуляция__ – это свойство системы, позволяющее объединить данные и методы, работающие с ними, в классе и скрыть детали реализации от пользователя, открыв только то, что необходимо при последующем использовании.

Цель инкапсуляции — уйти от зависимости внешнего интерфейса класса (то, что могут использовать другие классы) от реализации. Чтобы малейшее изменение в классе не влекло за собой изменение внешнего поведения класса.

## Что такое _«наследование»_?
__Наследование__ – это свойство системы, позволяющее описать новый класс на основе уже существующего с частично или полностью заимствующейся функциональностью.

Класс, от которого производится наследование, называется _предком_, _базовым_ или _родительским_. Новый класс – _потомком_, _наследником_ или _производным_ классом.


## Что такое _«полиморфизм»_?
__Полиморфизм__ – это свойство системы использовать объекты с одинаковым интерфейсом без информации о типе и внутренней структуре объекта.

Преимуществом полиморфизма является то, что он помогает снижать сложность программ, разрешая использование одного и того же интерфейса для задания единого набора действий. Выбор же конкретного действия, в зависимости от ситуации, возлагается на компилятор языка программирования. Отсюда следует ключевая особенность полиморфизма - использование объекта производного класса, вместо объекта базового (потомки могут изменять родительское поведение, даже если обращение к ним будет производиться по ссылке родительского типа).

_Полиморфная переменная_, это переменная, которая может принимать значения разных типов, а _полиморфная функция_, это функция у которой хотя бы один аргумент является полиморфной переменной.
Выделяют два вида полиморфных функций:

+ _ad hoc_, функция ведет себя по разному для разных типов аргументов (например, функция `draw()` — рисует по разному фигуры разных типов);
+ _параметрический_, функция ведет себя одинаково для аргументов разных типов (например, функция `add()` — одинаково кладет в контейнер элементы разных типов).


## Что такое _«абстракция»_?
_Абстрагирование_ – это способ выделить набор общих характеристик объекта, исключая из рассмотрения частные и незначимые. Соответственно, __абстракция__ – это набор всех таких характеристик.


## Что представляет собой _«обмен сообщениями»_?
Объекты взаимодействуют, посылая и получая сообщения. Сообщение — это запрос на выполнение действия, дополненный набором аргументов, которые могут понадобиться при выполнении действия. В ООП посылка сообщения (вызов метода) — это единственный путь передать управление объекту. Если объект должен «отвечать» на это сообщение, то у него должна иметься соответствующий данному сообщению метод. Так же объекты, используя свои методы, могут и сами посылать сообщения другим объектам. Обмен сообщениями реализуется с помощью динамических вызовов, что приводит к чрезвычайно позднему связыванию (extreme late binding).


## Расскажите про основные понятия ООП: _«класс»_, _«объект»_, _«интерфейс»_.
__Класс__ – это способ описания сущности, определяющий состояние и поведение, зависящее от этого состояния, а также правила для взаимодействия с данной сущностью (контракт). 

С точки зрения программирования класс можно рассматривать как набор данных (полей, атрибутов, членов класса) и функций для работы с ними (методов).

С точки зрения структуры программы, класс является сложным типом данных.

__Объект (экземпляр)__ – это отдельный представитель класса, имеющий конкретное состояние и поведение, полностью определяемое классом. Каждый объект имеет конкретные значения атрибутов и методы, работающие с этими значениями на основе правил, заданных в классе.

__Интерфейс__ – это набор методов класса, доступных для использования. Интерфейсом класса будет являться набор всех его публичных методов в совокупности с набором публичных атрибутов. По сути, интерфейс специфицирует класс, чётко определяя все возможные действия над ним. 


## В чем заключаются преимущества и недостатки объектно-ориентированного подхода в программировании?
Преимущества:

+ Объектная модель вполне естественна, поскольку в первую очередь ориентирована на человеческое восприятие мира, а не на компьютерную реализацию.
+ Классы позволяют проводить конструирование из полезных компонентов, обладающих простыми инструментами, что позволяет абстрагироваться от деталей реализации.
+ Данные и операции над ними образуют определенную сущность, и они не разносятся по всей программе, как нередко бывает в случае процедурного программирования, а описываются вместе. Локализация кода и данных улучшает наглядность и удобство сопровождения программного обеспечения.
+ Инкапсуляция позволяет привнести свойство модульности, что облегчает распараллеливание выполнения задачи между несколькими исполнителями и обновление версий отдельных компонентов.
+ Возможность создавать расширяемые системы.
+ Использование полиморфизма оказывается полезным при:
    + Обработке разнородных структур данных. Программы могут работать, не различая вида объектов, что существенно упрощает код. Новые виды могут быть добавлены в любой момент.
    + Изменении поведения во время исполнения. На этапе исполнения один объект может быть заменен другим, что позволяет легко, без изменения кода, адаптировать алгоритм в зависимости от того, какой используется объект.
    + Реализации работы с наследниками. Алгоритмы можно обобщить настолько, что они уже смогут работать более чем с одним видом объектов.
    + Возможности описать независимые от приложения части предметной области в виде набора универсальных классов, или фреймворка, который в дальнейшем будет расширен за счет добавления частей, специфичных для конкретного приложения.
+ Повторное использование кода:
    + Сокращается время на разработку, которое может быть отдано другим задачам.
    + Компоненты многоразового использования обычно содержат гораздо меньше ошибок, чем вновь разработанные, ведь они уже не раз подвергались проверке.
    + Когда некий компонент используется сразу несколькими клиентами, улучшения, вносимые в его код, одновременно оказывают положительное влияние и на множество работающих с ним программ.
    + Если программа опирается на стандартные компоненты, ее структура и пользовательский интерфейс становятся более унифицированными, что облегчает ее понимание и упрощает использование.

Недостатки:

+ В сложных иерархиях классов поля и методы обычно наследуются с разных уровней. И не всегда легко определить, какие поля и методы фактически относятся к данному классу.
+ Код для обработки сообщения иногда «размазан» по многим методам (иначе говоря, обработка сообщения требует не одного, а многих методов, которые могут быть описаны в разных классах).
+ Документирование классов - задача более трудная, чем это было в случае процедур и модулей. Поскольку любой метод может быть переопределен, в документации должно говориться не только о том, что делает данный метод, но и о том, в каком контексте он вызывается.
+ Неэффективность и неэкономное распределения памяти на этапе выполнения (по причине издержек на динамическое связывание и проверки типов на этапе выполнения).
+ Излишняя универсальность. Часто содержится больше методов, чем это реально необходимо текущей программе. А поскольку лишние методы не могут быть удалены, они становятся мертвым грузом.


## Что подразумевают в плане принципов ООП выражения _«является»_ и _«имеет»_?
__«является»__ подразумевает наследование.
__«имеет»__ подразумевает ассоциацию (агрегацию или композицию).


## В чем разница между _композицией_ и _агрегацией_?
Ассоциация обозначает связь между объектами. Композиция и агрегация — частные случаи ассоциации «часть-целое».

Агрегация предполагает, что объекты связаны взаимоотношением «part-of» (часть). Композиция более строгий вариант агрегации. Дополнительно к требованию «part-of» накладывается условие, что экземпляр «части» может входить только в одно целое (или никуда не входить), в то время как в случае агрегации экземпляр «части» может входить в несколько целых.


## Что такое _статическое_ и _динамическое связывание_?
Присоединение вызова метода к телу метода называется связыванием. Если связывание проводится компилятором (компоновщиком) перед запуском программы, то оно называется _статическим_ или _ранним связыванием (early binding)_.

В свою очередь, _позднее связывание (late binding)_ это связывание, проводимое непосредственно во время выполнения программы, в зависимости от типа объекта. Позднее связывание также называют _динамическим (dynamic)_ или _связыванием на стадии выполнения (runtime binding)_. В языках, реализующих позднее связывание, должен существовать механизм определения фактического типа объекта во время работы программы, для вызова подходящего метода. Иначе говоря, компилятор не знает тип объекта, но механизм вызова методов определяет его и вызывает соответствующее тело метода. Механизм позднего связывания зависит от конкретного языка, но нетрудно предположить, что для его реализации в объекты должна включаться какая-то дополнительная информация.

Для всех методов Java используется механизм позднего (динамического) связывания, если только метод не был объявлен как `final` (приватные методы являются `final` по умолчанию).