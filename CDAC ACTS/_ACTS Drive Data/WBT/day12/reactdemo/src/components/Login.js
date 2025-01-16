import React from "react";
import { useState } from "react";
function Login() {
  let [uname, setUname] = useState("");
  let [fname, setFName] = useState("");

  let display = () => {
    fname = setFName(uname);
  };
  let updateUname = (e) => {
    // console.log(e.target.value);
    setUname(e.target.value);
  };
  return (
    <div>
      <input
        type="text"
        placeholder="Enter"
        value={uname}
        onChange={updateUname}
      />
      <button onClick={display}>Click</button>
      <h2>VAlue is {fname}</h2>
    </div>
  );
}
export default Login;
