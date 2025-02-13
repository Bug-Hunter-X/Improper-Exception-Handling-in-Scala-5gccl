```scala
class MyClass(val name: String) {
  private var _value: Int = 0

  def value: Int = _value
  def value_=(newValue: Int): Unit = {
    if (newValue < 0) {
      // Log the error for debugging purposes
      println(s"Error: Attempting to set negative value for $name: $newValue")
      // Use a default value or another more appropriate error handling strategy
      _value = 0
      
    } else {
      _value = newValue
    }
  }
}

object Main extends App {
  val myObject = new MyClass("My Object")
  myObject.value = 10
  println(myObject.value) // Output: 10

  myObject.value = -5 // No longer throws an exception, but logs the error and defaults to 0
  println(myObject.value) // Output: 0
}
```