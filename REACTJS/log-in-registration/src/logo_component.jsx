import './App.css'
import reactLogo from './assets/react.svg'
function Logo() {

    return (
        <>
            <fieldset id='logo_fieldset'>
                <legend>Logo Component:</legend>
                <img src={reactLogo} className="logo react" alt="React logo" />
                <h3>React is the library for web and native user interfaces. Build user interfaces out of individual pieces called components written in JavaScript.</h3>
                
            </fieldset>
        </>
    );
}
export default Logo;