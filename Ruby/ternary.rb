puts ((gets.chomp.to_i) > 18) ? "eligible" : "not eligible"

class New_class

    attr_accessor :clsname
    attr_accessor :clscons

    @clsname = "me"
    @@clscons = "you"

end

cls1 = New_class.new
cls2 = New_class.new

cls1.clsname = "my"
puts cls1.clsname
puts cls2.clsname

cls1.clscons = "your"
puts cls1.clscons
puts cls2.clscons

cls2.clscons = "you1"
puts cls2.clscons


hunger = false


puts "study" unless hunger 

    
    