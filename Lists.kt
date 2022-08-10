fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
   	numbers.add("Ten")
    println("$numbers")
    // Add (Index, Element)
   	numbers.add(3,"4")
    println("$numbers")
    // Add All (List)
    numbers.addAll(weekDays)
   	println("$numbers")
    // Add All (Index, List)
     numbers.addAll(4,weekDays)
   	println("$numbers")
    // Clear 
   	weekDays.clear()
    println("$weekDays")
    // Remove
  println("$numbers.size")
  numbers.remove("four")
  println("after remove : $numbers.size ")
   
      // Remove all
    numbers.removeAll(numbers)
    println("$numbers")
    // The size of the list
  
    println("{$names.size}")
    // Contains
  
    println("${names.contains("Turki")}")
    println("${names.contains("Nasser")}")
    // Contains All
 
   	println("${names.containsAll(names)}")
    println("${names.containsAll(namesAll)}")
    // get
     
   	println(names.get(4))
    // indexOf
    
    println(names.indexOf("Nasser"))
    // isEmpty
        
    println(names.isEmpty())
    // Sublist
     
   println("${names.subList(0, 3)}")

}
