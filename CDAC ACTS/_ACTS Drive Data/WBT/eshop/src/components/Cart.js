import React from "react";
import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import { useSelector, useDispatch } from "react-redux";
import { remove } from "../redux/store/cartSlice";

function Cart() {
  const products = useSelector((state) => state.cart);

  const dispatch = useDispatch();

  const removeItem = (itemId) => {
    dispatch(remove(itemId));
  };

  const cards = products.map((product, key) => (
    <div className="col-md-3" style={{ marginBottom: "10px" }}>
      <Card className="h-100" key={product.id}>
        <div className="text-center">
          <Card.Img
            variant="top"
            src={product.image}
            style={{ width: "100px", height: "130px" }}
          />
        </div>
        <Card.Body>
          <Card.Title>{product.title}</Card.Title>
          <Card.Text> INR: {product.price}</Card.Text>
        </Card.Body>
        <Card.Footer style={{ backgroundColor: "white" }}>
          <Button variant="danger" onClick={() => removeItem(product.id)}>
            Remove Item
          </Button>
        </Card.Footer>
      </Card>
    </div>
  ));
  return (
    <div>
      <h1 className="rows">Cart</h1>
      {cards}
    </div>
  );
}

export default Cart;
