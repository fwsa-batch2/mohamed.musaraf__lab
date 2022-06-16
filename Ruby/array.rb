fruits = []

fruits.push("mango")
fruits.push("papaya")
fruits.push("kiwi")
fruits.push("Ice Apple")
fruits.push("pears")

veg = Array.new

veg.push("onion")
veg.push("cucumber")
veg.push("tomato")
veg.push("brinjal")
veg.push("ladys finger")


name = Array.new(3, "hasan")

puts name

veg.each{|a| print a}

puts(veg)
puts(fruits)
puts("length #{fruits.length()}")
fruits.delete("mango")
puts(fruits)
puts(fruits.unshift("orange"))