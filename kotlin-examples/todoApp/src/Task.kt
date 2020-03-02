data class Task(var description: String, var isCompleted: Boolean) {
    override fun toString(): String = if (isCompleted) "[x] $description" else "[ ] $description"
}