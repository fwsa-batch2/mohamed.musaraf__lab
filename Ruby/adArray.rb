books = ["Siddhartha", "Shogun", "Discworld"]

p books.length

p books[1]

p books[0]

p books[books.length - 1]

p books.push("Harry potter")

p books.last

books.each do |q| p q 
end

books.each {|x| p x}

p "1234, 56".split(//) 


a = %w[ a b c d e f ]
p a.select {|v| v =~ /[a]/ } 