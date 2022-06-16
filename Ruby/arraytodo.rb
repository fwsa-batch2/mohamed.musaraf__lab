todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]

  arr1 = []
  arr2 = []
  arr3 = []

  todos.each {|x| 
arr1.push(x[0]) if x[1] == "money"
arr2.push(x[0]) if x[1] == "organize"
arr3.push(x[0]) if x[1] == "food"
} 
puts ["money:",arr1 ]

puts ["organize:",arr2 ]

puts ["food:",arr3 ]