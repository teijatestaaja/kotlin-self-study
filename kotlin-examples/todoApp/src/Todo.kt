class Todo {
    var taskList = ArrayList<Task>()

    fun searchTask(desc: String): Task {
        for (task in taskList) {
            if (task.description.toLowerCase().equals(desc.toLowerCase())) return task
        }
        return Task("", false)
    }

    fun addTask(newTask: Task) = taskList.add(newTask)

    fun removeTask(task: Task): Boolean = taskList.remove(task)

    fun removeTaskByIndex(index: Int): Boolean {
        return if (index >= 0 && index < taskList.size) {
            taskList.removeAt(index)
            true
        } else false
    }

    fun markTask(taskToMark: Task, status: Boolean): Boolean {
        for (task in taskList) {
            if (task === taskToMark) {
                task.isCompleted = status
                return true
            }
        }
        return false
    }

    fun updateTaskDescription(oldDescription: String, newDescription: String): Boolean {
        for (task in taskList) {
            if (task.description.equals(oldDescription)) {
                task.description = newDescription
                return true
            }
        }
        return false
    }
}
