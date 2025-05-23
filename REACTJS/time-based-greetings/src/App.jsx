import './App.css'

function App() {
	const currentTime = new Date().getHours();
	let greeting;
	if(currentTime >= 5 && currentTime <= 11){
		greeting = <h4>Good Morning!</h4>
	}else if(currentTime >= 12 && currentTime <= 17){
		greeting = <h4>Good Afternoon!</h4>
	}else{
		greeting = <h4>Good Evening!</h4>
	}
	return (
		<>
			<h1>{greeting}</h1>
		</>
	)
}

export default App
