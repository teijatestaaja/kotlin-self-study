# Programming tasks

These programming tasks are beginner-friendly tasks for self-learning Kotlin programming language, if you have some basic Java or JavaScript programming background.
I have designed the tasks while teaching myself Kotlin from scratch, and the tasks below are free to use for personal learning and career advancement. The tasks work best if completed in order, starting from Task 1. Do not use these tasks for commercial purposes.

(c) Teija Alasalmi

## Setting up the environment along with unit tests

### [TASK 1](#task-1). Create and run a Kotlin Hello World program using IntelliJ IDEA

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
- Follow TDD practises to complete the task. Refactor code if needed.

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
