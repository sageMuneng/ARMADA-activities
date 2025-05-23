import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {

	//30 random numbers
	const numbers = [
		5, 12, 23,  78, 89, 90, 22, 33, 44,
		21, 32, 43, 54, 65, 76, 34, 45, 56, 67,
		11, ,87, 98, 19, 28, 55, 66, 77, 88, 99, 10,
	];

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
