import './App.css'
import Logo from './logo_component'
import Login from './login_component'
import Register from './registration_component'

function App() {

	return (
		<>
			<fieldset class="main">
				<legend>App Component:</legend>
				<Logo />
				<aside>
					<Login />
					<Register />

				</aside>

			</fieldset>
		</>
	)
}

export default App
