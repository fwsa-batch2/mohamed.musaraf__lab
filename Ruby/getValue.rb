class Klass
    def hello(*args)
      "Hello " + args.join(' ')
    end
  end
  k = Klass.new
print  k.send :hello, "gentle", "readers" 