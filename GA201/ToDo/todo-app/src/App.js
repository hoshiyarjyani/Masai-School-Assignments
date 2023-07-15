import React, { useState } from 'react';
import TodoList from './TodoList';
import './App.css';

function App() {
  const [todos, setTodos] = useState([]);
  const [inputValue, setInputValue] = useState('');
  const [showCompleted, setShowCompleted] = useState(true);

  const handleInputChange = (e) => {
    setInputValue(e.target.value);
  };

  const handleAddTodo = () => {
    if (inputValue.trim() !== '') {
      setTodos([...todos, { text: inputValue, completed: false }]);
      setInputValue('');
    }
  };

  const handleDeleteTodo = (index) => {
    const newTodos = [...todos];
    newTodos.splice(index, 1);
    setTodos(newTodos);
  };

  const handleUpdateTodo = (index, updatedValue) => {
    const newTodos = [...todos];
    newTodos[index].text = updatedValue;
    setTodos(newTodos);
  };

  const handleToggleComplete = (index) => {
    const newTodos = [...todos];
    newTodos[index].completed = !newTodos[index].completed;
    setTodos(newTodos);
  };

  const handleToggleShowCompleted = () => {
    setShowCompleted(!showCompleted);
  };

  const completedTodos = todos.filter((todo) => todo.completed);
  const incompleteTodos = todos.filter((todo) => !todo.completed);

  return (
    <div className="app">
      <h1>Todo App</h1>
      <div className="input-container">
        <input
          type="text"
          value={inputValue}
          onChange={handleInputChange}
          placeholder="Enter a todo..."
        />
        <button onClick={handleAddTodo}>Add</button>
      </div>
      <div className="toggle-container">
        <label>
          Show Completed:
          <input
            type="checkbox"
            checked={showCompleted}
            onChange={handleToggleShowCompleted}
          />
        </label>
      </div>
      <div className="todo-container">
        <TodoList
          todos={showCompleted ? todos : incompleteTodos}
          onCompleteTodo={handleToggleComplete}
          onDeleteTodo={handleDeleteTodo}
          onUpdateTodo={handleUpdateTodo}
        />
      </div>
      {completedTodos.length > 0 && showCompleted && (
        <div className="completed-container">
          <h2>Completed Todos</h2>
          <TodoList
            todos={completedTodos}
            onCompleteTodo={handleToggleComplete}
            onDeleteTodo={handleDeleteTodo}
            onUpdateTodo={handleUpdateTodo}
          />
        </div>
      )}
    </div>
  );
}

export default App;
