import React, {useEffect, useState} from 'react';

export default function ({col, category, cart, setCart, update}) {
  const [show, toggleShow] = useState(false)
  const [isLoading, loading] =  useState(true)
  const [items, setItems] = useState([])

  const [, updateState] = React.useState();
  const forceUpdate = React.useCallback(() => {updateState({});update({})}, []);

  useEffect(() => {
    fetchItems()
  },[category]);

  const fetchItems = async () =>{
    if (category>0 && category<5){
      toggleShow(true)
      loading(true)
      
      const resp = await fetch("/api/category/" + category)
      const data = await resp.json()
      setItems(data.items)
      loading(false)
    }
    else
      toggleShow(false)
  }

  const Item = ({name}) => (
    <div className="alert bg-white text-dark border">
      <strong>{name}</strong>      
        {
           (name in cart)?(
            <span className="float-right">              
              <b className="btn-primary cur-point mr-2 shadow px-2" onClick={()=>decrement(name)}>-</b>              
                {cart[name]} 
              <b className="btn-primary cur-point shadow px-2 ml-2" onClick={()=>increment(name)}>+</b> 
            </span>):(<span className="float-right">
              <b className="btn-primary cur-point shadow px-2 ml-2" onClick={()=>increment(name)}>Add</b> 
            </span>)
        }      
    </div>      
  )
  
  const increment = (n) => {
    
    if(n in cart){
      cart[n] = cart[n]+1
    }
    else{
      cart[n] = 1
    }
    setCart(cart)    
    forceUpdate()
  }

  const decrement = (n) => {
    if(n in cart){
      cart[n] = cart[n]-1
      if(cart[n] == 0)
        delete cart[n]
      setCart(cart)    
      forceUpdate()
    }
  }

  const ItemsDisplay = () => (isLoading?<p className="lead text-center mt-5">Loading..</p>:<>
      {
        items.map((e)=><Item key={e.name} name={e.name}/>)
      }
    </>
  )

  return (        
    <div className={"col-sm-" + col + " border bg-light text-dark " + (col==0?"d-none":"")}>
      <p className="display-4 text-center">Selection</p>
      <hr/>
      {
        show?<ItemsDisplay/>:<p className="lead text-center">Select Category</p>
      }
    </div>
  );
}  
/*
	Author : Rohit Chattopadhyay
	Path : src/main/js/ItemContainer.js
	Repository : https://github.com/RohitChattopadhyay/Spring-Store

*/

