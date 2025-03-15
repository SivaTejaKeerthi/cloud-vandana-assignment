document.getElementById('addTaskBtn').addEventListener('click', addTask);
document.getElementById('taskInput').addEventListener('keypress', function(event) {
    if (event.key === 'Enter') {
        addTask();
    }
});

function addTask() {
    const taskInput = document.getElementById('taskInput');
    const taskList = document.getElementById('taskList');
    const taskText = taskInput.value.trim();

    if (taskText !== '') {
        const li = document.createElement('li');
        li.className = 'task';
        li.innerHTML = `
            <span>${taskText}</span>
            <button onclick="removeTask(this)">Remove</button>
        `;
        taskList.appendChild(li);
        taskInput.value = '';
    }
}

function removeTask(button) {
    button.parentElement.remove();
}
