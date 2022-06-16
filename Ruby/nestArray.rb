names = [["Jhumpa", "Lahiri"], ["J. K", "Rowling"], ["Devdutt", "Pattanaik"]]

p names[0].join(" ")

b = []
for a in names do
     b.push(a.join(" "))
end
p b

[:foo, :bar, :baz].each.with_index do |value, index|
    puts "#{index}: #{value}"
end

[:foo, :bar, :baz].each_with_index do |value, index|
    puts "#{index}: #{value}"
end


books = ["Design as Art", "Anathem", "Shogun"]
authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]


books.map.with_index do |books, i|

    authors.map.with_index do |authors, j|

        if i == j
            p "#{books} was written by #{authors}"

        end
    end
end





