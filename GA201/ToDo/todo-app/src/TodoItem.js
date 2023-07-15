import React, { useState } from 'react';

function TodoItem({ index, todo, onCompleteTodo, onDeleteTodo, onUpdateTodo }) {
  const [isEditing, setIsEditing] = useState(false);
  const [updatedValue, setUpdatedValue] = useState(todo.text);

  const handleDelete = () => {
    onDeleteTodo(index);
  };

  const handleToggleEdit = () => {
    setIsEditing(!isEditing);
  };

  const handleInputChange = (e) => {
    setUpdatedValue(e.target.value);
  };

  const handleUpdate = () => {
    if (updatedValue.trim() !== '') {
      onUpdateTodo(index, updatedValue);
      setIsEditing(false);
    }
  };

  const handleToggleComplete = () => {
    onCompleteTodo(index);
  };

  return (
    <li className={`todo-item ${todo.completed ? 'completed' : ''}`}>
      {isEditing ? (
        <>
          <input
            type="text"
            value={updatedValue}
            onChange={handleInputChange}
          />
          <button onClick={handleUpdate}>Save</button>
        </>
      ) : (
        <>
          <span>{todo.text}</span>
          <div className="buttons">
            <button onClick={handleToggleEdit}>Edit</button>
            <button onClick={handleToggleComplete}>
              {todo.completed ? 'Undo' : 'Complete'}
            </button>
            <button onClick={handleDelete}>Delete</button>
          </div>
        </>
      )}
    </li>
  );
}

export default TodoItem;
