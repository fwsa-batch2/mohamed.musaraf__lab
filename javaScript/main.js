function saveData() {

  Names = document.getElementById("Name").value;
  dob1 = document.getElementById("D.O.B").value;
  mail1 = document.getElementById("mail").value;
  let gender1;
  if (document.getElementById('male').checked) {
    gender1 = "male";
  } if (document.getElementById('female').checked) {
    gender1 = "female";
  }

  let elmt = document.getElementById("eq");
  let eq1 = elmt.options[elmt.selectedIndex].text


  let nos = document.getElementById("no");
  let no1 = nos.options[nos.selectedIndex].text;

  let ph = document.getElementById("phone").value


  address = document.getElementById('add').value;



  localStorage.setItem("Name", Names)
  localStorage.setItem("D.O.B", dob1)
  localStorage.setItem("mail", mail1)
  localStorage.setItem("eq", eq1)
  localStorage.setItem("no", no1)
  localStorage.setItem("phone", ph)
  localStorage.setItem('add', address)
}

function openpage() {
  let x = document.getElementById('sr').value;

  if (x === 'about') {
    window.open('/pages/about.html')

  } else if (x === 'wiki') {
    window.open('/pages/wiki.html');
  } else if (x === 'contact') {
    window.open('/pages/contact.html')
  } else if (x === 'location') {
    window.open('https://www.google.com/search?tbs=lf:1,lf_ui:1&tbm=lcl&q=anna+university&rflfq=1&num=10&ved=2ahUKEwjZgdiws8nzAhVcIbcAHTxeC94QtgN6BAg1EAc')
  } else if (x === 'result') {
    window.open('/pages/result.html')
  } else {
    alert('Invalid Credentials')
  }






}


