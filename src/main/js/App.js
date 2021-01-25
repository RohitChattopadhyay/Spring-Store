import React, { useState } from 'react';

import Header from './Header'

import CartContainer from './CartContainer'
import ItemContainer from './ItemContainer'

export default function () {
  const [category, setCategory] = useState(0)
  const [cart, setCart] = useState({})
  const [,update] = useState(0)
  return (
    <div className="full-height">
      <Header/>
      <div className="container-fluid h-100">
        <div className="row h-100 ">
          <div className="col-sm-3 border">
            <div className="row h-100 category">
              <div className="col-12 border" onClick={()=>setCategory(1)}>
                <i className="fas fa-prescription-bottle-alt icon"></i>
              </div>
              <div className="col-12 border" onClick={()=>setCategory(2)}>
                <i className="fas fa-head-side-mask icon" style={{marginLeft:".55em"}}></i>
              </div>
            </div>
          </div>
          <div className="col-sm-3 border">
            <div className="row h-100 category">
              <div className="col-12 border" onClick={()=>setCategory(3)}>
                <i className="fas fa-carrot icon"></i>
              </div>
              <div className="col-12 border" onClick={()=>setCategory(4)}>
                <i className="fas fa-egg icon"></i>
              </div>
            </div>
          </div>
          <ItemContainer col={4} category={category} cart={cart} update={update} setCart={setCart}/>
          <CartContainer col={2} cart={cart} update={update} setCart={setCart}/>
        </div>
      </div>
    </div>
  );
}  