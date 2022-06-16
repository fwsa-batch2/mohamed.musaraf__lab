library = {}
library["Hasan"] =["Trust me", "Justice"]
library["Musaraf"] =["Cringe boy", "funny guys"]

authors = library.keys
p "These are the authors in my catalog: #{authors.join(", ")}"
p authors

library.each do |author, books| 
    p "#{author.capitalize} wrote the books #{books.join(', ')}"

end

    books = ["Design as Art", "Anathem", "Shogun"]
    authors = ["Bruno Munari", "Neal Stephenson", "James Clavell"]
    ash = {}

    for i in 0...books.length do
        for j in 0...authors.length do
          if i == j 
            puts books[i]
            b = authors[j].split.first
            c = b.to_sym
            d = c.downcase
            a = books[i]
            ash.store(d,a)
          end
        end
    end

puts ash


def first_name
    name = "hasan musata"

    if name.split.count > 1
    p  name.split.first
    else
      name
    end
  end

  first_name()


todos = [
    ["Send invoice", "money"],
    ["Clean room", "organize"],
    ["Pay rent", "money"],
    ["Arrange books", "organize"],
    ["Pay taxes", "money"],
    ["Buy groceries", "food"]
  ]


  array1 = []
  array2 = []
  array3 = []
  category = {}

  for i in 0...todos.length do
      for j in 0...todos[i].length do
        if todos[i][j+1] == "money"
            array1.push(todos[i][j])
 category[todos[i][j + 1].to_sym] =array1
        end
        if todos[i][j+1] == "organize"
            array2.push(todos[i][j])
 category[todos[i][j + 1].to_sym] =array2
        end
        if todos[i][j+1] == "food"
            array3.push(todos[i][j])
 category[todos[i][j + 1].to_sym] =array3
        end

    end

  end

#   p array1
p category