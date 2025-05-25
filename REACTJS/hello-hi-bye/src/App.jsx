import './App.css'

function App() {
  function popCard(event, type) {
    alert("You clicked " + type);
  }

  return (
    <>
      <button onClick={(event) => popCard(event, "Hello!")}>Hello!</button>
      <button onClick={(event) => popCard(event, "Hi!")}>Hi!</button>
      <button onClick={(event) => popCard(event, "Bye!")}>Bye!</button>
    </>
  )
}

export default App
