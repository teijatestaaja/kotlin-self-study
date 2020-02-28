# Kotlin learning diary

This is my learning diary on Kotlin programming language. The self-study project was started on week 8 in 2020.

Total time spent on the project: 1750 minutes (29 hours 10 minutes)

## Steps from zero to hero in Kotlin

- [x] Set up a github self-study project and find out what Kotlin is (14.2.2020: 60 minutes)
- [x] Search, evaluate and list online learning material related to Kotlin (18.2.2020: 200 minutes)
- [x] Create an initial todo list for self-learning (18.2.2020: 20 min)
- [x] Install IntelliJ IDEA, Android Studio and plugins for Visual Studio Code (19.2.2020: 30 minutes)
- [x] Create a Hello World program and run it in different environments (19.2.2020: 30 minutes)
- [x] Create a file for [programming tasks](programming-tasks.md) and update learning diary (19.2.2020: 90 min)
- [x] Study the basics of Kotlin along with Kotlin's history, present and future (20.2.2020: 30 min)
- [x] Learn to write simple unit tests in Kotlin (20.2.2020: 120 minutes)
- [x] Find out benefits of Kotlin and update learning diary (20.2.2020: 90 minutes)
- [x] Find out differences between Kotlin and Java (21.2.2020: 240 minutes)
- [x] Design more programming tasks 7-10 (24.2.2020: 135 minutes)
- [x] Learn about Kotlin classes and collections (24.2.2020: 120 minutes)
- [x] Watch videos related to Kotlin on YouTube (27.2.2020: 225 minutes) ~ 1 study point completed
- [ ] Create TODO App in Kotlin (28.2.2020: 360 minutes)
- [ ] Practise at Kotlin Koans
- [ ] Solve Kotlin puzzles
- [ ] Create a simple Android App
- [ ] ... more to be added later

## Where to learn Kotlin

After searching and evaluating online material related to Kotlin, I learned that Kotlin language was developed in 2011 by [JetBrains](https://www.jetbrains.com/), a software development company headquartered in Czech Republic. In May 2019 [Google announced](https://techcrunch.com/2019/05/07/kotlin-is-now-googles-preferred-language-for-android-app-development/) that the Kotlin programming language is now its preferred language for Android application developers. Also, according to [some statistics](http://codinginfinite.com/top-programming-languages-2020-stats-surveys), with the growth of Android, support of Google and with clean and short syntax Kotlin is a good choice to learn as a programming language for Android development.

I also learned that there are many tutorials, guidelines, online courses and Youtube videos on Kotlin. Most of it seems to be in English, since I could not find any tutorials in Finnish. The best materials for learning Kotlin online are maintained by the [Kotlin Foundation](https://kotlinlang.org/foundation/kotlin-foundation.html), which *"was created by JetBrains and Google with the mission to protect, promote and advance the development of the Kotlin programming language."* See [the list](README.md).

## Writing the first program (Tasks 1 to 3)

To complete [Task 1](programming-tasks.md#task-1) I installed the [JDK](https://jdk.java.net/) and downloaded [IntelliJ IDEA Community Edition](https://www.jetbrains.com/idea/). For [Task 2](programming-tasks.md#task-2) I downloaded [Kotlin plugin](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin) and [Code Runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner) for my favourite code editor, [Visual Studio Code](https://code.visualstudio.com/). For [Task 3](programming-tasks.md#task-3) I also downloaded the latest [standalone version of the Kotlin complier](https://github.com/JetBrains/kotlin/releases/tag/v1.3.61).

As a result, I created my first hello world program in Kotlin with IntelliJ IDEA

```kotlin
fun main() {
    println("Hello World!")
}
```

I learned to

- make a basic Kotlin project in IntelliJ IDEA
- create a new Kotlin file (.kt file) by right-clicking src folder
- run a Kotlin program with IntelliJ IDEA, Visual Studio Code and a command prompt
- set up a Kotlin standalone compiler

I used the following learning materials

- Tutorial: [Getting Started with IntelliJ IDEA](https://kotlinlang.org/docs/tutorials/getting-started.html)
- Video: [Kotlin - Visual Studio Code](https://www.youtube.com/watch?v=QeVl8fXteI0)
- Tutorial: [Working with the Command Line Compiler](https://kotlinlang.org/docs/tutorials/command-line.html)
- Documentation: [Kotlin's Getting Started - Basic Syntax](https://kotlinlang.org/docs/reference/basic-syntax.html)

## Creating first unit tests (Tasks 4 to 5)

As a Test Engineer, I wanted to learn to write tests first using Test-driven development (TDD) method. I created my first unit tests in Kotlin and as a result, refactored code by adding a hello named function:

```kotlin
fun hello(language: Int = 0, name: String = "World") = when (language) {
    1 -> "Hei ${name}!"
    2 -> "Hola ${name}!"
    else -> "Hello ${name}!"
}

fun main() {
    println(hello())
}
```

I learned

- to write simple unit tests
- some very basics of Kotlin (how to create a function with default values, use a string template and use a when statement)
- to use TDD method with Kotlin
- simplify code
- to run unit tests
- why Kotlin is cool
- a 5 step method of easy TDD

> According to Heather Downing, Kotlin is cool because it is
>
> - concise: The less code you write, the fewer mistakes you make.
> - expressive: You can express whatever you want in a shorter way.
> - pragmatic: It does not take a lot to get something built.
> - type safe: For a developer it is important that you have something you don't have to think about too much.
> - functional: In Kotlin, funtions and properties are first class citizens.
> - friendly: Interoperability between Kotlin and Java work almost perfectly.
> - human readable: This is visible when writing tests or comparing with other programming languages.
>
> Heather Downing's 5 step method of easy TDD
>
> 1. Decide the inputs and outputs
> 2. Choose function signature
> 3. Decide on one aspect of functionality
> 4. Implement test
> 5. Implement code

I used the following learning materials

- Article: [Getting Started Unit Testing with Kotlin](https://spin.atomicobject.com/2018/10/07/kotlin-unit-testing/) by Molly Alger
- Tutorial: [Test Driven Development](https://www.jetbrains.com/help/idea/tdd-with-intellij-idea.html)
- Tutorial: [Kotlin Tutorial for Beginners: Learn Kotlin Programming in 2 Hours](https://www.guru99.com/kotlin-tutorial.html)
- Documentation: [The standard Kotlin testing framework Kotlin.test](https://kotlinlang.org/api/latest/kotlin.test/index.html)
- Kotlin Language Guide: [Control Flow: if, when, for, while](https://kotlinlang.org/docs/reference/control-flow.html)
- Chapter in a book: [The Art of Agile Development: Test-Driven Development](https://www.jamesshore.com/Agile-Book/test_driven_development.html) by James Shore
- Conference talk (video): [Android TDD with Kotlin](https://www.youtube.com/watch?v=TXwCu8fVsVU) by Heather Downing

## Creating classes with properties (Tasks 6 to 8)

I learned to

- convert Java classes to Kotlin classes
- differences between Java and Kotlin
- refresh some Java
- basics of Kotlin
- create classes in Kotlin
- use collections in Kotlin

I used the following learning materials

- Documentation: [Classes and Inheritance](https://kotlinlang.org/docs/reference/classes.html)
- Documentation: [Data Classes](https://kotlinlang.org/docs/reference/data-classes.html)
- Tutorial: [Mixing Java and Kotlin in one project](https://kotlinlang.org/docs/tutorials/mixing-java-kotlin-intellij.html)
- Video: [Kotlin Crash Course for Java Developers](https://www.youtube.com/watch?v=pXdY1B-KVJg)
- Video: [Kotlin course - Tutorial for beginners](https://www.youtube.com/watch?v=F9UC9DY-vIU)
- Video: [Introduction to Kotlin](https://www.youtube.com/watch?v=X1RVYt2QKQE)
- Documentation: [Kotlin Collections Overview](https://kotlinlang.org/docs/reference/collections-overview.html)

## Creating a simple Todo App in Kotlin (Tasks 9 to 10)

I learned to

- Use the basic of Kotlin in action in a simple Todo program that prints todos on console
