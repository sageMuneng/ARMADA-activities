import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {

	//30 random numbers
	const numbers = Array.from({ length: 30 }, () => Math.floor(Math.random() * 9001));

	const unorderedListNumbers = (
		<ul>
			{numbers.map((number, index) => (
				<li key={index}>{number}</li>
			))}
		</ul>
	);
	const orderedListNumbers = (
		<ol>
			{numbers.map((number, index) => (
				<li key={index}>{number}</li>
			))}
		</ol>
	);

	return (
		<>
			{unorderedListNumbers}
			{orderedListNumbers}
		</>
	)
}

export default App
