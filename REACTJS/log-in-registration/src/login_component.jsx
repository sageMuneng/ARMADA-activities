import './App.css'
function LogIn() {

    return (
        <>
            <fieldset id='fieldset'>
                <legend>Login Component:</legend>
                <form action="">
                    <input type="text" placeholder='Username' />
                    <input type="password" placeholder='Password' />
                    <input id="submit" type='submit' value="Log In" />
                </form>
            </fieldset>
        </>
    );
}
export default LogIn;