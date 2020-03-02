package test
import Task
import org.junit.Test
import kotlin.test.assertEquals

class TaskTest {
    @Test
    fun  `should print not completed task` (){
        val task = Task("Buy groceries", false)
        assertEquals("[ ] Buy groceries", task.toString())
    }

    @Test
    fun  `should print completed task` (){
        val task = Task("Cook dinner", true)
        assertEquals("[x] Cook dinner", task.toString())
    }
}