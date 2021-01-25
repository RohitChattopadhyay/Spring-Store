import React, { useState } from 'react';

export default function ({ col, cart, setCart }) {
  const [, updateState] = React.useState();
  const forceUpdate = React.useCallback(() => {updateState({})}, []);
  const [order_id, set_order_id] = React.useState(null)

  const placeOrder = async () => {
    const resp = await fetch("/api/order", {
      method: 'POST',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
        "reqItems" : cart
      }
      )
    })
    const body = await resp.json()
    setCart({})
    set_order_id(body.id)
    forceUpdate()
  }
  return (
    <div className={"col-sm-" + col + " border bg-light text-dark " + (col==0?"d-none":"")}>
      <p className="display-4 text-center">Cart</p>
      {
        Object.keys(cart).length>0?(
        <>
          <table className="table table-sm">
            <thead>
              <tr>
                <th>Name</th>
                <th className="text-right">Qty</th>
              </tr>
            </thead>
            <tbody>
              {            
                Object.keys(cart).map((item)=>
                <tr key={item}>
                  <td>{item}</td>
                  <td className="text-right">{cart[item]}</td>
                </tr>)
              }
            </tbody>
            <tfoot>
              <tr>
                <th className="text-right">Total</th>
                <th className="text-right">{Object.values(cart).reduce((a, b) => a + b)}</th>
              </tr>
            </tfoot>
          </table>
          <button className="btn btn-block btn-primary" onClick={() => placeOrder()}>Place Order</button>
        </>
        ):<><hr/><p className="lead text-center">Empty Cart</p></>
      }      

      {
        Object.keys(cart).length==0 && order_id && <p className="border-top lead text-center mt-5">Last Order #{order_id}</p>
      }
    </div>
  );
}  