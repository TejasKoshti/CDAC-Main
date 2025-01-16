import logo from "./logo.svg";
import "./App.css";
import Login from "./components/Login";
import Counter from "./components/counter";

function App() {
  return (
    <div className="App">
      <h1> App Page</h1>
      <Login />
      <Counter cname="Pune" />
    </div>
  );
}

export default App;
