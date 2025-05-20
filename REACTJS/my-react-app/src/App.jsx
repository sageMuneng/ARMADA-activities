import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <h1>What I learned about Vite</h1>
        <p>I learned that vite pronounces as "veet" means "fast" in French. Its a modern frontend build tool that leverages native ES modules and provides fast HMR.</p>
        <p>The importance of using Vite is it has improved develop experience where it addresses many pain points associated with traditional build tools, faster iteration reducing the time between writing code and seeing the results in the browser, modern tooling, and scalability</p>
      </div>
    </>
  )
}

export default App
