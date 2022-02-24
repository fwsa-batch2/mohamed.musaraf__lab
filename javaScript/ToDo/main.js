
let saveArray = [];

function taskList() {

  let news = localStorage.getItem('task1')
  let taskInArray = JSON.parse(news);

  return taskInArray;

}


// function deleteAll() {
//   localStorage.setItem('task1', []);
// }

function updateTask(task) {
  saveArray.push(task);
  let taskInString = JSON.stringify(saveArray)
  localStorage.setItem('task1', taskInString)

}



function renderTask() {

  let ul = '';
  for (let value of saveArray) {

    ul1 = "<li>" + value + "</li>";
    ul = ul + ul1;
  }

  let li = document.getElementById('taskLists');

  li.innerHTML = ul;
}




function submitHandler() {
  event.preventDefault();


  let task = document.getElementById('newTask').value;

  updateTask(task);

  renderTask();

}


function onPageLoad() {
  saveArray = taskList();
  renderTask();
}

onPageLoad();