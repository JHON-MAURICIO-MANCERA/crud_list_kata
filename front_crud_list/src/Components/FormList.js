import React, { useContext,  useRef, useState } from 'react';
import  { Store } from '../store';
import api from '../API/api';


export default function FormList() {
    const formRef = useRef(null);
    const { dispatch, state: { groupList } } = useContext(Store);
    const item = groupList.item;
    const [state, setState] = useState(item);
  
    const onAdd = async (event) => {
      event.preventDefault();
  
      const request = {
        name: state.name,
        id: null
      };

      try {
        const groupList = await api.grouplist.addGroupList(request);
        dispatch({ type: "add-item-group", item: groupList });
        setState({ name: "" });
        formRef.current.reset();

      }catch (error){
        console.log(error)
      }
    }
  
    const onEdit = async (event) => {
      event.preventDefault();
  
      const request = {
        name: state.name,
        id: item.id,
        isCompleted: item.isCompleted
      };
  
        try {
            const todo = await api.todo.edit(request);
            dispatch({ type: "update-item", item: todo });
            setState({ name: "" });
            formRef.current.reset();
        } catch(error) {
            console.log(error);
        }
    }
  
    return (
        <form ref={formRef} className="container">
          <div className="row">
            <input
                  className="form-control form-control-sm col-10"
                  type="text"
                  name="name"
                  placeholder="Lista de TO-DO"
                  defaultValue={item.name}
                  onChange={(event) => {
                  setState({ ...state, name: event.target.value })
                  }} ></input>
            {item.id && <button onClick={onEdit}>Actualizar</button>}
            {!item.id && 
              <button class="btn btn-outline-success btn-sm col-2" onClick={onAdd}>
                Nueva tarea principal
              </button>}
          </div>
        </form>
    );
  }
