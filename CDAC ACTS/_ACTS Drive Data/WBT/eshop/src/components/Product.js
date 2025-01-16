import Card from "react-bootstrap/Card";
import Button from "react-bootstrap/Button";
import React, { useEffect, useState } from "react";
import { useDispatch } from "react-redux";
import { add } from "../redux/store/cartSlice";

function Product() {
  const dispatch = useDispatch();
  const [products, getProducts] = useState([]);
  useEffect(() => {
    fetch("https://fakestoreapi.com/products")
      .then((res) => res.json())
      .then((data) => getProducts(data));
  }, []);

  const addToCart = (product) => {
    dispatch(add(product));
  };
  // console.log(products);
  const cards = products.map((product, key) => (
    <div className="col-md-3" style={{ marginBottom: "10px" }}>
      <Card
        className="h-100"
        key={product.id}
        style={{
          borderStyle: "groove",
          borderColor: "gray",
          boxShadow: "2px 2px 2px gray",
        }}
      >
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
          <Button variant="primary" onClick={() => addToCart(product)}>
            Add To Cart
          </Button>
        </Card.Footer>
      </Card>
    </div>
  ));

  return (
    <div>
      <h1>Product Dashboard</h1>
      <div className="row">{cards}</div>
    </div>
  );
}

export default Product;
