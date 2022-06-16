def run_once
    yield
 end
 
 run_once { puts "This block was run!" }



 def run_thrice_with_index
	yield 2
    yield 2
	yield 2

end

run_thrice_with_index { |i| puts "#{i} Tada!" }


def wrap_div
    "<div>#{yield}</div>" 
  end
  
  puts wrap_div { "hello!" }