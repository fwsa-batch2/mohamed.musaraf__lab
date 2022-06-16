html = {
    :tag => "p"
    :text => "This is the para"
}

def render(node)
    if node[:tag] == "p"
        p "p: "
        p node[:text]
    end
    end 
    render(html)