import React, { useState } from "react";

function Counter({ cname }) {
  let [count, setCount] = useState(0);
  const incr = function () {
    setCount((previousCount) => {
      if (previousCount == 10) {
        setCount(0);
      }
      return previousCount + 1;
    });
  };
  const decr = function () {
    setCount((count = count - 1));
  };
  return (
    <div>
      <h1>Counter in {cname}</h1>
      <button onClick={incr}>Increment</button>
      <span>-{count}-</span>
      <button onClick={decr}>Decrement</button>
    </div>
  );
}

export default Counter;
