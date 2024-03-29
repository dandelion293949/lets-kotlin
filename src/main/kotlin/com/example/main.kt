package com.example

fun main(args: Array<String>) {
  println("Hello, World!")
  args.forEach { println(it) }

  val user = User("Kotlin", 29);
  val person = Person(user);
  person.greet();

  scopeFunctions();

  loop();
}

data class User(val name: String, val age: Int)

class Person(val user: User) {
  fun greet(): kotlin.Unit {
    val (name) = user;
    println("Hello, $name!")
    println("I'm ${user.age} years old.")
  }
}

fun loop() {
  val items = listOf("apple", "banana", "kiwifruit")
  for (item in items) {
    println(item)
  }

  for (index in items.indices) {
    println("item at $index is ${items[index]}")
  }

  var index = 0
  while (index < items.size) {
    println("item at $index is ${items[index]}")
    index++
  }
}

fun scopeFunctions() {

  println()
  println("\"let\"")
  val a = "test".let {
    println(it)
  }
  println(a)

  println()
  println("\"run\"")
  val b = "test".run {
    println(this)
  }
  println(b)

  println()
  println("\"apply\"")
  val c = "test".apply {
    println(this)
  }
  println(c)

  println()
  println("\"also\"")
  val d = "test".also {
    println(it)
  }
  println(d)

  println()
  println("\"with\"")
  val e = with("test") {
    println(this)
  }
  println(e)

}


