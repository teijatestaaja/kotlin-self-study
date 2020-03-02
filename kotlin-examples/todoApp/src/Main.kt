fun askTaskDescription(type: String = "new"): String {
    print("Enter $type task description>")
    val desc = readLine()
    if (desc === null) {
        return ""
    } else return desc
}

fun printTasks(todoApp: Todo) {
    if (todoApp.taskList.size > 0) {
        println("\nTasks: ")
        for (task in todoApp.taskList) println(task)
        println("")
    } else {
        println("No tasks to do!")
    }
}

fun addTask(todoApp: Todo) {
    val description = askTaskDescription()
    if (!description.isBlank()) {
           val newTask = Task(description, false)
            todoApp.addTask(newTask)
            println("New task '${newTask.description}' was added!")
    } else {
        println("You did not enter proper task description!")
    }
}

fun removeTask(todoApp: Todo) {
    if (todoApp.taskList.size > 0) {
        printTasks(todoApp)
        val description = askTaskDescription()
        val taskToRemove = todoApp.searchTask(description)
        if (todoApp.removeTask(taskToRemove)) {
            println("Removed task '${taskToRemove.description}'")
        } else {
            println("Could not find task '${taskToRemove.description}'")
        }
    } else {
        println("No tasks to remove!")
    }
}

fun editTaskDescription(todoApp: Todo) {
    val oldDescription = askTaskDescription("old")
    val newDescription = askTaskDescription()
    if (oldDescription.isEmpty() || oldDescription.isBlank() || newDescription.isEmpty() || newDescription.isBlank()) {
        println("Description cannot be empty!")
        return;
    }
    if(todoApp.updateTaskDescription(oldDescription, newDescription)) {
        println("Replaced '$oldDescription' with '$newDescription'")
    } else {
        println("Unable to update task '$oldDescription'!")
    }
}

fun markTask(todoApp: Todo, status: Boolean) {
    if (todoApp.taskList.size > 0) {
        printTasks(todoApp)
        val description = askTaskDescription()
        val taskToMark = todoApp.searchTask(description)
        if (todoApp.markTask(taskToMark, status)) {
            println("Marked task '${taskToMark.description}' as " + if (status) "completed" else "uncompleted" )
        } else {
            println("Could not find task '${taskToMark.description}'")
        }
    } else {
        println("No tasks to mark!")
    }
}

fun main() {
    val todoApp = Todo()
    var alive = true

    while (alive) {
        println("")
        println("1 Print tasks")
        println("2 Add task")
        println("3 Remove task")
        println("4 Edit task description")
        println("5 Mark task completed")
        println("6 Mark task uncompleted")
        println("7 Quit")
        print("Choose>")

        var command = 0
        try {
            command = Integer.valueOf(readLine())
        } catch (ex: NumberFormatException) {
            command = 0
        }

        when (command) {
            1 -> printTasks(todoApp)
            2 -> addTask(todoApp)
            3 -> removeTask(todoApp)
            4 -> editTaskDescription(todoApp)
            5 -> markTask(todoApp, true)
            6 -> markTask(todoApp, false)
            7 -> alive = false
        }
    }
}