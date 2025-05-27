import "./App.css"

function App() {
	function changeStyle(setting){
		var textEdit = document.getElementById('edit_text');

		switch(setting){
			case 1: 
				textEdit.style.fontWeight = "bold";
				break;
			case 2: 
				textEdit.style.fontStyle = "italic";
				break;
			case 3: 
				textEdit.style.textDecoration = "underline";
				break;
			case 4: 
				textEdit.style.fontSize = "14px";
				break;
			case 5: 
				textEdit.style.fontSize = "18px";
				break;
			case 6: 
				textEdit.style.fontSize = "24px";
				break;
			case 7: 
				textEdit.style.color = "red";
				break;
			case 8: 
				textEdit.style.color = "blue";
				break;
			case 9: 
				textEdit.style.color = "green";
				break;
			default:
				break;
		}
	}

	return (
		<>
			<h1>Text Styler</h1>
			<section class="buttons">
				<button onClick={(event)=>changeStyle(1)}>Bold</button>
				<button onClick={(event)=>changeStyle(2)}>Italic</button>
				<button onClick={(event)=>changeStyle(3)}>Underline</button>
				<button onClick={(event)=>changeStyle(4)}>Font Size 14px</button>
				<button onClick={(event)=>changeStyle(5)}>Font Size 18px</button>
				<button onClick={(event)=>changeStyle(6)}>Font Size 24px</button>
				<button onClick={(event)=>changeStyle(7)}>Red</button>
				<button onClick={(event)=>changeStyle(8)}>Blue</button>
				<button onClick={(event)=>changeStyle(9)}>Green</button>
			</section>
			<p id="edit_text">
				This is the text that will be styled dynamically based on the buttons clicked.
			</p>
		</>
	)
}

export default App
