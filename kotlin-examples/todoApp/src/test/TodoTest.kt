package test

import Task
import Todo
import org.junit.Test
import kotlin.test.assertEquals

class TodoTest {

   private val myList = Todo()

    @Test
    fun `should return empty todo list`() {
        assertEquals(0, myList.taskList.size)
    }

    @Test
    fun `should be able to add task` ()  {
        val task = Task("Clean the house", false)
        myList.addTask(task)
        assertEquals(1, myList.taskList.size)
    }

    @Test
    fun `should be able to remove task` ()  {
        val task = Task("Do the laundry", false)
        myList.addTask(task)
        assertEquals(true, myList.removeTask(task))
        assertEquals(0, myList.taskList.size)
    }

    @Test
    fun `should be able to remove task by number` ()  {
        val task = Task("Do the laundry", false)
        myList.addTask(task)
        assertEquals(true, myList.removeTaskByIndex(0))
        assertEquals(0, myList.taskList.size)
    }

    @Test
    fun `should be able to mark task as completed` ()  {
        val task = Task("Wash the dishes", false)
        myList.addTask(task)
        assertEquals(true, myList.markTask(task, true))
    }

    @Test
    fun `should be able to mark task as uncompleted` ()  {
        val task = Task("Take out the garbage", true)
        myList.addTask(task)
        assertEquals(true, myList.markTask(task, false))
    }

    @Test
    fun `should be able to update task description` ()  {
        val task = Task("Task description", false)
        myList.addTask(task)
        assertEquals(true, myList.updateTaskDescription("Task description", "Vacuum the house"))
        assertEquals("Vacuum the house", myList.taskList.get(0).description)
    }

    @Test
    fun `should be able to search task` () {
        val task = Task("Code in Kotlin", false)
        myList.addTask(task)
        assertEquals(task, myList.searchTask("Code in Kotlin"))
        assertEquals(task, myList.searchTask("code in kotlin"))
        assertEquals(task, myList.searchTask("CODE IN KOTLIN"))
    }
}