class Ruby_practice
    @@age = 12
    def hello
        name = "hasan"
        puts "My name is "+name
        puts "roll #{roll}"
    end
    def age1
        puts @@age
    end
    def roll
       @roll = 200
    end

end
run1 = Ruby_practice.new
run1.roll
run1.hello
run1.age1
