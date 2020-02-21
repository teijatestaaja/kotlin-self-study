# Programming tasks

These programming tasks are beginner-friendly tasks for self-learning [Kotlin programming language](https://kotlinlang.org/). They are designed especially for those who have at least some basic Java or JavaScript programming background. The tasks work best if they are completed in order, starting from Task 1. Hints for solving tasks are provided only for the first five tasks, which will help you to set up the development environment, get familiar with finding out information in [Kotlin documentation](https://kotlinlang.org/docs/reference/) and introduce yourself to or brush up your skills in [Test-driven development](https://en.wikipedia.org/wiki/Test-driven_development).

All the tasks are divided into sections and completing each section gradually builds up your knowledge on different features of Kotlin. I have designed the tasks while teaching myself Kotlin from scratch, and the tasks below are free to use for personal learning and career advancement. Do not use these tasks for commercial purposes. If you have any questions or if you want to give feedback or improvement ideas, please send me an email to teija.alasalmi@gmail.com

(c) Teija Alasalmi

## Setting up the development environment along with unit tests

### [TASK 1](#task-1). Briefly study the basic syntax of Kotlin and create and run a Kotlin Hello World program using IntelliJ IDEA

- Read documentation [Kotlin's Getting Started - Basic Syntax](https://kotlinlang.org/docs/reference/basic-syntax.html).
- Download and configure Java JDK and IntelliJ IDEA.
- Start a new project.
- Add a Kotlin file.
- Add a print statement.
- Run the program.

### [TASK 2](#task-2). Run the same Hello World program using Visual Studio Code

- Download Visual Studio and install Code Runner plugin.
- Open the project in Visual Studio Code, with Code Runner plugin enabled.
- Try running it and notice the 'kotlinc' error.
- Install and set up latest standalone Kotlin compiler.
- Restart Visual Studio Code and run the project again.

### [TASK 3](#task-3). Run the same Hello World program using a command prompt or shell

- Compile and run the project in command prompt or shell.

### [TASK 4](#task-4). With IntelliJ as the code editor, make the following unit test pass using Test-driven development (TDD)

```kotlin
@Test
    fun `hello should return general message in English`(){
        assertEquals("Hello World!", hello())
    }
```

- To the previous project create a new test package.
- In the package, create a new Kotlin test class.
- Add JUnit testing libraries in the project classpath.
- Follow [TDD practises](https://www.jamesshore.com/Agile-Book/test_driven_development.html) to complete the task. Refactor code if needed.

### [TASK 5](#task-5). Make the following unit tests pass using TDD

```kotlin
@Test
    fun `hello should return personalized message in Finnish`() {
        assertEquals("Hei Teija!", hello(1, "Teija"))
    }

@Test
    fun `hello should return personalized message in Spanish`() {
        assertEquals("Hola María!", hello(2, "María"))
    }
```

- Follow TDD practises to complete the task. Refactor code if needed.

### [TASK 6](#task-6). Pla
